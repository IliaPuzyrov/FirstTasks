package arrays;

import Utils.Util;

import java.util.Random;

public class Unit6 {

    public static void main(String[] args){

        int size = Util.scan("введи размер массива: ");
        int[] array = Util.array(size);
        Util.print(array);
            int n=0;
            int y=0;
            for(int t:array){
                n=findNumber(array, t);
                if(y<n){
                    n=t;
                    y=n;
                }
            }

            System.out.println(y+" повторилась "+ n+" раз");

        }

      private static int findNumber (int[] array,int a){
            int o=0;
            for(int t:array){
                if(a==t){
                    o++;
                }
            }
            return o;
        }

    }


