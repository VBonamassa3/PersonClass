public class Student extends Person {
    private myDOB EnrollmentDate, GraduationDate;
    private String StudentID;
    Student(){
        this.firstName ="";
        this.lastName = "";
        this.dob = new myDOB(7,17,2002);
    }
    Student(String _firstName){
        this.firstName = _firstName;
        this.lastName = "";
        this.dob = new myDOB(7,17,2002);
    }
    Student(String _firstName,String _lastName){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(7,17,2002);
    }
    Student(String _firstName, String _lastName, myDOB _dob){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(_dob);
        //this.dob = _dob.clone();
    }
    public void setStudentID(String _studentID){
        this.StudentID = _studentID;
    }
    public String getStudentID(){
        return this.StudentID;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
