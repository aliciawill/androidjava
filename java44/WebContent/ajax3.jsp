<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript" src="js/jquery.ajax-cross-origin.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				crossOrigin: true,
				url : "http://rss.hankyung.com/new/news_enter.xml",
				success : function(doc) {
					list = $(doc).find('item')
					console.log(list.length)
					$(list).each(function(index, item) {
						console.log(item)
						console.log($(item).find('title').text())
						$('#d1').append($(item).find('title').text() + "<br>")
					})
							
				}
			})
		})
	})
</script>
</head>
<body>
	<button id="b1">XML읽어오기</button>
	<button id="b2">JSON읽어오기</button>
	<button id="b3">DB에 넣기</button>
	<hr color="red">
	<div id="d1"></div>

</body>
</html>