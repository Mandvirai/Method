public class CreateMethod3 {
    public int Method(){ //create method.
        System.out.println("Method is created"); //print the message.
        square(6);
        return 2; //return the integer value.
    }
    public void square(int a){ //create second method.
        System.out.println(a*a);
    }
    public static void main(String[] args){
        CreateMethod3 method = new CreateMethod3(); //create the object of the class.
        System.out.println(method.Method());
    }
}


