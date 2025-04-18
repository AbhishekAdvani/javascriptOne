import java.util.*;

// Employee class with id, name, and salary attributes
class Employee{
    int id;
    int salary;
    String name;

    Employee(int id, String name, int salary){this.id=id;this.name=name;this.salary=salary;}
}

public class SixthHighest {
    public static void main(String[] args) {
        // Step 1: Create a list of Employee objects
        List<Employee> list = Arrays.asList(
                new Employee(1, "A", 5000),
                new Employee(2, "B", 6000),
                new Employee(3, "C", 5000),
                new Employee(4, "D", 8000),
                new Employee(5, "E", 9000),
                new Employee(6, "F", 6000),
                new Employee(7, "G", 10000),
                new Employee(8, "H", 7000)
        );

        //step 2: treeset in desc order
        Set<Integer> unqiueSalaries = new TreeSet<>(Comparator.reverseOrder());
        for ( Employee e: list){
            unqiueSalaries.add(e.salary);
        }
        System.out.println(unqiueSalaries);

        //step 3 creating a new list accesible in list format indexing
        List<Integer> sortedSalaries = new ArrayList<>(unqiueSalaries);
        System.out.println(sortedSalaries);

        if (sortedSalaries.size() >= 6){
            int sixthHighestSalary = sortedSalaries.get(5);

            for(Employee e : list) {
                if (e.salary == sixthHighestSalary) {
                    System.out.println("6th Highest Salary Employee: " + e.name + ", Salary: " + e.salary);
                    break; // Only printing the first match
                }
            }
        }else{
            System.out.println("not");
        }

    }
}
