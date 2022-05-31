package restaurantetocomfome

import comum.Permissao

class BootStrap {

    def init = { servletContext ->
        Permissao admin = Permissao.findByAuthority("ADMIN")
        if(admin == null){
            admin = new Permissao(authority: "ADMIN").save(flush: true)
        }
    }
    def destroy = {
    }
}
