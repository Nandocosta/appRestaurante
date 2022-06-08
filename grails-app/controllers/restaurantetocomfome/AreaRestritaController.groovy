package restaurantetocomfome

import grails.plugin.springsecurity.annotation.Secured;

class AreaRestritaController {

    def springSecurityService

    def index() {
    }

    def logar() {
        render(view: "/areaRestrita/logar")
    }
    @Secured ('ROLE_ADMIN')
    def admin(){
        String usuario = springSecurityService.principal.username

        render(view: "/areaRestrita/admin", model: [usuario: usuario])
    }
}
