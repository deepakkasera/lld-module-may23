package accessmodifiers;

public class StudentChild extends Student {
    public static void main(String[] args) {
        Student st = new Student();
        //st.name = "Hitesh";
        st.age = 25;
        st.batchId = 321;
        st.psp = 90.01;
        st.batchId = 456;
    }
}
