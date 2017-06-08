package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.*;

/*
JSON Representation for Bank:
{
  "required": [
    "address",
    "pin",
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    "chequebook"
=======
    "chequebook",
    "debitCard",
    "creditCard"
>>>>>>> my_branch
=======
    "chequebook",
    "debitCard",
    "creditCard"
>>>>>>> my_branch
=======
    "chequebook",
    "debitCard",
    "creditCard"
>>>>>>> my_branch
=======
=======
>>>>>>> my_branch
    "chequebook",
    "address_1",
    "debitCard",
    "creditCard"
<<<<<<< HEAD
>>>>>>> my_branch
=======
>>>>>>> my_branch
=======
    "chequebook",
    "debitCard",
    "report",
    "creditCard"
>>>>>>> my_branch
  ],
  "type": "object",
  "properties": {
    "pin": {
      "type": "string"
    },
    "address": {
      "type": "string"
    },
    "chequebook": {
      "type": "string"
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> my_branch
=======
>>>>>>> my_branch
=======
>>>>>>> my_branch
=======
>>>>>>> my_branch
=======
>>>>>>> my_branch
    },
    "debitCard": {
      "type": "string"
    },
    "creditCard": {
      "type": "string"
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> my_branch
=======
>>>>>>> my_branch
=======
>>>>>>> my_branch
=======
    },
    "address_1": {
      "type": "string"
>>>>>>> my_branch
=======
    },
    "address_1": {
      "type": "string"
>>>>>>> my_branch
=======
    },
    "report": {
      "type": "string"
>>>>>>> my_branch
    }
  }
}
*/

public class Bank {

	@Size(max=1)
	@NotNull
	private String pin;

	@Size(max=1)
	@NotNull
	private String address;

	@Size(max=1)
	@NotNull
	private String chequebook;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> my_branch
=======
>>>>>>> my_branch
=======
>>>>>>> my_branch
=======
>>>>>>> my_branch
=======
>>>>>>> my_branch
	@Size(max=1)
	@NotNull
	private String debitCard;

	@Size(max=1)
	@NotNull
	private String creditCard;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> my_branch
=======
>>>>>>> my_branch
=======
>>>>>>> my_branch
=======
=======
>>>>>>> my_branch
	@Size(max=1)
	@NotNull
	private String address_1;

<<<<<<< HEAD
>>>>>>> my_branch
=======
>>>>>>> my_branch
=======
	@Size(max=1)
	@NotNull
	private String report;

>>>>>>> my_branch
	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    pin = org.apache.commons.lang3.StringUtils.EMPTY;
	    address = org.apache.commons.lang3.StringUtils.EMPTY;
	    chequebook = org.apache.commons.lang3.StringUtils.EMPTY;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
	    debitCard = org.apache.commons.lang3.StringUtils.EMPTY;
	    creditCard = org.apache.commons.lang3.StringUtils.EMPTY;
>>>>>>> my_branch
=======
	    debitCard = org.apache.commons.lang3.StringUtils.EMPTY;
	    creditCard = org.apache.commons.lang3.StringUtils.EMPTY;
>>>>>>> my_branch
=======
	    debitCard = org.apache.commons.lang3.StringUtils.EMPTY;
	    creditCard = org.apache.commons.lang3.StringUtils.EMPTY;
>>>>>>> my_branch
=======
	    debitCard = org.apache.commons.lang3.StringUtils.EMPTY;
	    creditCard = org.apache.commons.lang3.StringUtils.EMPTY;
	    address = org.apache.commons.lang3.StringUtils.EMPTY;
>>>>>>> my_branch
=======
	    debitCard = org.apache.commons.lang3.StringUtils.EMPTY;
	    creditCard = org.apache.commons.lang3.StringUtils.EMPTY;
	    address = org.apache.commons.lang3.StringUtils.EMPTY;
>>>>>>> my_branch
=======
	    debitCard = org.apache.commons.lang3.StringUtils.EMPTY;
	    creditCard = org.apache.commons.lang3.StringUtils.EMPTY;
	    report = org.apache.commons.lang3.StringUtils.EMPTY;
>>>>>>> my_branch
	}
	public String getPin() {
		return pin;
	}
	
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getChequebook() {
		return chequebook;
	}
	
	public void setChequebook(String chequebook) {
		this.chequebook = chequebook;
	}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> my_branch
=======
>>>>>>> my_branch
=======
>>>>>>> my_branch
=======
>>>>>>> my_branch
=======
>>>>>>> my_branch
	public String getDebitCard() {
		return debitCard;
	}
	
	public void setDebitCard(String debitCard) {
		this.debitCard = debitCard;
	}
	public String getCreditCard() {
		return creditCard;
	}
	
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> my_branch
=======
>>>>>>> my_branch
=======
>>>>>>> my_branch
=======
=======
>>>>>>> my_branch
	public String getAddress_1() {
		return address;
	}
	
	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}
<<<<<<< HEAD
>>>>>>> my_branch
=======
>>>>>>> my_branch
=======
	public String getReport() {
		return report;
	}
	
	public void setReport(String report) {
		this.report = report;
	}
>>>>>>> my_branch
}