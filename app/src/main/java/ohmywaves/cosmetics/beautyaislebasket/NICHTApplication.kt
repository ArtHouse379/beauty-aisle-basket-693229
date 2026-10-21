package ohmywaves.cosmetics.beautyaislebasket

import android.app.Application
import ohmywaves.cosmetics.beautyaislebasket.di.dataModule
import ohmywaves.cosmetics.beautyaislebasket.di.dispatcherModule
import ohmywaves.cosmetics.beautyaislebasket.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class NICHTApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val appModules = dataModule + viewModule + dispatcherModule

        startKoin {
            androidLogger()
            androidContext(this@NICHTApplication)
            modules(appModules)
        }
    }
}
