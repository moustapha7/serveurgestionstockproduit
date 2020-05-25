package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Produit;
import com.example.demo.service.ICrudService;


@RestController
@RequestMapping("/api/produit")
@CrossOrigin
public class ProduitController {
	
	@Autowired
	private ICrudService<Produit, Long> iCrudService;
	
	
	@GetMapping
	public List<Produit> getProduits()
	{
		return iCrudService.getAll();
	}
	
	
	@PostMapping
	public void addProduit(@RequestBody Produit produit)
	{
		iCrudService.add(produit);
	}
	
	
	@PutMapping
	public void updateProduit(@RequestBody Produit produit)
	{
		iCrudService.update(produit);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable Long id)
	{
		iCrudService.delete(id);
	}

	
	
}
