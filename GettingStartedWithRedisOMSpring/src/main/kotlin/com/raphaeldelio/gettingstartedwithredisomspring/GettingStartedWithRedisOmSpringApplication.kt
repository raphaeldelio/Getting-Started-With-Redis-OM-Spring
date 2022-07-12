package com.raphaeldelio.gettingstartedwithredisomspring

import com.raphaeldelio.gettingstartedwithredisomspring.model.Product
import com.raphaeldelio.gettingstartedwithredisomspring.model.Store
import com.raphaeldelio.gettingstartedwithredisomspring.model.StoreRepository
import com.redis.om.spring.annotations.EnableRedisDocumentRepositories
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.util.StopWatch

@EnableRedisDocumentRepositories(basePackages = ["com.raphaeldelio.*"])
@SpringBootApplication
class GettingStartedWithRedisOmSpringApplication

fun main(args: Array<String>) {
    runApplication<GettingStartedWithRedisOmSpringApplication>(*args)
}
