package org.grails.guides

class Model {

    Sting name

    static belongsTo = [ make: Make ] // belongsTo is property GORM uses to determine associations between domain classes
    
    static constraints = {
    }

    String toString() {
        name
    }
}
