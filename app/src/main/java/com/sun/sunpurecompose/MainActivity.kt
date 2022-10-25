package com.sun.sunpurecompose

//import androidx.compose.runtime.*
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sun.sunpurecompose.ui.theme.SunPureComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log("MainActivity-onCreate")
        setContent {
            SunPureComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }

    override fun onPause() {
        super.onPause()
        log("MainActivity-onPause")
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        log("MainActivity-onDestroy")
    }

//    @Composable
//    fun Greeting(str: String) {
//        Column(modifier = Modifier.padding(16.dp)) {
//            var name by remember { mutableStateOf("") }
//            if (name.isNotEmpty()) {
//                Text(
//                    text = "Hello, $name!",
//                    modifier = Modifier.padding(bottom = 8.dp),
//                    style = MaterialTheme.typography.h5
//                )
//            }
//            OutlinedTextField(
//                value = name,
//                onValueChange = { name = it },
//                label = { Text("Name") }
//            )
//        }
//    }

    @Composable
    fun Greeting(name: String) {
        Column(
            Modifier.height(50.dp)
        ) {
            Text(
                text = "Hello $name!"
            )
            Button(onClick = {
                startActivity(Intent(this@MainActivity, SecondActivity::class.java))
            }) {
                Text(
                    text = "点击"
                )
            }
            val listData = listOf("小明", "小华", "小张")
            LazyColumn {
                items(listData) {
                    ListCell(name = it)
                }
            }
        }
    }

    @Composable
    fun ListCell(name: String) {
        Text(text = name)
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        SunPureComposeTheme {
            Greeting("Android")
        }
    }
}