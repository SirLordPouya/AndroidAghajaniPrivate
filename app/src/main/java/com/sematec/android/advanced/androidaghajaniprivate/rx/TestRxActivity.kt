package com.sematec.android.advanced.androidaghajaniprivate.rx

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sematec.android.advanced.androidaghajaniprivate.R
import io.reactivex.disposables.CompositeDisposable

class TestRxActivity : AppCompatActivity() {

    private val disposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_rx)

        disposable.add(TestObserableClass()
            .getObservable()
            .subscribe({
                Log.d("TAG", it.toString())
            }, {
                Log.d("TAG", it.message)
            })
        )
    }


    override fun onDestroy() {
        disposable.dispose()
        super.onDestroy()
    }

}