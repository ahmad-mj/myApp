package org.grails.guides

class Make {

    String name

    static constraints = {
        name blank: false, unique: false, nullable: true
    }

    String toString() {
        name
    }
}
