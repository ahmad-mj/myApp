package org.grails.guides

class Make {

    String name

    static constraints = {
        name blank: false, unique: true
    }

    String toString() {
        name
    }
}
