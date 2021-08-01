package com.reimbursement.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import com.reimbursement.dao.ReimbursementDaoDB;
import com.reimbursement.services.ReimbursementServices;

public class ReimbursementServiceTest {

	@InjectMocks
	public ReimbursementServices rServ;
	
	@Mock
	public ReimbursementDaoDB rDao;
	
	
	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void testReimbursementArray() {
		
		List rList = Mockito.spy(new ArrayList());
		
		rList.add("test");
		Mockito.verify(rList).add("test");
		
		assertEquals(1, rList.size());
		
		
	}
	
}
