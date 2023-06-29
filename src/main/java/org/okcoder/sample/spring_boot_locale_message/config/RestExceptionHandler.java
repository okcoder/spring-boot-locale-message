package org.okcoder.sample.spring_boot_locale_message.config;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<?> handleException(MethodArgumentNotValidException e) {

        return ResponseEntity.badRequest()
                .body(e.getBindingResult().getAllErrors());
    }
}
