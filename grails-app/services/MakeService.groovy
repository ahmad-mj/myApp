package org.grails.guides.services
import org.grails.guides.Make

class MakeService {
    def saveMake(String makeName) {
        def make = new Make(name: makeName)
        make.save() // Ensure valid constraints
    }
}
