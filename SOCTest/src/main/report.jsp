<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Report</title>
<style>
th { text-align: left}
td {border-bottom: 1px solid #ddd;padding: 5px; text-align: left;}
table {border-collapse: collapse;width: 60%; font-size:14}
th {height: 30px;}
html * {font-family: "Trebuchet MS", Helvetica, sans-serif}

</style>
</head>
<body>
	<h2>Exames</h2>
	<h3><a href="saveExame">Inserir novo</a></h3>
	<div style="margin-top: 40px;">
		<s:if test="noData==true">
			<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>Id</th>
						<th>Paciente</th>
						<th>Doutor</th>
					</tr>
				</thead>
				<s:iterator value="exameList">
					<tr>
						<td><a href="updateExame.action?submitType=updatedata&id=<s:property value="id"/>"><s:property value="id"/></td>
						<td><s:property value="paciente"/></td>
						<td><s:property value="doutor"/></td>
						<td>
							<a href="updateExame.action?submitType=updatedata&id=<s:property value="id"/>">
								Editar 
							</a>
							<a href="deleteExame.action?id=<s:property value="id"/>">
								 Remover
							</a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
		<s:else>
			<div style="color: red;"><s:property value="noData"/></div>
		</s:else>
	</div>
</body>
</html>