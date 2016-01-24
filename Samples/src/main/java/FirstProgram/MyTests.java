
public class MyTests {
    
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        boolean isAGreaterThanB=a>b;
        boolean isBGreaterThanA=b>a;

        boolean ans= isAGreaterThanB || isBGreaterThanA; 
        System.out.println(ans);
    }
}