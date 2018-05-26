/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.EC205.model;

/**
 *
 * @author casasbahia
 */
public class Teams {
    
    private String names;
    private int  goalsScored;
    private int  goalsConceded;
    private int  totalYellowCards;
    private int  totalRedCards;
    private int  victories;
    private int  defealts;
    private int  draws;
    private int  balance; //victories - defealts
    
    public void insertion(String Names, int GoalsScored, int GoalsConceded, int TotalYellowCards, int TotalRedCards, int Victories, int Defealts, int Draws){
    
        
        this.names = Names;
        this.goalsScored = GoalsScored;
        this.goalsConceded = GoalsConceded;
        this.totalRedCards = TotalRedCards;
        this.totalYellowCards = TotalYellowCards;
        this.victories = Victories;
        this.defealts = Defealts;
        this.draws = Draws;
        
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public int getTotalYellowCards() {
        return totalYellowCards;
    }

    public void setTotalYellowCards(int totalYellowCards) {
        this.totalYellowCards = totalYellowCards;
    }

    public int getTotalRedCards() {
        return totalRedCards;
    }

    public void setTotalRedCards(int totalRedCards) {
        this.totalRedCards = totalRedCards;
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDefealts() {
        return defealts;
    }

    public void setDefealts(int defealts) {
        this.defealts = defealts;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    
}
