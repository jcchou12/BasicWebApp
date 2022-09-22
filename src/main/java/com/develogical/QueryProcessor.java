package com.develogical;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "MyTeams";
        }
        if (query.toLowerCase().contains("hello")) {
            return "Hi";
        }
        if (query.toLowerCase().contains("find")) {
            return "Searching";
        }
        if (query.toLowerCase().contains("largest")){
            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(query);
            Integer largest = -2147483648;
            while(m.find()) {
                curr = m.group();
                if (curr > largest) {
                    largest = curr;
                }
            }
            return largest;
        }
        
        return "";
    }
}
