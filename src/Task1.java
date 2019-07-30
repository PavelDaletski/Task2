import com.sun.deploy.util.ArrayUtil;


import java.util.ArrayList;
import java.util.Arrays;


public class Task1 {
    public static void main(String[] args) {


        // Задача 1. Напишите Java-программу для сортировки числового массива и строкового массива.

        {
            int myArray[] = {1, 5, 6, 8, 7, 2, 9};
            Arrays.sort(myArray);
            String myArrayString = Arrays.toString(myArray);
            System.out.println(myArrayString);
        }
        {
            String myArray1[] = {"Home", "Jobs", "Car", "Dog", "Task"};
            Arrays.sort(myArray1);
            String myArray1String = Arrays.toString(myArray1);
            System.out.println(myArray1String);
        }

        // Задача 2. Напишите Java-программу для суммирования значений массива.
        {
            int myArray2[] = {1, 15, 8, 4, 9, 13, 6, 7};
            int sum = 0;
            for (int i = 0; i < myArray2.length; i++) {
                sum = sum + myArray2[i];
            }
            System.out.println(sum);
        }


        // Задача 3. Напишите Java-программу для печати следующей сетки
        {
            int[][] a = new int[10][10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.printf("%2d ", a[i][j]);
                }
                System.out.println();
            }
        }


        // Задача 4. Напишите Java-программу для расчета среднего значения элементов массива.
        {
            int myArray3[] = {1, 5, 10, 18, 3, 9, 2, 16};
            int sum = 0;
            int result = 0;
            for (int i = 0; i < myArray3.length; i++) {
                sum = sum + myArray3[i];
                result = myArray3.length % sum;
            }
            System.out.println("Среднее" + result);
        }

        // Задача 5. Напишите Java-программу для проверки, содержит ли массив конкретное значение.
        {
            int myArray4[] = {1, 5, 7, 9, 10, 14, 15, 6};
            int key = Arrays.binarySearch(myArray4, 10);
            System.out.println(key);
        }

        // Задача 6. Напишите программу на Java, чтобы найти индекс элемента массива.
        {
            int myArray5[] = {1, 23, 12, 53, 34, 54, 74, 63};

            int item2 = 54;

            for (int i = 0; i < myArray5.length; i++) {
                if (myArray5[i] == item2) {
                    System.out.println(i);
                }
            }
        }

        // Задача 7. Напишите Java-программу для удаления определенного элемента из массива.
        {
            int myArray6[] = {1, 5, 14, 16, 9, 7, 20};
            int removeIndex = 3;
            for (int i = removeIndex; i < myArray6.length - 1; i++) {
                myArray6[i] = myArray6[i + 1];
            }
            System.out.println(Arrays.toString(myArray6));
        }

        // Задача 8. Напишите Java-программу для копирования массива путем итерации массива.
        {
            int[] myArray8 = {1, 8, 10, 14, 5, 9, 60, 47, 16, 3};
            int newmyArray[] = new int[10];
            for (int i = 0; i < myArray8.length; i++) {
                newmyArray[i] = myArray8[i];
            }
            System.out.println(Arrays.toString(newmyArray));

        }

        // Задача 9. Напишите Java-программу для вставки элемента (определенной позиции) в массив.
        {
            int myArray9[] = {1, 158, 15, 16, 81, 10, 18};
            int Index_position = 4;
            int newvalue = 13;
            for (int i = myArray9.length - 1; i > Index_position; i--) {
                myArray9[i] = myArray9[i - 1];
            }
            myArray9[Index_position] = newvalue;
            System.out.println(Arrays.toString(myArray9));
        }


        // Задача 10. Напишите программу на Java, чтобы найти максимальное и минимальное значение массива.
        {
            int myArray[] = {2, 5, 8, 7, 4, 10, 15, 18, 3, 4, 19, 9};
            int max = myArray[0];
            int min = myArray[0];
            for (int i = 0; i != myArray.length; i++) {
                if (myArray[i] > max) {
                    max = myArray[i];
                }
                if (myArray[i] < min) {
                    min = myArray[i];
                }
            }
            System.out.println(max);
            System.out.println(min);
        }

        // Задача 11. Напишите Java-программу для обращения к массиву целочисленных значений.
        {
            int myArray11[] = {15, 18, 70, 16, 90, 304, 823, 47, 1};
            for (int i = 0; i < myArray11.length / 2; i++) {
                int temp = myArray11[i];
                myArray11[i] = myArray11[myArray11.length - i - 1];
                myArray11[myArray11.length - i - 1] = temp;
            }
            System.out.println(Arrays.toString(myArray11));
        }


