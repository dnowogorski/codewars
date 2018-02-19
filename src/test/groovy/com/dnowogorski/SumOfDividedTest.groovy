package com.dnowogorski

import spock.lang.Specification
import spock.lang.Unroll

class SumOfDividedTest extends Specification {

    @Unroll
    def "test one"() {
        expect:
        SumOfDivided.sumOfDivided(inputArray as int[]) == result
        where:
        inputArray << [[12, 15]]
        result << ["(2 12)(3 27)(5 15)"]
    }
}
