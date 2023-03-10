/*
* Напишите метод, который принимает на вход строку (String)
* и определяет является ли строка палиндромом (возвращает boolean значение).
 */

 import java.util.Arrays;

 public class task3 {
 
     public Boolean vozvrat(String A) {
         String K = "";
         String B = "";
         char[] mass0 = A.toCharArray();
         for (int l = 0; l < mass0.length - 1; l++) {
             if (Character.isLetterOrDigit(mass0[l]) == false) {
                 l++;
             }
             K += mass0[l];
         }
         K = K.replace(" ", "");
         char[] mass = K.toCharArray();
         char[] mass2 = new char[mass.length];
         for (int i = mass.length - 1; i >= 0;) {
             for (int j = 0; j < mass2.length; j++) {
                 mass2[j] = mass[i];
                 i--;
                 B += mass2[j];
             }
         }
         System.out.println(A);
         System.out.println(K);
         System.out.println(B);
         return B.equalsIgnoreCase(K);
     }
     public static void main(String args[]) {
         task3 C = new task3();
         System.out.println(C.vozvrat("Madam, I'm Adam!"));
     }
 }
        
        
