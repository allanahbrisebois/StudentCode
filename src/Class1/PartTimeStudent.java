/*
 * Name:Allanah Brisebois
 */

package Class1;


public class PartTimeStudent extends student{
    private int hoursOfStudy;

    public int getHoursOfStudy() {
        return hoursOfStudy;
    }

    public void setHoursOfStudy(int hoursOfStudy) {
        this.hoursOfStudy = hoursOfStudy;
    }
    public PartTimeStudent(String givenName, String givenID, String programName) {
        super(givenName, givenID, programName);
    }
    
}
