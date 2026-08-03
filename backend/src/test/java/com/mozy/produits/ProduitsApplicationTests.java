package com.mozy.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mozy.produits.entities.Categorie;
import com.mozy.produits.entities.Produit;
import com.mozy.produits.repos.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {

    @Autowired
    private ProduitRepository produitRepository;

    @Test
    public void testCreateProduit() {
        Produit prod = new Produit("PC Dell", 2200.500, new Date());
        produitRepository.save(prod);
    }

    @Test
    public void testFindByNomProduit() {
        List<Produit> prods = produitRepository.findByNomProduit("iphone X");
        for (Produit p : prods) {
            System.out.println(p);
        }
    }

    @Test
    public void testFindByNomProduitContains() {
        List<Produit> prods = produitRepository.findByNomProduitContains("iphone");
        for (Produit p : prods) {
            System.out.println(p);
        }
    }

    @Test
    public void testFindByNomPrix() {
        List<Produit> prods = produitRepository.findByNomPrix("iphone", 1000.0);
        for (Produit p : prods) {
            System.out.println(p);
        }
    }

    @Test
    public void testFindByCategorie() {
        Categorie cat = new Categorie();
        cat.setIdCat(1L);
        List<Produit> prods = produitRepository.findByCategorie(cat);
        for (Produit p : prods) {
            System.out.println(p);
        }
    }

    @Test
    public void testFindByCategorieIdCat() {
        List<Produit> prods = produitRepository.findByCategorieIdCat(1L);
        for (Produit p : prods) {
            System.out.println(p);
        }
    }

    @Test
    public void testFindByOrderByNomProduitAsc() {
        List<Produit> prods = produitRepository.findByOrderByNomProduitAsc();
        for (Produit p : prods) {
            System.out.println(p);
        }
    }

    @Test
    public void testTrierProduitsNomsPrix() {
        List<Produit> prods = produitRepository.trierProduitsNomsPrix();
        for (Produit p : prods) {
            System.out.println(p);
        }
    }
}