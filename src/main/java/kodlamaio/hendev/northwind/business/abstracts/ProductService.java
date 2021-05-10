package kodlamaio.hendev.northwind.business.abstracts;

import java.util.List;

import kodlamaio.hendev.northwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
