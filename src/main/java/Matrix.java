import java.util.Random;

/**
 * Недоработанный класс, производящий основные математические операции между матрицами
 */
public class Matrix {
    int n;
    int m;
    int [][] array;
    int [][] array1;
    int[][] arraySum;
    Matrix (int n,int m){
        this.n=n;
        this.m=m;
        this.array= new int[this.n][this.m];
        this.array1= new int[this.n][this.m];
        this.arraySum= new int[this.n][this.m];
    }

    /**
     * Метод создания матрицы рандомными значениями
     */
    public int[][] createMatrix(){
        Random random = new Random();
         for(int i=0;i<n;i++){
             for (int j = 0; j<m; j++){
                 array[i][j]=random.nextInt();
             }
             }
         return array;
         }

    /**
     * Метод для назначения элемента матрицы значения  * @param value , длиной строк * @param n и длиной столбцов * @param m
     */
   public void setElement(int n,int m,int value){
         array[n][m]=value;
    }

    /**
     * Метод для получения элемента матрицы
     */
    public int getElement(int n,int m){
        return array[n][m];
    }

    /**
     * Метод сложения двух матриц
     */
    public int sum(){
                for(int i=0;i<n;i++){
            for (int j = 0; j<m; j++){
                arraySum[i][j]=array[i][j] + array1[i][j];
            }
        }
                return arraySum[n][m];
    }

    /**
     * Метод вывода матрицы
     */
    @Override
    public String toString(){
        for(int i=0;i<n;i++){
            for (int j = 0; j<m; j++){
                System.out.println(array[i][j]+" ");
            }
            System.out.println("\n\n");
            }
        return null;
    }
}
