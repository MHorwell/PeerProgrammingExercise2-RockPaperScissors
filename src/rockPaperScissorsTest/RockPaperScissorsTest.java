package rockPaperScissorsTest;

import org.junit.Test;
import rockPaperScissors.Main;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RockPaperScissorsTest {
	
	@Test
	public void TestScore() {
		Main rps = new Main();
		String selectedWeapon = "s";
		String computerWeapon = "p";
		
		rps.fight(selectedWeapon, computerWeapon);
		rps.fight("p", computerWeapon);
		rps.fight(selectedWeapon, computerWeapon);
		assertEquals(2, rps.getPoints());
	}
	
	@Test
	public void TestGame() {
		
		Main rps = new Main();
		
		rps.game();
		
		assertNotNull(rps, "");
		
	}
	
	@Test
	public void TestPaperTie() {
		Main rps = new Main();
		String computerWeapon = "p";
		String selectedWeapon = "p";
		assertEquals(0, rps.fight(selectedWeapon, computerWeapon));
	}
	@Test
	public void TestRockTie() {
		Main rps = new Main();
		String computerWeapon = "r";
		String selectedWeapon = "r";
		assertEquals(0, rps.fight(selectedWeapon, computerWeapon));
	}
	@Test
	public void TestScissorsTie() {
		Main rps = new Main();
		String computerWeapon = "s";
		String selectedWeapon = "s";
		assertEquals(0, rps.fight(selectedWeapon, computerWeapon));
	}
	
	
	@Test
	public void TestScissorsWins() {
		Main rps = new Main();
		String selectedWeapon = "s";
		String computerWeapon = "p";
		assertEquals(1, rps.fight(selectedWeapon, computerWeapon));
	}
	
	@Test
	public void TestScissorsLoses() {
		Main rps = new Main();
		String selectedWeapon = "s";
		String computerWeapon = "r";
		assertEquals(-1, rps.fight(selectedWeapon, computerWeapon));
	}
	
	@Test
	public void TestPaperWins() {
		Main rps = new Main();
		String selectedWeapon = "p";
		String computerWeapon = "r";
		assertEquals(1, rps.fight(selectedWeapon, computerWeapon));
	}
	
	@Test
	public void TestPaperLoses() {
		Main rps = new Main();
		String selectedWeapon = "p";
		String computerWeapon = "s";
		assertEquals(-1, rps.fight(selectedWeapon, computerWeapon));
	}
	
	@Test
	public void TestRockWins() {
		Main rps = new Main();
		String selectedWeapon = "r";
		String computerWeapon = "s";
		assertEquals(1, rps.fight(selectedWeapon, computerWeapon));
	}
	
	@Test
	public void TestRockLoses() {
		Main rps = new Main();
		String selectedWeapon = "r";
		String computerWeapon = "p";
		assertEquals(-1, rps.fight(selectedWeapon, computerWeapon));
	}
	
	
	


}
