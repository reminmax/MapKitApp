package com.reminmax.mapkitapp.ui.navigation

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.reminmax.mapkitapp.ui.screens.home.HomeScreenRoute

@Composable
fun RootNavigationGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        route = NavigationGraph.ROOT,
        startDestination = NavigationGraph.HOME
    ) {
        composable(route = NavigationGraph.HOME) {
            val snackBarHostState: SnackbarHostState = remember { SnackbarHostState() }
            HomeScreenRoute(
                snackBarHostState = snackBarHostState
            )
        }
    }
}

object NavigationGraph {
    const val ROOT = "rootGraph"
    const val HOME = "home"
}