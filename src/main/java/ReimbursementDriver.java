import com.reimbursement.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

import com.reimbursement.dao.ReimbursementDaoDB;
import com.reimbursement.dao.UserDaoDB;
import com.reimbursement.models.Reimbursement;
import com.reimbursement.models.ReimbursementStatus;
import com.reimbursement.models.ReimbursementType;
import com.reimbursement.models.User;
import com.reimbursement.models.UserRole;

public class ReimbursementDriver {

	public static void main(String[] args) {
	
		UserDaoDB uDao = new UserDaoDB();
		
		ReimbursementDaoDB rDao = new ReimbursementDaoDB();
		
				
		UserRole ur1 = new UserRole("EMPLOYEE");
		UserRole ur2 = new UserRole("FINANCIAL MANAGER");
		
		ReimbursementStatus rs1 = new ReimbursementStatus("PENDING");
		ReimbursementStatus rs2 = new ReimbursementStatus("APPROVED");
		ReimbursementStatus rs3 = new ReimbursementStatus("DENIED");
		
		
		ReimbursementType rt1 = new ReimbursementType("TRAVEL");
		ReimbursementType rt2 = new ReimbursementType("FOOD");
		ReimbursementType rt3 = new ReimbursementType("LODGING");
		ReimbursementType rt4 = new ReimbursementType("OTHER");
		
		//Reimbursement r = new Reimbursement(320, uDao.selectByUserId(0), uDao.selectByUserId(0), "Road trip to Cali", rt1, rs3);


		User u = new User("Jazmine", "Sullivan", "js@mail.com", "password", ur1);
		User u1 = new User("Mike", "Jones", "mj56@mail.com", "password", ur1);
		User u2 = new User("Warren", "Buffet", "wb@mail.com", "password", ur2);
		
		uDao.createUser(u);
		uDao.createUser(u1);
		uDao.createUser(u2);
		
		
		Reimbursement r = new Reimbursement(320, u, u2, "Road trip to Cali", rt1, rs3);
		rDao.createReim(r);
		
		Reimbursement r1 = new Reimbursement(115, "Dinner at STK ATL", rt2, rs1);
		rDao.createReim(r1);
		
		Reimbursement r2 = new Reimbursement(550, "Trip to NYC", rt1, rs2);
		rDao.createReim(r2);
		
		Reimbursement r3 = new Reimbursement(675, "Hotel at DoubleTree LA", rt3, rs3);
		rDao.createReim(r3);
		
		List<Reimbursement> rList = new ArrayList<Reimbursement>();
		rList.add(r1);
		rList.add(r2);
		rList.add(r3);
		
//		HibernateUtil.closeSes();
	}

}
