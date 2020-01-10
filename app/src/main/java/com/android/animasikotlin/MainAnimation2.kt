package com.android.animasikotlin


import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import com.android.animasikotlin.R


class MainAnimation2 : AppCompatActivity() {

    internal lateinit var btnFadeIn: Button
    internal lateinit var btnFadeOut: Button
    internal lateinit var btnCrossFade: Button
    internal lateinit var btnBlink: Button
    internal lateinit var btnZoomIn: Button
    internal lateinit var btnZoomOut: Button
    internal lateinit var btnRotate: Button
    internal lateinit var btnMove: Button
    internal lateinit var btnSlideUp: Button
    internal lateinit var btnSlideDown: Button
    internal lateinit var btnBounce: Button
    internal lateinit var btnSequential: Button
    internal lateinit var btnTogether: Button
    internal lateinit var animFadeIn: Animation
    internal lateinit var animFadeOut: Animation
    internal lateinit var animBlink: Animation
    internal lateinit var animZoomIn: Animation
    internal lateinit var animZoomOut: Animation
    internal lateinit var animRotate: Animation
    internal lateinit var animMove: Animation
    internal lateinit var animSlideUp: Animation
    internal lateinit var animSlideDown: Animation
    internal lateinit var animBounce: Animation
    internal lateinit var animSequential: Animation
    internal lateinit var animTogether: Animation
    internal lateinit var animCrossFadeIn: Animation
    internal lateinit var animCrossFadeOut: Animation
    internal lateinit var txtFadeIn: TextView
    internal lateinit var txtFadeOut: TextView
    internal lateinit var txtBlink: TextView
    internal lateinit var txtZoomIn: TextView
    internal lateinit var txtZoomOut: TextView
    internal lateinit var txtRotate: TextView
    internal lateinit var txtMove: TextView
    internal lateinit var txtSlideUp: TextView
    internal lateinit var txtSlideDown: TextView
    internal lateinit var txtBounce: TextView
    internal lateinit var txtSeq: TextView
    internal lateinit var txtTog: TextView
    internal lateinit var txtIn: TextView
    internal lateinit var txtOut: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animation_activity)

        btnFadeIn = findViewById(R.id.btnFadeIn) as Button
        btnFadeOut = findViewById(R.id.btnFadeOut) as Button
        btnCrossFade = findViewById(R.id.btnCrossFade) as Button
        btnBlink = findViewById(R.id.btnBlink) as Button
        btnZoomIn = findViewById(R.id.btnZoomIn) as Button
        btnZoomOut = findViewById(R.id.btnZoomOut) as Button
        btnRotate = findViewById(R.id.btnRotate) as Button
        btnMove = findViewById(R.id.btnMove) as Button
        btnSlideUp = findViewById(R.id.btnSlideUp) as Button
        btnSlideDown = findViewById(R.id.btnSlideDown) as Button
        btnBounce = findViewById(R.id.btnBounce) as Button
        btnSequential = findViewById(R.id.btnSequential) as Button
        btnTogether = findViewById(R.id.btnTogether) as Button
        txtFadeIn = findViewById(R.id.txt_fade_in) as TextView
        txtFadeOut = findViewById(R.id.txt_fade_out) as TextView
        txtBlink = findViewById(R.id.txt_blink) as TextView
        txtZoomIn = findViewById(R.id.txt_zoom_in) as TextView
        txtZoomOut = findViewById(R.id.txt_zoom_out) as TextView
        txtRotate = findViewById(R.id.txt_rotate) as TextView
        txtMove = findViewById(R.id.txt_move) as TextView
        txtSlideUp = findViewById(R.id.txt_slide_up) as TextView
        txtSlideDown = findViewById(R.id.txt_slide_down) as TextView
        txtBounce = findViewById(R.id.txt_bounce) as TextView
        txtSeq = findViewById(R.id.txt_seq) as TextView
        txtTog = findViewById(R.id.txt_tog) as TextView
        txtIn = findViewById(R.id.txt_in) as TextView
        txtOut = findViewById(R.id.txt_out) as TextView


        animFadeIn = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.fade_in
        )

        animFadeIn = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.fade_in
        )
        // fade in
        btnFadeIn.setOnClickListener {
            txtFadeIn.visibility = View.VISIBLE
            txtFadeIn.startAnimation(animFadeIn)
        }

        animFadeOut = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.fade_out
        )

        // fade out
        btnFadeOut.setOnClickListener {
            txtFadeOut.visibility = View.VISIBLE
            txtFadeOut.startAnimation(animFadeOut)
        }
        animCrossFadeIn = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.fade_in
        )
        animCrossFadeOut = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.fade_out
        )
        // cross fade
        btnCrossFade.setOnClickListener {
            txtOut.visibility = View.VISIBLE
            // start fade in animation_activity
            txtOut.startAnimation(animCrossFadeIn)

            // start fade out animation_activity
            txtIn.startAnimation(animCrossFadeOut)
        }
        animBlink = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.blink
        )
        // blink
        btnBlink.setOnClickListener {
            txtBlink.visibility = View.VISIBLE
            txtBlink.startAnimation(animBlink)
        }

        animZoomIn = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.zoom_in
        )
        // Zoom In
        btnZoomIn.setOnClickListener {
            txtZoomIn.visibility = View.VISIBLE
            txtZoomIn.startAnimation(animZoomIn)
        }
        animZoomOut = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.zoom_out
        )
        // Zoom Out
        btnZoomOut.setOnClickListener {
            txtZoomOut.visibility = View.VISIBLE
            txtZoomOut.startAnimation(animZoomOut)
        }
        animRotate = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.rotate
        )

        // Rotate
        btnRotate.setOnClickListener { txtRotate.startAnimation(animRotate) }
        animMove = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.move
        )
        // Move
        btnMove.setOnClickListener { txtMove.startAnimation(animMove) }
        animSlideUp = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.slide_up
        )
        // Slide Up
        btnSlideUp.setOnClickListener { txtSlideUp.startAnimation(animSlideUp) }
        animSlideDown = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.slide_down
        )
        // Slide Down
        btnSlideDown.setOnClickListener { txtSlideDown.startAnimation(animSlideDown) }
        animBounce = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.bounce
        )
        // Slide Down
        btnBounce.setOnClickListener { txtBounce.startAnimation(animBounce) }
        animSequential = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.sequential
        )
        // Sequential
        btnSequential.setOnClickListener { txtSeq.startAnimation(animSequential) }
        animTogether = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.together
        )

        // Together
        btnTogether.setOnClickListener { txtTog.startAnimation(animTogether) }

    }
}
