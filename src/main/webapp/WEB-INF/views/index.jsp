<html>
<title>
Calculator
</title>
<head>
HALLO JSP!
</head>
<body>
<br>
<form method="post">
Zahl 1: <input type="text" name="zahl1">
<br>
Operation: <input type="text" name="operation">
<br>
Zahl 2: <input type="text" name="zahl2">
<br>
<input type="submit" name="button" value="Berechnen">
<br>
Ergebnis: ${result}
</form>


<body>
</html>

<%
int a = 5;
int b = 11;

out.println("a + b = " + (a + b));
%>