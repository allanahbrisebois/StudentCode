
package Class1;


public class studentList 
{
   public static void main(String[] args)
   {
       student[] studentList = new student[5];
       //add 5 students 
       studentList[0] = new student("Superman", "007", "SDNE");
       studentList[1] = new student("James Bond", "700", "Analyst");
       studentList[2] = new student("Flash", "100", "InfoSec");
       studentList[3] = new student("Batman", "001", "Art");
       studentList[4] = new student("Joker", "002", "ComSci");
       
       //for each loop iterates each student
       for(student s: studentList)
       {
            System.out.println(s.getName());
       }
   } 
}
