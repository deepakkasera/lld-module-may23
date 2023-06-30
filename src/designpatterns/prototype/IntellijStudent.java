package designpatterns.prototype;

public class IntellijStudent extends Student {
    private int iq;

    IntellijStudent() {

    }

    IntellijStudent(IntellijStudent intellijStudent) {
        //here the object has already been created of this class.
        super(intellijStudent);
        this.iq = intellijStudent.iq;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntellijStudent clone() {
//        IntellijStudent intellijStudent = new IntellijStudent();
//        intellijStudent.setAvgBatchPsp(this.);
//        intellijStudent.setBatchName(this.getBatchName());
//        return intellijStudent;
        ///super.clone();

        return new IntellijStudent(this);
    }
}
