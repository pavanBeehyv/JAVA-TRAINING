package pavan.java;

import pavan.java.test.Student;

//Access modifiers: final,abstract,public,protected,private
//classes can have final,abstract & public
//which declared
// -public can be accessed in any package
// -default can be accessed only from within the same package
// -protected can be accessed only within the class & subclasses
// -private can be accessed only within the class
public class InnerDemo {
    public static void main(String[] args) {
        Student S = new Student();
       String d= S.degree;
    }
}
