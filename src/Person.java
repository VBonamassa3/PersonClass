public abstract class Person {
    protected String firstName,lastName;
    protected myDOB dob;
    protected HiringDateF hdf;
    protected HiringDateA hda;
    Person(){
        this.firstName="";
        this.lastName ="";
        this.dob = new myDOB(7,17,2002);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", dob = " + dob.toString() +
                '}';
    }

}
