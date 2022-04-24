package com.bootcamp.logic

class BubbleSort<T : Comparable<T>?> {

    fun sort(list: List<T>): List<T> {

        val output: MutableList<T> = ArrayList(list)
        for (i in output.size - 1 downTo 1) {
            for (j in 0 until i) {
                if (output[j]!! > output[j + 1]) {
                    val temp = output[j]
                    output[j] = output[j + 1]
                    output[j + 1] = temp
                }
            }
        }
        return output
    }
}
