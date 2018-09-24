package com.example.zachevans.softbrick

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock.elapsedRealtime
import android.util.Log
import android.view.View
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import java.util.*
import kotlin.concurrent.fixedRateTimer

class MainActivity : AppCompatActivity() {

    var hours : Int = 0
    var minutes : Int = 0
    var seconds : Int = 0
    var amount : Int = 0
//    var startTime : Long = 0
//    var endTime : Long = 0
    var isTicking : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var test : String = getString(R.string.current_time, hours, minutes, amount)


        verticalLayout {
            padding = dip(30)

            textView {
                textResource = R.string.app_name
                textSize = 30f
                textAlignment = View.TEXT_ALIGNMENT_CENTER
                textColor = Color.DKGRAY
            }

            textView {
                text = test
                textAlignment = View.TEXT_ALIGNMENT_CENTER
            }

            button(R.string.start_button_text){
                textSize = 26f
                onClick {
                    startTimer()
                }
            }
            button(R.string.stop_button_text){
                textSize = 26f
                onClick {
                    stopTimer()
                }
            }
            button(R.string.reset_button_text){
                textSize = 26f
                onClick {
                    testFunction()
                }
            }
        }
    }


    private fun startTimer() {
//        longToast("Timer started")
        Log.v("button click", "hey I actually was clicked")
//        isTicking = true
//        startTime = elapsedRealtime()
            val fixedTimer = fixedRateTimer(
                    name = "hello-timer",
                    initialDelay = 100,
                    period = 1000)
            {
                amount++
                Log.v("clock tick", amount.toString())
            }

            try {
                Thread.sleep(10000)
            } finally {
                fixedTimer.cancel()
            }
    }

    private fun stopTimer() {
        longToast("stopTimer() called")
        isTicking = false
    }

    private fun testFunction(){
//        endTime = elapsedRealtime()
//        var timeDifference = (endTime - startTime)/1000
//        var timeToChar = timeDifference.toString()
//        longToast(timeToChar)
    }

}
