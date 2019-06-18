package com.example.wk.viewmodels

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

class BaseViewModelFactory<T>(val creator: () -> T): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        printSS()
        return creator() as T
    }
}

fun printSS() {
    println("3333")
}