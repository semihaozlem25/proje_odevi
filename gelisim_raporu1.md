# HastaneRandevuAlmaOtomasyonu
Bitirme Projesi

# Gelişim Raporu
**PROJE ÖZETİ**: 
Vatandaşlarımızın hastaneye gitmeden önce aldıkları randevuları web sayfasından alıyorlardı bu uygulama ile Android telefonlarına uygulamayı indirip kolayca sadece kimlik numarası ve şifre ile giriş yapıp web sitesinde olduğu gibi randevu almak randevularına bakmak.

**PROJE ARKA PLANI**: 
Bu projeden çokca yapılmış ama farklılık olarak bu uygulama sadece hastalar değil aynı zaman da doktorlarda girip kendilerine ait alınan randevulara bakabilir ve bunun için bildirim alırlar. Bir farklılık ise sağlık açısından bazı kişisel bilgiler alıp bu bilgilerle sağlıklı yaşam konusunda uyarı ve mesajlar verecektir.

**KULLANILACAK TEKNOLOJİLER**:
- Android Studio
Android Studio, Android Yazılım Geliştirme Takımı (SDK) ve Gradle yapı sistemine arayüz oluşturan IntelliJ IDEA yazılımının özeli bir sürümüdür.Çoğunlukla Android uygulamalar bu platformda yapılıyor.
- MD5 ile şifreleme
1. [https://stackoverflow.com/questions/4846484/md5-hashing-in-android]
2. [https://www.youtube.com/watch?v=fIVYV6KYJqM]
- Spring Security ile giriş
1. [https://spring.io/projects/spring-android]

Kütüphaneler;
- ActiviteAndroid
1. [https://guides.codepath.com/android/activeandroid-guide]
2. [https://yazilim.aykutasil.com/activeandroid/]
- Universal Image Loader
1. [https://github.com/nostra13/Android-Universal-Image-Loader]
2. [https://stackoverflow.com/questions/13854125/how-to-use-universal-image-loader]

**İŞ BÖLÜMÜ PLANLAMA**:

![projeİşPlanı](https://user-images.githubusercontent.com/74215861/99885151-f765b180-2c43-11eb-844c-9c84a3d70234.PNG)


**HEDEFLENEN ÇIKTILAR**:
Hastane randevu sistemi otomasyonu 2 şekilde girişe sahip bir uygulamadır. 
İlk giriş vatandaşların( Hastaların) girişidir. Vatandaşlar sisteme TC kimlik numarası ve kendisinin daha önceden belirlediği şifre ile giriş yapabilirler fakat kayıtlı kullanıcı değillerse kayıt ol kısmından kayıt işlemi gerçekleştirilmektedir.
Daha sonra giriş gerçekleştikten sonra karşısına randevularım, randevu al, kişisel bilgilerim ve sağlıklı mesajların bulunduğu seçenekler çıkıyor ve kişi bunlardan birini seçerek diğer sayfalara giriş yapabiliyorlar. Randevularım kısmında geçmiş veya gelecek olan randevuların sıralandığı sayfa olup aynı şekilde gelecek olan randevuların bildirimi alabiliyor.
Randevu al kısmında hangi polikinlik o polikinliğe ait doktoru ve müsait olan saat ve tarihi seçip randevu alınabiliyor. Kişisel bilgiler kısmından ise bilgiler güncellenebiliyor ve sağlıklı mesajlar kısmında bazı bilgilerin verisini alıp kişinin sağlığı konusunda mesajlar verir.
Bir sonraki giriş ise doktor girişidie. Aynı şekilde doktorlar önceden belirlenmiş kullanıcı adı ve şifre ile sisteme giriş yaparak karşısına çıkan adına alınmış randevuları görüp na göre hareket etme şansı yakalıyorlar.
Hedeflenen çıktılar bu şekilde ekstra istenen şeylerden biri Md5 ile bilgileri şifreleyip veri tabanında saklanması diğeri ise Spring Security ile girişlerin güvenli olunmasını sağlar.

