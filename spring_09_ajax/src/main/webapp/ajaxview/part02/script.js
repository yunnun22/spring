let httpRequest;

let btn = document.querySelector("#btn");
btn.onclick = process;

function process(){
	//1. ajax을 처리하기 위한 브라우저별 객체생성을 한다.
	if(window.XMLHttpRequest){
		httpRequest = new XMLHttpRequest();
	}else{
		httpRequest = new ActiveXObject("microsoft.XMLHTTP");//IE6이하
	}

//2.서버가 응답한 데이터를 처리하기 위한 함수를 정의한 후 등록을 한다.
	httpRequest.onreadystatechange = viewMessage;

//3.서버에 요청준비를 한다.
	httpRequest.open('POST', 'name.do', true);

	httpRequest.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

//4.서버에 요청을 한다.
	httpRequest.send('name=' + document.querySelector("#name").value);

}//process

//서버로부터 정상적으로 응답을 받았을때 수행할 함수의 정의
function viewMessage(){
   if(httpRequest.readyState == 4 && httpRequest.status == 200){
      document.querySelector("#wrap").innerHTML = httpRequest.responseText;
   }
}//end viewMessage()




