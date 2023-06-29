package org.okcoder.sample.spring_boot_locale_message.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.Locale;

public class QueryLocaleResolver implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String locale = request.getParameter("locale");
        if (locale != null) {
            LocaleContextHolder.setLocale(new Locale(locale));
        }
        return true;
    }
}
