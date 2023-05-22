package accessmodifiers;

import accessmodifiers.Student;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();
        //st.name = "Hitesh"; // Compile Time Error -> name is private
        st.age = 25; //age is public
        st.batchId = 123;
        st.psp = 90.0;
    }
}
