package day31_Constructors;

public class SalaryCalculatorTask {

    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public int weeklyHours;

    public SalaryCalculatorTask(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate /100;  // to make sure that user does not need to convert the percentage to decimal
        this.federalTaxRate = federalTaxRate;  // to make sure that user does not need to convert the percentage to decimal
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        double salary = hourlyRate * weeklyHours * 52;
        return salary;
    }

    public double stateTax(){
        return salary() * stateTaxRate;
    }

    public double federalTask(){
        return salary() * federalTaxRate;
    }

    public double salaryAfterTask(){
        return salary() - (stateTaxRate + federalTaxRate);
    }

    public String toString() {
        return "SalaryCalculatorTask{" +
                "hourlyRate=" + hourlyRate +
                ", state Tax= $" + stateTaxRate +
                ", federal Tax $=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", salary=" + salary() +
                ", salary after tax=" + salaryAfterTask() +
                '}';
    }
}
/*
1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours
	            Add a constructor to set all the fields
		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */