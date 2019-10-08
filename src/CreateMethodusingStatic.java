public class CreateMethodusingStatic {
    public static int Method(){ //create method.
        System.out.println("Method is created"); //print the message.
        //square(6); //for static square method can not created because square is a non static method.
        return 2; //return the integer value.
    }
    public void square(int a){ //create second method.
        System.out.println(a*a);
    }
    public static void main(String[] args){
        //CreateMethod3 method = new CreateMethod3(); //create the object of the class.//for static do not need to create a object.
        System.out.println(Method());//object. remove.
    }
}





