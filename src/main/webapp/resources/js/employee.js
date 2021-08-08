
let container = document.getElementById('reim-container');

async function getReimbursement(){
}



document.getElementById("submitReimb").addEventListener('click', newReimbursement);

async function newReimbursement(e){
	e.preventDefault();
	let req = await fetch('http://localhost:8080/ERCProject1/api/session');
	let res = await req.json();
	
	let uId = res.userId;
	let amount = res.amount.getElementById('rAmount').value;
	let description = res.content.value;
	let type = res.document.getElementByName('radio-btn');
	
	for(var i = 0; i <type.length; i++){
		if(type[i].checked){
			alert(type[i].value);
			break;
		}
	}
	
let reimbursement = {
	
	userId: uId,
	amount, 
	content: description,
	rType: type,

}

console.log(reimbursement);
console.log(res);

await fetch('http://localhost:8080/ERCProject1/api/addReimbursements', {
		method: "POST",
		contentType: "application/json",
		body: JSON.stringify(reimbursement)
	});

	
	
}


/*
function populateReim(data) {
	
	
	
	forEach(postObj of data){
		let rTable = document.createElement('div');
		
		rTable.classList.add('reimTable');
		
		rTable.innerHTML = ` <div id="reim-container" >
			<table class="table reimTable">
			  <thead>
			    <tr>
			      <th scope="col">Reimbursement ID: ${}</th>
			      <th scope="col">Type</th>
			      <th scope="col">Amount</th>
			      <th scope="col">Description</th>
			      <th scope="col">Date Submitted</th>
			      <th scope="col">Status</th>
			    </tr>
			  </thead>
			  <tbody>
			    <tr>
			      <th scope="row"></th>
			      <td></td>
			      <td></td>
			      <td></td>
			    </tr>
			    <tr>
			      <th scope="row"></th>
			      <td></td>
			      <td></td>
			      <td></td>
			    </tr>
			    <tr>
			      <th scope="row"></th>
			      <td colspan="2"></td>
			      <td></td>
			    </tr>
			  </tbody>
			</table>
		`;
		console.log(postObj);
		container.append(rTable);
		
	}
		
}
*/