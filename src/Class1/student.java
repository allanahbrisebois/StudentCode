package Class1;


public class student {

  
        private String name;
        private String studentID;
        private String program;
        
        //Student constructor
        public student(String givenName, String givenID, String programName){
            name = givenName;
            studentID = givenID;
            program = programName;
        }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
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