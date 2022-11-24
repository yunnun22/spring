$(document).ready(function(){
	$('#btn').click(process);
});


function process(){
	$.ajax({
		type:'GET',
		dataType:'json',
		url:'searchOpen.do?query='+$('#search').val(),
		success:viewMessage,
		error:function(xhr, textDtatus, error){
			alert(xhr.status);
		}
	});

}

function viewMessage(res){
//console.log(res);
//alert(res.documents[0].title);

 $.each(res.documents, function(index, element){
 	$('#wrap table').append(`<tr><td>${element.title}</td><td><a href="${element.url}"><img src=${element.thumbnail} /></a><td>${element.price}</td></td></tr>`);
 })
}