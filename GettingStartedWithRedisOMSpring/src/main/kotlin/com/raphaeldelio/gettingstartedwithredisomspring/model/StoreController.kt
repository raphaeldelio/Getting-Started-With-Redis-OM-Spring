package com.raphaeldelio.gettingstartedwithredisomspring.model

import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/store")
class StoreController(
    private val storeRepository: StoreRepository
) {
    @GetMapping
    fun getAll(): List<Store> {
        return storeRepository.findAll().toList()
    }

    @PostMapping
    fun save(@RequestBody store: Store): Store {
        val response = storeRepository.save(store)
        return response
    }

    @PutMapping
    fun updateNameById(@RequestParam id: String, @RequestParam name: String): Optional<Store> {
        val store = storeRepository.findById(id)
        store.ifPresent {
            it.name = name
            storeRepository.save(it)
        }
        return store
    }

    @DeleteMapping
    fun deleteById(@RequestParam id: String) {
        storeRepository.deleteById(id)
    }
}