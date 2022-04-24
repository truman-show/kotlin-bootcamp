package com.bootcamp.logic

class JavaSort<T : Comparable<T>> { // 코틀린에서는 : 뒤에 클래스를 적는것만으로도 extends, implements 모두 처리한다
    fun sort(list: List<T>): List<T> {
        val output = arrayListOf<T>()
        output.addAll(list)
        output.sort()
        return output
    }
}
