package com.yusuf.dovizuygulamasi.controller;

import com.yusuf.dovizuygulamasi.model.dto.DovizRequest;
import com.yusuf.dovizuygulamasi.model.dto.DovizResponse;
import com.yusuf.dovizuygulamasi.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home")
@RestController
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    //API
    @PostMapping("/cevir")
    public DovizResponse cevir(@RequestBody DovizRequest request ) {

        return currencyService.cevir(request);
    }
}
