package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.service.ICrudService;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;



@Service
public class ProduitMockServiceImpl implements ICrudService<Produit, Long> {

	private List<Produit> produits;
	
	public ProduitMockServiceImpl()
	{
		produits = new ArrayList<Produit> ();
		produits.add(new Produit());
		
		produits.add(new Produit("livre",50,2000));
		produits.add(new Produit("banane",15,1000));
		produits.add(new Produit("pomme",4,1400));
	}
	
	@Override
	public List<Produit> getAll() {
		
		return produits;
	}

	@Override
	public void add(Produit produit) {
		produits.add(produit);
		
	}

	@Override
	public void update(Produit produit) {

		produits.remove(produit);
		produits.add(produit);
		
	}

	@Override
	public void delete(Long id) {
		
		Produit produit = new Produit();
		produit.setId(id);
		produits.remove(produit);
		
		//produits.remove(ref);
		
	}

}
