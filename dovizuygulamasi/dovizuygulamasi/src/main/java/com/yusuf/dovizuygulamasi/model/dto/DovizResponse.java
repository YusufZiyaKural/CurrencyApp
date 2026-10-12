package com.yusuf.dovizuygulamasi.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DovizResponse {

    // altınMiktar eklendi
    private Double altınMiktar;
    private Double tlMiktar;
    private Double euroMiktar;
    private Double dolarMiktar;
}
