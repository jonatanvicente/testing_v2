package org.AssertJ_Hamcrest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class AssertJ_Test {

	private Collection<String> tennisPlayers;
	private final String ATP = "Grand Slam";
	private final Map<String, Collection<String>> TOURNAMENTS = new HashMap<String, Collection<String>>();


	@Before
	public void init(){

		tennisPlayers = Arrays.asList(
				new String[]{"Rafa Nadal",
						"Thomas Berdych",
						"Novak Djokovic",
						"Jo-Wilfried Tsonga",
						"Stan Wawrinka",
						"Roger Federer"
				});

		TOURNAMENTS.put("Australian Open",tennisPlayers);
		TOURNAMENTS.put("US Open",tennisPlayers);
		TOURNAMENTS.put("Roland Garros", tennisPlayers);
		TOURNAMENTS.put("Wimbledon", tennisPlayers);
	}


	@Test
	public void assertJExamples(){

		//Strings
		assertThat(ATP).startsWith("G").endsWith("Slam").isEqualToIgnoringCase("gRaND SlaM");
		//Collections
		assertThat(tennisPlayers)
		.isNotNull()
		.isNotEmpty()
		.hasSize(6)
		.contains("Rafa Nadal")
		.doesNotContain("Kei Nishikori");
		//Maps
		assertThat(TOURNAMENTS)
		.isNotNull()
		.isNotEmpty()
		.hasSize(4)
		.containsKey("Roland Garros")
		.doesNotContainKey("Masters Finals");


	}


}
