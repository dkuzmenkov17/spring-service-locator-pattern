package com.github.dkuzmenkov17.servicelocatorpattern.factory;

import com.github.dkuzmenkov17.servicelocatorpattern.configuration.MathOperationConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static com.github.dkuzmenkov17.servicelocatorpattern.bean.OperationType.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MathOperationConfiguration.class)
public class MathOperationFactoryUnitTest {

    @Autowired
    private MathOperationServiceFactory operationFactory;

    @Test
    public void testAdditionOperation() {
        //when
        double result = operationFactory.getMathOperationService(ADDITION_OPERATION).process(2, 5);
        //then
        assertThat(result, is(7.0));
    }

    @Test
    public void testSubtractionOperation() {
        //when
        double result = operationFactory.getMathOperationService(SUBTRACTION_OPERATION).process(5, 2);
        //then
        assertThat(result, is(3.0));
    }

    @Test
    public void testMultiplicationOperation() {
        //when
        double result = operationFactory.getMathOperationService(MULTIPLICATION_OPERATION).process(2, 5);
        //then
        assertThat(result, is(10.0));
    }

    @Test
    public void testDivisionOperation() {
        //when
        double result = operationFactory.getMathOperationService(DIVISION_OPERATION).process(10, 5);
        //then
        assertThat(result, is(2.0));
    }
}
