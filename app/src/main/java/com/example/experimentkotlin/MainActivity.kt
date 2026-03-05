package com.example.experimentkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.experimentkotlin.ui.theme.ExperimentKotlinTheme
import com.example.experimentkotlin.view.core.navigation.NavigationWrapper

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExperimentKotlinTheme {

                val navController = rememberNavController()

                NavigationWrapper()


/*Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->

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
                */
            }
        }
    }
}
