<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>XMLHttp&amp;JS</title>
</head>
<body>
<h1>ASYNC WEB APP WITH XML HTTP REQUEST AND JAVASCRIPT</h1>
<p id="mla"></p>
<script type="text/javascript">
function mlaData(input) {
	document.getElementById("mla").innerHTML = input;
}

let mlaPromise =new Promise(function(resolve,reject)
{
	let input = 0;
	if(input == 0)
	{
		resolve("Successs......")
	}
	else
		{
		reject("failed...../Deny");
		}
	
	});
	
	
	mlaPromise.then(
			function (value)
			{
				mlaData(value);
			},
			function(error)
			{
				mlaData(error);
			}
			
	);
	
</script>
</body>
</html>