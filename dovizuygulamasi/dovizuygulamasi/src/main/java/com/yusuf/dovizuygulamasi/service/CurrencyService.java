package com.yusuf.dovizuygulamasi.service;

import com.yusuf.dovizuygulamasi.model.dto.DovizRequest;
import com.yusuf.dovizuygulamasi.model.dto.DovizResponse;
import org.springframework.stereotype.Service;


//Logic
@Service
public class CurrencyService {
    public DovizResponse cevir (DovizRequest request){

        Double gelenTl = request.getTlMiktar();


        Double dolarKuru = 49.14;
        Double euroKuru = 55.37;

        Double hesaplananDolar = gelenTl / dolarKuru;
        Double hesaplananEuro = gelenTl / euroKuru;


        DovizResponse sonuc = new DovizResponse();


        sonuc.setTlMiktar(gelenTl);
        sonuc.setDolarMiktar(hesaplananDolar);
        sonuc.setEuroMiktar(hesaplananEuro);


        return sonuc;
    }

}