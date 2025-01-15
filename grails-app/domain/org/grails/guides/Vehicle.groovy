package org.grails.guides

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Vehicle {
    // Properties will be used to create columns in the database (assuming a relational database is used)
    Integer year   
    String name
    String make
    String model

    static constraints = {
    // Constraints are used to enforce valid data in each field
        year min: 1900
        name maxSize: 255
    }
}
