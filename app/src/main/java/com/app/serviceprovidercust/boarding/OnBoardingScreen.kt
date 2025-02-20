package com.app.serviceprovidercust.boarding

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.app.serviceprovidercust.R
import com.app.serviceprovidercust.auth.LoginActivity

class OnBoardingScreen : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2
    private lateinit var buttonNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_screen)

        viewPager = findViewById(R.id.viewPager)
        buttonNext = findViewById(R.id.buttonNext)

        val adapter = OnBoardingPageAdapter(this)
        viewPager.adapter = adapter

        // Page Change Listener
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (position == 1) {
                    buttonNext.text = "Get Started"
                } else {
                    buttonNext.text = "Next"
                }
            }
        })

        // Button Click Listener
        buttonNext.setOnClickListener {
            if (viewPager.currentItem < 1) {
                viewPager.currentItem += 1
            } else {
                startActivity(Intent(this,LoginActivity::class.java))
                finish()
            }
        }

    }
}