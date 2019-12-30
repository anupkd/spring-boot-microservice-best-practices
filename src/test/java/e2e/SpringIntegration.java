package com.uk.companieshouse.e2e;

import com.uk.companieshouse.CompaniesHouseApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(
        classes = CompaniesHouseApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ActiveProfiles("test")
public abstract class SpringIntegration implements WireMockService {
    protected final String DEFAULT_URL = "http://localhost:8081/";
    protected RestTemplate restTemplate = new RestTemplate();
}