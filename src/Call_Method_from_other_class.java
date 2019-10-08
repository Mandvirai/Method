public class Call_Method_from_other_class {
    public static int Method() { //create method.
        System.out.println("Method is created"); //print the message.
        return 2; //return the integer value.
    }

    public static void main(String[] args) {
        System.out.println(Method());//object. remove.
        Demo d = new Demo();
        d.show();


    }
}