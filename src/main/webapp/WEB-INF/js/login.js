/**
 * 
 */
 
 let form = document.getElementById('login').addEventListener('submit', login);
 
 async function login(e){
	e.preventDefault();
	
	let username = document.getElementById('usename').value;
	let password = document.getElementById('password').value;
	
//	console.log(username, password);
	
	let user = {
		username,
		password	
	};
	console.log(u)
	try{
		let req = await fetch("localhost:8080/SocialHubWeek3/api/login", {
			method: 'POST' ,
			headers: {
				'Content-Type' : 'application/json'
			},
			body: JSON.stringify(user)
			
		});
		
		let res = await req.json();
		console.log(e);
	}catch(e){
		alert("Username or password was incorrect");
		return;
	}
	
	location.href = 'resources/html/helloSocialHub.html';

}