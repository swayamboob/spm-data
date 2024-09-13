package ideas.spm.spm_data;

import ideas.spm.spm_data.entity.Product;
import ideas.spm.spm_data.entity.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpmDataApplication implements CommandLineRunner {
	@Autowired
	ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpmDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product product= new Product(0,"Pencil","educational",2.5f,4);
		productRepository.save(product);
	}
//	@Override
//	public void run(String... args) throws Exception{
//
//	}

}
