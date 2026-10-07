package com.yusuf.dovizuygulamasi.common.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//Kalıp Exception Handler (Ai ile oku)
@RestControllerAdvice
public class CurrencyExceptionHandler {

        @ExceptionHandler(HttpMessageNotReadableException.class)
        public ResponseEntity<String> handleWrongType(
                HttpMessageNotReadableException e) {

            return ResponseEntity
                    .badRequest()
                    .body("Miktar sayısal bir değer olmalıdır.");
        }

}
