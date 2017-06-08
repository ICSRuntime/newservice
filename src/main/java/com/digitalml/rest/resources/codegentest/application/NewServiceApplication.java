package com.digitalml.rest.resources.codegentest.application;

import com.digitalml.rest.resources.codegentest.resource.NewServiceResource;
import com.digitalml.rest.resources.codegentest.resource.ResourceLoggingFilter;					
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.codahale.metrics.health.HealthCheck;
import io.dropwizard.Configuration;

import java.util.EnumSet;
import javax.servlet.DispatcherType;

import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.ContextInitializer;
import ch.qos.logback.core.joran.spi.JoranException;


public class NewServiceApplication extends Application<NewServiceConfiguration> {

	public static void main(final String[] args) throws Exception {
		new NewServiceApplication().run(args);
	}
	
	@Override
	public void initialize(final Bootstrap<NewServiceConfiguration> bootstrap) {
		// TODO: application initialization
	}

	@Override
	public void run(final NewServiceConfiguration configuration, final Environment environment) {

		//separate logging setup to enable use of external logback xml
		LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
		context.reset();
		ContextInitializer initializer = new ContextInitializer(context);
		try {
			initializer.autoConfig();
		} catch (JoranException e) {
		}

		final NewServiceResource resource = new NewServiceResource();
		final NewServiceHealthCheck healthCheck = new NewServiceHealthCheck();
		
		environment.servlets().addFilter("ResourceLoggingFilter", new ResourceLoggingFilter()).addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");
		
		environment.healthChecks().register("template", healthCheck);
		environment.jersey().register(resource);

	}
}

final class NewServiceConfiguration extends Configuration {
}

final class NewServiceHealthCheck extends HealthCheck {

	public NewServiceHealthCheck() {
	}

	@Override
	protected Result check() throws Exception {
		return Result.healthy();
	}
}