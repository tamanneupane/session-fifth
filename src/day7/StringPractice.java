package day7;

import java.util.logging.Logger;

public class StringPractice {

    public static void main(String[] args) {
//        String surname;
//        String name = "Taman Neupane";
//
//        Logger.getGlobal().info(String.valueOf(name.length()));
//
//        String lowerCaseString = name.toUpperCase();
//        Logger.getGlobal().info(lowerCaseString);
//
//
//        String firstName = name.substring(0,5);
//        Logger.getGlobal().info(firstName);
//
//        String lastName = name.substring(6);
//        Logger.getGlobal().info(lastName);
//
//        String fullName = firstName.concat(" ").concat(lastName);
//        Logger.getGlobal().info(fullName);
//
//        String time =   "AM" + 21 + 9 ;
//        Logger.getGlobal().info(time);
//
//        String joinExample = String.join("/", "S", "L", "XL", "XXL");
//        Logger.getGlobal().info(joinExample);
//
//        String s = "     ";
//        String trimmedString = s.trim();
//        Logger.getGlobal().info(String.valueOf(trimmedString.length()));
//
//        Logger.getGlobal().info(String.valueOf(trimmedString.isEmpty()));
//
//        Logger.getGlobal().info(String.valueOf(trimmedString.isBlank()));

        String one = "one";
        String anotherOne = "one";

        String differentOne = "one two".substring(0,3);

        Logger.getGlobal().info(differentOne);

        Logger.getGlobal().info(String.valueOf(one == differentOne));

        Logger.getGlobal().info(String.valueOf(one.equals(differentOne)));

//        String yes = "yes";
//        String userYes = "Yes";
//
//        String lowerCaseUserYes = userYes.toLowerCase();
//
//        Logger.getGlobal().info(String.valueOf(yes.equals(lowerCaseUserYes)));


        Logger.getGlobal().info(String.valueOf("yes".equalsIgnoreCase("Yes")));

        String dirtyString = "Taman&Neupane";
        String cleanedString =  dirtyString.replace("&", " ");
        Logger.getGlobal().info(cleanedString);

        String commaSeperatedString = "Taman,Neupane";
        String [] seperetStringArray = commaSeperatedString.split(",");
        Logger.getGlobal().info(seperetStringArray[0]);
        Logger.getGlobal().info(seperetStringArray[1]);

        boolean decision = commaSeperatedString.startsWith("Ta");
        Logger.getGlobal().info(String.valueOf(decision));


        // Builder pattern
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("I");
        stringBuilder.append(" ");
        stringBuilder.append("am");
        stringBuilder.append(" ");
        stringBuilder.append("Java");
        stringBuilder.append(" ");
        stringBuilder.append("Tutor");

        String cocatString = stringBuilder.toString();

        Logger.getGlobal().info(cocatString);




    }
}
