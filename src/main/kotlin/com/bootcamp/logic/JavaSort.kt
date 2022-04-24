package com.bootcamp.logic

// 코틀린에서는 : 뒤에 클래스를 적는것만으로도 extends, implements 모두 처리한다
// Sort 인터페이스 구현
class JavaSort<T : Comparable<T>> : Sort<T> {
    override fun sort(list: List<T>): List<T> {
        val output = arrayListOf<T>()
        output.addAll(list)
        output.sort()
        return output
    }
}
