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
=======
=======
>>>>>>> my_branch
    },
    "debitCard": {
      "type": "string"
    },
    "creditCard": {
      "type": "string"
<<<<<<< HEAD
>>>>>>> my_branch
=======
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
=======
=======
>>>>>>> my_branch
	@Size(max=1)
	@NotNull
	private String debitCard;

	@Size(max=1)
	@NotNull
	private String creditCard;

<<<<<<< HEAD
>>>>>>> my_branch
=======
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
=======
	    debitCard = org.apache.commons.lang3.StringUtils.EMPTY;
	    creditCard = org.apache.commons.lang3.StringUtils.EMPTY;
>>>>>>> my_branch
=======
	    debitCard = org.apache.commons.lang3.StringUtils.EMPTY;
	    creditCard = org.apache.commons.lang3.StringUtils.EMPTY;
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
=======
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
>>>>>>> my_branch
=======
>>>>>>> my_branch
}