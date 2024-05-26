public class Employee {
    // ## Objects can be initialized by 3 ways

    String name; //instance variables
    int Emp_id; //instance variables


    // 1.referance variables

    //2.using method
    void display(String name,int Emp_id){
       this.name=name;
        this.Emp_id=Emp_id;
        System.out.println("employee name= "+this.name + "\nEmployee id= "+this.Emp_id);


    }
    //3.By using constructors
    public Employee(String name,int Emp_id){
        this.name=name; //here we can  also write name on L.H.S
        this.Emp_id=Emp_id; //here we can  also write Emp_id on L.H.S
        System.out.println("employee name= "+name + "\nEmployee id= "+Emp_id);
    }

    public static void main(String[] args) {
//        Employee e1=new Employee();
//        Employee e2=new Employee();

//        // 1. initializing object by using referance variables
////        e1.name="arti";
////        e1.Emp_id=1;
////
////        e2.name="raju";
////        e2.Emp_id=2;
//
//        //2.initializing object By using method
//        e1.display("arti" ,1);
//        e2.display("raju" ,2);

          //3.initializing object by using  constructors
        Employee e1=new Employee("arti",1);
        Employee e2=new Employee("raju",2);




    }
}
