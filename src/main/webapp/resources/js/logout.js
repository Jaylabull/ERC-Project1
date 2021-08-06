let logout = document.getElementById("logout").addEventListener("click", logout);

async function logout(){
	let req = await fetch('http://localhost:8080/ERS-Project1/logout');
	let res = await req.text();
	console.log(res);
	
	req = await fetch('http://localhost:8080/ERS-Project1/logout');
	res = await req.text();
	console.log(res);
	
	location.href = 'resources/html/login.html';
	
}