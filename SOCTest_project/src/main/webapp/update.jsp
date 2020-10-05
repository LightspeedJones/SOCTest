<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<style>
	html * {font-family: "Trebuchet MS", Helvetica, sans-serif}
</style>
<head>
<title>Update</title>
</head>
<body>
	<h2>Editar</h2>
	<s:form action="updateExame" method="post">
		<s:textfield label="Id" name="id" readonly="true" labelposition="top"/>
		<s:textfield label="Paciente" name="paciente" labelposition="top"/>
    	<s:textfield label="Doutor" name="doutor" labelposition="top"/>
    	<s:textfield label="Tipo" name="tipo" labelposition="top"/>
    	<s:textfield label="Data" name="data" type="date" labelposition="top"/>
		<s:submit name="submitType" value="Atualizar" type="submit" style="margin-top:10px"></s:submit>
    </s:form>
    
    
	<s:if test="affected>0">
		<span><s:property value="msg" /></span>
		<br>
	</s:if>
	<br>
	<a href="reportExame">Voltar</a>
</body>
</html>