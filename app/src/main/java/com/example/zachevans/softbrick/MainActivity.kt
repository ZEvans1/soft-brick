package com.example.zachevans.softbrick

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            padding = dip(30)

            textView {
                text = "Softbrick"
                textSize = 30f
                textAlignment = View.TEXT_ALIGNMENT_CENTER
            }

            button(R.string.start_button_text){
                textSize = 26f
                onClick {
                    longToast("Start pressed")
                }
            }
            button(R.string.stop_button_text){
                textSize = 26f
                onClick {
                    longToast("Stop pressed")
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
}
