package LoginScreen;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class LoginScreenTest {
	
	@Test
	public void testSuccesfulLogin() {
		LoginScreen loginScreen = new LoginScreen();
		assertTrue(loginScreen.login("john1", "password123"));
	}
	
	
	@Test
	public void testFailedLogin() {
		LoginScreen loginScreen = new LoginScreen();
		assertFalse(loginScreen.login("john", "wrongpassword"));
	}
	
	@Test
	public void testAddUser() {
		LoginScreen loginScreen = new LoginScreen();
		loginScreen.addUser("testUser", "testpassword");
		assertTrue(loginScreen.login("testUser", "testpassword"));
	}
	
	
	
	
}
