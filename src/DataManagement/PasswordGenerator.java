package DataManagement;

import java.security.SecureRandom;

public class PasswordGenerator {

    private static SecureRandom random = new SecureRandom();

    /** different dictionaries used */
    private static final String ALPHA_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String ALPHA = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMERIC = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*_=+-/";

    /**
     * Method will generate random string based on the parameters
     * 
     * @return the random password
     */
    public static String generatePassword() {
	String result = "";
	String dic = ALPHA_CAPS + ALPHA + SPECIAL_CHARS + NUMERIC;
	for (int i = 0; i < 8; i++) {
	    int index = random.nextInt(dic.length());
	    result += dic.charAt(index);
	}
	return result;
    }
    

}
