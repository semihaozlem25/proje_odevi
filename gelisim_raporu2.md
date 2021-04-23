# Gelişim Raporu 2
# DÜZELTMELER

Proje dağılımı Nisan'a kadar uzatıldı, bazı görevler iki defa yazıldığı için düzeltildi.

![iş bölümü-1](https://user-images.githubusercontent.com/74215861/103462393-f4c3a500-4d35-11eb-8f51-2cd8243e2c1e.jpg)

# KAYNAKLAR

1. FireBase'i android Studio'ya ekleme:

      [https://firebase.google.com/docs/android/setup]

2. Spinner kullanımı hakkında bilgi alınmıştır:

      [http://kod5.org/android-spinner-kullanimi/]

# ZORLUKLAR

Spinner kullanımında iki spinnerda ki verilerin bileşenlerini yerleştirme konusunda zorluk çekildi ve Adapter kullanımı öğrenildi.

![an0](https://user-images.githubusercontent.com/74215861/103468389-a203e080-4d69-11eb-8af0-f5666e1b0d32.PNG)

Polikinlikler doktorlar ve saatlere ait arraylar tanımlanmıştır.

![an](https://user-images.githubusercontent.com/74215861/103467839-3ec37f80-4d64-11eb-9f78-613816711c81.PNG)

Yukarıda ki kodda spinner ve adapteri tanımlaması yapıldı.

![an1](https://user-images.githubusercontent.com/74215861/103467892-aaa5e800-4d64-11eb-92b4-03ae0d5f6330.PNG)

Bu kodda ise yukarıda tanımlanan spinner ve adapterin androidde ataması gerçekleştirildi.

![an3](https://user-images.githubusercontent.com/74215861/103468446-12aafd00-4d6a-11eb-92b5-9faf8666782b.PNG)

Yukarıda ki işlemde polikinlik spinner'ine tıklama işlemi yapıldığında ilk önce tıklama yapılan indekse bakılır, daha sonra indekse göre 0. indekste ilk if koşuluna girip dahiliye polikinliğine ait doktorlar karşımıza çıkacaktır. 1.indekste ise else if koşuluna girip ağız ve diş sağlığı polikinliğine ait doktorları verecek, 2.indekste ise diğer else if koşuluna girip noroloji polikinliğine ait doktorlar karşımıza çıkar, 3.indekste ise en son else if koşuluna girip kardiyoloji polikinliğine ait doktorları verir. En sonda ise doktora ait spinner çağırılır.

# Çözümlenemeyen Zorluklar

FireBase'yi projeye eklerken bir sorun oluştu ve eklenilen proje FireBase'te eklenmiş olarak gözükmüyor ama Android Studio' da eklenmiş olarak gözüküyor, ve hala çözümlenmedi.

# ARAÇLAR

Kullanılan program Android Studio ve kullanılan programlama dili javadır.

# İŞ DAĞILIMI

|      | Classların Oluşturulması | Arayüz Tasarımı  | Toplam  |
|------|--------------------------|------------------|---------|
| Saat | 5 Saat                   | 10 Saat          | 15 Saat |
