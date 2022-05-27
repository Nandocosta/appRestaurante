package restaurantetocomfome

import grails.gorm.transactions.Transactional

class ProdutoController {

    def index() {
        def lista = Produto.list()
        render(view: "/produto/index", model:[produtos: lista])
    }
    def adicionar() {
        Produto novoProduto = new Produto()
        novoProduto.preco = 0
        novoProduto.nome = ''

        Estoque estoque = new Estoque()
        estoque.quantidade = 0
        estoque.quantidadeMinima = 0

        novoProduto.estoque = estoque

        render(template: "/produto/form", model:[produto: novoProduto])
    }
    def editar() {
        Produto produto = Produto.get(params.id)
        render(template: "/produto/form", model:[produto: produto])
    }

    def lista() {
        def lista = Produto.list()
        render(template: "/produto/lista", model:[produtos: lista])
    }

    @Transactional
    def salvar() {
        Produto produto = null
        Estoque estoque = null

        if(params.id){
            produto = Produto.get(params.id)
            estoque = produto.estoque
        }else{
            produto = new Produto()
            estoque = new Estoque()
        }

        produto.nome = params.nome
        produto.preco = params.preco.toDouble()

        estoque.quantidade = params.quantidade.toInteger()
        estoque.quantidadeMinima = params.quantidadeMinima.toInteger()

        produto.estoque = estoque

        produto.estoque.produto = produto

        produto.estoque.save(flush:true)

        if (!produto.hasErrors()){
            //permitir o failonError
            produto.save(flush:true)
            render("Salvou com sucesso")
        }else{
            produto.errors.allErrors.each {
                println this
            }
            render("Ops... deu pau!")
        }
    }
    @Transactional
    def excluir() {
        Produto produto = Produto.get(params.id)
        produto.delete(flush:true)

        def lista = Produto.list()
        render(template: "/produto/lista", model:[produtos: lista])
    }
}
