package com.dnowogorski

import spock.lang.Specification
import spock.lang.Unroll

class DataReverseTest extends Specification {

    @Unroll
    def "should reverse data"() {
        expect:
            DataReverse.dataReverse(data as int[]).toList() == result
        where:
            data << [[1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0], [0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1]]
            result << [[1,0,1,0,1,0,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1], [0,0,1,0,1,0,0,1,0,0,1,1,0,1,1,0]]
    }
}
