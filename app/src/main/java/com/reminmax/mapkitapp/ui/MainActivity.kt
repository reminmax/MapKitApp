package com.reminmax.mapkitapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.reminmax.mapkitapp.ui.navigation.RootNavigationGraph
import com.reminmax.mapkitapp.ui.theme.MapKitAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MapKitAppTheme {
                RootNavigationGraph(
                    navController = rememberNavController(),
                )
            }
        }
    }
}