package module8;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import module8.beans.Company;
import module8.beans.JobOpenings;
import module8.controller.BeanConfiguration;
import module8.repository.CompanyRepository;

@SpringBootApplication
public class SpringBeansProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeansProjectApplication.class, args);

		/*
		 * @SuppressWarnings("resource") ApplicationContext appContext = new
		 * AnnotationConfigApplicationContext(BeanConfiguration.class); Company c =
		 * appContext.getBean("company", Company.class); // type in "" tells which type
		 * of object to cast the // bean to
		 * 
		 * // after getting the bean, can use the class methods to get or set values
		 * System.out.println(c.toString());
		 */
	}

	@Autowired
	CompanyRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		// Using an existing bean
		/*
		 * Company c = appContext.getBean("company", Company.class);
		 * c.setCompanyName("Company1"); repo.save(c);
		 */

		// Create a bean to use - not managed by Spring
		Company co = new Company("Wells Fargo", null);
		JobOpenings jo = new JobOpenings("Account Opener", 55000, 50);
		co.setJobOpenings(jo);
		repo.save(co);
		
		// enhanced for loop to list all entries in database
		List<Company> allCompanies = repo.findAll();
		for (Company people : allCompanies) {
			System.out.println(people.toString());
		}

		// closes the ApplicationContext resource leak - not imperative to add but nice
		// to clean it up
		((AbstractApplicationContext) appContext).close();
	}

}
