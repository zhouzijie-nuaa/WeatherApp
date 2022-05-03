package com.sunnyweather.android

import android.app.Application
import android.content.Context
import android.media.session.MediaSession

class SunnyWeatherApplication : Application() {

    companion object {
        lateinit var context: Context
        const val TOKEN = "We1I5Qy64hAvetXt"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}