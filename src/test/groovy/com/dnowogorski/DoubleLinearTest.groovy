package com.dnowogorski

import spock.lang.Specification
import spock.lang.Unroll

class DoubleLinearTest extends Specification {

    @Unroll
    def "should find solutions"() {
        expect:
        DoubleLinear.dblLinear(num) == result
        where:
        num << [10, 20, 30, 50]
        result << [22, 57, 91, 175]
    }
}
