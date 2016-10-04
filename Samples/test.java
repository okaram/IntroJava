i​nt​ ​a​=10, ​b​;
a​=​a​+5;           // a=15
b​=​a​+4;           // b=19
b= (++a);                // a=16, b=16
int​ ​ans​=​a​+​b​;     //16+19=35

//Write a function called isOdd that takes an int and returns a boolean; 
//the function returns true if the number is odd and false otherwise
public static
boolean isOdd(int a) {
    return (a%2==1);
}
//Write a function called isLarge that takes an int and returns a boolean; 
// the function returns true if its argument is larger than 1000, false otherwise.
boolean isLarge(int n){
    return n>1000;
}

//Write a function called fizz, that takes an integer and returns a String. 
//The function returns “fizz” if its argument is divisible by 3, and the 
//number otherwise 
public static
String fizz(int a) {

    return a%3==0 ? "fizz" : ""+a;
/*    if(a%3==0)
        return "fizz";
    else
        return ""+a;
*/
}

public​ ​static​ 
​int​ bar(​int​ ​a​) {
    if​ (​a​<=0)
        return​ 2;
    else
        return​ ​a​*bar(​a-​­1);
}

bar(-1) ?  = 2
bar(3) = 3*bar(2) = 3* 2 *bar(1) = 3 * 2 * 2 = 18


public​ ​static​ 
String baz(​char​ ​c1​, ​char​ ​c2​) {
    String ​ans​=​""​;
    for​(​char​ ​c​=​c1​; ​c​<=​c2​; ++​c​)
        ans​+=​c​;
    return​ ​ans​;
}
baz('a','d') ? 

//Write a function called printFromTo, which takes two integer parameters,
// and prints all numbers between its first and second parameters,
// including both parameters (print a newLine character after each number).
void printFromTo(int from, int to) {
    for(int i=from; i<=to; ++i) {
        System.out.println(i);
    }
}

void printFromTo(int from, int to) {
    int i=from;
    while( i<=to) {
        System.out.println(i);
        ++i;
    }
}

void printFromTo(int from, int to) {
    if(from<=to) {
        System.out.println(from);
        printFromTo(from+1,to);
    }        
}


void printFromTo2(int from, int to) {
    for(int i=from+1; i<to; ++i) {
        System.out.println(i);
    }
}

void printDownFromTo(int from, int to) {
    for(int i=from; i>=to; --i) {
        System.out.println(i);
    }
}

Using a while loop (and no recursion or other kinds of loops), 
write a function called power, that takes two integer parameters, 
say base and exponent, and returns the first parameter (base) 
raised to the second parameter (exponent), by performing repeated
multiplications.
a. now do it with a for loop
b. and now do it using recursion

int power (int base, int exp){
    int value=1;
    while(exp>0){
        value=value*base;
        --exp;
    }
    return value;
}

int power (int base, int exp){
    int value=1;
    for( ; exp>0 ; value*=base, --exp)
        ;
    return value;
}

int power(int base, int exp) {
    return base==0 ? 1 : base*power(base,exp-1);
}



public​ ​static​ ​f2(String s, ​char​ c)
{
    for​(​int​ i=0; i<s.length();++i)
        if​(s.charAt(i)==c)
            return​ ​true​;
    return​ ​false​;
}

f2(“Hello”,’a’) ? false

f2(“Hello”,’l’) ? true



