<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<%@page import="com.vleague.model.VongDau"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="list-group">
<%
  	ArrayList<VongDau> lsVong = (ArrayList<VongDau>)session.getAttribute("listVD");
    System.out.print(lsVong);
  	if(lsVong!=null){
    	for(VongDau vd : lsVong){
%>
<a href="#" class="list-group-item list-group-item-action flex-column align-items-start">
    <div class="d-flex w-100 justify-content-between">
      <h5 class="mb-1"><%= vd.getMaVong()%></h5>
      <small><%= vd.getThoiGian()%></small>
    </div>
      <p class="mb-1"><%= vd.getTenVong()%></p>
      <small>Donec id elit non mi porta.</small>
  </a>
<%
		}
 %>
   <%} %>
   </div>
</body>
<script type="text/javascript">
  function my()
  {
    alert("hello");
  }
</script>
</html>