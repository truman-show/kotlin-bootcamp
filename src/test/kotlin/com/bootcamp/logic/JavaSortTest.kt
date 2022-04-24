package com.bootcamp.logic

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class JavaSortTest : DescribeSpec({


    describe("sort 메소드는") {
        fun subject(list: List<Int>): List<Int> {
            return JavaSort<Int>()
                .sort(list)
        }

        context("리스트를 넣으면") {
            val paramList = listOf(3, 5, 1, 2, 4)

            it("정렬된 결과를 보여준다") {
                subject(paramList) shouldBe listOf(1, 2, 3, 4, 5)
            }
        }
    }


})
