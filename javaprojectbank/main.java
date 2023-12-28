/*import java.util.ArrayList;
import java.util.List;

public class main 
{
    public static void main(String[] args) {
        teacher Hange=new teacher(1, "Hange", 1500);
        teacher Erwin=new teacher(2, "Erwin", 1000);
        teacher Levi=new teacher(3, "Levi", 1800);

        List<teacher>teachersList=new ArrayList<>();
        teachersList.add(Hange);
        teachersList.add(Erwin);
        teachersList.add(Levi);
    

        student eren=new student(1, "Eren",7);
        student mikasa=new student(2, "Mikasa", 7);
        student armin=new student(2, "armin", 7);
        List<student>studentsList=new ArrayList<>();
        studentsList.add(eren);
        studentsList.add(mikasa);
        studentsList.add(armin);
        
        school mgs=new school(teachersList,studentsList);
        eren.payFees(3000);
        mikasa.payFees(7000);
        armin.payFees(9000);
        System.out.println("mgs has earned Rs" + mgs.getTotalMoneyEarned());
        System.out.println("mgs pay salary to teachers");
        Hange.receiveSalary(Hange.getSalary());
        System.out.println("mgs has spent for salary to"+ Hange.getName()+" and now has Rs"+ mgs.getTotalMoneyEarned() );

    }
    
}*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a list of teachers
        List<teacher> teachers = new ArrayList<>();
        teachers.add(createTeacher(scanner));
        teachers.add(createTeacher(scanner));

        // Create a list of students
        List<student> students = new ArrayList<>();
        students.add(createStudent(scanner));
        students.add(createStudent(scanner));

        // Create a school
        school mySchool = new school(teachers, students);

        // Display initial information
        System.out.println("Initial Information:");
        displaySchoolInfo(mySchool);

        // Pay fees for a student
        student alice = students.get(0);
        System.out.print("Enter fees to be paid for " + alice.getName() + ": ");
        int feesPaid = scanner.nextInt();
        alice.payFees(feesPaid);

        // Update teacher salary
        teacher john = teachers.get(0);
        System.out.print("Enter new salary for " + john.getName() + ": ");
        int newSalary = scanner.nextInt();
        john.setSalary(newSalary);

        // Receive salary for a teacher
        john.receiveSalary(john.getSalary());

        // Display updated information
        System.out.println("\nUpdated Information:");
        displaySchoolInfo(mySchool);

        // Close the scanner
        scanner.close();
    }

    private static teacher createTeacher(Scanner scanner) {
        System.out.print("Enter teacher name: ");
        String name = scanner.next();
        System.out.print("Enter teacher salary: ");
        int salary = scanner.nextInt();
        List<teacher> teachers=new ArrayList<>();
        return new teacher(teachers.size() + 1, name, salary);
    }

      private static student createStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.next();
        System.out.print("Enter student grade: ");
        int grade = scanner.nextInt();
        List<teacher> students=new ArrayList<>();
        return new student(students.size() + 1, name, grade);
    }
     private static void displaySchoolInfo(school mySchool) {
        System.out.println("Total Money Earned: " + mySchool.getTotalMoneyEarned());
        System.out.println("Total Money Spent: " + mySchool.getTotalMoneySpent());

        System.out.println("\nTeachers:");
        for (teacher t : mySchool.getTeachers()) {
            System.out.println(t.getId() + ": " + t.getName() + " - Salary: " + t.getSalary());
        }

        System.out.println("\nStudents:");
        for (student s : mySchool.getStudents()) {
            System.out.println(s.getId() + ": " + s.getName() + " - Grade: " + s.getGrade() +
                    " - Fees Paid: " + s.getFeespaid() + " - Remaining Fees: " + s.getRemainingfees());
        }
    }
}

