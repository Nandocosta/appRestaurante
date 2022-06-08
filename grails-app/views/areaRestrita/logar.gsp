package areaRestrita

<!doctype html>
<html>
    <head>
    <meta name="layout" content="main"/>
    <title>Àrea restrita-Restaurante tô com Fome</title>
</head>
<body>
    <form action='${request.contextPath}/j_spring_security' method='POST' id='frmLogar' name='frmLogar'>
    <p>
    Email
    <input type='text' name='j_username' id='username' />
    </P>
     <P>
        Senha
        <input type='password' name='j_password' id='password' />
    </p>
        <input type="submit" value="Entrar" />
    </form>
</body>
</html>