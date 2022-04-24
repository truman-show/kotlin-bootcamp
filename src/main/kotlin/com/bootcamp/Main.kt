package com.bootcamp

import com.bootcamp.logic.BubbleSort
import com.bootcamp.service.SortService

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
//        val sort = BubbleSort<String>()
//        println("[result] : ${sort.sort(args.toList())}")
        val sortService = SortService(BubbleSort<String>())
        println("[result] : ${sortService.doSort(args.toList())}")
    }

}
