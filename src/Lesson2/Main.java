package Lesson2;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16", "2"}

        };
        try {
            System.out.println(checkArr(arr));
        }catch (MyArraySizeException e){
            System.err.println(("Проверьте размер массива"));
        }catch (MyArrayDataException e){
            System.err.println("Проверьте тип данных");
            System.out.println(checkArr(arr));
        }
    }
    public static int  checkArr(String[][] a) throws MyArraySizeException, MyArrayDataException{
       int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if ((a[i].length != 4) || a.length != 4) {
            throw new MyArraySizeException("Создайте двумерный массив 4х4");
        }
            for (int j = 0; j < a.length; j++) {
               try {
                    sum +=  Integer.parseInt(a[i][j]) ;
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("InvalidDataType arr[" + i + "][" + j + "]");
                }
            }

        }
        return sum;
    }

    private static class MyArraySizeException extends ArrayIndexOutOfBoundsException {
        public MyArraySizeException(String s) {
            super(s);
        }
    }

    private static class MyArrayDataException extends NumberFormatException{
        public MyArrayDataException(String s) {
            super(s);
        }
    }
}
