package Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import junit.framework.TestCase;
import model.Gun;

public class GunTest extends TestCase{

	private String name;
	private int bullets;
	private Gun gun;
	
	void escenarioUno() {
		
		
		name = "Shark";
		bullets = 32;
		
		gun = new Gun(name, bullets);
		
	}


	@Test
	public void testGetName() {
		
		escenarioUno();
	
		assertEquals(gun.getName(), name);
	}
	@Test
	public void testSetName() {
		
		escenarioUno();
		
		String other = "Bird";
			
		gun.setName(other);
		
		assertEquals(gun.getName(), other);
	
	}
	@Test
	public void testGetBullets() {
		
		escenarioUno();
		
		int bullet = gun.getBullets();
		assertTrue(bullets == bullet);
	}
	@Test
	public void tesSettBullets() {
		
		escenarioUno();
		int newbullets = 3;
		gun.setBullets(newbullets);
		
		int updatedBullests = gun.getBullets();
		assertTrue(newbullets == updatedBullests);
		
	}
	
}
