package com.xworkz.download;

public class Main2 {
    public static void main(String[] args) {

        VotingSystem voting = new VotingSystem();

        voting.castVote("A");
        voting.castVote("B");
        voting.castVote("A");
        voting.castVote("A");

        voting.showResults();
    }
}