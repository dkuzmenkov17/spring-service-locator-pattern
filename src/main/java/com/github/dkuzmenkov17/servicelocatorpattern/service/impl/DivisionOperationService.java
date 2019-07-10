package com.github.dkuzmenkov17.servicelocatorpattern.service.impl;

import com.github.dkuzmenkov17.servicelocatorpattern.exception.ZeroDivisionException;
import com.github.dkuzmenkov17.servicelocatorpattern.service.MathOperationService;
import org.springframework.stereotype.Service;

import static com.github.dkuzmenkov17.servicelocatorpattern.bean.OperationType.DIVISION_OPERATION;

@Service(DIVISION_OPERATION)
public class DivisionOperationService implements MathOperationService {

    public double process(double a, double b) {
        if (b == 0) {
            throw new ZeroDivisionException("second value should not be null");
        }
        return a / b;
    }
}
