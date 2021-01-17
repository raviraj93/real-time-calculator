var a = '';
var b = '';
var num = [];
var ans;

function sendNum(digit){

	num.push(digit);

	if(num.length != 1){
		a = '';
		document.getElementById('screen').innerHTML = a;
	}


	for(i=0; i<num.length ; i++){

		a = a + num[i] + ' ';

	}

    document.getElementById('screen').innerHTML = a;
}

function equalTo(){
	document.getElementById('screen').innerHTML = '';

	for(i=0; i<num.length ; i++){

		b += num[i] + ' ';
	}

    let socket = new WebSocket("ws://localhost:8080");

//    socket.addEventListener('open', function (event) {
//        console.log(b)
//        socket.send(b);
//    });
//
//   socket.addEventListener('message', function (event) {
//       console.log('Message from server ', event.data);
//   });

    socket.onopen = function(e) {
      alert("[open] Connection established");
      alert("Sending to server");
      socket.send(b);
    };

//	document.getElementById('screen').innerHTML = ans;

	while(num.length > 0){
    	num.pop();
	}

	socket.onmessage = function(event) {
      alert(`[message] Data received from server: ${event.data}`);
      document.getElementById('screen').innerHTML = event.data;
    };

    socket.onclose = function(event) {
      if (event.wasClean) {
        alert(`[close] Connection closed cleanly, code=${event.code} reason=${event.reason}`);
      } else {
        // e.g. server process killed or network down
        // event.code is usually 1006 in this case
        alert('[close] Connection died');
      }
    };

    socket.onerror = function(error) {
      alert(`[error] ${error.message}`);
    };

//	num.push(ans.toString());

}


function clearScr(){
	document.getElementById('screen').innerHTML = '';

	while(num.length > 0){
    	num.pop();
	}

	a ='';
	b ='';
}