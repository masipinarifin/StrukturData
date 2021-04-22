package Praktikum5;

/**
 *
 * @author NURUL ARIFIN
 * 
 */
import java.util.*;

public class JavaComparatorExample {
    public static void main(String[] args){
        //Employee array wich will hold employee
        Employee employee[] = new Employee[2];
        //set different attributes of the individual employee
        employee[0] = new Employee();
        employee[0].setAge(40);
        employee[0].setName("Joe");
        employee[1] = new Employee();
        employee[1].setAge(20);
        employee[1].setName("Mark");
        System.out.println("Order of employee before sorting is");
        //print array as is
        for(int i = 0; i < employee.length; i++){
            System.out.println("Employee " + (i + 1) + " name :: " + employee[i].getName() + ", Age :: " + employee[i].getAge());
        }
        //Sorting array on the basis of employee age by passing AgeComparator
        Arrays.sort(employee, new AgeComparator());
        System.out.println("\n\nOrder of employee after sorting by employe age is");
        for(int i = 0; i < employee.length; i++){
            System.out.println("Employee " + (i + 1) + " name :: " + employee[i].getName() + ", Age :: " + employee[i].getAge());
        }
        //Sorting array on the basis of employee age by passing NameComparator
        Arrays.sort(employee, new NameComparator());
        System.out.println("\n\nOrder of employee after sorting by employe name is");
        for(int i = 0; i < employee.length; i++){
            System.out.println("Employee " + (i + 1) + " name :: " + employee[i].getName() + ", Age :: " + employee[i].getAge());
        }
    }

}
