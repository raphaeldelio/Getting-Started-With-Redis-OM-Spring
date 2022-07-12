package com.raphaeldelio.gettingstartedwithredisomspring.model

import com.redis.om.spring.annotations.Indexed

data class Product(
    @Indexed
    val name: String,

    @Indexed
    val price: Double
)
