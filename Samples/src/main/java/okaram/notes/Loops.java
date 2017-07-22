package okaram.notes
import java.util.Scanner;
import java.io.PrintStream;

class Loops {

    // tag::readAndSumDoWhile[]
    public static int readAndSum(PrintStream out, Scanner in)
    {
        int sum=0;
        int input;
        do {
            out.println("Please enter a number (0 to stop)");
            input=in.nextInt();
            sum+=input;
        } while(input!=0);
        return sum;
    }
    // end::readAndSumDoWhile[]

    // tag::readAndSumWhile[]
    public static int readAndSumW(PrintStream out, Scanner in)
    {
        int sum=0;
        int input=1;
        while(input!=0) {
            out.println("Please enter a number (0 to stop)");
            input=in.nextInt();
            sum+=input;
        } 
        return sum;
    }
    //end::readAndSumWhile[]

    //tag::countAndPrintWhile[]
    static void countAndPrintWhile(int low, int high, PrintStream out) {
        int i=low;
        while(i<=to) {
            out.println(i);
            ++i;
        }
    }
    //end::countAndPrintWhile[]

    //tag::countDownWhile[]
    static void countDownWhile(int high, int low, PrintStream out) {
        int i=high;
        while(i>=low) {
            out.println(i);
            --i;
        }
    }
    //end::countDownWhile[]

    //tag::powerWhile[]
    int power(int base, int exponent)
    {
        int pow=1;
        int counter=0;
        while(counter<exponent) {
            pow*=base;
            ++counter;
        }
        return pow;
    }
    //end::powerWhile[]

    //tag::powerWhile1[]
    int power(int base, int exponent)
    {
        int pow=1;
        while(exponent>0) {
            pow*=base;
            --exponent;
        }
        return pow;
    }
    //end::powerWhile1[]

    //tag::powerFor[]
    int power_for(int base, int exponent)
    {
        int pow;
        for(  pow=1; exponent>0; --exponent) { 
            pow*=base;
        }
        return pow;
    }
    //end::powerFor[]

    public static boolean containsDigit(int number, int digit)
    {
        for( ; number!=0 ; number /=10){
            int lastDigit=number%10;
            if(lastDigit==digit)
                return true;
        }
        return false;
    }

    int power2(int base, int exponent)
    {
        int pow=1;
        while(exponent>0) {
            pow*=base;
            --exponent;
        }
        return pow;
    }

    // read numbers until you read -1 and return their sum
    //tag::readBreak[]
    public static int readAndSumBreak(PrintStream out, Scanner in)
    {
        int sum=0;
        int input;
        while( true ) {
            out.println("Please enter a number (-1 to stop)");
            input=in.nextInt();
            if(input==-1) 
                break;
            sum+=input;
        } 
        return sum;
    }
    //end::readBreak[]

    //tag::readBreakFor[]
    public static int readAndSumBreak(PrintStream out, Scanner in)
    {
        int sum=0;
        int input;
        for( ; ; ) {
            out.println("Please enter a number (-1 to stop)");
            input=in.nextInt();
            if(input==-1) 
                break;
            sum+=input;
        } 
        return sum;
    }
    //end::readBreakFor[]

    static boolean isEven(int n) { return n%2==0;}

    public static int pow_log(int base, int exponent)
    {
        if(exponent==0)
            return 1;
        int halfPow=pow_log(base, exponent/2);
        if(isEven(exponent)) {
            return halfPow*halfPow;
        } else {
            return base * halfPow*halfPow;
        }
    }

    static void guessingGame(PrintStream out, Scanner in) {
        int target=new java.util.Random().nextInt(100);

        int input;
        do {
            out.println("Guess my number ...");
            input=in.nextInt();
            if(input>target) {
                out.println("Too high");
            } else if (input < target) {
                out.println("Too low");
            } else {
                out.println("You got it");
            }
            
        } while(input != target);
    }

    //tag::countAndPrintFor[]
    static void countAndPrint(int from, int to, PrintStream out) {
        for(int i=from; i<=to; ++i) {
            out.println(i);
        }
    }
    //end::countAndPrintFor[]

    static void printMulTable(PrintStream ps)
    {
        ps.print(" \t");
        for(int col =1; col <=6; ++col) {
            ps.print(col+"\t");
        }
        ps.println();
        
        for(int row=1; row<=6; ++row) {
            ps.print(row+"\t");
            for(int col =1; col <=6; ++col) {
                ps.print(row*col+"\t");
            }
            ps.println();
        }
    }

    public static void main(String[] args) {
        Scanner theScanner=new Scanner(System.in);
//        int s=readAndSum2(System.out, theScanner);
//        System.out.println("The sum is: "+s);
//        System.out.println(pow_log(2, 9));
        //guessingGame(System.out, theScanner);
    //        System.out.println(containsDigit(12345, 3));
//        System.out.println(containsDigit(12345, 6));

        printMulTable(System.out);
    }
}
