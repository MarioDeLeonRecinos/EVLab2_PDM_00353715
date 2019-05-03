package com.sovize.laboratorioevaluado2.layouts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.sovize.laboratorioevaluado2.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.fragment_blank_fragment2)
        setContentView(R.layout.blank_fragment)
    }

}
