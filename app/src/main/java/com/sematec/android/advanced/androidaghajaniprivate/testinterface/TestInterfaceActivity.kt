package com.sematec.android.advanced.androidaghajaniprivate.testinterface

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sematec.android.advanced.androidaghajaniprivate.R
import kotlinx.android.synthetic.main.activity_test_interface.*

class TestInterfaceActivity : AppCompatActivity(), TestInterface, TestInterfaceContract.View {

    lateinit var presenter: TestInterfaceContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_interface)

        presenter = TestInterfacePresenter(this)

        val list = arrayListOf("Ali", "Qoli", "Mamad", "Saeed", "Farhad")
//        val adapter = TestAdapter(list, recycler.setOnClickListener {
//
//        })


        val adapter = TestAdapter(list){
            Toast.makeText(this,it,Toast.LENGTH_LONG).show()
        }


        recycler.adapter = adapter


        recycler.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

            }
        })

        recycler.setOnClickListener {

        }

        testLambda{ name, password ->
            Toast.makeText(this, name + password, Toast.LENGTH_LONG).show()
            name + password
        }
    }

    override fun onRecyclerItemClicked(name: String) {
        presenter.onItemClicked(name)
    }

    override fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }

    fun testLambda(lambdaFun: (String, Int) -> String) {
     val text =   lambdaFun("MyPassWordIs", 123)
    }
}
