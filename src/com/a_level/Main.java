package com.a_level;

public class Main {

    public static void main(String[] args) {
        /*1.	Дано число (к примеру 347_693_485). Для каждой из цифр в этом числе (справа налево) **(слева направо), если она кратна (делится без остатка) 2, вывести fizz
если она кратна 3, вывести buzz
если она кратна 2 и 3, вывести fizzbuzz
иначе, вывести саму цифру */
        /*слева направо*/
        String number = "347693485";
        for(int i=0; i<number.length(); i++){
            int temp= number.charAt(i);
            if(temp%6==0){
                System.out.print("fizzbuzz"+" ");
            }
            else if(temp%2==0){
                System.out.print("fizz"+" ");
            }
            else if(temp%3==0){
                System.out.print("buzz"+" ");
            }
            else{
                System.out.print(number.charAt(i)+" ");
            }
        }
        System.out.println(" ");

        /*справа налево*/
        for(int j=number.length()-1; j>=0; j--){
            int temp= number.charAt(j);
            if(temp%6==0){
                System.out.print("fizzbuzz"+" ");
            }
            else if(temp%2==0){
                System.out.print("fizz"+" ");
            }
            else if(temp%3==0){
                System.out.print("buzz"+" ");
            }
            else{
                System.out.print(number.charAt(j)+" ");
            }
        }
        System.out.println(" ");

        /*2.	Дано число типа long. Посчитать в нем количество битов, имеющих значение 1.*/
        long numLong=333;
        int numInt= (int) numLong;
        String numString=Integer.toBinaryString(numInt);
        System.out.println("BinaryString = "+numString);
        int count=0;
        for(int i=0; i<numString.length(); i++){
            if(numString.charAt(i)=='1'){
                count++;
            }
        }
        System.out.println("Count of 1= "+count);
    }
}





