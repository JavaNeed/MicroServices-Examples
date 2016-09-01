microservice-sample
---------------------
https://blog.frankel.ch/going-the-microservices-way-part-1/
https://blog.frankel.ch/going-the-microservices-way-part-2/
https://blog.frankel.ch/going-the-microservices-way-part-3/


Microservices, are trending right now, whether you like it or not. There are good reasons for that as it resolves many issues organizations are faced with. It also opens a Pandora box as new issues pop up every now and then… But that is a story for another day: in the end, microservices are here to stay.

In this serie of articles, I’ll take a simple Spring Boot app ecosystem and turn it into microservices to deploy them into the Cloud. As an example, I’ll use an ecommerce shop, that requires different services such as:

- an account service
- a product service
- a cart service
etc.
This week is dedicated to creating a sample REST application that lists products. It is based on Spring Boot because Boot makes developing such an application a breeze, as will see in the rest of this article.

At this point, we’re done. Spring Data REST will automatically provide a REST endpoint to the repository. After executing the main class of the application, browsing to http://localhost:8080/products will yield the list of available products in JSON format.

If you don’t believe how easy this, then you’re welcome to take a look at the Github repo and just launch the app with mvn spring-boot:run. There’s a script to populate initial data present.


How to Test the app ?
------------------
http://localhost:8080/products

http://localhost:8080/products/1

http://localhost:8080/products/2

http://localhost:8080/products/3

http://localhost:8080/products/4

http://localhost:8080/products/5

http://localhost:8080/products/search