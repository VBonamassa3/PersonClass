public class Faculty extends Person{
    private String FacultyID, HiringDateF;
    Faculty(){
        this.FacultyID = "12345";
        this.hdf = new HiringDateF(4,3,2015);
    }
    Faculty(String _FacultyID){
        this.FacultyID = _FacultyID;
        this.hdf = new HiringDateF(4,3,2015);
    }
    Faculty(String _FacultyID, HiringDateF hdf){
        this.FacultyID = _FacultyID;
        this.hdf = new HiringDateF(4,3,2015);
    }

   @Override
    public String toString() {
        System.out.println("Faculty Hiring Date: "+this.hdf);
        System.out.println("Faculty ID: "+this.FacultyID);
        return super.toString();
    }

}
