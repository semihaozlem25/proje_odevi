# Gelişim Raporu 3

**DÜZELTMELER**:
İlk dönemde projemde kullanacağım olan Firebase uygulamasıydı fakat uygulamayı Android Studio' ya bağlarken internet kopukluğundan dolayı herhangi bir veriyi ekleyip çıkaramadım bu yüzden başka ver tabanı uygulaması kullanmak istedim. SQLite uygulamasını kullandım ve ekleme işlemini yaptım.

İlk olarak veriTabani adında sınıf oluşturdum ardından ise içine *SQLiteOpenHelper* metodunu extends ettim. Bu metodun içine ise onCreate(SQLiteDatabase db) ve 
