package com.dnowogorski

import spock.lang.Specification
import spock.lang.Unroll

class HtmlColorParserTest extends Specification {

    def parser = new HtmlColorParser("limegreen":"#32CD32")

    @Unroll
    def "should parse rgb color"() {
        expect:
        parser.parse(color) == result

        where:
        color << ["#80FFA0", "#3B7", "LimeGreen"]
        result << [new RGB(128, 255, 160),
                   new RGB(51, 187, 119),
                   new RGB(50, 205, 50)]
    }
}
