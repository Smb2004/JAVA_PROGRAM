import java.util.*;
class CompanyConstructor{
        String cmpName;
        String cmpLocation;
        CompanyConstructor(String cmpName,String cmpLocation){
                this.cmpName=cmpName;
                this.cmpLocation=cmpLocation;
        }
        void Display(){
                System.out.println(cmpName);
                System.out.println(cmpLocation);
        }
}
class Employee extends CompanyConstructor{
        String empName;
        double empSalary;
        Employee(String cmpName, String cmpLocation, String empName,double empSalary){
                super(cmpName,cmpLocation);
                this.empName=empName;
                this.empSalary=empSalary;
        }
        void display(){
                Display();
                System.out.println(empName);
                System.out.println(empSalary);
        }
}
class Client{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter cmpName:");
                String cmpName=sc.next();
                System.out.println("Enter cmpLocation:");
                String cmpLocation=sc.next();
                System.out.println("Enter empName:");
                String empName=sc.next();
                System.out.println("Enter empSalary:");
                double empSalary=sc.nextDouble();
                Employee obj=new Employee(cmpName, cmpLocation,empName,empSalary);
                obj.display();
        }            
    
}
