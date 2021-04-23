# Gelişim Raporu 3

**DÜZELTMELER**:
İlk dönemde projemde kullanılacak olan Firebase uygulamasıydı fakat uygulamayı Android Studio' ya bağlarken internet kopukluğundan dolayı herhangi bir veriyi ekleyip çıkarılmadı bu yüzden başka ver tabanı uygulaması kullanmak istenildi. SQLite uygulamasını kullanıldı ve ekleme işlemi yapıldı.

İlk olarak veriTabani adında sınıf oluşturulup ardından ise içine *SQLiteOpenHelper* metodunu extends edildi. Bu metodun içine ise *onCreate(SQLiteDatabase db)* ve *onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)* değişkenlerini ekleyip içleri dolduruldu. İlk değişkenin içinde veritabanın ismi ikincisinde ise veri tabanının sürümü yazıldı. 

