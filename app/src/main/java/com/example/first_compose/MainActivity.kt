package com.example.first_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
         Text(text = "Hello compose")      
        }
    }
}


@Composable
fun SaySomething(name:String = "Gaurav"){
    Text(text = "Hello $name")
}


@Composable
fun SaySomething2(name:String){
    Text(text = "Hello $name")
}

@Preview(showBackground = true, name = "Hello Message", widthDp = 200, heightDp = 200)
@Composable
fun PreviewFunction(){
    SaySomething2(name = "                Srivastava")
    SaySomething()
}

