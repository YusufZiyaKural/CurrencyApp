package com.yusuf.dovizuygulamasi.model.dto;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DovizRequestTest {

    @Test
    public void dovizTltest(){
        DovizRequest request = new DovizRequest(); //  1) Obje oluşturma (Arrange)


        request.setTlMiktar(1500.0); // 2) girilen değer (Act)

        assertEquals(1500.0, request.getTlMiktar()); // 3) çıkması beklenen değer ve gerçekten dönen response verisinin çekilmesi (Assert)


    }

}