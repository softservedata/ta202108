package com.softserve.edu07sort;

import java.util.Comparator;

public class Student implements Comparable<Student> { // extends Object
    
    public static class NameComparator implements Comparator<Student> {
        public int compare(Student st1, Student st2) {
            return st1.getName().compareTo(st2.getName());
        }
    }
    
    public static class NameIdComparator implements Comparator<Student> {
        public int compare(Student st1, Student st2) {
            return st1.getName().compareTo(st2.getName()) == 0
                    ? st1.getId() - st2.getId()
                    : st1.getName().compareTo(st2.getName());
        }
    }
    
    public static class IdComparator implements Comparator<Student> {
        public int compare(Student st1, Student st2) {
            return st1.getId() - st2.getId();
        }
    }
    
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; 
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        Student other = (Student) obj;
        if ( (id != other.id) 
               || (name == null) && (other.name != null)
               || (name != null) && (other.name == null)) {
            return false;
        }
        if ((name == null) && (other.name == null)) {
            return true;
        }
        return name.equals(other.name);
    }
    
    public int compareTo(Student student) {
        return getName().compareTo(student.getName());
    }
    
    /*-
    public int compareTo(Student student) {
        return getId() - student.getId();
    }
    */
    
    @Override
    public String toString() {
        return "\nStudent [name=" + name 
                + ", id=" + id
                + "]";
    }

    
}