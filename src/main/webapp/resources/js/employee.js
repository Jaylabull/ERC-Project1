/* window.onload = getReimbursements(); */

let container = document.getElementById('reim-container');

async function getReimbursement(){
	let res = await fetch('http://localhost:8080/ERCProject1/api/employeeHome');
	let data = await res.json();
	populateReimbursement(data);
	console.log(data);

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