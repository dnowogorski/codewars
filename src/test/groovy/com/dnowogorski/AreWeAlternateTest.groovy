package com.dnowogorski

import spock.lang.Specification
import spock.lang.Unroll

class AreWeAlternateTest extends Specification {

    @Unroll
    def "should check if alternate"() {
        expect:
        AreWeAlternate.isAlt(word) == result
        where:
        word << ["amazon", "apple", "banana"]
        result << [true, false, true]
    }

}
