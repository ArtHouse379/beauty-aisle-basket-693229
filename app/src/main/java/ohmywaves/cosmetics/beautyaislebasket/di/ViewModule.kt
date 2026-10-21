package ohmywaves.cosmetics.beautyaislebasket.di

import ohmywaves.cosmetics.beautyaislebasket.ui.viewmodel.AppViewModel
import ohmywaves.cosmetics.beautyaislebasket.ui.viewmodel.CartViewModel
import ohmywaves.cosmetics.beautyaislebasket.ui.viewmodel.CheckoutViewModel
import ohmywaves.cosmetics.beautyaislebasket.ui.viewmodel.OnboardingViewModel
import ohmywaves.cosmetics.beautyaislebasket.ui.viewmodel.OrderViewModel
import ohmywaves.cosmetics.beautyaislebasket.ui.viewmodel.ProductDetailsViewModel
import ohmywaves.cosmetics.beautyaislebasket.ui.viewmodel.ProductViewModel
import ohmywaves.cosmetics.beautyaislebasket.ui.viewmodel.SplashViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModule = module {
    viewModel {
        AppViewModel(
            cartRepository = get()
        )
    }

    viewModel {
        SplashViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        OnboardingViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        ProductViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        ProductDetailsViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        CheckoutViewModel(
            cartRepository = get(),
            productRepository = get(),
            orderRepository = get(),
        )
    }

    viewModel {
        CartViewModel(
            cartRepository = get(),
            productRepository = get(),
        )
    }

    viewModel {
        OrderViewModel(
            orderRepository = get(),
        )
    }
}