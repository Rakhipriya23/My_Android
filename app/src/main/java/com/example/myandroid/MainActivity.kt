package com.example.myandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgeDefaults.containerColor
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.rememberNestedScrollInteropConnection
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myandroid.ui.theme.MyAndroidTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            //Surface(modifier = Modifier.fillMaxSize(),)

            AppNavigation()


            }
        }
    }

    @OptIn(ExperimentalFoundationApi::class,ExperimentalMaterial3Api::class)
 @Composable
fun AppNavigation(){
    val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "screen1" ){
            composable("screen1"){Screen1(navController)}
            composable("screen2"){Screen2(navController)}
            composable("screen3/{data}",arguments = listOf(navArgument("date"){type = NavType.StringType})) {backStackEntry ->

            Screen3(navController,backStackEntry.arguments?.getString("data") ?:"")
                }
        }
}
@Composable
fun Screen1(navController: NavController){
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
    ) {
        Text(text = "This is Screen1", color = Color.Cyan, fontSize = 50.sp)
        Button(onClick = {
            navController.navigate("screen2")
        }) {
            Text(text="Goto Screen 2")
        }
    }
}
@Composable
fun Screen2(navController: NavController){
    var text by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
    ) {
        OutlinedTextField(value = text, onValueChange ={
            text=it
        }, label = { Text(text = "Enter Something")} )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "This is Screen 2", color = Color.Red, fontSize = 50.sp)
        Button(onClick = {
            navController.navigate("screen3/$text")
        }) {
            Text(text="Goto Screen 3")
        }
    }
}
@Composable
fun Screen3(navController: NavController,data:String){
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
    ) {
        Text(text = "This is Screen 2", color = Color.Red, fontSize = 50.sp)
        Button(onClick = {
            // navController.navigate("screen2")
        }) {
            Text(text="Goto Screen 3")
        }
    }
}