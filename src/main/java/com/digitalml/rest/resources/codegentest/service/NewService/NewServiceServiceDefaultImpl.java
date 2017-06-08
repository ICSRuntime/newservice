package com.digitalml.rest.resources.codegentest.service.NewService;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Principal;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.ws.rs.core.SecurityContext;
import com.google.common.base.Strings;

import com.digitalml.rest.resources.codegentest.service.NewServiceService;
	
/**
 * Default implementation for: New Service
 * 120
 *
 * @author admin
 * @version 1
 */

public class NewServiceServiceDefaultImpl extends NewServiceService {


	/**
	 * Creates and returns a {@link Method} object using reflection and handles the possible exceptions.
	 * <br/>
	 * Aids with calling the process step method based on the outcome of the control logic
	 * 
	 * @param methodName
	 * @param clazz
	 * @return
	 */
	private Method getMethod(String methodName, Class clazz) {
		Method method = null;
		try {
			method = NewServiceService.class.getMethod(methodName, clazz);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

		return method;
	}
	
	/**
	 * For use when calling provider systems.
	 * <p>
	 * TODO: Implement security logic here
	 */
	protected SecurityContext securityContext = new SecurityContext() {

		@Override
		public boolean isUserInRole(String arg0) {
			return true;
		}

		@Override
		public boolean isSecure() {
			return false;
		}

		@Override
		public Principal getUserPrincipal() {
			return null;
		}

		@Override
		public String getAuthenticationScheme() {
			return null;
		}
	};
}