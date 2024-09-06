package buddy.testing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExampleApplicationTests {



	@Test
	void customTest(){
		System.out.println("This is custom test");
	}

	@Test
	void anotherCustomTest(){
		System.out.println("Another Custom Test");
	}

}
