package com.example.zachevans.softbrick

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivity : AppCompatActivity() {

    var hours : Int = 0
    var minutes : Int = 0
    var seconds : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var test : String = getString(R.string.current_time, hours, minutes, seconds)


        verticalLayout {
            padding = dip(30)

            textView {
                textResource = R.string.app_name
                textSize = 30f
                textAlignment = View.TEXT_ALIGNMENT_CENTER
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
                    longToast("Reset pressed")
                }
            }
        }
    }

    private fun startTimer() {
        longToast("startTimer() called")
    }

    private fun stopTimer() {
        longToast("stopTimer() called")
    }

}
