import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.sort;

 class Employee implements Comparable<Employee>
{
    int empId;
    String empName;

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName='" + empName + '\'' + '}';
    }

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }


    @Override
    public int compareTo(Employee that) {
        return this.empId>that.empId?1:-1;
    }
}

class Student
{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
}

public class ComaparatorAndCompare {
    public static void main(String[] args) {

        // Now I want to compare Last digit of all number
        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               if(o1%10 >o2%10) return 1;
               else return -1;
            }
        };

        List<Integer> li=new ArrayList<>();
        li.add(22);
        li.add(21);
        li.add(77);
        li.add(16);
        li.add(24);

        System.out.println(li);

        sort(li,com);
        System.out.println(li);
        System.out.println();
        System.out.println();


        // Now I want to compare String by there length
        Comparator<String> compString=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
              if (o1.length()>o2.length()) return 1;
              else return -1;
            }
        };
        List<String> str=new ArrayList<>();
        str.add("Abhishek");
        str.add("Sandeep");
        str.add("Kapil");
        str.add("Sun");
        str.add("Shivam");
        str.add("Rahul");

        System.out.println(str);
        sort(str,compString);
        System.out.println(str);
        System.out.println();
        System.out.println();


        // Compare with as class of Students
        Comparator<Student> stud=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.age>o2.age) return 1;
                else return -1;
            }
        };

        List<Student> studs=new ArrayList<>();
        studs.add(new Student(25,"Abhishek"));
        studs.add(new Student(15,"Kapil"));
        studs.add(new Student(20,"Sunny"));
        studs.add(new Student(9,"Shivam"));
        studs.add(new Student(27,"Sandeep"));


        System.out.println(studs);
        for(Student s : studs)
            System.out.println(s);
        Collections.sort(studs,stud);
        System.out.println(studs);
        for(Student s : studs)
            System.out.println(s);
        System.out.println();
        System.out.println();



        // Now Creating Comparable with the help of Lambda Expression
        List<Employee> emp=new ArrayList<>();
        emp.add(new Employee(25,"Abhishek"));
        emp.add(new Employee(15,"Kapil"));
        emp.add(new Employee(20,"Sunny"));
        emp.add(new Employee(9,"Shivam"));
        emp.add(new Employee(27,"Sandeep"));


        System.out.println(emp);
        for(Employee e : emp)
            System.out.println(e);
        Collections.sort(emp);
        System.out.println(emp);
        for(Employee e : emp)
            System.out.println(e);
    }
}


/*
OUTPUT

[22, 21, 77, 16, 24]
[21, 22, 24, 16, 77]


[Abhishek, Sandeep, Kapil, Sun, Shivam, Rahul]
[Sun, Rahul, Kapil, Shivam, Sandeep, Abhishek]


[Student{age=25, name='Abhishek'}, Student{age=15, name='Kapil'}, Student{age=20, name='Sunny'}, Student{age=9, name='Shivam'}, Student{age=27, name='Sandeep'}]
Student{age=25, name='Abhishek'}
Student{age=15, name='Kapil'}
Student{age=20, name='Sunny'}
Student{age=9, name='Shivam'}
Student{age=27, name='Sandeep'}
[Student{age=9, name='Shivam'}, Student{age=15, name='Kapil'}, Student{age=20, name='Sunny'}, Student{age=25, name='Abhishek'}, Student{age=27, name='Sandeep'}]
Student{age=9, name='Shivam'}
Student{age=15, name='Kapil'}
Student{age=20, name='Sunny'}
Student{age=25, name='Abhishek'}
Student{age=27, name='Sandeep'}


[Employee{empId=25, empName='Abhishek'}, Employee{empId=15, empName='Kapil'}, Employee{empId=20, empName='Sunny'}, Employee{empId=9, empName='Shivam'}, Employee{empId=27, empName='Sandeep'}]
Employee{empId=25, empName='Abhishek'}
Employee{empId=15, empName='Kapil'}
Employee{empId=20, empName='Sunny'}
Employee{empId=9, empName='Shivam'}
Employee{empId=27, empName='Sandeep'}
[Employee{empId=9, empName='Shivam'}, Employee{empId=15, empName='Kapil'}, Employee{empId=20, empName='Sunny'}, Employee{empId=25, empName='Abhishek'}, Employee{empId=27, empName='Sandeep'}]
Employee{empId=9, empName='Shivam'}
Employee{empId=15, empName='Kapil'}
Employee{empId=20, empName='Sunny'}
Employee{empId=25, empName='Abhishek'}
Employee{empId=27, empName='Sandeep'}

Process finished with exit code 0

 */