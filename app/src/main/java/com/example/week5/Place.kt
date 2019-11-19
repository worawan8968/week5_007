package com.example.week5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.place_lo.*


class Place : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.place_lo)

        setTitle("สถานที่บันเทิง")
        var place = intent.extras?.getString(MainActivity().YING)
        txt_pp.setText(place)
        btn_bb.setOnClickListener(){
            finish()
        }
    }
}