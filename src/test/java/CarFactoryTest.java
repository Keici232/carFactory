import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarFactoryTest {

	Car car;

	@BeforeEach
	void setUp () {
		car = new Car();
	}

	@Test
	void test_create_car_success () {
		car.createNewCar();

		assertEquals(null, car.createNewCar());

	}
}
