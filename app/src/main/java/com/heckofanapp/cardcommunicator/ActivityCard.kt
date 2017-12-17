package com.heckofanapp.cardcommunicator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.heckofanapp.cardcommunicator.data.Constants
import com.heckofanapp.cardcommunicator.util.Utilities

class ActivityCard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        val color = intent.extras!!.getInt(Constants.EXTRA_COLOR)
        val icon = intent.extras!!.getInt(Constants.EXTRA_ICON)
        val text = intent.extras!!.getInt(Constants.EXTRA_TEXT)

        val cardLayout = findViewById<LinearLayout>(R.id.card)
        cardLayout.setBackgroundResource(color)
        cardLayout.setOnClickListener({ _ ->
            finishAfterTransition()
        })
        Utilities.setNavigationBarAndStatusBarPadding(cardLayout, this@ActivityCard)

        val cardIcon = findViewById<ImageView>(R.id.icon)
        cardIcon.setImageResource(icon)

        val cardText = findViewById<TextView>(R.id.text)
        cardText.text = getString(text)
    }
}
