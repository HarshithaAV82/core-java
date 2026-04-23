class Cricket{

    String teamName;
    String captainName;
    String coachName;
    int totalPlayers;
    String format; 
    int totalOvers;
    int runsScored;
    int wicketsLost;
    double runRate;
    String stadiumName;
    String country;
    int matchNumber;
    boolean tossWon;
    String tossDecision;
    int targetScore;
    int ballsFaced;
    int fours;
    int sixes;
    int extras;
    boolean matchWon;

    Cricket(String teamName, String captainName, String coachName,
            int totalPlayers, String format, int totalOvers,
            int runsScored, int wicketsLost, double runRate,
            String stadiumName, String country, int matchNumber,
            boolean tossWon, String tossDecision, int targetScore,
            int ballsFaced, int fours, int sixes,
            int extras, boolean matchWon) {

        this.teamName = teamName;
        this.captainName = captainName;
        this.coachName = coachName;
        this.totalPlayers = totalPlayers;
        this.format = format;
        this.totalOvers = totalOvers;
        this.runsScored = runsScored;
        this.wicketsLost = wicketsLost;
        this.runRate = runRate;
        this.stadiumName = stadiumName;
        this.country = country;
        this.matchNumber = matchNumber;
        this.tossWon = tossWon;
        this.tossDecision = tossDecision;
        this.targetScore = targetScore;
        this.ballsFaced = ballsFaced;
        this.fours = fours;
        this.sixes = sixes;
        this.extras = extras;
        this.matchWon = matchWon;
    }
}