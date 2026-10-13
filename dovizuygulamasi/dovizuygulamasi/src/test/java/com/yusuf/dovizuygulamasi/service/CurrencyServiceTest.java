package com.yusuf.dovizuygulamasi.service;

import com.yusuf.dovizuygulamasi.model.dto.DovizRequest;
import com.yusuf.dovizuygulamasi.model.dto.DovizResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyServiceTest {

    // Servisin düz işlem akışını hayal et, sırayla testi yaz!
    @Test
    void cevirDogrulama(){
        // 1) Arrange
        CurrencyService service = new CurrencyService(); //CurrencyService class'ini çağırıyorum

        DovizRequest request = new DovizRequest(); // request paketi
        request.setTlMiktar(1000.0); // tl miktarını girerek ilk requestte bulunuyorum

        Double beklenenAltin = 1000.0/6.506; // logic işlemlerinin sonuçlarını asserte yazmak için varieble halin getiriyorum
        Double beklenenDolar = 1000.0/49.14; // -Double normal double'a nazaran içinde null değer tutabiliyor o yüzden daha verimli-
        Double beklenenEuro = 1000.0/55.37;

        // 2) Act
        DovizResponse response = service.cevir(request); // response paketi

        // 3) Assert
        assertEquals(1000.0,response.getTlMiktar());    // assert kısmına excpected responseları
        assertEquals(beklenenAltin,response.getAltınMiktar());  // ve get ile gerçekten çekilen responseları karşılaştırıyorum
        assertEquals(beklenenDolar,response.getDolarMiktar());
        assertEquals(beklenenEuro,response.getEuroMiktar());

    }

}