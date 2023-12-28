

//implement teachers and students using ArrayList
import java.util.List;


public class school 
{
    private List<teacher>teachers;
    private List<student>students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;    

// teachers is a list of teachers in the school
// students is a list of students in the school

school(List<teacher>teachers,List<student>students)
{
    this.teachers=teachers;
    this.students=students;
    totalMoneyEarned=0;
    totalMoneySpent=0;
}
 public List<teacher>getTeachers()
    {
        return teachers;
        
    }

    // return the list of teachers in the school
        public void addTeacher(teacher teachers)
        {
            teachers.add(teachers);
        }
    // return the list of students 
    public List<student>getStudents()
    {
        return students;
    }
     public void addstudent(student student)
        {
            students.add(student);
        }
        //total money earned
    public static void updateTotalMoneyEarned(int moneyEarned)
    {
        totalMoneyEarned+=moneyEarned;
    }
    public int getTotalMoneyEarned()
    {
        return totalMoneyEarned;
    }
    
    
    public int getTotalMoneySpent()
    {
        return totalMoneySpent;
    }
    public static void updateTotalMoneySpent(int MoneySpent)
    {
        totalMoneyEarned-=MoneySpent;
    }

    //money spent by the school is the salary given to teachers 
}