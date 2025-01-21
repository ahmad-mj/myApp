package org.grails.guides
import org.grails.guides.Make
import org.grails.guides.Model

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Vehicle {
    // Properties will be used to create columns in the database (assuming a relational database is used)
    Integer year   
    String name
    Make make
    Model model

    static constraints = {
    // Constraints are used to enforce valid data in each field
        year min: 1900
        name maxSize: 255
        make nullable: false
        model nullable: false
    }
}
