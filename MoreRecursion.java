int power(int base, int exponent) {
    if(exponent==0)
        return 1;
    else
        return base * power(base, exponent-1); 
}

int pow2(int base, int exponent, int accum) {
    System.out.println("pow2 "+base+" "+exponent+" "+accum);
    if(exponent==0)
        return accum;
    return pow2(base, exponent-1, base*accum);
}
//           0  1  2  3  4  5  6   7   8
// Fibonacci 1, 1, 2, 3, 5, 8, 13, 21, 34, ....
int fib(int n) {
    System.out.println("fib " +n);
    if (n<=1)
        return 1;
    else   
        return fib(n-1) + fib(n-2);
}

int fib_accum(int n, int current,  int prev1, int prev2 )
{
//    System.out.println("fib_accum "+n + " "+current+" "+prev1 + " "+prev2);
    if(n==current)
        return prev1;
    else
        return fib_accum(n, current+1, prev1+prev2, prev1);
}


// count up, from from to to, INCLUSIVE
void PrintCountUp(PrintStream out, int from, int to, int step) {
    if(from<=to) {
        out.println(from);
        PrintCountUp(out, from+step, to, step);
    }
}

// from>to , call like PrintCountDown(System.out, 10, 1, 2) to get 10,8,6,4,2
void PrintCountDown(PrintStream out, int from, int to, int step) {
    if( from>=to ) {
        out.println(from);
        PrintCountDown(out, from-step, to, step);        
    }
}

void PrintCountDown2(PrintStream out, int to, int from, int step) {
    if(from<=to) {
        PrintCountDown2(out, from+step, to, step);
        out.println(from);
    }
}

// compoundInterest(1000, 1.05, 30)    5%=1.05
double compoundInterest(double principal, double interestFactor, int numSteps ){
    if(numSteps<=0)
        return principal;
    else 
        return compoundInterest(principal*interestFactor, interestFactor, numSteps-1);
}





int gcd(int a, int b){
    if(b==0)
        return a;
    else
        return gcd(b, a%b);
}



