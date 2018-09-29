package com.jg.deloitte;

import org.apache.log4j.Logger;

public class EncryptDecryptValue {
	static Logger log = Logger.getLogger(EncryptDecryptValue.class.getName());

	public String encodeTheValue(String inputValue) {
		log.info("Input value->" + inputValue);
		StringBuilder sb = new StringBuilder();
		String firstPart = null;
		String secondPart = null;
		// determine odd or even length
		if (inputValue.length() % 2 == 0) {
			log.info("E/C Even length");
			firstPart = inputValue.substring(0, inputValue.length() / 2);
			secondPart = inputValue.substring(inputValue.length() / 2, inputValue.length());
			sb.append(secondPart);
			sb.append(firstPart);
		} else {
			log.info("E/C Odd length");
			firstPart = inputValue.substring(0, inputValue.length() / 2 + 1);
			secondPart = inputValue.substring(inputValue.length() / 2 + 1);
			sb.append(firstPart);
			sb.append(secondPart);
			sb.append("#");
		}

		return sb.toString();
	}

	public String decodeTheValue(String inputValue) {
		String firstPart = null;
		String secondPart = null;
		StringBuilder sb = new StringBuilder();
		// determine odd or even length
		if (inputValue.length() % 2 == 0) {
			log.info("D/C Even length");
			firstPart = inputValue.substring(0, inputValue.length() / 2);
			secondPart = inputValue.substring(inputValue.length() / 2, inputValue.length());
			sb.append(secondPart);
			sb.append(firstPart);
		} else {
			log.info("D/C Odd length");
			firstPart = inputValue.substring(0, inputValue.length() / 2 + 1);
			secondPart = inputValue.substring(inputValue.length() / 2 + 1);
			sb.append(firstPart);
			sb.append(secondPart);
		}
		log.debug("StringBuilder->" + sb.toString());
		return sb.toString();
	}
}
