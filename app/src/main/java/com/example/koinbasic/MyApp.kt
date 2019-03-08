package com.example.koinbasic

import android.app.Application
import appModule
import org.koin.standalone.StandAloneContext.startKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(listOf(appModule))
    }
}