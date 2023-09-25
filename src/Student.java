public class Student {

    private String name;
    private int grade;
    private double gpa;

    public Student (String studentName, int studentGrade, double studentGpa){

        name = studentName;
        grade = studentGrade;
        gpa = studentGpa;
    }

    public void stateStudentInfo(){
        System.out.println("Student's name is "+ name);
        System.out.println("Student is in grade "+ grade);
        System.out.println("Student has a GPA of "+ gpa);

    }


}
