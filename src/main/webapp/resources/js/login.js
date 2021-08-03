/**
 * 
 */
 let form = document.getElementById('login').addEventListener('submit', login);

async function login(e){
	e.preventDefault();
	let username = document.getElementById("username").value;
	let password = document.getElementById("password").value;
	
	let user = {
		username,
		password
	}
	
	console.log(user);

	
	try{
		let req = await fetch('http://localhost:8080/ERCProject1/api/login', {
			method: 'POST',
			headers: {
				'Content-Type': 'application/json'
			},
			body: JSON.stringify(user)
		});
		let res = await req.text();
		console.log(res);
	} catch(e){
		console.log(e.stack);
		alert('Username or password incorrect!');
		return;
	}
	
	location.href = 'resources/html/SocialHub.html';
}
 