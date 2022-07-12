package com.raphaeldelio.gettingstartedwithredisomspring.model

import com.redis.om.spring.annotations.Document
import com.redis.om.spring.annotations.Indexed
import com.redis.om.spring.annotations.Searchable
import org.springframework.data.annotation.Id

@Document
data class Store(
    @Id
    @Indexed
    var id: String? = null,

    @Indexed
    var name: String,

    @Searchable
    var storeLogo: String,

    @Indexed
    var products: List<Product>
)
