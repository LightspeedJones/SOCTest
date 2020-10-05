<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<style>
	html * {font-family: "Trebuchet MS", Helvetica, sans-serif}
</style>
  <head>
    <title>Cadastrar exame</title>
  </head>
  <body>
  <h2>Cadastrar exame</h2>
    <s:form action="saveExame">
    	<s:textfield label="Paciente" name="paciente" labelposition="top"/>
    	<s:textfield label="Doutor" name="doutor" labelposition="top"/>
    	<s:textfield label="Tipo" name="tipo" labelposition="top"/>
    	<s:textfield label="Data" name="data" type="date" labelposition="top"/>
    	<s:submit value="Salvar"/>
    </s:form>
    
    <s:if test="affected>0">
    	<span><s:property value="msg" /></span>
    	<br>
    </s:if>
    
    <a href="reportExame">Voltar</a>
  </body>
</html>