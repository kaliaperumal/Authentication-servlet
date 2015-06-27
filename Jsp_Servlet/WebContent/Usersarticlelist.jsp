<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
  <script src="http://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <style>
	  #tabs {
	    align-self: center;
	    left: 28%;
	    width: 437pt;
		}
  </style>
 <script>
	  $(function() {
	    $( "#tabs" ).tabs();
	  });
  </script>
</head>
<body>

<div id="tabs">
  <ul>
    <li><a href="#tabs-1">UnVerified Files</a></li>
    <li><a href="#tabs-2">Verified Files</a></li>
  </ul>
  <div id="tabs-1">
    <jsp:include page="unverifiedfilelist.jsp" />
  </div>
  <div id="tabs-2">
    <jsp:include page="verifiedfilelist.jsp" />
  </div>
</div>
</body>
</html>