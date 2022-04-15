package pixar.toystory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToystoryApplication {

	public static void main(String[] args) {
		Woody woody = new Woody();
		woody.setData("brown hat");
		String data = woody.getData();
		System.out.println(data);
		SpringApplication.run(ToystoryApplication.class, args);
	}

}
