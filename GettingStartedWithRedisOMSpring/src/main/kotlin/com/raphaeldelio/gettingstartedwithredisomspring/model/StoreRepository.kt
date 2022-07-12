package com.raphaeldelio.gettingstartedwithredisomspring.model

import com.redis.om.spring.repository.RedisDocumentRepository

interface StoreRepository : RedisDocumentRepository<Store, String>