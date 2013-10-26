<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<!-- <h1>Using GET Method to Read Form Data</h1>
		<ul>
		<li><p><b>First Name:</b>
		   <%= request.getParameter("name")%>
		</p></li>
		<li><p><b>Last  Name:</b>
		   <%= request.getParameter("manufacturer_name")%>
		</p></li>
		<li><p><b>Last  Name:</b>
		   <%= request.getParameter("manufacturer_part_id")%>
		</p></li>
		<li><p><b>Last  Name:</b>
		   <%= request.getParameter("tag")%>
		</p></li>
		<li><p><b>Last  Name:</b>
		   <%= request.getParameter("location_name")%>
		</p></li>
		
		</ul>-->
		
		
		
		
		
		
		<form action="foxtrot_asset_system.actions.NewAsset.action" method="GET">
			Asset Name: <input type="text" name="name" value="<%= request.getParameter("name")%>"  /><br />
			Manufacturer: <input type="text" name="manufacturer_name" value="<%= request.getParameter("manufacturer_name")%>" /><br />
			Manufacturer Part Id: <input type="text" name="manufacturer_part_id" value="<%= request.getParameter("manufacturer_part_id")%>" /><br />
			Tag #: <input type="text" name="tag" value="<%= request.getParameter("tag")%>"/><br />
			Location Name: <input type="text" name="location_name" value="<%= request.getParameter("location_name")%>"/><br />
			Date Depreciated By: <input type="text" name="depreciated" value="<%= request.getParameter("depreciated")%>"/><br />
			Install Date: <input type="text" name="installdate" value="<%= request.getParameter("installdate")%>"/><br />
			Note: <input type="text" name="note" value="<%= request.getParameter("note")%>"/><br />
			<input type="submit" value="Submit" />
		</form>



</body>
</html>