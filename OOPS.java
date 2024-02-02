class Pen{
    String color;
    String type;
    void write(){// FUNCTION INSIDE CLASS IS METHOD
        System.out.println("WRITE SOMETHING....");
    }
}
public class OOPS{ //PUBLIC CLASS CONTAINS MAIN FUNCTION AND OBJECTS ARE CREATED INSDE MAIN FUNCTION
    public static void main(String[] args){
        Pen pen1= new Pen(); //CREATING OBJECT
        pen1.color="BLUE";  //ASSIGNING VALUES IN OBJECT
        pen1.type="GEL";
        System.out.println(pen1.color+" "+pen1.type);
        pen1.write();
    }
}