public class Computer
{
    private  String model;
    private String brand;

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    private OperatingSystem os;

    class OperatingSystem {

        private String osname;

        public OperatingSystem(String osname) {
            this.osname = osname;
        }

        public void displayInfo(){
            System.out.println("Displaying info of Operating system---"+osname);
        }
    }
}
