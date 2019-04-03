<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#fff; display:flex; justify-content:center;">
 <div style="">
                <h1 style="text-align:center; font-family: sans-serif;">Log In</h1>
                <form action="${pageContext.request.contextPath}/AnotacionServlet" method="post">
                        <input required type="text" placeholder="Username" name="user" style=" margin-top: 10px;
    border-radius: 25px;
    background: #fff;
    padding-left: 20px;
    padding-right: 20px;
    padding-top: 10px;
    padding-bottom: 10px;
    font-size: 16px;
    align-content: center;
    border-color: #000;" onchange="getTemperatures()"><br>
      <input required type="password" placeholder="Password" name="password" id="tem" style=" margin-top: 10px;
    border-radius: 25px;
    background: #fff;
    padding-left: 20px;
    padding-right: 20px;
    padding-top: 10px;
    padding-bottom: 10px;
    font-size: 16px;
    align-content: center;
    border-color: #000;" onchange="getTemperatures()">
                        <br>
                        <input type="submit">
                </form>
                </div>
</body>
</html>