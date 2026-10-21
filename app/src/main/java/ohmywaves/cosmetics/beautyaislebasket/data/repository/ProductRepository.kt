package ohmywaves.cosmetics.beautyaislebasket.data.repository

import ohmywaves.cosmetics.beautyaislebasket.data.model.Product
import ohmywaves.cosmetics.beautyaislebasket.data.model.ProductCategory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class ProductRepository {
    private val products = listOf<Product>(
        Product(
            id = 1,
            title = "Gentle Facial Cleanser",
            description = "This creamy cleanser lifts away makeup, sunscreen, and daily impurities without leaving skin tight. Its mild lather rinses clean and suits a simple morning or evening routine. The practical pump bottle makes it easy to dispense the right amount.",
            category = ProductCategory.SKINCARE,
            price = 12.99,
            imageUrl = "https://images.unsplash.com/photo-1556228720-195a672e8a03",
        ),
        Product(
            id = 2,
            title = "Vitamin C Serum",
            description = "This lightweight facial serum adds a brightening step to everyday skincare. The fluid texture spreads easily and layers well beneath moisturiser and sunscreen. A dropper top helps apply a small, measured amount each time.",
            category = ProductCategory.SKINCARE,
            price = 18.50,
            imageUrl = "https://images.unsplash.com/photo-1556228578-8c89e6adf883",
        ),
        Product(
            id = 3,
            title = "Matte Lipstick",
            description = "This classic lipstick delivers rich colour with a smooth matte finish. The bullet shape allows precise application straight from the tube. Its compact case slips neatly into a handbag or makeup pouch for touch-ups.",
            category = ProductCategory.MAKEUP,
            price = 9.99,
            imageUrl = "https://images.unsplash.com/photo-1586495777744-4413f21062fa",
        ),
        Product(
            id = 4,
            title = "Eyeshadow Palette",
            description = "This compact palette brings together versatile shades for soft daytime looks or deeper evening colour. The pressed powders can be worn alone or blended to create a smooth gradient. A sturdy case keeps the pans protected between uses.",
            category = ProductCategory.MAKEUP,
            price = 16.99,
            imageUrl = "https://images.unsplash.com/photo-1512496015851-a90fb38ba796",
        ),
        Product(
            id = 5,
            title = "Repair Hair Serum",
            description = "This leave-in serum smooths the look of dry ends and adds a polished finish after styling. A small amount distributes easily through damp or dry hair without weighing it down. The pump bottle keeps application quick and controlled.",
            category = ProductCategory.HAIR_CARE,
            price = 14.50,
            imageUrl = "https://images.unsplash.com/photo-1571781926291-c477ebfd024b",
        ),
        Product(
            id = 6,
            title = "Hairbrush Set",
            description = "This practical brush set covers everyday detangling, smoothing, and styling needs. Comfortable handles provide a secure grip while working through different sections of hair. The coordinated tools are easy to keep together at home or pack for travel.",
            category = ProductCategory.HAIR_CARE,
            price = 11.99,
            imageUrl = "https://images.unsplash.com/photo-1625038032200-648fbcd800d0",
        ),
        Product(
            id = 7,
            title = "Body Lotion",
            description = "This everyday lotion softens dry-feeling skin after bathing or whenever moisture is needed. The light texture spreads quickly over arms and legs and absorbs without a heavy finish. A pump dispenser makes daily use tidy and convenient.",
            category = ProductCategory.BATH_BODY,
            price = 8.99,
            imageUrl = "https://images.unsplash.com/photo-1631729371254-42c2892f0e6e",
        ),
        Product(
            id = 8,
            title = "Olive Soap Bar",
            description = "This solid soap bar creates a gentle lather for washing hands or body. Its olive-based style makes it a simple choice for an everyday cleansing routine. The compact bar stores neatly in a soap dish and uses minimal packaging.",
            category = ProductCategory.BATH_BODY,
            price = 4.50,
            imageUrl = "https://images.unsplash.com/photo-1614806687007-2215a9db3b1c",
        ),
        Product(
            id = 9,
            title = "Floral Eau de Parfum",
            description = "This eau de parfum offers a floral scent designed for everyday wear or special occasions. A fine spray distributes the fragrance lightly across pulse points. The glass bottle looks elegant on a dressing table while protecting the perfume inside.",
            category = ProductCategory.FRAGRANCE,
            price = 34.99,
            imageUrl = "https://images.unsplash.com/photo-1594035910387-fea47794261f",
        ),
        Product(
            id = 10,
            title = "Woody Eau de Toilette",
            description = "This eau de toilette combines a fresh opening with a warm, woody character. Its lighter concentration works well for daytime use and can be reapplied when desired. The spray bottle delivers an even mist and is easy to display or store.",
            category = ProductCategory.FRAGRANCE,
            price = 29.99,
            imageUrl = "https://images.unsplash.com/photo-1592945403244-b3fbafd7f539",
        ),
    )

    fun observeById(id: Int): Flow<Product?> {
        val item = products.find { it.id == id }
        return flowOf(item)
    }

    fun getById(id: Int): Product? {
        return products.find { it.id == id }
    }

    fun observeAll(): Flow<List<Product>> {
        return flowOf(products)
    }
}
