package Praktikum5;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 * 
 */
import java.util.*;

class Employee {
    private int age;
    private String name;
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }   
}
class AgeComparator implements Comparator{
    public int compare(Object emp1, Object emp2){
        int emp1Age = ((Employee) emp1).getAge();
        int emp2Age = ((Employee) emp2).getAge();
        if(emp1Age > emp2Age){
            return 1;
        } else if (emp1Age < emp2Age){
            return -1;
        } else {
            return 0;
        }
    }
}
class NameComparator implements Comparator{
    public int compare(Object emp1, Object emp2){
        //parameter are of tyoe object, so we have to downcast it to Employee objects
        String emp1Name = ((Employee) emp1).getName();
        String emp2Name = ((Employee) emp2).getName();
        //use compareTO method of String class to compare names of employee
        return emp1Name.compareTo(emp2Name);
    }
}
