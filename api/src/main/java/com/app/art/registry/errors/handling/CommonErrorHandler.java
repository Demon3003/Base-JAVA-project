package com.app.art.registry.errors.handling;

import com.app.art.registry.exceptions.jwt.JwtAuthenticationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class CommonErrorHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleCommonError(Exception ex) {
        log.error("Error occurred", ex);
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

    @ExceptionHandler(JwtAuthenticationException.class)
    public ResponseEntity<String> handleAuthenticationError(JwtAuthenticationException ex) {
        log.error("Error occurred", ex);
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

}
