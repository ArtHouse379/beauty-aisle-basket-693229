package ohmywaves.cosmetics.beautyaislebasket.ui.composable.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import ohmywaves.cosmetics.beautyaislebasket.ui.composable.screen.cart.NICHTCartScreen
import ohmywaves.cosmetics.beautyaislebasket.ui.composable.screen.checkout.NICHTCheckoutScreen
import ohmywaves.cosmetics.beautyaislebasket.ui.composable.screen.home.NICHTHomeScreen
import ohmywaves.cosmetics.beautyaislebasket.ui.composable.screen.onboarding.NICHTOnboardingScreen
import ohmywaves.cosmetics.beautyaislebasket.ui.composable.screen.order.NICHTOrdersScreen
import ohmywaves.cosmetics.beautyaislebasket.ui.composable.screen.productdetails.NICHTProductDetailsScreen
import ohmywaves.cosmetics.beautyaislebasket.ui.composable.screen.settings.NICHTSettingsScreen
import ohmywaves.cosmetics.beautyaislebasket.ui.composable.screen.splash.NICHTSplashScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Splash,
        modifier = modifier,
    ) {
        composable<NavRoute.Splash> {
            NICHTSplashScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(route = NavRoute.Home) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                },
                onNavigateToOnboarding = {
                    navController.navigate(route = NavRoute.Onboarding) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Onboarding> {
            NICHTOnboardingScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(NavRoute.Home) {
                        popUpTo(NavRoute.Onboarding) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Home> {
            NICHTHomeScreen(
                onNavigateToProductDetails = { id: Int ->
                    navController.navigate(
                        route = NavRoute.ProductDetails(id = id)
                    )
                }
            )
        }

        composable<NavRoute.ProductDetails> { backStackEntry ->
            val productDetails: NavRoute.ProductDetails = backStackEntry.toRoute()
            NICHTProductDetailsScreen(
                productId = productDetails.id,
            )
        }

        composable<NavRoute.Cart> {
            NICHTCartScreen(
                onNavigateToCheckoutScreen = {
                    navController.navigate(NavRoute.Checkout)
                }
            )
        }

        composable<NavRoute.Checkout> {
            NICHTCheckoutScreen(
                onNavigateToOrdersScreen = {
                    navController.navigate(NavRoute.Orders) {
                        popUpTo(NavRoute.Home) { inclusive = false }
                    }
                }
            )
        }

        composable<NavRoute.Orders> {
            NICHTOrdersScreen()
        }

        composable<NavRoute.Settings> {
            NICHTSettingsScreen()
        }
    }
}