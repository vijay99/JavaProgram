package com.practice;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;

public class RegexCheck {
    private static final String ERROR_MSG_REGEX_SYNTAX = "The regular-expression supplied has a syntax error";
    public static void main(String[] args) throws Exception {
        StringBuilder filterQuery = new StringBuilder(" and  displayName in (");
        System.out.println("Please enter the regex pattern:");
        Scanner sc = new Scanner(System.in);
        String regexPattern=sc.nextLine();
        System.out.println("Provided Regex pattern is: "+regexPattern);
       // String allTeamsDisplayName="QA Team 7,QATeam 10,Team13,Test Team,Team1,Team2,Team3,Team4,Team5,Team6,Team8,Team9,Team11,Team12,Team13,Team14,Team15,Team16,Team17,Team18,Team19,Team20,Team21,Team22,Team23,Team24,Team25,OrgLevelTeam,Team26,Team27,Team28,Team29,Team30,Team31,Team32,Team33,Team33,Team34,Team35,Team36,Team37,Team38,Team39,Team40,Team41,Team42,Team43,Team44,Team45,Team46,Team47,Team48,Team49,Team50,Team51,Team52,qwertyuiopasdfghjklzxcvbnm12345678qwertyui23456,!@#$%^&$%^&*()+-:,2345678901234567890123456789012345678901234567890qwertyuiopqwertyuiopqwertyuiopqwertyu,2345678901234567890123456789012345678901234567890qwertyuiopqwertyuiopqwertyuiopqwertyu789685298653287542,SACUMEN,SACUMen,null,123456789,sacumen                         team,Team_Special_Characters";
        String allTeamsDisplayName="special_characters,sales,department,test,student";
        List<String> allTeamNames= Arrays.stream(allTeamsDisplayName.split(",")).collect(Collectors.toList());
        Pattern patternIncludes;
        try {
            patternIncludes = Pattern.compile(regexPattern);
        } catch (PatternSyntaxException e) {

            throw new Exception(ERROR_MSG_REGEX_SYNTAX, e);
        }
        String sep = "";
        for (String teamDisplayName : allTeamNames) {
            if ((Objects.nonNull(patternIncludes) && patternIncludes.matcher(teamDisplayName).find())) {
                filterQuery.append(sep);
                filterQuery.append("'" + teamDisplayName + "'");
                sep = ",";
            }
        }
        filterQuery.append(")");
        System.out.println("final query is :"+filterQuery);

    }
}
