package com.github.dkuzmenkov17.servicelocatorpattern.factory;

import com.github.dkuzmenkov17.servicelocatorpattern.service.MathOperationService;

public interface MathOperationServiceFactory {
    MathOperationService getMathOperationService(String operationType);
}
