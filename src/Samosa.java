public class Samosa {

    private static Samosa samosa;

    //When we create an object of a class constructor will be invoked.(Either it will invoke parameterized constructor or default constructor).
    //Singleton design pattern we must make sure only one instance is created. So we must need to restrict the constructor.

   private Samosa(){}

    public static Samosa getSamosa(){
       //this method will create object of this class;
        if(samosa == null){
            samosa = new Samosa();
        }

        return  samosa;
    }
}


/*
Steps to create a singleton design pattern class
1. Create  a private constructor so that no multiple objects can be created.
2. Create a private static variable ---we are creating static variable so that it can be accessed inside the static method.
As in java we cannot use non-static variables inside the static block.
3. Create a public static method inside check if object is already created (null = not created then allow to create it once)

Why we have created static method- If we keep a non-static method. To call the method we might need an object of that class.
Instead of creating an object of the class, but we want to call the method in that case we must use direct class to call the method
which we can achieve by making the method as static.
 */