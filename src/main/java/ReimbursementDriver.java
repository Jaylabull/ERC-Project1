import com.reimbursement.util.HibernateUtil;
import com.reimbursement.dao.UserDaoDB;
import com.reimbursement.models.User;

public class ReimbursementDriver {

	public static void main(String[] args) {
	
		UserDaoDB uDao = new UserDaoDB();
		
		
		User u = new User("Jayla", "Bull", "jb@gmail.com", "password");
		uDao.createUser(u);
		
//		HibernateUtil.closeSes();
	}

}
