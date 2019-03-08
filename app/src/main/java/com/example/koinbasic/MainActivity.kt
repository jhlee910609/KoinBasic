package com.example.koinbasic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.koin.android.ext.android.inject
import org.koin.standalone.StandAloneContext.startKoin

class MainActivity : AppCompatActivity() {

    val presenter : MySimplePresenter by inject<MySimplePresenter>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tv).text = presenter.sayHello()

    }
}
