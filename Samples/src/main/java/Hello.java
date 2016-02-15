public class Hello {
    public static void main(String[] args) {        
    	java.util.Scanner input=new java.util.Scanner(System.in);

        System.out.println("Please enter your name");
        String name=input.nextLine();
        System.out.println("Hello "+name);
    }
}
