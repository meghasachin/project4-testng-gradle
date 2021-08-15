package project4.testng.gradle;

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
		System.out.println("Test result "+result);
		System.out.println("Test result "+new Float(result).floatValue());
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
	@Test()
	public void testPerimeterRect() {
		
	}
	
	@Test()
	public void testVolumeSphere() {
		
	}
	
	@Test()
	public void testSurfaceAreaSphere() {
		
	}
}
