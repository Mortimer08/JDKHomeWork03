package org.example;

public class Main {
    public static void main(String[] args) {
        Double a = 10.0;
        Float b = 3f;

        System.out.println(Calculator.sum(a, b));
        System.out.println(Calculator.substract(a, b));
        System.out.println(Calculator.devide(a, b));
        System.out.println(Calculator.multiply(a, b));
        Integer[] intArr = {1, 2, 3};
        Integer[] intArr2 = {1, 2, 3};
        Integer[] intArr3 = {4, 2, 3};
        String[] atrArray1 = {"str1", "str2"};
        String[] atrArray2 = {"str1", "str3"};

        System.out.println(compareArrays(intArr, intArr3));
        System.out.println(compareArrays(atrArray1, atrArray2));
        Pair<Integer, String> myPair = new Pair<>(3, "Second item");
        System.out.println(myPair);
    }

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (!array1[i].equals(array2[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}