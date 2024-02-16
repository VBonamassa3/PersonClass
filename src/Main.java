public class Main {
    public static void main(String[] args) {
       Student s1 = new Student("Vincent","Bonamassa");
       System.out.println(s1.toString());
       System.out.println(" ");
       Faculty f1 = new Faculty("54321");
       System.out.println(f1);
       System.out.println(" ");
       Admin a1 = new Admin("9876");
       System.out.println(a1.toString());
    }
}