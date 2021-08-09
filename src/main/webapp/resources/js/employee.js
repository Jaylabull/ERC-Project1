
async function addReimbursements(e){
	e.preventDefault();
	let uId = document.getElementById('eId').value;
	let amount = document.getElementById('rAmount').value;
	let description = document.getElementById('description').value;
	let type = document.getElementById('radio-option').value;
	let testDiv = document.getElementById('test');

let reimbursement = {
	
	userId: uId,
	amount, 
	content: description,
	rType: type

}

//console.log(reimbursement);


let req = await fetch('http://localhost:8080/ERCProject1/api/addReimbursements', {
		method: "POST",
		 headers:{
                 'Content-Type' : 'application/json'
             },
             
		body: JSON.stringify(reimbursement)
	});
	
	let res = await req.json();
	
		
			console.log(res);

     
		let rTable = document.createElement('div');
		
		rTable.classList.add('reimTable');
		
		rTable.innerHTML = ` <div id="reim-container" >
			<table class="table reimTable">
			  <thead>
			    <tr>
			     <th scope="col"></th>
			      <th scope="col">Reimbursement ID:</th>
			      <th scope="col">Amount</th>
			      <th scope="col">Description</th>
			      <th scope="col">Type</th>
			    </tr>
			  </thead>
			  <tbody>
			    <tr>
			      <th scope="row"></th>
			      <td>${res.reimbursement_id}</td>
			      <td>${res.reimbursement_amt}</td>
			      <td>${res.reimbursement_despt}</td>
			      <td>TRAVEL</td>
			    </tr>
			    <tr>
			      <th scope="row"></th>
			      <td colspan="2"></td>
			      <td></td>
			    </tr>
			  </tbody>
			</table>
		`;
		
let container = document.getElementById('reim-container'); 
container.append(rTable);

	} 

			


document.getElementById("submitReimb").addEventListener('click', addReimbursements);
ddocument.getElementById("viewReimb").addEventListener('click', viewReimbursements);