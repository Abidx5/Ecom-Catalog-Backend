package com.crack.ecomcatalog.config;

import com.crack.ecomcatalog.model.Category;
import com.crack.ecomcatalog.model.Product;
import com.crack.ecomcatalog.repository.CategoryRespository;
import com.crack.ecomcatalog.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRespository categoryRespository;

    public DataSeeder(ProductRepository productRepository, CategoryRespository categoryRespository) {
        this.productRepository = productRepository;
        this.categoryRespository = categoryRespository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Clear previous data
        productRepository.deleteAll();
        categoryRespository.deleteAll();

        // Create categories
        Category electronics = new Category();
        electronics.setName("Electronics");
        Category clothing = new Category();
        clothing.setName("Clothing");
        Category home = new Category();
        home.setName("Home");
        categoryRespository.saveAll(Arrays.asList(electronics, clothing, home));

        // Products with real images

        // Electronics
        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("High-performance laptop for work and gaming");
        laptop.setImageUrl("https://images.pexels.com/photos/18105/pexels-photo.jpg");
        laptop.setCategory(electronics);
        laptop.setPrice(899.99);

        Product headphones = new Product();
        headphones.setName("Wireless Headphones");
        headphones.setDescription("Noise-canceling over-ear headphones with Bluetooth support");
        headphones.setImageUrl("https://images.pexels.com/photos/3394659/pexels-photo-3394659.jpeg");
        headphones.setCategory(electronics);
        headphones.setPrice(129.99);

        Product smartwatch = new Product();
        smartwatch.setName("Smartwatch");
        smartwatch.setDescription("Fitness tracker with heart rate monitoring and GPS");
        smartwatch.setImageUrl("https://images.pexels.com/photos/437038/pexels-photo-437038.jpeg");
        smartwatch.setCategory(electronics);
        smartwatch.setPrice(79.99);

        // Clothing
        Product tshirt = new Product();
        tshirt.setName("Cotton T-Shirt");
        tshirt.setDescription("Comfortable cotton t-shirt in various colors");
        tshirt.setImageUrl("https://images.pexels.com/photos/298864/pexels-photo-298864.jpeg");
        tshirt.setCategory(clothing);
        tshirt.setPrice(15.99);

        Product jeans = new Product();
        jeans.setName("Denim Jeans");
        jeans.setDescription("Slim-fit denim jeans for casual wear");
        jeans.setImageUrl("https://images.pexels.com/photos/325876/pexels-photo-325876.jpeg");
        jeans.setCategory(clothing);
        jeans.setPrice(39.99);

        Product jacket = new Product();
        jacket.setName("Leather Jacket");
        jacket.setDescription("Stylish leather jacket for men and women");
        jacket.setImageUrl("https://images.pexels.com/photos/1556644/pexels-photo-1556644.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
        jacket.setCategory(clothing);
        jacket.setPrice(99.99);

        // Home
        Product sofa = new Product();
        sofa.setName("Luxury Sofa");
        sofa.setDescription("Modern and comfortable 3-seater sofa");
        sofa.setImageUrl("https://images.pexels.com/photos/1866149/pexels-photo-1866149.jpeg");
        sofa.setCategory(home);
        sofa.setPrice(499.99);

        Product diningTable = new Product();
        diningTable.setName("Dining Table Set");
        diningTable.setDescription("Wooden dining table with 6 chairs");
        diningTable.setImageUrl("https://images.pexels.com/photos/2635038/pexels-photo-2635038.jpeg");
        diningTable.setCategory(home);
        diningTable.setPrice(699.99);

        Product lamp = new Product();
        lamp.setName("Bedside Lamp");
        lamp.setDescription("Minimalist LED bedside lamp with touch control");
        lamp.setImageUrl("https://images.pexels.com/photos/112811/pexels-photo-112811.jpeg");
        lamp.setCategory(home);
        lamp.setPrice(29.99);

        // Save all products
        productRepository.saveAll(Arrays.asList(laptop, headphones, smartwatch,
                tshirt, jeans, jacket, sofa, diningTable, lamp));
    }
}
