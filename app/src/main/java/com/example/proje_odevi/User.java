package com.example.proje_odevi;

public class User
{
    private String ad;
    private String soyad;
    private String dgtrh;
    private String cinsiyet;
    private String sifre;
    private String sifretekrar;




    public User(){}
    public User( String ad, String soyad, String dgtrh, String cinsiyet, String sifre, String sifretekrar) {
        this.ad = ad;
        this.soyad = soyad;
        this.dgtrh = dgtrh;
        this.cinsiyet = cinsiyet;
        this.sifre = sifre;
        this.sifretekrar = sifretekrar;

    }

    public String getAd()
    {
        return ad;
    }
    public void setAd(String ad)
    {
        this.ad = ad;
    }
    public String getSoyad()
    {
        return soyad;
    }
    public void setSoyad(String soyad)
    {
        this.soyad = soyad;
    }
    public String getDgtrh()
    {
        return dgtrh;
    }
    public void setDgtrh(String dgtrh)
    {
        this.dgtrh = dgtrh;
    }
    public String getCinsiyet()
    {
        return cinsiyet;
    }
    public void setCinsiyet(String cinsiyet)
    {
        this.cinsiyet = cinsiyet;
    }
    public String getSifre()
    {
        return sifre;
    }
    public void setSifre(String sifre)
    {
        this.sifre = sifre;
    }
    public String getSifretekrar()
    {
        return sifretekrar;
    }
    public void setSifretekrar(String sifretekrar)
    {
        this.sifretekrar = sifretekrar;
    }
}
