package com.dnowogorski

import spock.lang.Specification

class KataTest extends Specification {
    def "should find missing letter"() {
        expect:
        Kata.findMissingLetter(array) == result

        where:
        array << [['a','b','c','d','f'] as char[],
                  ['O','Q','R','S'] as char[],
                  ['C','E'] as char[],
                  ['i', 'k', 'l'] as char[]]
        result << ['e', 'P', 'D', 'j']
    }
}