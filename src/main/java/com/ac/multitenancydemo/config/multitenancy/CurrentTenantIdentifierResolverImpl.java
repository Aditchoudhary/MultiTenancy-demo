package com.ac.multitenancydemo.config.multitenancy;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.util.StringUtils;

public class CurrentTenantIdentifierResolverImpl implements CurrentTenantIdentifierResolver {

    private static final String DEFAULT_TENANT_ID = "client_tenant_1";

    @Override
    public String resolveCurrentTenantIdentifier() {
        String tenant = DBContextHolder.getCurrentDb();
        return StringUtils.isEmpty(tenant) ? DEFAULT_TENANT_ID : tenant;
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }
}