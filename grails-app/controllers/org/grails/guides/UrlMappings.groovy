package org.grails.guides

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: 'book', action: 'index')
        "/home"(controller: 'home')
        "/index"(view:'/index')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
