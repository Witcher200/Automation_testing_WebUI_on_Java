package org.example.lesson4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

class TriangleTest {

static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

@Test
@DisplayName("logging")
@Order(1)
public void simpleTest() {
	logger.info("Информация");
	logger.error("Ошибка");
	assertTrue(true);
}

@Test
@DisplayName("Test 1")
void sqTriangle() throws Triangle.NotTriangleException  {
   assertEquals(30.000d, Triangle.SqTriangle(5,12,13),0.001d);
}

@Test
@DisplayName("Test 2")
void sqTriangle1() throws Triangle.NotTriangleException  {
	//assertEquals( 1.7320d, Triangle.SqTriangle(-1,2,2),0.001d);
	assertEquals( 0.433d, Triangle.SqTriangle(1,1,1),0.001d);
	assertEquals( 1.7320d, Triangle.SqTriangle(2,2,2),0.001d);

}

@Test
@DisplayName("Test Exceptions 1")
void shouldThrowException1() {
	Throwable exception = assertThrows(IllegalArgumentException.class, ()
			-> { Triangle.SqTriangle(-1,2,2) ;
	});
	assertEquals("Длина стороны не может быть <= 0", exception.getMessage());
}

@Test
@DisplayName("Test Exceptions 2")

void shouldThrowException2() {
	Throwable exception = assertThrows(Triangle.NotTriangleException.class, ()
			-> { Triangle.SqTriangle(5,2,2) ;
	});
	assertEquals("Нельзя построить треугольник с такиой длиной сторон", exception.getMessage());
}

}