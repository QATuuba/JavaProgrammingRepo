package day39_Recap.cydeoTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, int employeeID, double salary) {
        super(name, age, gender, employeeID, "Developer", salary);
    }

    public void fixingBugs(){
        System.out.println(getJobTitle() + " " + getName() + " is fixing bugs");
    }

    @Override
    public void work() {

        System.out.println(getJobTitle()+" "+getName()+" is developing the application");

    }
}
/*
4. Create a sub class of Employee named Developer
            Override the work method
            Extra methods:
                fixingBugs()
 */