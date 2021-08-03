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
import com.reimbursement.services.UserServices;

public class ReimbursementDriver {

	public static void main(String[] args) {
	
		 UserDaoDB uDao = new UserDaoDB();
		 UserServices uServ = new UserServices(uDao);
		
//	User u = uServ.signIn("JazmineSullivan1430", "password");
//	
//	System.out.println(u);
		
//		ReimbursementDaoDB rDao = new ReimbursementDaoDB();
//		
//				
//		UserRole ur1 = new UserRole(1, "EMPLOYEE");
//		UserRole ur2 = new UserRole(2, "FINANCIAL MANAGER");
//		
//		ReimbursementStatus rs1 = new ReimbursementStatus(1, "PENDING");
//		ReimbursementStatus rs2 = new ReimbursementStatus(2, "APPROVED");
//		ReimbursementStatus rs3 = new ReimbursementStatus(3, "DENIED");
//		
//		
//		ReimbursementType rt1 = new ReimbursementType(1, "TRAVEL");
//		ReimbursementType rt2 = new ReimbursementType(2, "FOOD");
//		ReimbursementType rt3 = new ReimbursementType(3, "LODGING");
//		ReimbursementType rt4 = new ReimbursementType(4, "OTHER");
//		
//
//		User u = new User("Jazmine", "Sullivan", "js@mail.com", "password", ur1);
//		User u1 = new User("Mike", "Jones", "mj56@mail.com", "password", ur1);
//		User u2 = new User("Warren", "Buffet", "wb@mail.com", "password", ur2);
//		User u3 = new User("Lofti", "Hiphop", "lhb@mail.com", "password", ur1);
//		User u4 = new User("String", "Builder", "sb@mail.com", "password", ur2);
//		User u5 = new User("Mickey", "Mouse", "mm@mail.com", "password", ur2);
		
//		uDao.createUser(u);
//		uDao.createUser(u1);
//		uDao.createUser(u2);
//		uDao.updateUser(u3);
//		uDao.createUser(u4);
//		uDao.createUser(u5);
		
		
//		Reimbursement r = new Reimbursement(320, u, u2, "Road trip to Cali", rt1, rs3);
//		rDao.createReim(r);
//		
//		Reimbursement r1 = new Reimbursement(115, u2, u4 ,"Dinner at STK ATL", rt2, rs1);
//		rDao.createReim(r1);
//		
//		Reimbursement r2 = new Reimbursement(550, u4, u5, "Trip to NYC", rt1, rs2);
//		rDao.createReim(r2);
//		
//		Reimbursement r3 = new Reimbursement(675, u3, u4, "Hotel at DoubleTree LA", rt3, rs3);
//		rDao.createReim(r3);
		
//		Reimbursement r4 = new Reimbursement(555, u3, u, "Staying at the Ritz for the Weekend", rt3, rs3);
//		rDao.createReim(r4);
		
//		List<Reimbursement> rList = new ArrayList<Reimbursement>();
//		rList.add(r);
//		rList.add(r1);
//		rList.add(r2);
//		rList.add(r3);
//		rList.add(r4);
		
		
//		User us = uServ.signIn("JazmineSullivan1430", "password");
//		System.out.println(us);
		
		
		
//		HibernateUtil.closeSes();
	}

}
