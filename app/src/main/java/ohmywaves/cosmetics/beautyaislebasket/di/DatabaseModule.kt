package ohmywaves.cosmetics.beautyaislebasket.di

import androidx.room.Room
import ohmywaves.cosmetics.beautyaislebasket.data.database.NICHTAppDatabase
import org.koin.dsl.module

private const val DB_NAME = "nicht_db"

val databaseModule = module {
    single {
        Room.databaseBuilder(
            context = get(),
            klass = NICHTAppDatabase::class.java,
            name = DB_NAME
        ).build()
    }

    single { get<NICHTAppDatabase>().cartItemDao() }

    single { get<NICHTAppDatabase>().orderDao() }
}