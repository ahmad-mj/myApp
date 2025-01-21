package org.grails.guides.services
import org.grails.guides.Make
import grails.gorm.transactions.Transactional

@Transactional

class MakeService {
    def saveMake(String makeName) {
        def make = new Make(name: makeName)
        make.save() // Ensure valid constraints
    }
}
