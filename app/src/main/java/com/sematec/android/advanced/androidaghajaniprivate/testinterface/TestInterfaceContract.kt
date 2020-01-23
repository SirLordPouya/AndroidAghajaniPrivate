package com.sematec.android.advanced.androidaghajaniprivate.testinterface

interface TestInterfaceContract {

    interface View {

        fun showToast(text: String)
    }

    interface Presenter {

        fun onItemClicked(text: String)
    }
}