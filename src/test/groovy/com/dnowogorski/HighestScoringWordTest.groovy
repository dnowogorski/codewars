package com.dnowogorski

import spock.lang.Specification
import spock.lang.Unroll

class HighestScoringWordTest extends Specification {

    @Unroll
    def "should find highest scoring word"() {
        expect:
        HighestScoringWord.high(sentence) == result
        where:
        sentence << ["man i need a taxi up to ubud", "what time are we climbing up to the volcano", "take me to semynak"]
        result << ["taxi", "volcano", "semynak"]
    }
}
