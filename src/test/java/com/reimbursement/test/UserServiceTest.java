package com.reimbursement.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;


import com.reimbursement.dao.UserDaoDB;
import com.reimbursement.models.User;
import com.reimbursement.models.UserRole;
import com.reimbursement.services.UserServices;

public class UserServiceTest {

	@InjectMocks
	public UserServices uServ;

	
	@Mock
	public UserDaoDB uDao;
	
	
	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testSignIn() {
		UserRole r1 = new UserRole("EMPLOYEE");
		UserRole r2 = new UserRole("FINANCIAL MANAGER");
		
		
		User u = new User(1, "User123", "User", "Test", "test@email.com", "testpassword", r1);
		User notUser = new User(0, "User", "Test", "test@email.com", "testpassword", r2);
		
		when(uDao.selectByUsername(anyString())).thenReturn(u);
		
		User signedIn = uServ.signIn("User123", "testpassword");
		
		assertEquals(u.getUsername(), signedIn.getUsername());
	}

	
}
