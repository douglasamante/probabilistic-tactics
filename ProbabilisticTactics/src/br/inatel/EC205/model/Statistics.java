
package br.inatel.EC205.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author amantedouglas
 */
public class Statistics{

    Scanner valueT = new Scanner(System.in);
    
    public String[]  games = new String[20];
    private int  yellowCard;
    private int  redCard;
    public Escalation escalation;
    public ArrayList<String> escalationName = new ArrayList<>();
    public ArrayList<Integer> escalationNumber = new ArrayList<>();
    public Teams [] teams = new Teams[16];
    
    public Statistics(){
        escalation = new Escalation();
        
    }
    
    public void setTeams(Teams [] teams){
        this.teams = teams;
    }
    
    
    public void setYellowCard(int YellowCard){
        this.yellowCard = YellowCard;
    }
    
    public void setRedCard(int RedCard){
        this.redCard = RedCard;
    }
    
    public int getYellowCard(){
        return yellowCard;
    }
    
    public int getRedCard(){
        return redCard;
    }

    
    public void setEscalation(Escalation escalation){
        this.escalation = escalation;
        
    }

    public void addGame(){
        
            
        //The person choose a team for play of game of back with our team
            
        System.out.println("EQUIPES DISPONIVEIS PARA JOGAR CONTRA NOSSO TIME:"); //RETIRAR
            
        System.out.println("1 - Origin:"); //RETIRAR
        System.out.println("2 - Cabrid:"); //RETIRAR
        System.out.println("3 - Chuchuq:"); //RETIRAR
        System.out.println("4 - Nowin:"); //RETIRAR
        System.out.println("5 - Mowqilio:"); //RETIRAR
        System.out.println("6 - Powlif:"); //RETIRAR
        System.out.println("7 - Bakapowho:"); //RETIRAR
        System.out.println("8 - Choolsa:"); //RETIRAR
        System.out.println("9 - Paraloppy:"); //RETIRAR
        System.out.println("10 - Gabbywol:"); //RETIRAR
        System.out.println("11 - Pahol:"); //RETIRAR
        System.out.println("12 - Panatilows:"); //RETIRAR
        System.out.println("13 - Hollo:"); //RETIRAR
        System.out.println("14 - Excheloh:"); //RETIRAR
        System.out.println("15 - Kalakazi:"); //RETIRAR
        System.out.println("Time escolhido : "); //RETIRAR
        
        int team1 = 0;
        
        while((team1<1)||(team1>15)){
             team1 = valueT.nextInt();
        }
        
        
        escalation.SelectionTactic(team1, this.teams);
         
        
        
        
        System.out.println("PREPARANDO PARA O JOGO : "); //RETIRAR
        
        System.out.println("TIME FORMADO "); //RETIRAR
        
        escalationName = escalation.getEscalationOficialName();
        escalationNumber = escalation.getEscalationOficialNumberShirt();
        
        if(escalationName.size() > 0 && escalationNumber.size() > 0){
            for(int i=0;i<escalationName.size();i++){
                escalationName = escalation.getEscalationOficialName();
                escalationNumber = escalation.getEscalationOficialNumberShirt();

                System.out.printf(" %s ",escalationName.get(i));
                System.out.printf(" ");
                System.out.printf(" %s - %d", escalationName.get(i), escalationNumber.get(i));

            }
        }
    }
    
}
