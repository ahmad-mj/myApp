package org.grails.guides

class Model {

    String name

    static belongsTo = [ make: Make ] // belongsTo is property GORM uses to determine associations between domain classes
    
    static constraints = {
        name blank: false, unique:false, nullable: true
    }

    String toString() {
        name
    }
}
