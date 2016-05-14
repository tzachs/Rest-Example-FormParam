<html>
<body>
	<h2>Jersey RESTful Web Application!</h2>
	<p>
		<a href="webapi/myresource">Jersey resource</a>
	<p>
		Visit <a href="http://jersey.java.net">Project Jersey website</a> for
		more information on Jersey!
	<form action="webapi/calc" method="post">
		<p>
			number1 <input type="text" name="num1">
		</p>
		<p>
			number2 <input type="text" name="num2">
		</p>
		<p>
			operation <select name="operation">
				<option value="1">Sum</option>
				<option value="2">Difference</option>
			</select>
		</p>
		<p>
			<input type="submit" value="calc" />
	</form>
</body>
</html>
