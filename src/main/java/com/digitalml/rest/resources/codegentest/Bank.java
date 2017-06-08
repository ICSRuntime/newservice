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
    "chequebook"
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

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    pin = org.apache.commons.lang3.StringUtils.EMPTY;
	    address = org.apache.commons.lang3.StringUtils.EMPTY;
	    chequebook = org.apache.commons.lang3.StringUtils.EMPTY;
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
}