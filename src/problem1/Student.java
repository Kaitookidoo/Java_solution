/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;

/**
 *
 * @author elega
 */
public class Student implements Comparable{
        private String fullName;
    private int uniqueNumber;
    float cgpa;
    public  Student(float CGPA,int number,String name){
        fullName=name;
        cgpa=CGPA;
        uniqueNumber=number;
    }
    public String getname(){
        return fullName;
    }
public float getcgpa() {
        return cgpa;
    }
    

@Override
    public int compareTo(Object obj) {
        Student person = (Student) obj;

        if((float)getcgpa()>(float)person.getcgpa()){
            return -1; 
        }else if((float)getcgpa()<(float)person.getcgpa()){
            return 1;
        }
        else {
            if(((String)getname()).compareTo (person.getname()) < 0){
                return -1;
            }
            else{
                return 1;
            }
        }
    }
}

