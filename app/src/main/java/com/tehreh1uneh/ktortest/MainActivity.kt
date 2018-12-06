package com.tehreh1uneh.ktortest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        performAllCases()
    }

    companion object {
        const val BASE_TAG = "### "
    }
}
