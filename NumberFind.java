package patika;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberFind {
    public static void main(String[] args) {
        Random rand=new Random(100);
        int sayi= rand.nextInt();
        System.out.println(sayi);
        Scanner sc=new Scanner(System.in);
        int right=0;
        int select;
        int[] wrong=new int[5];
        boolean isWin=false;
        while (right<5){
            System.out.println("Lütfen bir sayı giriniz:");
            select=sc.nextInt();
            if(select<0 ||select>100){

                continue;
            }
            if(select==sayi){
                System.out.println("Tebrikler doğru tahmin.Tahmin ettiğiniz sayı:"+sayi);
           isWin=true;
                break;
            }else {
                wrong[right]=select;
                right++;
                System.out.println("Hatalı bir sayı girdiniz");
                if(select<sayi){
                    System.out.println("girdiğiniz sayı gizli sayıdan küçüktür");
                }else {
                    System.out.println("girdiğiniz sayı gizli sayıdan büyüktür");
                }
                }
            System.out.println("Kalan hakkınız:"+(5-right));
            }

        if(!isWin){
            System.out.println("Kaybettiniz!!!!");
            System.out.println("Tahminleriniz:"+ Arrays.toString(wrong));
            System.out.println("Doğru sayı:"+sayi);
        }

        }

    }

