package controllers;

import interfaces.Products;
import models.Product;

import java.util.ArrayList;

public class DaoFactory {
    private static Products productsDao;
    private Products productsDao;

    public static Products getProductsDao() {
        if (productsDao == null) {
            productsDao = new ListProducts();
        }
        return productsDao;
    }

    private static class ListProducts implements Products {
        @Override
        public ArrayList<Product> all() {
            return null;
        }

        @Override
        public void insert(Product product) {

        }
    }
}