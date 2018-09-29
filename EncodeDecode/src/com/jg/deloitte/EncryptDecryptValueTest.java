package com.jg.deloitte;

import static org.junit.Assert.*;

import org.junit.Test;

public class EncryptDecryptValueTest {

	@Test
	public final void testMain() {
		//fail("Not yet implemented");
		EncryptDecryptValue test1 = new EncryptDecryptValue();
		test1.decodeTheValue("inAm");
	}

	@Test
	public final void testEncodeTheValueAmin() {
		EncryptDecryptValue test1 = new EncryptDecryptValue();
		String valueBack = test1.encodeTheValue("Amin");
		assertTrue("incorrect.", valueBack.equalsIgnoreCase("inAm"));
	}

	@Test
	public final void testDecodeTheValueAmin() {
		EncryptDecryptValue test1 = new EncryptDecryptValue();
		test1.decodeTheValue("inAm");
	}
	
	@Test
	public final void testEncodeTheValueJohn() {
		EncryptDecryptValue test1 = new EncryptDecryptValue();
		String valueBack = test1.encodeTheValue("John");
		assertTrue("incorrect.", valueBack.equalsIgnoreCase("hnJo"));
	}

	@Test
	public final void testDecodeTheValueJohn() {
		EncryptDecryptValue test1 = new EncryptDecryptValue();
		String valueBack = test1.decodeTheValue("hnJo");
		assertTrue("incorrect.", valueBack.equalsIgnoreCase("John"));
	}

	@Test
	public final void testEncodeTheValueVimal() {
		EncryptDecryptValue test1 = new EncryptDecryptValue();
		String valueBack = test1.encodeTheValue("Vimal");
		assertTrue("incorrect. RtnBack was " + valueBack, valueBack.equalsIgnoreCase("Vimal#"));
	}

	@Test
	public final void testDecodeTheValueVimal() {
		EncryptDecryptValue test1 = new EncryptDecryptValue();
		String valueBack = test1.decodeTheValue("Vimal#");
		assertTrue("incorrect. RtnBack was " + valueBack, valueBack.equalsIgnoreCase("al#Vim"));
	}

	@Test
	public final void testEncodeTheValueSridhar() {
		EncryptDecryptValue test1 = new EncryptDecryptValue();
		String valueBack = test1.encodeTheValue("Sridhar");
		assertTrue("incorrect. RtnBack was " + valueBack, valueBack.equalsIgnoreCase("Sridhar#"));
	}

	@Test
	public final void testDecodeTheValueSridhar() {
		EncryptDecryptValue test1 = new EncryptDecryptValue();
		String valueBack = test1.decodeTheValue("Sridhar#");
		assertTrue("incorrect. RtnBack was " + valueBack, valueBack.equalsIgnoreCase("har#Srid"));
	}

}
