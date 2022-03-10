package qa.lessonsWork;


import org.testng.Assert;
import org.testng.annotations.Test;

  public class SquareTests {

    @Test
    public void testAriapatrat() {
      Square s = new Square(5);
      //assert s.ariapatrat()==25;
      Assert.assertEquals(s.ariapatrat(),25.0);
      //pentru aratarea variantei gresite
    }
  }



