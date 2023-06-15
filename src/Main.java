public class Main {
    public static void main(String[] args) {
        String str = "Scaler"; // @480
        System.out.println(System.identityHashCode(str));
        str = "Interviewbit"; //@980

        String str1 = "Scaler";

        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str1));

        String str2 = new String("Scaler");
        System.out.println(System.identityHashCode(str2));


        System.out.println("Hello world!");
    }
}