package com.example.koinbasic

interface HelloRepository {
    fun sayHello(): String
}

class HelloRepositoryImpl() : HelloRepository {
    override fun sayHello() = "Hello, Koin!"
}