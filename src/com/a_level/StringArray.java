package com.a_level;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    /*Создать класс StringArray с конструктором который будет принимать переменное количество аргументов и помещать эти аргументы во внутреннее поле класса (массив).*/
   int number;
    String arrayClass[]= new String[number];
    void StringArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Сколько будет элементов?");
         int num = input.nextInt();
        String array[]= new String[num];
        number=num;
        for (int i = 0 ; i < num; i++ )
        {
            System.out.print("Введи строковый элемент "+ (i+1) +":  ");
            array[i] = input.next();
        }
        arrayClass= Arrays.copyOf(array, number);
        System.out.println("Поле класса (массив): ");
        for (int i = 0 ; i < num; i++){
           System.out.println(arrayClass[i]);
        }
            }
/*Создать 2 метода для сортировки (в прямом и обратном порядке) методом вставки */
    void sorting(){
        for (int i=1; i<number;i++){
            String current=arrayClass[i];
            int j = i-1;
            while(j>=0 && current.compareTo(arrayClass[j])<0){
                arrayClass[j+1]=arrayClass[j];
                j--;
            }
            arrayClass[j+1]=current;
        }
        System.out.print("После сортировки: ");
        for (int i=0; i<number;i++){
            System.out.print(arrayClass[i] + ", ");
        }
    }
    void sorting_2(){
        for (int i=1; i<number;i++){
            String current=arrayClass[i];
            int j = i-1;
            while(j>=0 && current.compareTo(arrayClass[j])>0){
                arrayClass[j+1]=arrayClass[j];
                j--;
            }
            arrayClass[j+1]=current;
        }
        System.out.print("После сортировки2: ");
        for (int i=0; i<number;i++){
            System.out.print(arrayClass[i] + ", ");
        }
    }
    /*Создать метод который будет возвращать пронумерованный массив одной строкой, пример: “1: первый элемент; 2: второй элемент”.*/
    void arrayOneLine(){
        for (int i = 0 ; i < number; i++){
            System.out.print((i+1) + " элемент:"  + arrayClass[i] + "; ");
        }
    }
}
