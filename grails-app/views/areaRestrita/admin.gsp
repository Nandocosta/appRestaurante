<!doctype html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Àrea restrita - Restaurante tô com Fome</title>
    </head>
    <body>
        <sec:ifLoggedIn>
              Olá, ${usuario}
              <a href="/restauranteToComFome/j_spring_security_logout">Sair</a>
        </sec:ifLoggedIn>

    </body>
</html>