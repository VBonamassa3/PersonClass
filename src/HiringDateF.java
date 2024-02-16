public class HiringDateF {
    private int dayF,monthF,yearF;
    HiringDateF(int _monthF, int _dayF, int _yearF){
        this.monthF = _monthF;
        this.dayF = _dayF;
        this.yearF = _yearF;
    }
    HiringDateF(HiringDateF hdf){
        this.monthF = hdf.monthF;
        this.dayF = hdf.dayF;
        this.yearF = hdf.yearF;
    }
    @Override
    public String toString() {
        String date = this.monthF + "/"+ this.dayF + "/"+ yearF;
        return date;
    }

    @Override
    protected myDOB clone() throws CloneNotSupportedException {
        myDOB obj = new myDOB(this.monthF,this.dayF,this.yearF);
        return obj;
    }

    public boolean equals(HiringDateF obj) {
        return (obj.monthF == this.monthF &&
                obj.dayF == this.dayF &&
                obj.yearF == this.yearF);

    }
}
