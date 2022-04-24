package com.bootcamp.service

import com.bootcamp.logic.BubbleSort
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class SortServiceTest : DescribeSpec({

    /*
    Kotest는 아래와 같이 테스트 간 격리에 대한 설정을 제공하고 있습니다.
    Kotest Isolation Mode
      - SingleInstance – Default
      - InstancePerTest
      - InstancePerLeaf
    Kotest에서는 테스트 간 격리 레벨에 대해 디폴트로 SingleInstance를 설정하고 있으며
    이 경우 Mocking 등의 이유로 테스트 간 충돌이 발생할 수 있습니다.
    따라서 테스트간 완전한 격리를 위해서는 아래와 같이 IsolationMode를 InstancePerLeaf로 지정해 사용해야 합니다.
    */
//    isolationMode = IsolationMode.InstancePerLeaf

    describe("doSort 메소드는") {
        fun subject(list: List<String>): List<String> {
            val sortService = SortService(BubbleSort())
            return sortService.doSort(list)
        }

        context("주어진 정렬방식에 따라") {

            it("정렬하여 리턴한다") {
                subject(listOf("3", "1", "2")) shouldBe listOf("1", "2", "3")
            }
        }

    }
})

