package com.sematec.android.advanced.androidaghajaniprivate.mvvm;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.sematec.android.advanced.androidaghajaniprivate.R;

public class TestMVVMActivity extends AppCompatActivity {

    TestMVVMViewModel viewModel;
    private static final String TAG = "TestMVVMActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_mvvm);

        final TextView txtTitle = findViewById(R.id.txtTitle);
        viewModel = new ViewModelProvider(this).get(TestMVVMViewModel.class);


        viewModel.getLiveData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                txtTitle.setText(s);
            }
        });

        if (savedInstanceState == null) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    viewModel.getName(1);
                }
            }, 1000);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    viewModel.getName(2);
                }
            }, 2000);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    viewModel.getName(3);
                }
            }, 3000);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    viewModel.getName(4);
                }
            }, 4000);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    viewModel.getName(5);
                }
            }, 5000);
        }

    }
}
