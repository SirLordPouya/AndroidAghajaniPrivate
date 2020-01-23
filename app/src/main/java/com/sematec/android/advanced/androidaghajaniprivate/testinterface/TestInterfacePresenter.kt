package com.sematec.android.advanced.androidaghajaniprivate.testinterface

class TestInterfacePresenter(val view: TestInterfaceContract.View) :
    TestInterfaceContract.Presenter {

    override fun onItemClicked(text: String) {
        view.showToast(text)
    }
}