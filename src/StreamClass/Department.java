package StreamClass;

public class Department {

    private int deptId;
    private String name;
    private int empId;


    public Department(int deptId, String name, int empId) {
        this.deptId = deptId;
        this.name = name;
        this.empId = empId;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", name='" + name + '\'' +
                ", empId=" + empId +
                '}';
    }
}
