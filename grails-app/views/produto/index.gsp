<!doctype html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Gerenciamento de produtos</title>
    <g: javascript library = "jquery"/>
    </head>
    <body>
        <a href="#">Adicionar</a>
        <div id="listaProdutos">
            <g: render template="lista" model="{produtos: produtos}"></g:render>
        </div>
        <div> id="divForm"></div>
    </body>
</html>