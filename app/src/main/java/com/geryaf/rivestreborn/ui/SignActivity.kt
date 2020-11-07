package com.geryaf.rivestreborn.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geryaf.rivestreborn.R
import com.geryaf.rivestreborn.ui.fragment.SignFragment

class SignActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)
        supportActionBar?.hide()
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SignFragment.newInstance())
                .commitNow()
        }
    }
}