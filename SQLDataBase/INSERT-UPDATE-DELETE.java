// To import multiple records loop will be used to iteration

import java.util.Scanner;
public class Student{
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        int n = sc.nextInt();
        Student[] std = new Student[n];
        
        System.out.println("Enter records: ");
        for(int i=0; i<n; i++){
            System.out.println("id: ");
            int id = sc.nextInt();
            System.out.println("name: ");
            String name = sc.nextLine();
            System.out.println("marks1: ");
            int m1 = sc.nextInt();
            System.out.println("Mark2: ");
            int m2 = sc.nextInt();
            System.out.println("Marks3: ");
            int m3 = sc.nextInt();
            std [i] = new Student();
            std[i].set_data(id,name,m1,m2,m3);
            
            
        }
        for(int i=0; i<n; i++){
            std[i].get_data();
        }
    }

}
class Student{
    int std_id, m1, m2, m3;
    String std_name;
    public void set_data(int std_id, String std_name, int m1, int m2, int m3){
        this.std_id = std_id;
        this.std_name = std_name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public void get_data(){
        System.out.print(std_id + " " + std_name + " " + m1 + " " + m2 + " " + m3);
        System.out.println();
    }
    
}
       