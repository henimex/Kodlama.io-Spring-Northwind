package kodlamaio.hendev.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hendev.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
