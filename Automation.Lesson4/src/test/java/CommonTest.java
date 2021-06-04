import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.logging.Logger;

public class CommonTest {

SquareTriangle squareTriangle=new SquareTriangle();

@BeforeAll
    static void beforeAllTests(){

}

    @Test
    @DisplayName("Позитивный тест с целым результатом")
    void correctTriangleInt (){
    double result=squareTriangle.Square(3,4,5);
        Assertions.assertEquals(6,result);
    }

    @Test
    @DisplayName("Позитивный тест с дробным результатом")
    void correctTriangleDouble (){
        double result=squareTriangle.Square(3,5,3);
        Assertions.assertEquals(4.146,result);
    }

    @ParameterizedTest
    @CsvSource({"3,4,5,6","1,5,5,2.487","10,15,20,72.618"})
    @DisplayName("Позитивные параметризированные тесты ")
    void correctTriangleDouble (int a, int b, int c, double expRes){
        double result=squareTriangle.Square(a,b,c);
        Assertions.assertEquals(expRes,result);
    }

    @ParameterizedTest
    @CsvSource({"0,1,1","1,2,3","-5,5,5","0,0,0"})
    @DisplayName("Негативные тесты")

    void negativeTest(int a, int b, int c)
    {
      try {
          double result = squareTriangle.Square(a,b,c);
          Assertions.fail();
      }
      catch (UnsupportedOperationException e){
          Assertions.assertEquals("Triangle doesn't exist", e.getMessage());
      }
      }


}
