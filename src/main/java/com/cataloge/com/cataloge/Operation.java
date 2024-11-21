package com.cataloge.com.cataloge;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Operation {

    public Operation() {
        products.add(new Product("Чайник со свистком \"Тефаль\" ", "Чайник эмалированный со свистком. Свестит громко и мелодично", 1, 500));
        products.add(new Product("Миксер \"Весна\" ", "Отличный миксер для коктейлей", 2, 1500));
        products.add(new Product("Микроволновка \"обычная\"", "Недорогая микроволновка", 3, 3000));
        products.add(new Product("Микроволновка \"Sharp\"", "Отличная бытовая микроволновка", 4, 7000));

    }

    //"Победа"


    List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }


    public Product getByid(int id) {

        for (int i = 0; i < products.size(); i++) {

            System.out.println(products.get(i).getId() == id);
            if (products.get(i).getId() == id) return products.get(i);
        }
        return null;

        // гет ай ди через цикл

    }

    public Object removeById(int id) {
        Product p = getByid(id);
        if (p != null)
            products.remove(p);


        return null;
    }
}


