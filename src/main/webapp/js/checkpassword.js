
function CheckPassword(event){
	var password=document.getElementById("UserPassword").value;
	
	var passw = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/;
	if(!password.match(passw)){
		
		event.preventDefault();
	}
	
	
}
