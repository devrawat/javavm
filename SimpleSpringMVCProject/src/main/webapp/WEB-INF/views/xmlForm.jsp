<html>
<head>
<script type="text/javascript">  
	function check() {
		$.ajax({
			datatype : "xml",
			type : "POST",
			contentType: 'application/xml',
			url: contexPath+"/xmlDisplay",
			data : $('#xmlValue').val(),
			success : function(response) {
				$('#xmlValueResult').val(response.toString());
			},
			error : function(e) {
				alert('Error: ' + e);
			}
		});
	}
</script>
<script type="text/javascript"> 
         var contexPath = "<%=request.getContextPath() %>"; 
</script> 
</head>
<body>
	<form name="myform">
		INPUT XML:</BR>
		<textarea rows="10" cols="100" id="xmlValue">
		<person>
			<firstName>John</firstName>
			<lastName>Wells</lastName>
		</person>
		</textarea></BR>
		OUTPUT XML:</BR>
		<textarea rows="10" cols="100" id="xmlValueResult">
		</textarea>
		<input value="GO" type="button" onclick='check()';>
	</form>
	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
</body>
</html>
