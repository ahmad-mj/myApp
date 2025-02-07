package org.grails.guides

class HomeController {

 static defaultAction = "homePage"

    def index() { 
    render "Welcome from HomeController"
    } 
}
