package com.bptn.feedAppAutomation.config;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.bptn.feedAppAutomation.AutomationApplication;

import io.cucumber.spring.CucumberContextConfiguration;


@SpringBootTest
@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationApplication.class)
public class ContextConfig {
	
}