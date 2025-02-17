package org.grails.guides

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:'/index')
        "/home"(controller: 'home', action: 'index')
        "/vehicle"(controller: 'vehicle')
        "/book"(controller: 'book',)
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
