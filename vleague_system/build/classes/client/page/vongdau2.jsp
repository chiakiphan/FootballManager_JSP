<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style><%@include file="/WEB-INF/css/vongdau.css"%></style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<%@page import="com.vleague.model.VongDau"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<section>
  <!--for demo wrap-->
  <h1>Vòng đấu Vleague 2020</h1>
  <div class="tbl-header">
    <table cellpadding="0" cellspacing="0" border="0">
      <thead>
        <tr>
          <th style="width:10%">Số thứ tự</th>
          <th style="width:15%">Mã trận</th>
          <th>Tên trận</th>
          <th>Thời gian bắt đầu</th>
          <th>Thời gian kết thúc</th>
          <th>Trạng thái</th>
        </tr>
      </thead>
    </table>
  </div>
  <div class="tbl-content">
    <table cellpadding="0" cellspacing="0" border="0">
      <tbody>
<%
  	ArrayList<VongDau> lsVong = (ArrayList<VongDau>)session.getAttribute("listVD");
	Date date = new SimpleDateFormat("yyyy-MM-dd").parse(LocalDate.now()+"");  
	int stt = 0;
	String status = "";
	out.println("<p>"+lsVong.size()+"</p>");
  	if(lsVong!=null){
    	for(VongDau vd : lsVong){
    		stt++;
    		if (new SimpleDateFormat("yyyy-MM-dd").parse(vd.getThoiGianStart()+"").compareTo(date)<0){
    			status = "Đã diễn ra";
    		}
    		else status = "Chưa diễn ra";
    			
%>

        <tr onclick="selectVongDau(this)">
          <td style="width:10%"><%= stt%></td>
          <td style="width:15%"><%= vd.getMaVong()%></td>
          <td><%= vd.getTenVong()%></td>
          <td><%= vd.getThoiGianStart()%></td>
          <td><%= vd.getThoiGianEnd()%></td>
          <td><%= status %></td>
        </tr>

<%
		}
%>
<%	
	} 
%>
      </tbody>
      </table>
     </div>
</section>
 <div class="container">
   <br>
    <div class="content">
      <a href="http://localhost:8080/vleague_system/home" class="btn left">
        <span class="left icon fa fa-backward"><span class="arrow-left"></span></span>
        <span class="right title">Trở lại</span>
      </a>

      <a href="#" class="btn right" onclick="next()">
        <span class="left title">Tiếp tục</span>
        <span class="right icon fa fa-forward"><span class="arrow-right"></span></span>
      </a>
    </div>
   </br>
 </div>


<!-- follow me template -->
<div class="made-with-love">
 </div>
</body>
<script type="text/javascript">
//'.tbl-content' consumed little space for vertical scrollbar, scrollbar width depend on browser/os/platfrom. Here calculate the scollbar width .
$(window).on("load resize ", function() {
  var scrollWidth = $('.tbl-content').width() - $('.tbl-content table').width();
  $('.tbl-header').css({'padding-right':scrollWidth});
}).resize();

var chosen = -1;

function selectVongDau(_this) {
	resetSelection();
	_this.style.backgroundColor = "rgb(10,50,0)";
	chosen = _this.childNodes[3].textContent;

}

function resetSelection(){
	  var tr = document.getElementsByTagName("tr");
	  for(var i = 0; i < tr.length; i ++)
		  tr[i].style.backgroundColor = "";
}

function next(){
	if (typeof chosen === 'undefined'){
		alert("Hãy chọn một vòng đấu để tiếp tục!");
	}
	else{
		var parameters = "round="+chosen;
	    var xhr = new XMLHttpRequest();
	    xhr.onreadystatechange = function() {
	        if (xhr.readyState == 4) {
	        	window.location.href = 'http://localhost:8080/vleague_system/lich_dau';
	        }
	    }
	    xhr.open('GET', '${pageContext.request.contextPath}/lich_dau?'+parameters, true);
	    xhr.send(null);
	}
}
</script>
</html>