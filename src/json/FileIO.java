package json;

import java.io.FileInputStream;
import java.util.HashMap;
import java.io.FileOutputStream;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;


/**
 *
 * @author Architect
 */
public class FileIO {
    
    public void recordStats(PlayerBean playerBean) throws Exception {
        
        HashMap playerMap = new HashMap();
        
        playerMap.put("First Name", playerBean.getFirstName());
        playerMap.put("Last Name", playerBean.getLastName());
        playerMap.put("Position", playerBean.getPosition());
        playerMap.put("Jersey Number", playerBean.getJerseyNumber());
        playerMap.put("University", playerBean.getUniversity());
        
        try {
            
            if (playerBean.getFirstName() == null || playerBean.getLastName() == null) {
                
                throw new NullPointerException();
                
            }
            
            else {
            
                FileOutputStream statsFile = new FileOutputStream(playerBean.getFirstName() + " " + playerBean.getLastName() + ".txt");
            
                JSONOutputStream writeFile = new JSONOutputStream(statsFile);
            
                writeFile.writeObject(playerMap);
            
                System.out.println("Thank you, " + playerBean.getFirstName() + " " + playerBean.getLastName() + " has been added to the system.");
            
            }
                
        }
        
        catch (NullPointerException npe) {
                
            System.err.println("First name and last name cannot be null");
            
        }
        
    }
    
    public void readStats(String firstName, String lastName) {
        
        String fileName = firstName + " " + lastName + ".txt";
        
        try {
            
            FileInputStream statsFile = new FileInputStream(fileName);
            
            JSONInputStream readFile = new JSONInputStream(statsFile);
            
            Object stats = readFile.readObject();
            
            HashMap playerMap = (HashMap) stats;
            
            System.out.println("Stats for " + playerMap.get("First Name") + " " + playerMap.get("Last Name"));
            System.out.println("\tName: " + playerMap.get("First Name") + " " + playerMap.get("Last Name"));
            System.out.println("\tPosition: " + playerMap.get("Position"));
            System.out.println("\tJersey Number: " + playerMap.get("Jersey Number"));
            System.out.println("\tUniversity: " + playerMap.get("University"));
            
        }
        
        catch (Exception e) {
            
            System.err.println("Player " + firstName + " " + lastName + " does not exist in our system.");
            
        }
        
    }
    
}
