package com.ps.mock.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MasterControllerTest {

	@Mock
	MasterController controller;
	
	
	
	@Test
	public void testController() {
		
		when(controller.home()).thenReturn("Modified the return type");
		assertEquals("Modified the return type",controller.home());
		verify(controller).home();
	}
	

}
