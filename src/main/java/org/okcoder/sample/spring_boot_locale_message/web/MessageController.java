package org.okcoder.sample.spring_boot_locale_message.web;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final MessageSource messageSource;

    public MessageController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("message")
    public String get(@Validated MessageRequest request) {
        return messageSource.getMessage(request.getId(), null, LocaleContextHolder.getLocale());
    }

}
