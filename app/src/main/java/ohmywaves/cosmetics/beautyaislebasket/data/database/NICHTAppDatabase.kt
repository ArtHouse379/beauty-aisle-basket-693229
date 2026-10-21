package ohmywaves.cosmetics.beautyaislebasket.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ohmywaves.cosmetics.beautyaislebasket.data.database.dao.CartItemDao
import ohmywaves.cosmetics.beautyaislebasket.data.database.dao.OrderDao
import ohmywaves.cosmetics.beautyaislebasket.data.database.converter.Converters
import ohmywaves.cosmetics.beautyaislebasket.data.entity.CartItemEntity
import ohmywaves.cosmetics.beautyaislebasket.data.entity.OrderEntity

@Database(
    entities = [CartItemEntity::class, OrderEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class NICHTAppDatabase : RoomDatabase() {

    abstract fun cartItemDao(): CartItemDao

    abstract fun orderDao(): OrderDao
}