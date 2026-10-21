package ohmywaves.cosmetics.beautyaislebasket.data.model

import androidx.annotation.StringRes
import ohmywaves.cosmetics.beautyaislebasket.R

enum class ProductCategory(@field:StringRes val titleRes: Int) {
    SKINCARE(R.string.product_category_skincare_title),
    MAKEUP(R.string.product_category_makeup_title),
    HAIR_CARE(R.string.product_category_hair_care_title),
    BATH_BODY(R.string.product_category_bath_body_title),
    FRAGRANCE(R.string.product_category_fragrance_title),
}
