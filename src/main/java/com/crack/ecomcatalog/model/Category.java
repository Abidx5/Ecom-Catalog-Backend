package com.crack.ecomcatalog.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Category {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;

   @OneToMany(mappedBy = "category",
           cascade = CascadeType.ALL,
           fetch = FetchType.LAZY)
   @JsonManagedReference
   private Set<Product> products;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Set<Product> getProducts() {
      return products;
   }

   public void setProducts(Set<Product> products) {
      this.products = products;
   }

   public Category() {
   }
}
