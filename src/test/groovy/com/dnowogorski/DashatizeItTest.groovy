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
}
