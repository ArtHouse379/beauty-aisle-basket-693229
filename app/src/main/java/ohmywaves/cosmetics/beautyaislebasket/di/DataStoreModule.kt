package ohmywaves.cosmetics.beautyaislebasket.di

import ohmywaves.cosmetics.beautyaislebasket.data.datastore.OnboardingDataStoreManager
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dataStoreModule = module {
    single { OnboardingDataStoreManager(androidContext()) }
}