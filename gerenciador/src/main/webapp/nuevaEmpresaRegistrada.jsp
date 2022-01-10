<%
	//scriptlet
	String empresa = (String)request.getAttribute("empresa");
	System.out.println(empresa);
%>


<html><body>
Empresa <%= empresa %> registrada!
</body></html>
