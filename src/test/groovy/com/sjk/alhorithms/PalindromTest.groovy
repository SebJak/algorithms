package com.sjk.alhorithms

import spock.lang.Specification

import static com.sjk.alhorithms.Palindrome.*

class PalindromTest extends Specification {

    def "Should return the longest palindrome from given string value"() {
        expect:
        getLongestPalindrome(value) == palindrome
        where:
        value | palindrome
        'ala' | 'ala'
        'alibaba' | 'bab'
        'test' | ''
    }
}
