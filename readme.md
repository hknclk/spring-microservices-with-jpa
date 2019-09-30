
Mikroservislere Giriş Projesi
-----------------------------

Başlatma Sırası:
1) configserver
2) eureka
3) Örnek mikroservisler (department, student)
4) apigw

Terminalden projeleri başlatmak için şu komutu kullanın:
> mvn spring-boot:run

ÖNEMLİ! Yalnızca configserver'ın git repo yerine lokaldeki config dosyalarını okuması için profil adı olarak "native" vermemiz gerekiyor. İlgili komut:
 > mvn spring-boot:run -Dspring-boot.run.profiles=native


Tüm projeler başladıktan sonra:
-------------------------------

<b>Eureka Dashboard:</b> http://localhost:8061

<b>Örnek API çağrısı (API GW Üzerinden):</b> http://localhost:8060/department/hello

Örnek API istekleri için resources klasöründeki postman collection'ına bakabilirsiniz
