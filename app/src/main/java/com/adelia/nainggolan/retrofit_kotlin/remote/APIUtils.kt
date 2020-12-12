package com.adelia.nainggolan.retrofit_kotlin.remote


object APIUtils {
    private const val API_URL = "http://10.0.2.2/marketplace/index.php/"
    val productService: ProductService
        get() = RetrofitClient.getClient(API_URL)?.create(ProductService::class.java)!!
}