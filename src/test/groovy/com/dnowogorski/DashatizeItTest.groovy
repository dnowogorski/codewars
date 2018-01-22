package com.dnowogorski

import spock.lang.Specification
import spock.lang.Unroll

class DashatizeItTest extends Specification {

    def dashatizer = new DashatizeIt()

    @Unroll
    def "should dashatize basic"() {
        expect:
            dashatizer.dashatize(num) == result
        where:
            num << [274, 5311, 86320, 974302]
            result << ["2-7-4", "5-3-1-1", "86-3-20", "9-7-4-3-02"]
    }

    @Unroll
    def "should dashatize edge cases"() {
        expect:
        dashatizer.dashatize(num) == result
        where:
        num << [Integer.MAX_VALUE, Integer.MIN_VALUE, -1111111111]
        result << ["2-1-4-7-48-3-64-7", "2-1-4-7-48-3-648", "1-1-1-1-1-1-1-1-1-1"]
    }

    @Unroll
    def "should dashatize weird"() {
        expect:
        dashatizer.dashatize(num) == result
        where:
        num << [0, -1, -28369]
        result << ["0", "1", "28-3-6-9"]
    }
}
