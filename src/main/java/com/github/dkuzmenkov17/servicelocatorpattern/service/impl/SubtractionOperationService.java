package com.github.dkuzmenkov17.servicelocatorpattern.service.impl;

import com.github.dkuzmenkov17.servicelocatorpattern.service.MathOperationService;
import org.springframework.stereotype.Service;

import static com.github.dkuzmenkov17.servicelocatorpattern.bean.OperationType.SUBTRACTION_OPERATION;

@Service(SUBTRACTION_OPERATION)
public class SubtractionOperationService implements MathOperationService {

    public double process(double a, double b) {
        return a - b;
    }
}
