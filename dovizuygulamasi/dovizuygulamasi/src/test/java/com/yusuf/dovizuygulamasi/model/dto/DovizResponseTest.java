package com.yusuf.dovizuygulamasi.model.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DovizResponseTest {

    @Test
    public void dovizKurtest(){
        DovizResponse response =  new DovizResponse(); // obje

        response.setAltınMiktar(120.0); // değerler
        response.setTlMiktar(60.0);
        response.setDolarMiktar(5.0);
        response.setEuroMiktar(20.0);

        assertEquals(120.0, response.getAltınMiktar()); // sağlamalar
        assertEquals(60.0, response.getTlMiktar());
        assertEquals(5.0, response.getDolarMiktar());
        assertEquals(20.0, response.getEuroMiktar());

    }

}