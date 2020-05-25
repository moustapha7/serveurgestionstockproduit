package com.example.demo;

import com.example.demo.entity.Produit;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.repository.ProduitRepository;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.util.RoleEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ServeurGestionDesStockProduitsApplication {

	public static void main(String[] args) {

		SpringApplication.run(ServeurGestionDesStockProduitsApplication.class, args);
		/*ConfigurableApplicationContext ctx =	SpringApplication.run(ServeurGestionDesStockProduitsApplication.class, args);
		ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);

		produitRepository.save(new Produit("livre",50,2000));
		produitRepository.save(new Produit("banane",15,1000));
		produitRepository.save(new Produit("pomme",4,1400));

		RoleRepository roleRepository = ctx.getBean(RoleRepository.class);
		Role rolesUser = new Role(RoleEnum.ROLE_USER);
		Role roleAdmin = new Role(RoleEnum.ROLE_ADMIN);

		roleRepository.save(rolesUser);
		roleRepository.save(roleAdmin);



		UserRepository userRepository = ctx.getBean(UserRepository.class);

		User user = new User("mana","passer",true);
		user.setRoles(Arrays.asList(rolesUser));
		userRepository.save(user);

		User admin = new User("tapha","passer",true);
		admin.setRoles(Arrays.asList(roleAdmin, rolesUser));
		userRepository.save(admin); */

	}

}
