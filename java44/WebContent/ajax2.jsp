<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">
	
	$(function() {
		$('#b1').click(function() {
			$('#d1').empty()
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fhealth.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=rooa9cfdnkctmsnpiftxnozlzfyaunxvudzwajoq",
				data:{
					url : 'http://health.chosun.com/site/data/rss/rss.xml',
					api_key : 'rooa9cfdnkctmsnpiftxnozlzfyaunxvudzwajoq',
					count : 20
				},
				success: function(result) {
					console.log('성공!!' + result)
					list = result.items
					console.log(list.length)
					if(list.length > 0){
						$(list).each(function(index, news) {
							title = news.title
							pubDate = news.pubDate
							link = news.link
							console.log(title)
							console.log(pubDate)
							console.log(link)
							total = "<b><a href=" + link + ">"  + title + "</a></b> : " + pubDate + "<br>" +
									link
							$('#d1').append(total + "<hr>")
						})//each
					}//if
				}//success
			})//ajax
		})//b1
		$('#b2').click(function() {
			$('#d1').empty()
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Ftravel.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=rooa9cfdnkctmsnpiftxnozlzfyaunxvudzwajoq",
				data:{
					url : 'http://travel.chosun.com/site/data/rss/rss.xml',
					api_key : 'rooa9cfdnkctmsnpiftxnozlzfyaunxvudzwajoq',
					count : 20
				},
				success: function(result) {
					console.log('성공!!' + result)
					list = result.items
					console.log(list.length)
					if(list.length > 0){
						$(list).each(function(index, news) {
							title = news.title
							pubDate = news.pubDate
							link = news.link
							console.log(title)
							console.log(pubDate)
							console.log(link)
							total = "<b><a href=" + link + ">"  + title + "</a></b> : " + pubDate + "<br>" +
									link
							$('#d1').append(total + "<hr>")
						})//each
					}//if
				}//success
			})//ajax
		})//b2
	})//start
		
</script>
</head>
<body>
<button id= "b1" style=background:yellow>헬스 연결</button>
<button id= "b2" style=background:pink>트래블 연결</button>
<button id= "b3" style=background:green>아트 연결</button>
<hr color="red">
<div id="d1"></div>

</body>
</html>