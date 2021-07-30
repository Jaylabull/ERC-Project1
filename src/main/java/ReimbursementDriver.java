import com.reimbursement.util.HibernateUtil;
import com.reimbursement.dao.ReimbursementDaoDB;
import com.reimbursement.dao.UserDaoDB;
import com.reimbursement.models.Reimbursement;
import com.reimbursement.models.User;
import com.reimbursement.models.UserRole;

public class ReimbursementDriver {

	public static void main(String[] args) {
	
		UserDaoDB uDao = new UserDaoDB();
		
		ReimbursementDaoDB rDao = new ReimbursementDaoDB();
		
		UserRole ur = new UserRole();
		
		User u = new User("Jazmine", "Sullivan", "js@mail.com", "password");
		uDao.createUser(u);
		uDao.updateUser("EMPLOYEE");
		
		Reimbursement r = new Reimbursement(150, "SUBMITTED", "PENDING", "Company outing.");
		rDao.createReim(r);
		
		
//		HibernateUtil.closeSes();
	}

}
