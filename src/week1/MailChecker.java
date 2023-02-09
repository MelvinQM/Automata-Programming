package week1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Melvin Moes 500905603
??-02-2023
Regex mail checker
 */
public class MailChecker {
    public static void main(String[] args) {
        System.out.println("Made by: Melvin Moes 500905603");
        // Opgave 2 van week 1: Regex voor controle HvA email adres
        String test[] = {"piet@HVA.NL", "joop@hva@hvabnl", "Mats@HvA.Nl", "melvin@@hva.nl"};
        /*First part says all characters except some special chars like '@' and '.'. Second part says end
        with @hva.nl the final condition says that casing doesn't matter*/
        Pattern pattern = Pattern.compile("^\\w+@hva\\.nl$", Pattern.CASE_INSENSITIVE);
        //Making a boolean for matchfound and initializing the object before the loop
        boolean matchFound;
        Matcher matcher;
        for (int i = 0; i < test.length; i++) {
            matcher = pattern.matcher(test[i]);
            matchFound = matcher.find();
            if (matchFound){
                System.out.println("MATCHED");
            } else {
                System.out.println("NO MATCH");
            }
        }
    }
}
