package com.bootcamp

import io.kotest.core.spec.style.DescribeSpec

class MainTest : DescribeSpec({

    describe("main 메소드는 ") {
        context("입력인자가 주어지면") {
            it("정렬하여 출력한다") {
                val args = arrayOf("3", "1", "2")
                Main.main(args)
            }
        }
    }
})
