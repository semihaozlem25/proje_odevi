package com.example.proje_odevi;

public class randevu {
    private String polikinlik;
    private String doktor;
    private String saat;

    public randevu(){}
    public randevu(String polikinlik, String doktor, String saat){
        this.polikinlik = polikinlik;
        this.doktor = doktor;
        this.saat = saat;
    }

    public String getPolikinlik(){
        return polikinlik;
    }
    public void setPolikinlik(String polikinlik){
        this.polikinlik = polikinlik;
    }
    public String getDoktor(){
        return doktor;
    }
    public void setDoktor(String doktor){
        this.doktor = doktor;
    }
    public String getSaat(){
        return saat = saat;
    }
    public void setSaat(String saat){
        this.saat = saat;
    }



}
