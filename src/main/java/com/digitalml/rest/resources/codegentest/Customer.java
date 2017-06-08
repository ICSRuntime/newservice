package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.*;

/*
JSON Representation for Customer:
{
  "required": [
    "id"
  ],
  "type": "object",
  "properties": {
    "id": {
      "type": "string"
    }
  }
}
*/

public class Customer {

	@Size(max=1)
	@NotNull
	private String id;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    id = org.apache.commons.lang3.StringUtils.EMPTY;
	}
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
}