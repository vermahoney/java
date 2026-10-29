public class Demo2 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="honey";
        s1.age=24;


        s1.rollNumber=1876;
        s1.college="mnit";
        // constructor -->to create an object 

      System.out.println(s1.name);
      System.out.println(s1.age);
      System.out.println(s1.rollNumber);
      System.out.println(s1.college);
      // int x;
      // local varible ->> no default values 
      // syste.out printin(x

   }
}

/*intter 
-->0
floating-->0.0
boolen-->false
string --->null(nothing)*/
class Student{
    String name;// information /data/characteriestc/--> instance variables
    int age;
    int rollNumber;
    String college;
    

    void markAttendance(){
        System.out.println("attendance marked for the student" +name);

    }


}