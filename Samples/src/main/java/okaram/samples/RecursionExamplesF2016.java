int power(int base, int exponent)
{
    if(exponent<=0) {
        return 1;
    }else {
        return base*power(base, exponent-1);
    }
}

int power_l(int base, int exponent)
{
    System.out.println("power_l "+exponent);
    if(exponent<=0)
        return 1;

    int sr=power_l(base, exponent/2);
    if(exponent%2==0) {// even exponent
        return sr*sr;
    } else {
        return base*sr*sr;
    } 
}

void printCountdown(int from, PrintStream out)
{
    if(from <0)
        return;
    out.println(from);
    printCountdown(from-1);
}

// returns true if s contains c on characters starting from from
boolean contains(String s, char c, int from)
{
    if(from>=s.length()) // base condition, fell off the string
        return false;
    if( s.charAt(from) == c )
        return true;
    return contains(s,c,from+1);
}

boolean contains2(String s, char c, int from)
{
    if(from<0) // base condition, fell off the string
        return false;
    if( s.charAt(from) == c )
        return true;
    return contains2(s,c,from-1);
}

// wrapper, hides the extra recursion stuff
boolean contains(String s, char c)
{
    return contains2(s,c,s.length()-1);
}

// -1 if it doesn't occur
int firstOccurrence(String s, char c, int from) 
{
    if(from>=s.length()) // base condition, fell off the string
        return -1;
    if( s.charAt(from) == c )
        return from;
    return firstOccurrence(s,c,from+1);
}

int firstOccurrence(String s, char c)
{
    return firstOccurrence(s,c,0);
} 

boolean containsDigit(int n, int digit)
{
    System.out.println("cd "+n);
    if(n==0)
        return false;
    if( n%10 == digit )
        return true;
    return containsDigit(n/10, digit);
}




