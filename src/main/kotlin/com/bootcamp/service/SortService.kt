package com.bootcamp.service

import com.bootcamp.logic.Sort

class SortService(private val sort: Sort<String>) {

    fun doSort(list: List<String>): List<String> {
        println(sort.javaClass.name)
        return sort.sort(list)
    }
}
