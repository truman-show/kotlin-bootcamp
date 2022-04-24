package com.bootcamp.logic

interface Sort<T : Comparable<T>?> {

    fun sort(list: List<T>): List<T>
}
