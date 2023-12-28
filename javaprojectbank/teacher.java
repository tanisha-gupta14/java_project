public class teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryearned;

    teacher(int id,String name,int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;

    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public int getSalary()
    {
        return salary;

    }

    //update salary
    public void setSalary(int salary)
    {
        this.salary=salary;
    }

    //adds to salary earned removes from total money earned byw school
    public void receiveSalary(int salary) 
    {
        salaryearned+=salary;
        school.updateTotalMoneySpent(salary);
    }
    
}
