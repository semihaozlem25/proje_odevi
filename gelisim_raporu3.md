# Gelişim Raporu 3

**DÜZELTMELER**:
Projenin ilk döneminde veriyi ekleme kısmında kalınmıştı ve kullanılan uygulama Firebase olduğu için çokca uğraşılıp çözüm bulunamadı ve başka yönteme geçerek SQL veri tabanını kullanarak eklemeler yapıldı.

**KAYNAKLAR**:
SQL veri tabanı için;

1. https://www.youtube.com/watch?v=0puZXySbhx4&list=PLyezMuyIdMmecdSo3_AFOLiyIFe8Fjl3f&index=15
2. https://www.robodeney.com/android-studio/android-studio-veritabani-kullanimi-sqlite

**ZORLUKLAR**:
İlk dönemde projede kullanılacak olan Firebase uygulamasıydı fakat uygulamayı Android Studio' ya bağlarken internet kopukluğundan dolayı herhangi bir veriyi ekleyip çıkarılmadı bu yüzden başka ver tabanı uygulaması kullanmak istenildi. SQLite uygulamasını kullanıldı ve ekleme işlemi yapıldı.

![g1](https://user-images.githubusercontent.com/74215861/115923594-2304f600-a487-11eb-97f4-5d93526d28ab.PNG)

İlk olarak veriTabani adında sınıf oluşturulup ardından ise içine *SQLiteOpenHelper* metodunu extends edildi. Bu metodun içine ise *onCreate(SQLiteDatabase db)* ve *onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)* değişkenlerini ekleyip içleri dolduruldu. İlk değişkenin içinde veritabanın ismi ikincisinde ise veri tabanının sürümü yazıldı. 

![g2](https://user-images.githubusercontent.com/74215861/115923861-9575d600-a487-11eb-83a1-8c79913de323.PNG)

Daha sonra ise yukarıda oluşturulan sınıftan v1 nesnesi oluşturuldu.

![g3](https://user-images.githubusercontent.com/74215861/115924093-edacd800-a487-11eb-995f-e9e17371c487.PNG)

bu kodda ise v1 nesnesinin new ile bellekte yer kaplamasını sağladık.

![g4](https://user-images.githubusercontent.com/74215861/115924486-73c91e80-a488-11eb-8ec5-e3e7f763f60f.PNG)

ilk satırda ekleme metodu oluşturuldu ve 6 parametre alıyor. ikinci satırda ise v1 nesnesi üzerinden getWritableDatabase() metodunu çağrıldı. Çünkü ekleme yani bir yazma işlemi yapılacak. Bu işlemi de db nesnesine atıldı. Üçüncü satırda ise zorunlu olarak ContentValues sınıfından bir nesne oluşturuldu. Daha sonra ise  nesnenin put() metodunu çağırarak ekleme yapıldı. Hangi alanları ekledik? Parantez içinde ilk parametre nerede tutacalacağını gösterir. 2.parametre ise neyi tutulacak onu gösterir. Bu tutulacak olan değerleri, ekleme() metodunda parametre olarak almıştı. Son satırda ise db’nin insertOrThrow() metodunu çağrıldı. Bu metod veritabanına ekleme yapar.

**ARAÇLAR**:
Android Studio kullanıldı.

