package json;

import java.io.Serializable;

/**
 *
 * @author Architect
 */
public class PlayerBean implements Serializable {
    
    private String firstName, lastName, position, university;
    private Integer jerseyNumber;
    
    public PlayerBean() {
        
        firstName = "";
        lastName = "";
        position = "";
        jerseyNumber = 0;
        university = "";
        
    }
    
    public String getFirstName() {
        
        return firstName;
        
    }
    
    public void setFirstName(String firstName) {
        
        this.firstName = firstName;
        
    }
    
    public String getLastName() {
        
        return lastName;
        
    }
    
    public void setLastName(String lastName) {
        
        this.lastName = lastName;
        
    }
    
    public String getPosition() {
        
        return position;
        
    }
    
    public void setPosition(String position) {
        
        this.position = position;
        
    }
    
    public Integer getJerseyNumber() {
        
        return jerseyNumber;
        
    }
    
    public void setJerseyNumber(Integer jerseyNumber) {
        
        this.jerseyNumber = jerseyNumber;
        
    }
    
    public String getUniversity() {
        
        return university;
        
    }
    
    public void setUniversity(String university) {
        
        this.university = university;
        
    }
    
}
