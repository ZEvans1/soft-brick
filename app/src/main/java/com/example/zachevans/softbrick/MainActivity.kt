package com.example.zachevans.softbrick

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            padding = dip(30)

            button("Start"){
                textSize = 26f
                onClick {
                    longToast("Start pressed")
                }
            }
            button("Stop"){
                textSize = 26f
                onClick {
                    longToast("Stop pressed")
                }
            }
            button("Reset"){
                textSize = 26f
                onClick {
                    longToast("Reset pressed")
                }
            }
        }
    }
}
