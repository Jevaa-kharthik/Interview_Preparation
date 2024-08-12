import java.util.ArrayList;
import java.util.List;

public class Student_Management {

    private String Student_Name;
    private int Student_ID;
    private List<Double> Grades;

    public Student_Management(String Student_Name, int Student_ID){
        this.Student_Name = Student_Name;
        this.Student_ID = Student_ID;
        this.Grades = new ArrayList<>();
    }

    public void addGrade(double i){
        if(i > 0 && i <= 100){
            Grades.add(i);
            System.out.println("The Has been Added Successfully");
        }
        else{
            System.out.println("The grade is not added");
        }
    }

    public String getStudentName(){
        return Student_Name;
    }

    public int getStudentId(){
        return Student_ID;
    }

    public List<Double> getStudentMark(){
        return Grades;
    }

    public double CalculateAverage(){
        double sum = 0;
        for(int i = 0; i < Grades.size(); i++){
            sum += Grades.get(i);
        }
        double avg = sum / Grades.size();
        return avg;
    }
    
    public static void main(String[] args) {
        Student_Management student = new Student_Management("John Doe", 123456);

        // Adding grades
        student.addGrade(85);
        student.addGrade(92);
        student.addGrade(78);
        student.addGrade(88);

        // Retrieving student information
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student ID: " + student.getStudentId());

        // Calculating and displaying the average grade
        System.out.println("Average Grade: " + student.CalculateAverage());

        // Displaying all grades
        System.out.println("All Grades: " + student.getStudentMark());

        student.addGrade(99);

        System.out.println(student.CalculateAverage());

        System.out.println(student.getStudentMark());
    }
}
