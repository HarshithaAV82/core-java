package com.xworkz.download;

public class VotingSystem {

        private int votesForA = 0;
        private int votesForB = 0;

        public void castVote(String candidateName) {
            if (candidateName.equalsIgnoreCase("A")) {
                votesForA++;
                System.out.println("Vote given to Candidate A");
            } else if (candidateName.equalsIgnoreCase("B")) {
                votesForB++;
                System.out.println("Vote given to Candidate B");
            } else {
                System.out.println("Invalid candidate");
            }
        }

        public void showResults() {
            System.out.println("Final Results:");
            System.out.println("Candidate A Votes: " + votesForA);
            System.out.println("Candidate B Votes: " + votesForB);

            if (votesForA > votesForB) {
                System.out.println("Winner: Candidate A");
            } else if (votesForB > votesForA) {
                System.out.println("Winner: Candidate B");
            } else {
                System.out.println("It's a tie!");
            }
        }
}
