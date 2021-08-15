package project4.testng.gradle;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GeometryTest {
	
	private Geometry testObject;
	
	@BeforeTest
	public void setup() {
		testObject = new Geometry();
	}
	
	/*********************************************************************************************************/
	/*                                 			AreaRect													 */
	/*********************************************************************************************************/
	// test area of rectangle with even width and height
	@Test()
	public void testAreaRect_TC_1() {
		float width = 4;
		float height = 6;
		float result = testObject.areaRect(width, height);
		Assert.assertEquals(result, new Float(24).floatValue(), "Test area of rectangle with even width/4 and height/6");
		Assert.assertEquals(new Float(result).floatValue(), 24.0f, "Test area of rectangle with even width/4 and height/6");
	}
	
	// test area of rectangle with odd width and height
	@Test()
	public void testAreaRect_TC_2() {
		float width = 3;
		float height = 7;
		float result = testObject.areaRect(width, height);
		Assert.assertEquals(result, new Float(21).floatValue(), "Test area of rectangle with even width/3 and height/7");
		Assert.assertEquals(new Float(result).floatValue(), 21.0f, "Test area of rectangle with even width/3 and height/7");
	}
	
	// test area of rectangle with decimal width and whole height
	@Test()
	public void testAreaRect_TC_3() {
		float width = 4.5f;
		float height = 7f;
		float result = testObject.areaRect(width, height);
		Assert.assertEquals(result, new Float(31.5).floatValue(), "Test area of rectangle with even width/4.5 and height/7");
		Assert.assertEquals(new Float(result).floatValue(), 31.5f, "Test area of rectangle with even width/4.5 and height/7");
	}
	
	// test area of rectangle with whole width and decimal height
	@Test()
	public void testAreaRect_TC_4() {
		float width = 4f;
		float height = 7.5f;
		float result = testObject.areaRect(width, height);
		Assert.assertEquals(result, new Float(30).floatValue(), "Test area of rectangle with even width/4 and height/7.5");
		Assert.assertEquals(new Float(result).floatValue(), 30f, "Test area of rectangle with even width/4 and height/7.5");
	}
	
	// test area of rectangle with whole width and zero height
	@Test()
	public void testAreaRect_TC_5() {
		float width = 4f;
		float height = 0f;
		float result = testObject.areaRect(width, height);
		Assert.assertEquals(result, new Float(0).floatValue(), "Test area of rectangle with even width/4 and height/0");
		Assert.assertEquals(new Float(result).floatValue(), 0f, "Test area of rectangle with even width/4 and height/0");
	}
	
	/*********************************************************************************************************/
	/*                                 			PerimeterRect												 */
	/*********************************************************************************************************/
	// test perimeter of rectangle with even width and height	
	@Test()
	public void testPerimeterRect_TC_1() {
		float width = 4;
		float height = 6;
		float result = testObject.perimeterRect(width, height);
		Assert.assertEquals(result, new Float(20).floatValue(), "Test perimeter of rectangle with even width/4 and height/6");
		Assert.assertEquals(new Float(result).floatValue(), 20f, "Test perimeter of rectangle with even width/4 and height/6");		
	}
	
	// test area of rectangle with odd width and height
	@Test()
	public void testPerimeterRect_TC_2() {
		float width = 5;
		float height = 7;
		float result = testObject.perimeterRect(width, height);
		Assert.assertEquals(result, new Float(24).floatValue(), "Test perimeter of rectangle with even width/5 and height/7");
		Assert.assertEquals(new Float(result).floatValue(), 24f, "Test perimeter of rectangle with even width/5 and height/7");		
	}
	
	// test area of rectangle with decimal width and whole height
	@Test()
	public void testPerimeterRect_TC_3() {
		float width = 5.5f;
		float height = 7;
		float result = testObject.perimeterRect(width, height);
		Assert.assertEquals(result, new Float(25).floatValue(), "Test perimeter of rectangle with even width/5.5 and height/7");
		Assert.assertEquals(new Float(result).floatValue(), 25f, "Test perimeter of rectangle with even width/5.5 and height/7");		
	}
	
	// test area of rectangle with decimal width and whole height
	@Test()
	public void testPerimeterRect_TC_4() {
		float width = 5f;
		float height = 7.5f;
		float result = testObject.perimeterRect(width, height);
		Assert.assertEquals(result, new Float(25).floatValue(), "Test perimeter of rectangle with even width/5 and height/7.5");
		Assert.assertEquals(new Float(result).floatValue(), 25f, "Test perimeter of rectangle with even width/5 and height/7.5");		
	}
	
	// test area of rectangle with whole width and zero height
	@Test()
	public void testPerimeterRect_TC_5() {
		float width = 5f;
		float height = 0f;
		float result = testObject.perimeterRect(width, height);
		Assert.assertEquals(result, new Float(10).floatValue(), "Test perimeter of rectangle with even width/5 and height/0");
		Assert.assertEquals(new Float(result).floatValue(), 10f, "Test perimeter of rectangle with even width/5 and height/0");		
	}	

	/*********************************************************************************************************/
	/*                                 			VolumeRect												 	 */
	/*********************************************************************************************************/
	// test Volume of Sphere with even radius
	@Test()
	public void testVolumeSphere_TC_1() {
		float radius = 4;
		float result = testObject.volumeSphere(radius);
		
        BigDecimal expectedBigDecimal = new BigDecimal(267.2768); // calculated with 4/3 = 1.33
        expectedBigDecimal = expectedBigDecimal.setScale(2, RoundingMode.HALF_UP); // expected two decimal round up
        
        BigDecimal resultBigDecimal = new BigDecimal(result); // given by function
        resultBigDecimal = resultBigDecimal.setScale(2, RoundingMode.HALF_UP); // expected two decimal round up
	
        Assert.assertEquals(resultBigDecimal.floatValue(), expectedBigDecimal.floatValue(), 0.1f, "Test volume of sphere with even radius/4");
	}
	
	// test Volume of Sphere with even radius
	@Test()
	public void testVolumeSphere_TC_2() {
		float radius = 5;		
		float result = testObject.volumeSphere(radius);
		
        BigDecimal expectedBigDecimal = new BigDecimal(522.025); // calculated with 4/3 = 1.33
        expectedBigDecimal = expectedBigDecimal.setScale(2, RoundingMode.HALF_UP); // expected two decimal round up
        
        BigDecimal resultBigDecimal = new BigDecimal(result); // given by function
        resultBigDecimal = resultBigDecimal.setScale(2, RoundingMode.HALF_UP); // expected two decimal round up
	
        Assert.assertEquals(resultBigDecimal.floatValue(), expectedBigDecimal.floatValue(), 0.1f, "Test volume of sphere with even radius/5");
	}
	
	// test Volume of Sphere with decimal radius
	@Test()
	public void testVolumeSphere_TC_3() {
		float radius = 5.5f;		
		float result = testObject.volumeSphere(radius);
		
        BigDecimal expectedBigDecimal = new BigDecimal(694.815275); // calculated with 4/3 = 1.33
        expectedBigDecimal = expectedBigDecimal.setScale(2, RoundingMode.HALF_UP); // expected two decimal round up
        
        BigDecimal resultBigDecimal = new BigDecimal(result); // given by function
        resultBigDecimal = resultBigDecimal.setScale(2, RoundingMode.HALF_UP); // expected two decimal round up
	
        Assert.assertEquals(resultBigDecimal.floatValue(), expectedBigDecimal.floatValue(), 0.1f, "Test volume of sphere with even radius/5.5");
		
	}
	
	// test Volume of Sphere with zero radius
	@Test()
	public void testVolumeSphere_TC_4() {
		float radius = 0f;		
		float result = testObject.volumeSphere(radius);
		
        BigDecimal expectedBigDecimal = new BigDecimal(0); // calculated with 4/3 = 1.33
        expectedBigDecimal = expectedBigDecimal.setScale(2, RoundingMode.HALF_UP); // expected two decimal round up
        
        BigDecimal resultBigDecimal = new BigDecimal(result); // given by function
        resultBigDecimal = resultBigDecimal.setScale(2, RoundingMode.HALF_UP); // expected two decimal round up
	
        Assert.assertEquals(resultBigDecimal.floatValue(), expectedBigDecimal.floatValue(), 0.1f, "Test volume of sphere with even radius/0");
	}	
	
	@Test()
	public void testSurfaceAreaSphere() {
		
	}
}
