$(document).ready(function(){
	$('#btn').click(process);
});




function process(){
alert('test');
	$.ajax({
		type:'GET',
		url:'https://dapi.kakao.com/v3/search/book?target=title',
		headers:{"Authorization":"KakaoAK 2ad95e011b3023dee0ced0c3c4dcd14e"},
		dataType:'json',
		data:{"query": $('#search').val()},
		success: viewMessage
	});

}




function viewMessage(res){
$.each(res.documents, function(index, element){
 	$('#wrap table').append(`<tr><td>${element.title}</td><td><a href="${element.url}"><img src=${element.thumbnail} /></a><td>${element.price}</td></td></tr>`);
 })
}