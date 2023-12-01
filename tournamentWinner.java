import java.util.*;
import java.util.Map.Entry;

public class tournamentWinner {
    public static String tournamentWinnerF(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.
        Hashtable<String, Integer> scoreHashtable = new Hashtable<String, Integer>();
        for (int iter = 0; iter < competitions.size(); iter++) {
            String homeTeam = competitions.get(iter).get(0);
            String awayTeam = competitions.get(iter).get(1);
            if (results.get(iter) == 0) {
                if (scoreHashtable.containsKey(awayTeam)) {
                    Integer score = scoreHashtable.get(awayTeam);
                    scoreHashtable.put(awayTeam, score + 3);
                } else {
                    scoreHashtable.put(awayTeam, 0);
                }
            } else {
                if (scoreHashtable.containsKey(homeTeam)) {
                    Integer score = scoreHashtable.get(homeTeam);
                    scoreHashtable.put(homeTeam, score + 3);
                } else {
                    scoreHashtable.put(homeTeam, 0);
                }
            }
        }
        Integer maxValue = Collections.max(scoreHashtable.values());
        for (Entry<String, Integer> entry : scoreHashtable.entrySet()) {
            if (entry.getValue() == maxValue) {
                return entry.getKey();
            }
        }
        return "";
    }

    public static String tournamentWinnerM(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> hMap = new HashMap<>();
        String overallWinner = "", winningTeam = "";
        for (int iter = 0; iter < competitions.size(); iter++) {
            winningTeam = competitions.get(iter).get(results.get(iter) == 0 ? 1 : 0);
            hMap.put(winningTeam, hMap.getOrDefault(winningTeam, 0) + 3);
            overallWinner = hMap.get(winningTeam) > hMap.getOrDefault(overallWinner, 0) ? winningTeam : overallWinner;
        }
        return overallWinner;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competition = new ArrayList<ArrayList<String>>();
        ArrayList<String> firstTeam = new ArrayList<String>();
        firstTeam.add("HTML");
        firstTeam.add("C#");
        competition.add(firstTeam);
        ArrayList<String> secondTeam = new ArrayList<String>();
        secondTeam.add("C#");
        secondTeam.add("Python");
        competition.add(secondTeam);
        ArrayList<String> thirdTeam = new ArrayList<String>();
        thirdTeam.add("Python");
        thirdTeam.add("HTML");
        competition.add(thirdTeam);
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(0);
        result.add(1);
        System.out.println(tournamentWinnerM(competition, result));
    }
}
