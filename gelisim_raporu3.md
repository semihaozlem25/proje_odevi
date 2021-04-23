# Gelişim Raporu 3

**DÜZELTMELER**:
İlk dönemde projemde kullanılacak olan Firebase uygulamasıydı fakat uygulamayı Android Studio' ya bağlarken internet kopukluğundan dolayı herhangi bir veriyi ekleyip çıkarılmadı bu yüzden başka ver tabanı uygulaması kullanmak istenildi. SQLite uygulamasını kullanıldı ve ekleme işlemi yapıldı.

![g1](https://user-images.githubusercontent.com/74215861/115923594-2304f600-a487-11eb-97f4-5d93526d28ab.PNG)

İlk olarak veriTabani adında sınıf oluşturulup ardından ise içine *SQLiteOpenHelper* metodunu extends edildi. Bu metodun içine ise *onCreate(SQLiteDatabase db)* ve *onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)* değişkenlerini ekleyip içleri dolduruldu. İlk değişkenin içinde veritabanın ismi ikincisinde ise veri tabanının sürümü yazıldı. 

![g2](https://user-images.githubusercontent.com/74215861/115923861-9575d600-a487-11eb-83a1-8c79913de323.PNG)

Daha sonra ise yukarıda oluşturulan sınıftan v1 nesnesi oluşturuldu.

![g3](https://user-images.githubusercontent.com/74215861/115924093-edacd800-a487-11eb-995f-e9e17371c487.PNG)

bu kodda ise v1 nesnesinin new ile bellekte yer kaplamasını sağladık.

