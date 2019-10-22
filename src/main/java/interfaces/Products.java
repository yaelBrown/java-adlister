package interfaces;

import models.Product;

import java.util.ArrayList;

// This interface describes the operations that our application can perform with products.
// The DAO interface (DAO - Data Access Object aka Data Access Class)
public interface Products {

    ArrayList<Product> all(); // get all the product records

    void insert(Product product); // persist new product to the database

}