package com.dnowogorski

import spock.lang.Specification
import spock.lang.Unroll

class SpinWordsTest extends Specification {

    def spinner = new SpinWords()

    @Unroll
    def "should spin words"() {
        expect:
        spinner.spinWords(sentence) == result
        where:
        sentence << ["Welcome", "Hey fellow warriors"]
        result << ["emocleW", "Hey wollef sroirraw"]
    }
}