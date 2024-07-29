package com.example.logexecutiontime;

import org.springframework.stereotype.Service;

@Service
public class LoggerTestClass {

        @LogExecutionTime
        public void testMethod() throws InterruptedException {
            Thread.sleep(1000);
        }
}
