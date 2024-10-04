package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {

    private static List<Employee> employees = new LinkedList<>();


    public static void main(String[] args) {

        employees.add(new Employee(1, "Deniz", "Acay"));
        employees.add(new Employee(2, "Kübra", "Tekin"));
        employees.add(new Employee(3, "Orcun", "Dogan"));
        employees.add(new Employee(4, "Kübra", "Dogan"));
        employees.add(new Employee(5, "Burak", "Civelek"));
    }

    public static List<Employee> findDuplicates(List<Employee> input) {

        List<Employee> duplicates = new LinkedList<>();
        List<Employee> uniques = new LinkedList<>();

        for (Employee employee : input) {

            if (employee == null)
                continue;

            if(uniques.contains(employee))
                duplicates.add(employee);
            else
                uniques.add(employee);
        }

        return duplicates;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> input) {

        Map<Integer, Employee> employeeMap = new HashMap<>();

        for (Employee employee : input) {

            if (employee == null)
                continue;

            employeeMap.put(employee.getId(), employee);
        }

        return employeeMap;
    }

    public static List<Employee> removeDuplicates(List<Employee> input ) {

        List<Employee> duplicates = new LinkedList<>();
        List<Employee> uniques = new LinkedList<>();

        for (Employee employee : input) {

            if (employee == null)
                continue;

            if(uniques.contains(employee))
                duplicates.add(employee);
            else
                uniques.add(employee);
        }

        uniques.removeAll(duplicates);

        return uniques;
    }
}