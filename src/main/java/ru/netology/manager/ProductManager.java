package ru.netology.manager;

import ru.netology.Product;
import ru.netology.repository.ProductRepository;

public class ProductManager {
    private ProductRepository repository;

    public void addProduct(Product addedProduct) {
        repository.saveProduct(addedProduct);
    }
}