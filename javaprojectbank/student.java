//this class is responsible for keeping track of students fees ,name ,grade and id
public class student
{
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //fees for every student is ₹50000 per year


    //constructor to initialize value
    student(int id,String name,int grade)
    {   
        feesPaid=0;
        this.feesTotal=500000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    //not going to alter students name,id
    //update students grade when promoted  

    public void setGrade(int grade){
        this.grade=grade;


    }

    public void payFees(int fees)
    {
        feesPaid+=fees;   
        school.updateTotalMoneyEarned(feesPaid);
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getGrade()
    {
        return grade;
    }
    public int getFeespaid()
    {
        return feesPaid;
    }
    public int getfeesTotal()
    {
        return feesTotal;
    }
    public int getRemainingfees()
    {
        return feesTotal-feesPaid;
    }
    

    
}