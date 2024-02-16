public class myDOB {
    private int day,month,year;
    myDOB(int _month, int _day, int _year){
        this.month = _month;
        this.day = _day;
        this.year = _year;
    }
    myDOB(myDOB dob){
        this.month = dob.month;
        this.day = dob.day;
        this.year = dob.year;
    }
    @Override
    public String toString() {
        String date = this.month + "/"+ this.day + "/"+ year;
        return date;
    }

    @Override
    protected myDOB clone() throws CloneNotSupportedException {
        myDOB obj = new myDOB(this.month,this.day,this.year);
        return obj;
    }

    public boolean equals(myDOB obj) {
        /*boolean equal = false;
        if(obj.year == this.year && obj.day == this.day && obj.month == this.month)
            equal = true;
        else
            equal = false;
        return equal;
        */
        return (obj.month == this.month &&
                obj.day == this.day &&
                obj.year == this.year);

    }
}
