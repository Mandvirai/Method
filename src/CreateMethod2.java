public class CreateMethod2 {
    public int Method(){ //create method.
        System.out.println("Method is created"); //print the message.
        return 2; //return the integer value.
    }
    public static void main(String[] args){
        CreateMethod2 method = new CreateMethod2(); //create the object of the class.
        System.out.println(method.Method());
    }
}

