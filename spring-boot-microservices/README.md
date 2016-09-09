spring-boot-microservices
--------------------------

curl -vvv "http://localhost:8080/order?idCustomer=2&idProduct=3&amount=4"
*   Trying 127.0.0.1...
* Connected to localhost (127.0.0.1) port 8080 (#0)
> GET /order?idCustomer=2&idProduct=3&amount=4 HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.46.0
> Accept: */*
>
< HTTP/1.1 200
< Content-Type: application/json
< Content-Length: 173
< Date: Fri, 09 Sep 2016 07:22:02 GMT
<
{"id":1,"amount":4,"orderDate":1473405722862,"customer":{"id":2,"name":"Customer 2","email":"Customer2@gmail.com"},"product":{"id":3,"sku":"abcd3","description":"Product3"}}* Connection #0 to host localhost left intact

Ref: https://dzone.com/articles/spring-boot-creating