        // Задача 12. Напишите программу на Java, чтобы найти повторяющиеся значения в массиве целочисленных значений.
        {
            int myArray12[] = {2, 96, 50, 82, 16, 25, 1, 9, 65, 11, 47, 96};
            for (int i = 0; i < myArray12.length - 1; i++) {
                for (int u = i + 1; u < myArray12.length; u++) {
                    if ((myArray12[i] == myArray12[u]) && (i != u)) {
                        System.out.println(myArray12[u]);
                    }
                }
            }
        }


        // Задача 13. Написать Java-программу для поиска дублирующихся значений массива строковых значений.
        {
            String myArray13[] = {"Red", "Jobs", "CNC", "Log", "Red", "Pencil"};
            for (int i = 0; i < myArray13.length - 1; i++) {
                for (int q = 0; q < myArray13.length; q++) {
                    if ((myArray13[i] == myArray13[q]) && (i != q)) {
                        System.out.println(myArray13[q]);
                    }
                }
            }
        }

        // Задача 14. Напишите программу на Java, чтобы найти общие элементы между двумя массивами (строковые значения).
        {
            String myArray14[] = {"Home", "Work", "Jobs", "Int", "String"};
            String myArray15[] = {"Academy", "Class", "Car", "Home", "Red"};
            for (int i = 0; i < myArray14.length; i++) {
                for (int j = 0; (j < myArray15.length); j++) {
                    if (myArray14[i] == myArray15[j]) {
                        System.out.print(myArray15[j]);
                        break;
                    }
                }
            }
        }


        // Задача 15. Напишите программу на Java, чтобы найти общие элементы между двумя массивами целых чисел.
        {
            int myArray16[] = {1, 5, 9, 7, 4, 5, 10, 15, 2};
            int myArray17[] = {4, 8, 6, 12, 14, 17, 10, 18};

            for (int p = 0; p < myArray16.length; p++) {
                for (int o = 0; (o < myArray17.length); o++) {
                    if (myArray17[p] == myArray16[o]) {
                        System.out.print(myArray17[o]);
                        break;
                    }
                }
            }
        }

        // Задача 16. Напишите Java-программу для удаления дублирующихся элементов из массива.
        { int myArray16[] = {2, 96, 50, 82, 16, 25, 1, 9, 65, 11, 47, 96};
          int[] resultArray=Arrays.stream(myArray16).distinct().toArray();
            System.out.println(Arrays.toString(resultArray));
                }

        // Задача 17. Написать программу на Java, чтобы найти второй по величине элемент в массиве.
        {
            int myArray[]={1,15,41,6,8,45,79,10,16,52,25,19,22};
            int max=myArray[0];
            int max2=myArray[0];
            for (int i=0; i<myArray.length; i++){
                if (max<myArray[i]){
                    max=myArray[i];}
                else if (max2<myArray[i]){
                    max2=myArray[i];
                    }
                }
            System.out.println(max2);
        }


        // Задача 18. Напишите программу на Java, чтобы найти второй наименьший элемент в массиве.
        {
            int myArray18[] = {3,5, 8, 10, 169, 78, 69, 32, 14, 45, 16};
            Arrays.sort(myArray18);
            int min2 = myArray18[1];

            System.out.println(min2);
        }


        // Задача 19. Напишите Java-программу для добавления двух матриц одинакового размера.
        {
            int myArrey19 [][] = {{1,2,3}, {4,5,6}, {7,8,9}};
            int myArrey20 [][] ={{4,5,6}, {7,8,9},{1,2,3}};

            int newmyArrey [][] = new int[3][3];
            for (int i=0; i<3; i++){
                for (int q=0; q<3; q++){
                    newmyArrey [i][q]=myArrey19[i][q]+myArrey20[i][q];
                    System.out.println(newmyArrey[i] [q]+"");
                }
                System.out.println();
            }
        }



            // Задача 20. Напишите Java-программу для преобразования массива в ArrayList.
            {
                Integer myArray20[] = {1, 23, 12, 53, 34, 54, 74, 63};
                ArrayList<Integer> myArray = new ArrayList<>(Arrays.asList(myArray20));
                System.out.println(myArray);
            }

        }
    }





