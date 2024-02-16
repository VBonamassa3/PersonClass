public class HiringDateA {
    private int dayA,monthA,yearA;
    HiringDateA(int _monthA, int _dayA, int _yearA){
        this.monthA = _monthA;
        this.dayA = _dayA;
        this.yearA = _yearA;
    }
    HiringDateA(HiringDateA hda){
        this.monthA = hda.monthA;
        this.dayA = hda.dayA;
        this.yearA = hda.yearA;
    }
    @Override
    public String toString() {
        String date = this.monthA + "/"+ this.dayA + "/"+ yearA;
        return date;
    }

    @Override
    protected myDOB clone() throws CloneNotSupportedException {
        myDOB obj = new myDOB(this.monthA,this.dayA,this.yearA);
        return obj;
    }

    public boolean equals(HiringDateA obj) {
        return (obj.monthA == this.monthA &&
                obj.dayA == this.dayA &&
                obj.yearA == this.yearA);

    }
}
