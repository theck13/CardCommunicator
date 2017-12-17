package com.heckofanapp.cardcommunicator

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.LinearLayout
import com.heckofanapp.cardcommunicator.data.Constants
import com.heckofanapp.cardcommunicator.util.Utilities

class ActivityMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout = findViewById<ConstraintLayout>(R.id.layout)
        Utilities.setNavigationBarAndStatusBarPadding(layout, this@ActivityMain)

        val tileHear = findViewById<LinearLayout>(R.id.tile_hear)
        tileHear.setOnClickListener({ view ->
            showCard(view, R.color.red_500, R.drawable.ic_ear_white_24dp, R.string.text_hear)
        })

        val tileMove = findViewById<LinearLayout>(R.id.tile_move)
        tileMove.setOnClickListener({ view ->
            showCard(view, R.color.green_500, R.drawable.ic_truck_white_24dp, R.string.text_move)
        })

        val tileReboot = findViewById<LinearLayout>(R.id.tile_reboot)
        tileReboot.setOnClickListener({ view ->
            showCard(view, R.color.blue_500, R.drawable.ic_sync_white_24dp, R.string.text_reboot)
        })

        val tileBreak = findViewById<LinearLayout>(R.id.tile_break)
        tileBreak.setOnClickListener({ view ->
            showCard(view, R.color.red_500, R.drawable.ic_volume_off_white_24dp, R.string.text_break)
        })

        val tileMute = findViewById<LinearLayout>(R.id.tile_mute)
        tileMute.setOnClickListener({ view ->
            showCard(view, R.color.green_500, R.drawable.ic_microphone_off_white_24dp, R.string.text_mute)
        })

        val tileYes = findViewById<LinearLayout>(R.id.tile_yes)
        tileYes.setOnClickListener({ view ->
            showCard(view, R.color.blue_500, R.drawable.ic_thumb_up_white_24dp, R.string.text_yes)
        })

        val tileNo = findViewById<LinearLayout>(R.id.tile_no)
        tileNo.setOnClickListener({ view ->
            showCard(view, R.color.red_500, R.drawable.ic_thumb_down_white_24dp, R.string.text_no)
        })

        val tileGo = findViewById<LinearLayout>(R.id.tile_go)
        tileGo.setOnClickListener({ view ->
            showCard(view, R.color.green_500, R.drawable.ic_alarm_white_24dp, R.string.text_go)
        })

        val tileNoise = findViewById<LinearLayout>(R.id.tile_noise)
        tileNoise.setOnClickListener({ view ->
            showCard(view, R.color.blue_500, R.drawable.ic_voice_white_24dp, R.string.text_noise)
        })

        val tileConnection = findViewById<LinearLayout>(R.id.tile_connection)
        tileConnection.setOnClickListener({ view ->
            showCard(view, R.color.red_500, R.drawable.ic_wifi_off_white_24dp, R.string.text_connection)
        })

        val tileBack = findViewById<LinearLayout>(R.id.tile_back)
        tileBack.setOnClickListener({ view ->
            showCard(view, R.color.green_500, R.drawable.ic_pause_white_24dp, R.string.text_back)
        })

        val tileRepeat = findViewById<LinearLayout>(R.id.tile_repeat)
        tileRepeat.setOnClickListener({ view ->
            showCard(view, R.color.blue_500, R.drawable.ic_refresh_white_24dp, R.string.text_repeat)
        })

        val tileFaster = findViewById<LinearLayout>(R.id.tile_faster)
        tileFaster.setOnClickListener({ view ->
            showCard(view, R.color.red_500, R.drawable.ic_forward_white_24dp, R.string.text_faster)
        })

        val tileSlower = findViewById<LinearLayout>(R.id.tile_slower)
        tileSlower.setOnClickListener({ view ->
            showCard(view, R.color.green_500, R.drawable.ic_rewind_white_24dp, R.string.text_slower)
        })

        val tileFrozen = findViewById<LinearLayout>(R.id.tile_frozen)
        tileFrozen.setOnClickListener({ view ->
            showCard(view, R.color.blue_500, R.drawable.ic_snow_white_24dp, R.string.text_frozen)
        })

        val tileMuted = findViewById<LinearLayout>(R.id.tile_muted)
        tileMuted.setOnClickListener({ view ->
            showCard(view, R.color.red_500, R.drawable.ic_volume_mute_white_24dp, R.string.text_muted)
        })

        val tileHand = findViewById<LinearLayout>(R.id.tile_hand)
        tileHand.setOnClickListener({ view ->
            showCard(view, R.color.green_500, R.drawable.ic_hand_white_24dp, R.string.text_hand)
        })

        val tileIdea = findViewById<LinearLayout>(R.id.tile_idea)
        tileIdea.setOnClickListener({ view ->
            showCard(view, R.color.blue_500, R.drawable.ic_light_white_24dp, R.string.text_idea)
        })
    }

    private fun showCard(view: View, resourceColor: Int, resourceIcon: Int, resourceText: Int) {
        val intent = Intent(this@ActivityMain, ActivityMain::class.java)
        intent.putExtra(Constants.EXTRA_COLOR, resourceColor)
        intent.putExtra(Constants.EXTRA_ICON, resourceIcon)
        intent.putExtra(Constants.EXTRA_TEXT, resourceText)
        val options = ActivityOptions.makeSceneTransitionAnimation(this@ActivityMain, view, getString(R.string.shared_element))
        startActivity(intent, options.toBundle())
    }
}
