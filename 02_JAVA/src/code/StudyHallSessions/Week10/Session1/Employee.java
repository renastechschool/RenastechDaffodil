package code.StudyHallSessions.Week10.Session1;


//Create a classed called Employee
//
public class Employee {


    //Attributes
    //   ssn;
    //   empName;
    //   empAge;
  private int ssn;
  private String empName;
  private int empAge;


    //Actions :
    //implement Getter and Setter methods


    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public Employee(int ssn, String empName, int empAge) {
        this.ssn = ssn;
        this.empName = empName;
        this.empAge = empAge;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ssn=" + ssn +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                '}';
    }
}
