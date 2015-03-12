package json;

/**
 *
 * @author Architect
 */
public class JSON {

    public static void main(String[] args) throws Exception {
        
        PlayerBean playerBean = new PlayerBean();
        FileIO fileIO = new FileIO();
        String firstName, firstName2, lastName, lastName2, position, position2, university, university2;
        Integer jerseyNumber, jerseyNumber2;
        
        firstName = "Jonathan";
        lastName = "Lundberg";
        position = "Power Forward";
        jerseyNumber = 57;
        university = "BYU-I";
        
        firstName2 = null;
        lastName2 = null;
        position2 = null;
        jerseyNumber2 = null;
        university2 = null;
        
        // Correct usage of the recordStats method
        playerBean.setFirstName(firstName);
        playerBean.setLastName(lastName);
        playerBean.setPosition(position);
        playerBean.setJerseyNumber(jerseyNumber);
        playerBean.setUniversity(university);
        
        System.out.println("Test 1: Add player with legit values");
        fileIO.recordStats(playerBean);
        
        // Attempting to pass null values as parameters to the recordStats method
        playerBean.setFirstName(firstName2);
        playerBean.setLastName(lastName2);
        playerBean.setPosition(position2);
        playerBean.setJerseyNumber(jerseyNumber2);
        playerBean.setUniversity(university2);
        
        System.out.println("Test 2: Add player with null values");
        fileIO.recordStats(playerBean);
        
        // Reading stats file for Jonathan Lundberg
        System.out.println("Test 3: Read file created from legit parameters");
        fileIO.readStats(firstName, lastName);
        
        // Reading stats for George Costanza, who is not in the system
        System.out.println("Test 5: Read file that doesn't exist");
        fileIO.readStats("George", "Costanza");
        
    }
    
}
