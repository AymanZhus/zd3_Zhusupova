package com.example.zad3_zhusupova

import android.app.Application

class CriminalIntentApplication : Application()
{

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}