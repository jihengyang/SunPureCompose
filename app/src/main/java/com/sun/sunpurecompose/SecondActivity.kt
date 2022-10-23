package com.sun.sunpurecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sun.sunpurecompose.ui.theme.SunPureComposeTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log("SecondActivity-onCreate")
        setContent {
            SunPureComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
        SunMeta().doSomeThing()
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