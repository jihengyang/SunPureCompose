package com.sun.sunpurecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log("SecondActivity-onCreate")
        setContent {
            Greeting("Android")
        }
    }

    override fun onPause() {
        super.onPause()
        log("SecondActivity-onPause")
    }

    override fun onStop() {
        super.onStop()
        log("SecondActivity-onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("SecondActivity-onDestroy")
    }

    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name!")
    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    SunPureComposeTheme {
//        Greeting("Android")
//    }
//}