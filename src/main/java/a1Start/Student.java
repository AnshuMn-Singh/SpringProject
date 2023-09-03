package a1Start;

public class Student {
    private int studentId;
    private String StudentName;
    private String StudentAddress;

    public Student ( ) {
        super();
    }

    public Student ( int studentId, String studentName, String studentAddress ) {
        this.studentId = studentId;
        StudentName = studentName;
        StudentAddress = studentAddress;
    }

    public int getStudentId ( ) {
        return studentId;
    }

    public void setStudentId ( int studentId ) {
        this.studentId = studentId;
    }

    public String getStudentName ( ) {
        return StudentName;
    }

    public void setStudentName ( String studentName ) {
        StudentName = studentName;
    }

    public String getStudentAddress ( ) {
        return StudentAddress;
    }

    public void setStudentAddress ( String studentAddress ) {
        StudentAddress = studentAddress;
    }

    @Override
    public String toString ( ) {
        return "Student [" + "studentId=" + studentId + ", StudentName= " + StudentName + ", StudentAddress= " + StudentAddress + ']';
    }
}
