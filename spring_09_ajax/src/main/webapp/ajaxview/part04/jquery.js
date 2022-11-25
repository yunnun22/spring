$(document).ready(function(){
	$('#btn').click(process);
});


/*
//function process(){
//	$.ajax({
//		type:'GET',
//		dataType:'json',
//		url:'searchOpen.do?query='+$('#search').val(),
//		success:viewMessage,
//		error:function(xhr, textDtatus, error){
//			alert(xhr.status);
//		}
//	});
//
//}
*/  

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
//console.log(res);
//alert(res.documents[0].title);

 $.each(res.documents, function(index, element){
 	$('#wrap table').append(`<tr><td>${element.title}</td><td><a href="${element.url}"><img src=${element.thumbnail} /></a><td>${element.price}</td></td></tr>`);
 })
}