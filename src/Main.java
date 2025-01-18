import java.util.ArrayList;

abstract class Employee{

    private String name;
    private int id;

    public Employee(String name, int id){
        this.name=name;
        this.id=id;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public abstract double calculatesalary();

    @Override
    public String toString()
    {
        return "Employee [name = " + name +",id = "+id + ",salary  = " + calculatesalary()+"]";
    }

}

class fulltimeemployee extends Employee{
    private double monthlysalary;

    public fulltimeemployee(String name, int id , int monthlysalary)
    {
        super(name,id);
        this.monthlysalary=monthlysalary;

    }

    @Override
    public double calculatesalary()
    {
        return monthlysalary;
    }

}

class parttimeemployee extends Employee{

    private int  hoursworked;
    private double hourlyrate;

    public parttimeemployee(String name, int id , int hourlyrate , int hoursworked)
    {
        super(name,id);
        this.hoursworked=hoursworked;
        this.hourlyrate=hourlyrate;
    }

    public double calculatesalary()
    {
        return hourlyrate*hoursworked;
    }
}

class payrollsystem{

    private static ArrayList<Employee> employeelist;

    public payrollsystem(){
        employeelist = new ArrayList<>();
    }

    public static void addemployee(Employee employee){
        employeelist.add(employee);
    }

    public static void  removeemployee(int id){
        Employee emplyeetoremove=null;

        for(Employee employee: employeelist)
        {
            if(employee.getid()==id)
            {
                emplyeetoremove=employee;
                break;
            }


        }

        if (emplyeetoremove!=null)
        {
            employeelist.remove(emplyeetoremove);
        }
    }

    public static void displayemployee(){
        for(Employee employee: employeelist)
        {
            System.out.println(employee);
        }
    }

}

public class Main {
    public static void main(String[] args) {
       payrollsystem payroll = new payrollsystem();
       fulltimeemployee emp1 = new fulltimeemployee("utosh", 100,40000);
       parttimeemployee emp2 = new parttimeemployee("aditya",101,400,120);

       payrollsystem.addemployee(emp1);
       payrollsystem.addemployee(emp2);
        System.out.println("intial employee details: ");
        payrollsystem.displayemployee();
        System.out.println("removing employee ");
        payrollsystem.removeemployee(101);
        System.out.println("remaining employees: ");
        payrollsystem.displayemployee();

    }
}