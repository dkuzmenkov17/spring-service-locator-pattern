package com.github.dkuzmenkov17.servicelocatorpattern.service.impl;

import com.github.dkuzmenkov17.servicelocatorpattern.service.MathOperationService;
import org.springframework.stereotype.Service;

import static com.github.dkuzmenkov17.servicelocatorpattern.bean.OperationType.MULTIPLICATION_OPERATION;

@Service(MULTIPLICATION_OPERATION)
public class MultiplicationOperationService implements MathOperationService {

    public double process(double a, double b) {
        return a * b;
    }
}
