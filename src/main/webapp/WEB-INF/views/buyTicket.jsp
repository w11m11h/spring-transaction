<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>티켓 구입</title>
</head>
<body>
	<h1>카드 결제 화면</h1>
	<hr>
	<form action="buyTicketOk">
		고객아이디 : <input type="text" name="consumerid"><br><br>
		티켓구매수 : <input type="text" name="amount"><br><br>
		<input type="submit" value="티켓구매">
	</form>
</body>
</html>