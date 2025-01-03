public class Company {
    public static void main(String[] args){
        Employee dev1 = new Developer(100, "Mohamed", "pro developer");
        Employee dev2 = new Developer(101, "Ahmed", "developer");

        Employee man1 = new Manager(200, "Gamal", "SEC manager");
        Employee man2 = new Manager(201, "Gamal", "SEO manager");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(accDirectory);
        companyDirectory.showEmployeeDetails();

    }
}



