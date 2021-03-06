package com.digitalml.rest.resources.codegentest.service;
    	
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import java.net.URL;

import org.apache.commons.collections.CollectionUtils;

import java.util.Date;
import java.lang.Object;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.SecurityContext;
import java.security.AccessControlException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.*;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

// Import any model objects used by the interface

import com.digitalml.rest.resources.codegentest.*;

/**
 * Service: New Service
 * 120
 *
 * This service has been automatically generated by Ignite
 *
 * @author admin
 * @version 1
 *
 */

public abstract class NewServiceService {

	private static final Logger LOGGER = LoggerFactory.getLogger(NewServiceService.class);

	// Required for JSR-303 validation
	static private ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();

	protected static Mapper mapper;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	public void myNewMethod() {
		System.out.println("This doesn't do a lot!");
	}
	
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
=======
>>>>>>> my_branch
	static {
		URL configFile = NewServiceService.class.getResource("NewServiceServiceMappings.xml");
		if (configFile != null) {

			List<String> mappingFiles = new ArrayList<String>();
			mappingFiles.add(configFile.toExternalForm());
			mapper = new DozerBeanMapper(mappingFiles);

		} else {
			mapper = new DozerBeanMapper(); // Use default wildcard mappings only
		}
	}

	protected boolean checkPermissions(SecurityContext securityContext) throws AccessControlException {
		return true;
		//return securityContext != null ? securityContext.isUserInRole("ROLE_ADMINISTRATOR") : false;
	}

	/**
	Implements method _NewOperation_1	*/
	public NewOperation1ReturnDTO _NewOperation_1(SecurityContext securityContext, NewOperation1InputParametersDTO inputs)  {

		if (LOGGER.isDebugEnabled())
			LOGGER.debug("Entered method _NewOperation_1");

		// Do any security checks
		if (securityContext == null)
			throw new AccessControlException("No SecurityContext available so cannot access _NewOperation_1");

		if (!checkPermissions(securityContext))
			throw new AccessControlException("Insufficient permissions to access _NewOperation_1");

        NewOperation1CurrentStateDTO currentState = new NewOperation1CurrentStateDTO();
        
        // Setup the inputs for the first process step
        mapper.map(inputs, currentState.getInputs());
		Object returnDTO = null;
		return currentState.getReturnObject();
	}


    // Supporting Use Case and Process methods



// Supporting Exception classes

// Supporting DTO classes


	/**
	 * Provides a DTO to hold the current state of the orchestration for the operation New Operation 1.
	 * This allows the state to be easily passed in method calls.
	 */
	public static class NewOperation1CurrentStateDTO {
		
		private NewOperation1InputParametersDTO inputs;
		private NewOperation1ReturnDTO returnObject;
		private NewOperation1ReturnStatusDTO errorState;
		// DTOs for orchestration
		
		public NewOperation1CurrentStateDTO() {
			initialiseDTOs();
		}

		public NewOperation1CurrentStateDTO(NewOperation1InputParametersDTO inputs) {
			initialiseDTOs();
			this.inputs = inputs;
		}
		
		// Add extra DTOs for steps
		public NewOperation1InputParametersDTO getInputs() {
			return inputs;
		}

		
		public void setErrorState(NewOperation1ReturnStatusDTO errorState) {
			this.errorState = errorState;
		}

		public NewOperation1ReturnStatusDTO getErrorState() {
			return errorState;
		}

		public NewOperation1ReturnDTO getReturnObject() {
			return returnObject;
		}
		
		private void initialiseDTOs() {
			inputs = new NewOperation1InputParametersDTO();
			returnObject = new NewOperation1ReturnDTO();
			errorState = new NewOperation1ReturnStatusDTO();
		
		}			
	};

	/**
	 * Holds the return value for the operation New Operation 1
	 */
	public static class NewOperation1ReturnDTO {
		private com.digitalml.rest.resources.codegentest.Bank bank = new com.digitalml.rest.resources.codegentest.Bank();

		public com.digitalml.rest.resources.codegentest.Bank getBank() {
			return bank;
		}

		public void setBank(com.digitalml.rest.resources.codegentest.Bank bank) {
			this.bank = bank;
		}

	};

	/**
	 * Holds the return value for the operation New Operation 1 when an exception has been thrown.
	 */
	public static class NewOperation1ReturnStatusDTO {

		private String exceptionMessage;

		public NewOperation1ReturnStatusDTO() {
		}

		public NewOperation1ReturnStatusDTO(String exceptionMessage) {
			this.exceptionMessage = exceptionMessage;
		}



		public String getExceptionMessage() {
			return exceptionMessage;
		}

		public void setExceptionMessage(String exceptionMessage) {
			this.exceptionMessage = exceptionMessage;
		}
	};
	
	/**
	 * Holds the input parameters for the operation New Operation 1 in a single DTO which aids
	 * validation and allows the inputs to be easily passed in method calls.
	 */
	public static class NewOperation1InputParametersDTO {


    	@NotNull
		private com.digitalml.rest.resources.codegentest.Customer customer;

		public com.digitalml.rest.resources.codegentest.Customer getCustomer() {
			return customer;
		}

		public void setCustomer(com.digitalml.rest.resources.codegentest.Customer customer) {
			this.customer = customer;
		}


		public boolean validate() {
			Validator validator = validatorFactory.getValidator();
			Set<ConstraintViolation<NewOperation1InputParametersDTO>> errors = validator.validate(this);
			return CollectionUtils.isEmpty(errors);
		}

		public List<String> validateReport() {
			Validator validator = validatorFactory.getValidator();
			Set<ConstraintViolation<NewOperation1InputParametersDTO>> errors = validator.validate(this);

			List<String> results = new ArrayList<String>();
			if (CollectionUtils.isNotEmpty(errors))
				for (ConstraintViolation<NewOperation1InputParametersDTO> error : errors) {
					StringBuffer sb = new StringBuffer();
					sb.append(error.getMessage());
					results.add(sb.toString());
				}

			return results;
		}
	};

}