package org.grails.guides

class Vehicle {
    // Properties will be used to create columns in the database (assuming a relational database is used)
    String name
    String make
    String model

    static constraints = {
    // Constraints are used to enforce valid data in each field
        name maxSize: 255
        make inList: ['Ford', 'Chevrolet', 'Nissan']
        model nullable: true
    }
}
