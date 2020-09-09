<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style><%@include file="/WEB-INF/css/lichdau.css"%></style>
<%@page import="com.vleague.model.TranDau"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VFF</title>
</head>
<body>
<% int round = (int)request.getAttribute("round"); %>
<h1>Lịch đấu vòng <%=round %></h1>
<div class="container">
	<div class="schedule-item-by-date">
<%
	ArrayList<TranDau> lsTD = (ArrayList<TranDau>)request.getAttribute("listTD");
	String today="";
	String doiKhach = "";
	String chuSan = "";
	if(lsTD!=null){
		for(TranDau td : lsTD){
			doiKhach = td.getDoi1().getDoiBong().getTenDoi();
			chuSan = td.getDoi2().getDoiBong().getTenDoi();
			
			if (td.getDoi1().getVaiTro().equals("CS")){
				String temp = doiKhach; 
				doiKhach = chuSan;
				chuSan = temp;
			}
			
%>		
		<div class="row">
<%		
		if (!today.equals(td.getThoiGian()+"")){ 
%>

			<div class="col-md-2 col-sm-12">
				<div class="mb30">
 					<span class="date">
 					<b><%= td.getThoiGian()%></b>
 					<% today = td.getThoiGian()+""; %>
 					</span>
 				</div>
 			</div>
<%			}
%>
			<div class="col-md-10 col-sm-12">
				<div class="schedule-item text-center mb30">
					<div class="row align-items-center">
						<div class="col-md-2 col-sm-6 col-xs-12">
						 <span class="time"><%= td.getGio() %></span>
						 </div>
						 <div class="col-md-2 col-sm-6 col-xs-12"></div>
						 <div class="col-md-5 col-sm-12 col-xs-12">
							 <div class="row team align-items-center gutter-x">
								 <div class="col team-country">
								 
								 	<p style="color: blue;" class="open-button" onclick="openForm()"><%= chuSan %></p><span>-</span>
								 </div>
								 <div class="col vs"> VS</div>
								 <div class="col team-country b">
								 	<p style="color: rgb(255, 204, 102);" class="open-button" onclick="openForm()"><%= doiKhach %></p><span>-</span>
								 	<div class="form-popup" id="myForm">
									  <form action="/action_page.php" class="form-container">
									    <h2>Menu</h2>
									    <button type="submit" class="btn">Danh sách cầu thủ</button>
									    <button type="button" class="btn cancel" onclick="closeForm()">Hủy</button>
									  </form>
</div>
								 	
								 </div>
							 </div>
						 </div>
						 <div class="col-md-3 col-sm-12 col-xs-12"></div>
					</div>
				</div>
			</div>
		</div>
	<%} %>
<%} %>
 </div>
</div>
</body>
<script type="text/javascript">
function openForm() {
  document.getElementById("myForm").style.display = "block";
}

function closeForm() {
  document.getElementById("myForm").style.display = "none";
}
</script>
</html>