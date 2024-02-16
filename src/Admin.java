public class Admin extends Person{
    private String AdminID, HiringDateA;
    Admin(){
        this.AdminID = "6789";
        this.hda = new HiringDateA(8,25,2018);
    }
    Admin(String _AdminID){
        this.AdminID = _AdminID;
        this.hda = new HiringDateA(8,25,2018);
    }
    Admin(String _AdminID, HiringDateA hda){
        this.AdminID = _AdminID;
        this.hda = new HiringDateA(8,25,2018);
    }

    @Override
    public String toString() {
        System.out.println("Admin Hiring Date: "+this.hda);
        System.out.println("Admin ID: "+this.AdminID);
        return super.toString();
    }
}
