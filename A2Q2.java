class Encapsulate{
    private String empName;
    private int empAge;

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

}
public class A2Q2{
    public static void main(String args[]){
        Encapsulate obj = new Encapsulate();
         obj.setEmpName("John Doe");
         obj.setEmpAge(32);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}