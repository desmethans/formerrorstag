<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%@taglib prefix='spring' uri='http://www.springframework.org/tags'%>
<%@taglib prefix='form' uri='http://www.springframework.org/tags/form'%> 
<!doctype html>
<html lang='nl'>
<head>
<title>
Test
</title>
</head>
<body>
<h1>Test</h1>
<form:form action='' modelAttribute='commandObject' method='get'>
<form:input path='value' autofocus='autofocus'/> 
<form:errors path='value'/> 
 <input type='submit' value='Zoeken'> 
</form:form>
</body>
</html>