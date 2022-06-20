/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class Student extends Person {

    private int studyCredits;
    
    public Student(String name, String surname) {
        super(name, surname);
        this.studyCredits = 0;
    }
    
    public void add(int credits) {
        this.studyCredits = studyCredits + credits;
    }
    
    public int credits() {
        return this.studyCredits;
    }
    
    public void study() {
        this.studyCredits = studyCredits + 1;
    }
    
    public String toString() {
        return super.toString() + "\n  Study credits " + this.studyCredits;
    }
    
}
