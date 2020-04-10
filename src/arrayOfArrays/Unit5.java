package arrayOfArrays;

import Utils.Util;

public class Unit5 {
    public static void main(String[] args) {
        int a = Util.scan("Vvedite kolichestvo strok");
        int b =Util.scan("Vvedite kolichestvo stolbcov");
        int[][] array = Util.arraysOfArrays(a,b);
        Util.printDouble(array);
        System.out.println("количество '-1' встречается "+ findNumberOfNegative(array)+" раз");
    }
    private  static int findNumberOfNegative(int[][]a){
        int count =0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if (a[i][j]==-1){
                    count++;

                }
            }
        }return count;



    }

}
