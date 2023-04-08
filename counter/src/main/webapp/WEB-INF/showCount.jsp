<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
<meta charset="UTF-8">
    <title>Counter  - Count</title>
</head>
<body>
<div class=" container mt-5">
    <h1 class="text-primary">You have visited ${countToShow} times.</h1>
 	<p class="text-danger">Click the link to test another visit:</p>
    <a href="/">Home Page</a>
    </div>
</body>
</html>