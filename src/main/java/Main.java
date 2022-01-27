public class Main {
public static void main(String[] args){
    Human human = new Human("Brown","Ric","Сергеевич",34);
    Book book = new Book("java",2021,"Rick",5);
    Human human1 = new Human();
    Calculator calculator = new Calculator();
    Matrix matrix = new Matrix(3,3);
    System.out.println(human);
    System.out.println(human1);
    System.out.println(calculator.sum(2,1));
    System.out.println(calculator.subtraction(3,3));
    System.out.println(calculator.multiplication(4,2));
    System.out.println(calculator.division(4,2));
    }
}
