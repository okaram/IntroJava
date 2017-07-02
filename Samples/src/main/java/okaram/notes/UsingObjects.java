package okaram.notes
import java.util.Scanner;
import java.io.PrintStream;

import java.awt.Point;
import java.awt.Dimension;
import java.awt.Rectangle;

class UsingObjects {

    //tag::tryToChangePrimitive[]
    public static int tryToChangePrimitive(int a)
    {
        a=2*a; // this changes just the parameter; no changes outside
    }
    //end::tryToChangePrimitive[]

    public void callTryToChangePrimitive() {
    //tag::passingPrimitives[]
        int b=20;
        tryToChangePrimitive(b);
    //end::passingPrimitives[]

        // what's the value of b ?
    }


    // tag::tryToChangeReference[]
    public static int tryToChangeReference(Point p)
    {
        p=new Point(10,20);
    }
    //end::tryToChangeReference[]

    public void callTryToChangeReference() {
    //tag::passReference[]
        Point p2=new Point(5,10);
        tryToChangeReference(p2);
    //end::passReference[]

    }

    // tag::translatePoint[]
    public static int translatePoint(Point p)
    {
        p.translate(10,10);
    }
    //end::translatePoint[]

    public void callTranslatePoint() {
    //tag::callTranslatePoint[]
        Point p2=new Point(5,10);
        translatePoint(p2);
    //end::callTranslatePoint[]

    }

    //tag::makeTranslatedPoint[]
    public Point makeTranslatedPoint(Point p, int dx, int dy)
    {
        Point p2=new Point(p.x+dx, p.y+dy);
    }
    //end::makeTranslatedPoint[]

    public void stringIdentity()
    {
        //tag::stringIdentity[]
        String s1="abc";
        String s2="abc";
        String s3=new String("abc");

        Point p=new Point(10,20);
        String ps1=p.toString();
        String ps2=p.toString();
        //end::stringIdentity[]
    }

    //tag::printPoint[]
    public void makeTranslatedPoint(Point p, PrintStream out)
    {
        out.println( p );
    }
    //end::printPoint[]

    //tag::readAndAdd[]
    public int readAndAdd(PrintStream out, Scanner in)
    {
        out.println("Please enter two integers");
        int i1=in.nextInt();
        int i2=in.nextInt();

        return i1+i2;
    }
    //end::readAndAdd[]
}
