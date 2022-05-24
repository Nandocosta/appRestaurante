package restaurantetocomfome

class ProdutoController {

    def index() {
        def lista = Produto.list()
        render(view: "/produto/index", model:[produtos: lista])
    }
    def adicionar() {
        Produto novoproduto = new Produto()
        novoproduto.preco = 0
        novoproduto.estoque = new Estoque()
        novoproduto.estoque.quantidade = 0
        novoproduto.estoque.quantidadeMinima = 0

        render(template: "/produto/form", model:[produto: novoproduto])
    }
    def salvar() {

    }
}
