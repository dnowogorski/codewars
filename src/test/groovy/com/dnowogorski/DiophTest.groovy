package com.dnowogorski

import spock.lang.Specification
import spock.lang.Unroll

class DiophTest extends Specification {

    @Unroll
    def "should find solutions"() {
        expect:
        Dioph.solEquaStr(num) == result
        where:
        num << [5, 12, 13, 16]
        result << ["[[3, 1]]", "[[4, 1]]", "[[7, 3]]", "[[4, 0]]"]
    }
}
