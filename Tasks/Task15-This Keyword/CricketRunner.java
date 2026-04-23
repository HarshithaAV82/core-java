class CricketRunner{

    public static void main(String[] args) {

        Cricket match = new Cricket(
                "India",
                "Rohit Sharma",
                "Rahul Dravid",
                11,
                "ODI",
                50,
                280,
                6,
                5.6,
                "Wankhede Stadium",
                "India",
                1,
                true,
                "Batting",
                275,
                300,
                24,
                5,
                10,
                true
        );

        System.out.println("Team Name: " + match.teamName);
        System.out.println("Captain Name: " + match.captainName);
        System.out.println("Coach Name: " + match.coachName);
        System.out.println("Total Players: " + match.totalPlayers);
        System.out.println("Format: " + match.format);
        System.out.println("Total Overs: " + match.totalOvers);
        System.out.println("Runs Scored: " + match.runsScored);
        System.out.println("Wickets Lost: " + match.wicketsLost);
        System.out.println("Run Rate: " + match.runRate);
        System.out.println("Stadium Name: " + match.stadiumName);
        System.out.println("Country: " + match.country);
        System.out.println("Match Number: " + match.matchNumber);
        System.out.println("Toss Won: " + match.tossWon);
        System.out.println("Toss Decision: " + match.tossDecision);
        System.out.println("Target Score: " + match.targetScore);
        System.out.println("Balls Faced: " + match.ballsFaced);
        System.out.println("Fours: " + match.fours);
        System.out.println("Sixes: " + match.sixes);
        System.out.println("Extras: " + match.extras);
        System.out.println("Match Won: " + match.matchWon);
    }
}