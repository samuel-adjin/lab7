package prob1.partB;

import java.util.Objects;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "(" + this.name + ", " + this.salary + ")";
    }

//    public boolean equals(Employee e) {
//        return e.name.equals(this.name) && e.salary == this.salary;
//    }

// solution
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return salary == employee.salary && Objects.equals(name, employee.name);
    }

}
