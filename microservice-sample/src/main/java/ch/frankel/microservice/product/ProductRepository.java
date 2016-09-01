package ch.frankel.microservice.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	Product findByName(String name);
	
	Product findById(long id);
}
