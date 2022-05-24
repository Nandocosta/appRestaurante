<div id="divMensagem"><div>
<g:formRemote name="frmProduto" url="[controller: 'produto', action: 'salvar']" update="divMensagem">
   Nome <input type="text" name="nome" value=""/><br/>
   Preço <input type="text" name="preco" values=""/><br/>
   Qtde. atual <input type="text" name="quantidade" values=""/><br/>
   Qtde. mínima <input type="text" name="quantidadeMinima" values=""/><br/>
   <input type="submit" name="btnSalvar" values="Salvar"/><br/>
   <input type="submit" name="btnCancelar" values="Cancelar"/>
</g:formRemote>