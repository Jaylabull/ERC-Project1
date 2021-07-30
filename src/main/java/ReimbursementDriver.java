import com.reimbursement.util.HibernateUtil;
import com.reimbursement.dao.ReimbursementDaoDB;
import com.reimbursement.dao.UserDaoDB;
import com.reimbursement.models.Reimbursement;
import com.reimbursement.models.ReimbursementStatus;
import com.reimbursement.models.User;
import com.reimbursement.models.UserRole;

public class ReimbursementDriver {

	public static void main(String[] args) {
	
		UserDaoDB uDao = new UserDaoDB();
		
		ReimbursementDaoDB rDao = new ReimbursementDaoDB();
		
//		ReimbursementStatus rs = new ReimbursementStatus();
		
		User u = new User("Jazmine", "Sullivan", "js@mail.com", "password", new UserRole("EMPLOYEE"));
		uDao.createUser(u);
		
		User u1 = new User("Mike", "Jones", "mj56@mail.com", "password", new UserRole("EMPLOYEE"));
		uDao.createUser(u1);
		
		User u3 = new User("Warren", "Buffet", "wb@mail.com", "password", new UserRole("FINANCIAL MANAGER"));
		uDao.createUser(u1);
		
		
//		Reimbursement r = new Reimbursement(680, "Dinner celebration Day 2");
//		rDao.createReim(r);
		
		
//		HibernateUtil.closeSes();
	}

}
