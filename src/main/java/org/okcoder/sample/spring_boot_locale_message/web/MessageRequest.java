package org.okcoder.sample.spring_boot_locale_message.web;

import jakarta.validation.constraints.NotEmpty;

public class MessageRequest {
    @NotEmpty(message = "{id.not.empty}")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
