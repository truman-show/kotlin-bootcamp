package com.bootcamp

import com.bootcamp.logic.BubbleSort
import java.util.ArrayList

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val sort = BubbleSort<String>()
        println("[result] : ${sort.sort(args.toList())}")
    }

}
