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
	public void testAreaRect() {
		float width = 4;
		float height = 6;
		float result = testObject.areaRect(width, height);
		Assert.assertEquals(result, 24, "Test area of rectangle with even width/4 and height/6");
	}
	
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
