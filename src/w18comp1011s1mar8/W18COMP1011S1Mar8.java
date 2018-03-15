package w18comp1011s1mar8;

import java.util.ArrayList;

/**
 *
 * @author jwright
 */
public class W18COMP1011S1Mar8
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {   
        String name = "jaret";
        
        name = name.replaceAll("[a-z][a-z]*", "[A-Z][a-z]*");
        
        System.out.printf("%s%n", name);
        
        ArrayList<String> list = new ArrayList<>();
        list.add("17055551234");
        list.add("705-5551234");
        list.add("705-555-1234");
        list.add("705-555 1234");
        list.add("(705)555 1234");
        list.add("(705)555-1234");
        list.add("(705)555.1234");
        list.add("705.555.1234");
        list.add("005 555 1234");
        list.add("105 555 1234");
        list.add("705 111 1234");
        
        
        for (String phoneNum:list)
        {
            System.out.printf("%s %s a valid phone number%n", phoneNum,
                            validatePhone(phoneNum)?"is": "is not");
        }
    }
    
    public static boolean validatePhone(String phoneNum)
    {
        return phoneNum.matches("\\(?[2-9]\\d{2}\\)?[-.\\s]?[2-9]\\d{2}[-.\\s]?\\d{4}");
    }
}
