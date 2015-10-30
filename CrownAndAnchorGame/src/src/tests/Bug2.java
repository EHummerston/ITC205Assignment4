package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import crownandanchor.Player;

public class Bug2 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void bug2_betBalance_betDenied() {
		Player player = new Player("test", 5);
		player.setLimit(0);
		assertFalse(player.balanceExceedsLimitBy(player.getBalance()));
	}

}
