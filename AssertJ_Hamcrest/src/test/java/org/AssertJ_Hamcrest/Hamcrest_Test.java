package org.AssertJ_Hamcrest;

import org.junit.matchers.JUnitMatchers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Every.everyItem;


import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Hamcrest_Test {

	private List<String> tennisPlayers;
	List<Integer> ranking;


	@Before
	public void init(){

		tennisPlayers = Arrays.asList(
				new String[]{"Rafa Nadal",
						"Milos Raonic",
						"Novak Djokovic",
						"Alexander Zverev",
						"Dominic Thiem",
						"Roger Federer"
				});

		ranking = Arrays.asList(5, 2, 4);
	}

	@Test
	public void testMatchers(){

		assertThat(tennisPlayers, JUnitMatchers.hasItem("Rafa Nadal"));

		assertThat(tennisPlayers, contains("Rafa Nadal", "Milos Raonic", "Novak Djokovic", "Alexander Zverev", "Dominic Thiem", "Roger Federer"));
        assertThat(ranking, hasSize(3));
        assertThat(ranking, contains(5, 2, 4));
        assertThat(ranking, containsInAnyOrder(2, 4, 5));
        assertThat(ranking, everyItem(greaterThan(1)));
		


	}

}
