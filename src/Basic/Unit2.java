package Basic;

import Utils.Util;

public class Unit2 {
    public static void main(String[] args) {
     int h;
     int m;
      int s;
      double k;
      int b=60;
      int c= 3600;
      int d= Util.scanInt("введите количество секунд");
      h=d/c;
      k=d%c;
      m=(int)(k/b);
      s=(int)(k%b);
        System.out.println(h+"часы"+m+"минуты"+s+"секунды");







    }
}
