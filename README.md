# Ders Notu Hesaplama Uygulaması

Bu proje, kullanıcının girdiği vize ve final notlarına göre ortalama hesaplayan ve harf notunu belirleyen basit bir Java uygulamasıdır.

## Özellikler
- **Vize ve final notu girişi:** Kullanıcı, vize ve final notlarını sisteme girer.
- **Ortalama hesaplama:** Vize %40, final %60 etkili olacak şekilde ortalama hesaplar.
- **Harf notu belirleme:** Ortalamaya göre harf notu hesaplar.
- **Geçme/Kalma durumu:** Kullanıcının dersi geçip geçmediğini belirtir.

## Kullanım
Program çalıştırıldığında, kullanıcıdan vize ve final notlarını girmesi istenir. Giriş yapıldıktan sonra aşağıdaki kriterlere göre değerlendirme yapılır:

- **Final notu 50'den düşükse, ders otomatik olarak kalınır.**
- **Ortalama 0-44.99 arası ise:** FF (Kaldı)
- **Ortalama 45-49.99 arası ise:** DD (Sorumlu Geçti)
- **Ortalama 50-59.99 arası ise:** DC (Geçti)
- **Ortalama 60-69.99 arası ise:** CC (Geçti)
- **Ortalama 70-79.99 arası ise:** CB (Geçti)
- **Ortalama 80-84.99 arası ise:** BB (Geçti)
- **Ortalama 85-89.99 arası ise:** BA (Geçti)
- **Ortalama 90 ve üstü ise:** AA (Geçti)

## Çalıştırma Talimatları
1. Java ortamının sisteminizde kurulu olduğundan emin olun.
2. Proje dosyasını indirip bir Java IDE (Eclipse, IntelliJ IDEA, NetBeans vb.) ile açın.
3. `Ders_notu_hesaplama` sınıfının `main` metodunu çalıştırın.
4. Terminal veya konsoldan notları girerek sonucu görüntüleyin.

## Örnek Kullanım
```
Vize notunu giriniz: 70
Final notunu giriniz: 80
Ortalamanız= 76.0
Harf notunuz= CB
Dersten Geçtiniz
```

## Lisans
Bu proje açık kaynaklıdır ve herkes tarafından kullanılabilir.

