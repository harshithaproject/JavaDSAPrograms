public class Employee {
    private int employeeid;
    private String employeeName;
    private String salary;
    private String Department;

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Employee(int employeeid, String employeeName, String salary, String department) {
        this.employeeid = employeeid;
        this.employeeName = employeeName;
        this.salary = salary;
        Department = department;
    }
}
