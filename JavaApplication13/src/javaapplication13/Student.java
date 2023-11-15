
package javaapplication13;

    public class Student {

    private int credits;

    public Student() {
        this.credits = 0;
    }

    public void play() {
        this.credits = this.credits - 8;
    }
}
public static void main(String[] args) {
         Student matt = new Student();
       
