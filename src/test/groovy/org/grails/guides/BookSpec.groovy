package org.grails.guides

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class BookSpec extends Specification implements DomainUnitTest<Book> {

    def setup() {
    }

    def cleanup() {
    }

 

    void "test book title is set correctly"() {
        given : "A book instance"
        def book = new Book(title: "Grails Guide")
        
        expect: "Title should be correctly assigned"
        book.title == "Grails Guide"
    }
}
