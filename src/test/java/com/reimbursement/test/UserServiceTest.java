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
	public void testSignUp() {
		User u = new User(1, "User", "Test", "test@email.com", "testpassword");
		User notUser = new User(0, "User", "Test", "test@email.com", "testpassword");
		
		when(uDao.selectByUsername(anyString())).thenReturn(u);
		
		User signedIn = uServ.signIn("User", "testpassword");
		
		assertEquals(u.getUserId(), signedIn.getUserId());
	}


	
}
