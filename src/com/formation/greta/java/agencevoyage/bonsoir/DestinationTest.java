package com.formation.greta.java.agencevoyage.bonsoir;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DestinationTest {

	private Destination d;

	@BeforeEach
	void initDest() {
		d = new Destination();
	}

	@Test
	void testCtor() {

		assertEquals(0, d.getNbreJours());

	}

	@Test
	void testAllonger() {
		
		d.setNbreJours(10);
		d.allongerSejour(20);
		assertEquals(30, d.getNbreJours());
	}

	@Test
	void setPays() {

		d.setNomDest("France");
		assertEquals("France", d.getNomDest());

	}

}
