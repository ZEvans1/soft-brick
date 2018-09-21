package com.example.zachevans.softbrick

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock.elapsedRealtime
import android.view.View
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivity : AppCompatActivity() {

    var hours : Int = 0
    var minutes : Int = 0
    var seconds : Int = 0
    var startTime : Long = 0
    var endTime : Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var test : String = getString(R.string.current_time, hours, minutes, seconds)


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
        longToast("Timer started")
        startTime = elapsedRealtime()

    }

    private fun stopTimer() {
        longToast("stopTimer() called")
    }

    private fun testFunction(){
        endTime = elapsedRealtime()
        var timeDifference = endTime - startTime
        var timeToChar = timeDifference.toString()
        longToast(timeToChar)
    }

}
