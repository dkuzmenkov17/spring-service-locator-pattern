package com.github.dkuzmenkov17.servicelocatorpattern.configuration;

import com.github.dkuzmenkov17.servicelocatorpattern.factory.MathOperationServiceFactory;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "com.github.dkuzmenkov17.servicelocatorpattern.service"
})
public class MathOperationConfiguration {

    @Bean
    public ServiceLocatorFactoryBean serviceLocatorFactoryBean() {
        ServiceLocatorFactoryBean serviceLocatorFactoryBean = new ServiceLocatorFactoryBean();
        serviceLocatorFactoryBean.setServiceLocatorInterface(MathOperationServiceFactory.class);
        return serviceLocatorFactoryBean;
    }
}
