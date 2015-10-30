package tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import crownandanchor.Dice;
import crownandanchor.DiceValue;
import crownandanchor.Game;
import crownandanchor.Player;

import static org.mockito.Mockito.*;

public class Bug1 {

	Dice d1, d2, d3;
	Player player;
	Game game;
	int balance;

	@Before
	public void setUp() throws Exception {

		Dice d1 = mock(Dice.class);
		when(d1.getValue()).thenReturn(DiceValue.values()[0]);
		Dice d2 = mock(Dice.class);
		when(d2.getValue()).thenReturn(DiceValue.values()[1]);
		Dice d3 = mock(Dice.class);
		when(d3.getValue()).thenReturn(DiceValue.values()[2]);


		balance = 100;
		player = new Player("Fred", balance);
		game = new Game(d1, d2, d3);
	}






	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void bug1_1Match_NoBalanceChange() {
		
		int limit = 0;
		player.setLimit(limit);
		int bet = 5;
		
		DiceValue pick = DiceValue.values()[0];
		
		int winnings = game.playRound(player, pick, bet);
		
		assertEquals(balance, player.getBalance());
		
	}

}
