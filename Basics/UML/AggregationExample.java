package Basics.UML;

import java.util.ArrayList;
import java.util.List;

class Professor  {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


class Department {
    private String name;
    private List<Professor> prefessors;

    public Department(String name, List<Professor> prefessors) {
        this.name = name;
        this.prefessors = prefessors;
    }

    public void showPrefessors() {
        System.out.println("Department: " + name);
        for (Professor prefessor : prefessors) {
            System.out.println(prefessor.getName());
        }
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Professor pref1 = new Professor("Prof A");
        Professor pref2 = new Professor("Prof B");
        List<Professor> prefessors = new ArrayList<>();
        prefessors.add(pref1);
        prefessors.add(pref2);
        Department department = new Department("CSE", prefessors);
        department.showPrefessors();
    }
}

// Department: CSE
// Prof A
// Prof B
