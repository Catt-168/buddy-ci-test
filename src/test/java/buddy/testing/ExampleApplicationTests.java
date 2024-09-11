package buddy.testing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class ExampleApplicationTests {



	@Test
	void customTest(){
		System.out.println("This is custom test");
	}

	@Test
	void anotherCustomTest(){
	Assert.hasText("","");
//		System.out.println("Another Custom Test");
	}

}
