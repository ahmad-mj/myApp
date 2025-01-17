package org.grails.guides
import org.grails.guides.services.MakeService
import org.grails.guides.Make

class BootStrap {

    MakeService makeService
    def init = { servletContext ->
    def toyota= makeService.saveMake('Toyota')
    }
    def destroy = {
    }
}
