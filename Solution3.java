import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String str=String.format("%03d",x);
                System.out.println(s1+"\t\t"+str);
            }
            System.out.println("================================");
            sc.close();

    }
}



