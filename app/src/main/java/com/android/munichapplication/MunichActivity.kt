package com.android.munichapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

class MunichActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_munich)
    }


}