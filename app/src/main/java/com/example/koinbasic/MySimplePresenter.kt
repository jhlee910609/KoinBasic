package com.example.koinbasic

class MySimplePresenter(val repo: HelloRepository) {
    fun sayHello() = "${repo.sayHello()} from $this"
}