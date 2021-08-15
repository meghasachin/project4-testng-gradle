package project4.testng.gradle;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Geometry {	
	private static float PI = 3.14f;
	
	public float areaRect(float width, float height) {
		return width * height;
	}
	
	public float perimeterRect(float width, float height) {
		return 2 * (width + height);
	}
	
	public float volumeSphere(float radius) {
		BigDecimal bigDecimal = new BigDecimal(4f/3f);
		bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
		return bigDecimal.floatValue() * PI * radius * radius * radius;
	}
	
	public float surfaceAreaSphere(float radius) {
		return 0;
	}
}