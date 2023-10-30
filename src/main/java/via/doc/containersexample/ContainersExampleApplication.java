package via.doc.containersexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ContainersExampleApplication {

	@RequestMapping()
	public String index() {
		return "<body> <h1> Containerization and Orchestration </h1> </body>";
	}
	public static void main(String[] args) {

		SpringApplication.run(ContainersExampleApplication.class, args);
	}

}
