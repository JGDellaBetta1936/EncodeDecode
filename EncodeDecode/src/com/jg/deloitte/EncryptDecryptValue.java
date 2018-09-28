package com.jg.deloitte;

import org.apache.log4j.Logger;

public class EncryptDecryptValue {
	static Logger log = Logger.getLogger(EncryptDecryptValue.class.getName());

	public static void main (String [] args) {
		EncryptDecryptValue edv1 = new EncryptDecryptValue();
		log.info("recived back->" + edv1.encodeTheValue("Amin") );
	}
	
	
	public String encodeTheValue(String inputValue) {
		log.info("Input value->" + inputValue);
		StringBuilder sb = new StringBuilder();
		String firstPart = null;
		String secondPart = null;
		// determine odd or even length
		if (inputValue.length() % 2 == 0) {
			log.info("Even length");
			firstPart = inputValue.substring(0, inputValue.length() / 2);
			secondPart = inputValue.substring(inputValue.length() / 2, inputValue.length()) ;
			sb.append(secondPart);
			sb.append(firstPart);
		} else {
			log.info("Odd length");
		}

		return sb.toString();
	}
	public String decodeTheValue(String inputValue) {
		String rtnString = null;
		// determine odd or even length
		if (inputValue.length() % 2 == 0) {
			log.info("Even length");
		} else {
			log.info("Odd length");
		}

		return rtnString;
	}
}
