import com.reimbursement.util.HibernateUtil;
import com.reimbursement.dao.ReimbursementDaoDB;
import com.reimbursement.dao.UserDaoDB;
import com.reimbursement.models.Reimbursement;
import com.reimbursement.models.User;

public class ReimbursementDriver {

	public static void main(String[] args) {
	
		UserDaoDB uDao = new UserDaoDB();
		
		ReimbursementDaoDB rDao = new ReimbursementDaoDB();
		
		
		User u = new User("Jayla", "Bull", "jb@gmail.com", "password");
		uDao.createUser(u);
		
		
		Reimbursement r = new Reimbursement(50, "SUBMITTED", "PENDING", "Company dinner expense.");
		rDao.createReim(r);
		
		
//		HibernateUtil.closeSes();
	}

}
