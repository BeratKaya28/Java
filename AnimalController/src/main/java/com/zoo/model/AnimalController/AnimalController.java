package com.zoo.model.AnimalController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/animals")
public class AnimalController {
	
	@Autowired
	private AnimalRepository repository;
	
	@PostMapping
	public Animal addAnimal(@RequestBody Animal animal) {
		
		return repository.save(animal);
	}
	
	@GetMapping
	public List<Animal> getAnimals(){
		return repository.findAll();
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<?> getAnimalByName(@PathVariable String name){
		List<Animal> animals = repository.findByHayvanAdi(name);
		
		if(animals.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hayvan bulunamadı");
		}else if(animals.size()==1) {
			return ResponseEntity.ok(animals.get(0));
		}else {
			return ResponseEntity.ok(animals);
		}
		
	}
	
	@DeleteMapping("/{name}")
	public ResponseEntity<String> deleteAnimalByName(@PathVariable String name){
		List<Animal> animals = repository.findByHayvanAdi(name);
		
		if(animals.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hayvan bulunamadı");
		}
		
		repository.deleteAll(animals);
		return ResponseEntity.ok(name+" adlı hayvanlar başarıyla silindi.");
	}
	
	@PutMapping("/{name}")
	public ResponseEntity<String> updateAnimal(@PathVariable String name, @RequestBody Animal updatedAnimal){
		List<Animal> existingAnimals = repository.findByHayvanAdi(name);
		
		if(existingAnimals.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hayvan bulunamadı.");
		}
		
		for(Animal animal : existingAnimals) {
			
			animal.setYas(updatedAnimal.getYas());
			 animal.setBoy(updatedAnimal.getBoy());
		        animal.setKilo(updatedAnimal.getKilo());
		        animal.setHız(updatedAnimal.getHız());
		        animal.setRenk(updatedAnimal.getRenk());
		        repository.save(animal);
			
		}
		
		return ResponseEntity.ok(name+" adlı hayvan başarıyla güncellendi.");
	}
	
	
	
	
	
	

}
