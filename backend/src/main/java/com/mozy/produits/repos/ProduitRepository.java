package com.mozy.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mozy.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}