package com.yusuf.dovizuygulamasi.common.exception;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CurrencyExceptionHandlerTest {

    @Test
    void handleWrongTypeTest() {

        // Arrange
        CurrencyExceptionHandler handler = new CurrencyExceptionHandler(); // Obje


        HttpMessageNotReadableException sahteHata = null; // e işlevsizliğine karşı null

        // Act
        ResponseEntity<String> response = handler.handleWrongType(sahteHata); // Paketi yakalayacak sepet


        // Assert
        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode()); // http 400 testi

        assertEquals("Miktar sayısal bir değer olmalıdır.", response.getBody()); // dönen mesajın testi
    }
}