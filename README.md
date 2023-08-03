<h1> Application Programming Interface (Uygulama Programlama Arayüzü)  </h1>

<h2> Proje Amacı   </h2>
<p><i> Belirtilen API den gelen verileri resources klasörü altında result.txt dosyası oluşturup içerisine yazmak amaçlanmıştır.

<p> Bu projede Apache HttpClien sınıfı kullanılarak <b>http://localhost:8080/demo/all</b> URL adresine get isteği atma işlemi yapılmıştır.</i>
<br>
<br>
<br>
<p> <strong>Uygulamayı Çalıştırmak için yapılması gerekenler </strong>
<ol>
<li> İlk olarak bir başka projede yazmış olduğum Api Servis çalıştırılmalıdır. <b>https://github.com/alibeysulen00/SpringBoot-userServices</b> bu adresteki projede SpringBoot framework kullanılarak CRUD işlemler yapan bir api yazılmıştır detayları projedeki Readme dosyası içerisinde mvcuttur. <b>Proje başarılı bir şekilde Run edilmelidir</b> (Bu projede yalnızca READ işlemi yapılacaktır. Belirtilen proje incelendiğinde CREATE, UPDATE, DELETE işlemlerininde ufak değişiklikler yapılarak işlemler yapılabilir)  </li>
<li>Web Servisimiz ayağa kalktığında bulunduğunuz projeyi build ve run ettiğinizde resources klasörü altında result.txt oluşturulup içerisine apiden gelen yanıtların var olduğunu göreceksiniz  </li>


</ol>

<p> İlk projeyi kendi veritabanınıza göre uyarladığınız zaman sizde kendi apinizi oluşturmuş olup  bu apiye dışarıdan istek atıp yanıt alabileceksiniz


<h2>ÖZET</h2>
<ol>
    <li> İlk projemde Spring Boot tabanlı bir API hizmeti yazdım ve bu hizmetin CRUD işlemlerini gerçekleştiren endpointlerini oluşturdum   </li>
    <li> İkinci Projemde (bulunduğunuz proje) Apache HttpClient kullanarak ilk projedeki API'ye GET isteği atarak tüm kullanıcıları aldım  </li>
    <li> Elde ettiğim kullanıcı verilerini result.txt dosyasına yazdırarak başarılı bir şekilde sunuçlarımı kaydettim  </li>


</ol>
