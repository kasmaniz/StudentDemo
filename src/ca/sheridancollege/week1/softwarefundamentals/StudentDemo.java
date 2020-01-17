/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 ** A class to model Student Objects
 * each student has: a name (first and last name)
 * each student can: say their name (getName)

 * @author Sivagama
 */
public class StudentDemo {

    private String name;
    private int sid;
private int h;
    //constructor
    public StudentDemo(String givenName,int n,int a)
    {
        name=givenName;
        sid = n;
        h=a;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    public int getsid(){
        return sid;
    }
    /**
     * @param name the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }

    /**
     * @return the h
     */
    public int getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(int h) {
        this.h = h;
    }
    
    
}
