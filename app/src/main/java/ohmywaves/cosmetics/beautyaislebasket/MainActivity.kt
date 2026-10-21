package ohmywaves.cosmetics.beautyaislebasket

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ohmywaves.cosmetics.beautyaislebasket.ui.composable.approot.AppRoot
import ohmywaves.cosmetics.beautyaislebasket.ui.theme.NICHTAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NICHTAppTheme {
                AppRoot()
            }
        }
    }
}
