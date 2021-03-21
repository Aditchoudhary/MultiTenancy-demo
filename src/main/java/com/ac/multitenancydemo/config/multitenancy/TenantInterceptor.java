package com.ac.multitenancydemo.config.multitenancy;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

@Component
public class TenantInterceptor implements WebRequestInterceptor {

    private static final String TENANT_HEADER = "X-Tenant";

    @Override
    public void preHandle(WebRequest request) {
        DBContextHolder.setCurrentDb(request.getHeader(TENANT_HEADER));
    }

    @Override
    public void postHandle(WebRequest webRequest, ModelMap modelMap) {
    	DBContextHolder.clear();
    }

    @Override
    public void afterCompletion(WebRequest webRequest, Exception e) {

    }

}