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
	public void test() {
		Player player = new Player("test", 100);
		assertFalse(player.balanceExceedsLimitBy(player.getBalance()));
	}

}
