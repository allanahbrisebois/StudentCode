package Class1;


public class student {

  
        private String name;
        private String studentID;
        
        //Student constructor
        public student(String givenName, String givenID){
            name = givenName;
            studentID = givenID;
        }
        
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

   
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    public boolean didStudy(){
        return true;
    }
}