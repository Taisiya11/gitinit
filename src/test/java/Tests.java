import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests {
    private Human human;
    private Book book;
    private Movie movie;
    private Calculator calculator;
    private Matrix matrix;
   @Test
    public void humanTest(){
       Human human = new Human("Brown","Ric","Сергеевич",21);
       Assert.assertTrue(human.age>0);
   }
   @Test
   public void bookTest(){
       Assert.assertTrue(book.year>0);
       Assert.assertTrue(book.numberOfPages>0);
   }
   @Test
    public void calculatorTest(){
       Calculator calculator = new Calculator();
       int sum = calculator.sum(3,1);
       int subtraction = calculator.subtraction(3,1);
       int multiplication = calculator.multiplication(3,1);
       int division = calculator.division(3,1);
       Assert.assertEquals(sum,4);
       Assert.assertEquals(subtraction,2);
       Assert.assertEquals(multiplication,3);
       Assert.assertEquals(division,3);
       Assert.assertNotNull(division);
      // Assert.assertFalse(calculator.number2==0);
          }
       @Test
    public void matrixTest(){
       Matrix matrix = new Matrix(3,3);
       int sum = matrix.sum();
       Assert.assertEquals(matrix.n,3);
       Assert.assertEquals(matrix.m,3);
       Assert.assertEquals(matrix.arraySum.length,matrix.array.length);

    }
}