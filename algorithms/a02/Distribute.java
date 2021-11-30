import java.util.Scanner;
public class Distribute {
    public static String distrib(int x, int y) {
        String va = "distribute("+x+ ","+y+")=>[";
        int d = y/x, count = 0, c = 0;
        int mod = y % x;
        for(int i=0;i<x; i++){
            va += "[";
            for(int j =0; j< d; j++) {
                va += String.valueOf(count);
                if((j+1)!= d){
                    va += ",";
                }
                count++;
            }
            if(c < mod)
            {
                va += ",";
                va += String.valueOf(count);
                c++;
                count++;
            }
            va += "]";
            if ((i +1) !=x)
            {
                va += ",";
            }
        }
        va += "]";
        return va;
    }
     public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("input : x = ");
        int x = sc.nextInt();
        
        Scanner sa = new Scanner(System.in);
        System.out.print("input : y = ");
        int y = sa.nextInt();     
        System.out.println(distrib(x,y));
    }
}