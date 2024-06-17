package com.example.myandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myandroid.ui.theme.MyAndroidTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            AlertDialogFunction()
//            Button(onClick = { println("I am Clicked") }) {
//                Text("Filled Button")
//            }
//            OutlinedButton(onClick = { /*TODO*/ }) {
//                Text(text = "Outlined Button")
//            }
//            
//            TextButton(onClick = { /*TODO*/ }) {
//                Text(text = "Text Button")
//            }
//          Row(
//              modifier = Modifier.fillMaxWidth(),
//              verticalAlignment = Alignment.CenterVertically){
//
//              Text(
//                        text = "Android Developer",
//                        fontSize = 30.sp,
//                        modifier = Modifier
//                            .padding(70.dp)
//                            .background(Color.Cyan)
//                            .clickable {
//                                println("I am clickable")
//                            }
//
//              )
//          }
//            Column {
//                Text(text = "hello World", fontSize = 70.sp)
//
//                Row {
//
//                    Text(
//                        text = "Android Developer",
//                        fontSize = 30.sp
//                    )
//                    Text(
//                        text = "Android Developer",
//                        fontSize = 30.sp
//                    )
//
//                }
//                Box(modifier = Modifier.padding(20.dp)) {
//                    Text(
//                        text = "Android Developer",
//                        fontSize = 30.sp
//                    )
//                    Text(
//                        text = "Android Developer",
//                        fontSize = 30.sp
//                    )
//                }
//            }
//            val gColors = listOf(Color.Cyan, Color.LightGray,Color.Blue)
//            Text(text = "Hello World", fontSize = 40.sp,
//                letterSpacing = 3.sp,
//                style = TextStyle(
//                    brush = Brush.linearGradient(
//                        colors = gColors
      //              )
        //        )
          //  )
        }

    }
}
//@OptIn(ExperimentalFoundationApi::class)
//@Composable
//private fun MarqueeEffect() {
//    Box(
//        modifier = Modifier.fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ) {
//        Text(
//            modifier = Modifier.basicMarquee(),
//            text = "Compose has finally added support for Marquee! It's soo easy to implement!"
//        )
//    }
//}
@OptIn(ExperimentalFoundationApi::class)

@Composable
fun AlertDialogFunction(){
    AlertDialog(title = {
                        Text(text = "I am Alert")
    }, text = {
              Text(text = "Please acknowledge us")
    },
        onDismissRequest = { /*TODO*/ }, confirmButton = {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "ok")
        }
    })
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyAndroidTheme {
        Greeting("Android")
    }
}