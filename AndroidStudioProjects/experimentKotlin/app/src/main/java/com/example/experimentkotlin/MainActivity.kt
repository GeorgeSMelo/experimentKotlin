package com.example.experimentkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.experimentkotlin.ui.theme.ExperimentKotlinTheme
import com.example.experimentkotlin.view.CreateUser
import com.example.experimentkotlin.view.Interface

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExperimentKotlinTheme {

                val navController = rememberNavController()

                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->

                    NavHost(
                        navController = navController,
                        startDestination = "login",
                        modifier = Modifier.padding(innerPadding)
                    ){
                        composable("login"){
                            Interface(navController)
                        }
                        composable("createUser"){
                            CreateUser(navController)
                        }
                    }
                }
            }
        }
    }
}
