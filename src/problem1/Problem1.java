/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;

import java.util.PriorityQueue;
import java.util.Scanner;
import problem1.Student;
/**
 *
 * @author elega
 */

public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in); 
        
        int n=in.nextInt();
        
        PriorityQueue<Student> schoolQueue = new PriorityQueue<Student>();
        for(int i=-1;i<n;i++){
            String[] k=in.nextLine().split(" ");
            if(k[0].equals("ENTER")){
                float a1=Float.valueOf(k[2]);
                int a2=Integer.parseInt(k[3]);
                Student person=new Student(a1,a2,k[1]);
                schoolQueue.offer(person);
                
            }
            else if(k[0].equals("SERVED")){
                schoolQueue.poll();
               
            }
            
                
        }
        System.out.println("OUTPUT");
        for(Student member : schoolQueue){
            String memberName = member.getname();
            System.out.println(memberName);
        }
  
       
    }
    
}
