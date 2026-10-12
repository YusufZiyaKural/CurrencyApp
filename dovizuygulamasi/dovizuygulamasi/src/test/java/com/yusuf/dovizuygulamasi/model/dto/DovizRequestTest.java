package com.yusuf.dovizuygulamasi.model.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DovizRequestTest {

    @Test
    void dovizTltest(){
        DovizRequest request = new DovizRequest(); //  1) Obje oluşturma


        request.setTlMiktar(1500.0); // 2) girilen değer

        assertEquals(1500.0, request.getTlMiktar()); // 3) çıkması beklenen değer ve gerçekten dönen response verisinin çekilmesi

    }

}