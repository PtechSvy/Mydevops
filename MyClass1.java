package basics;

public class MyClass1 {

    int p = 10;
    String str = "Hello World";

public static void main(String[]args)
{
    MyClass1 myclass = new MyClass1();
    myclass.myMethod();
    System.out.println(myclass.jumbo());
    System.out.println(myclass.jumbo1().p);

    myclass.stringCheck();
}

//String methods
   public void stringCheck()
   {
       str.concat("!!");
       System.out.println(str);
       str = str.toUpperCase();
       System.out.println(str);
       //need to provide start index
       str = str.substring(8);
       System.out.println(str);
       //start and end index
       ///str = str.substring(6,11);
      // System.out.println(str);
       //Compare string with other string and this returns a boolean value
       boolean flag  = str.equalsIgnoreCase("WORLD");
       System.out.println(flag);
       //convert string to integer
       str ="5";
       //this function can only be used when extracting a integer value to string
       int i = Integer.parseInt(str);

       //convert integer to string
        i = 6;
        str = String.valueOf(i);
       System.out.println(str);



   }

    public void myMethod()
    {
        //static method can be called directly
        BasicPart1.initialize();
        System.out.println(BasicPart1.i);

    }

    public int jumbo()
    {
       p =6;
        return p;
    }

    //TO return instance of the class using this method
    public MyClass1 jumbo1()
    {
        p =11;
        return this;
    }


}
