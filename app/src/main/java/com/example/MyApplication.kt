package com.example

import android.app.Application

class MyApplication : Application() {
    companion object{
        public var ins: MyApplication? = null
    }

    override fun onCreate() {
        super.onCreate()
        ins = this
    }
}