package org.example.lesson4;

public class Triangle {



public static class NotTriangleException extends Exception {

	public NotTriangleException (String message) {
		super(message);
	}

}

//public IncorrectValuesException (String message) {
//	super(message);


public static void main(String[] args) throws NotTriangleException {
	System.out.println(SqTriangle(5, 12, 13));
	System.out.println(SqTriangle(23, 23, 23));
	/*System.out.println(createTriangle(15, 0, 15));*/
	System.out.println(SqTriangle(13, 15, 18));
	/*System.out.println(createTriangle(-15, -15, -15));*/
	System.out.println(SqTriangle(20, 20, 20));

	double p;
	System.out.println("");

	try {
		p = SqTriangle(1, 4, -4);
		System.out.println("S="+p);
	}catch
		(NotTriangleException|IllegalArgumentException ex)
		{System.out.println(ex);
	}

	try {
		p = SqTriangle(1, 1, 1);
		System.out.println("S="+p);
	}catch
		(NotTriangleException|IllegalArgumentException ex) {
		System.out.println(ex);
	}


	try {
		p = SqTriangle(2, 2, 2);
		System.out.println("S="+p);
	}catch
		(NotTriangleException|IllegalArgumentException ex) {
		System.out.println(ex);
	}

	try {
		p = SqTriangle(2, 3, 5);
		System.out.println("S="+p);
	}catch
		(NotTriangleException|IllegalArgumentException ex) {
		System.out.println(ex);
	}

	try {
		p = SqTriangle(-2, 2, 2);
		System.out.println("S="+p);
	} catch
	(NotTriangleException|IllegalArgumentException ex) {
		System.out.println(ex);
	}
}

public static double SqTriangle(int a, int b, int c) throws  NotTriangleException {
	System.out.println("");

	System.out.println(a+","+b+","+c);
	if((a>0) && (b>0) && (c>0)) {
		if((a+b)>c && (a+c)>b && (c+b)>a) {
				System.out.println("Triangle is valid");
				double p = (a+b+c)/2.0;
			//	System.out.println(p);
				double s = p*(p-a)*(p-b)*(p-c);
	//		System.out.println(s);
				return Math.sqrt(s);
			} else {
				System.out.println("Not triangle2");
	     		throw new NotTriangleException("Нельзя построить треугольник с такиой длиной сторон");
			}
		} else {
			System.out.println("Not triangle1");
			throw new IllegalArgumentException("Длина стороны не может быть <= 0");
		}
	}

}