package day40_Encapsulation;

public class EmployeeInfo {

    private double salary;
    private long SSN;
    private int ID;
    private String Address;
    public static String companyName="Bank of America";

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public long getSSN() {
        return SSN;
    }
    public void setSSN(long SSN) {
        this.SSN = SSN;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public static String getCompanyName() {
        return companyName;
    }
    public static void setCompanyName(String companyName) {
        EmployeeInfo.companyName = companyName;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "salary=" + salary +
                ", SSN=" + SSN +
                ", ID=" + ID +
                ", Address='" + Address + '\'' +
                '}';
    }
}
