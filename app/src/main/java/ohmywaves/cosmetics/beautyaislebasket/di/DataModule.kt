package ohmywaves.cosmetics.beautyaislebasket.di

import ohmywaves.cosmetics.beautyaislebasket.data.repository.CartRepository
import ohmywaves.cosmetics.beautyaislebasket.data.repository.OnboardingRepository
import ohmywaves.cosmetics.beautyaislebasket.data.repository.OrderRepository
import ohmywaves.cosmetics.beautyaislebasket.data.repository.ProductRepository

import org.koin.core.qualifier.named
import org.koin.dsl.module

val dataModule = module {
    includes(databaseModule, dataStoreModule)

    single {
        OnboardingRepository(
            onboardingDataStoreManager = get(),
            coroutineDispatcher = get(named("IO"))
        )
    }

    single { ProductRepository() }

    single {
        CartRepository(
            cartItemDao = get(),
            coroutineDispatcher = get(named("IO"))
        )
    }

    single {
        OrderRepository(
            orderDao = get(),
            coroutineDispatcher = get(named("IO"))
        )
    }
}