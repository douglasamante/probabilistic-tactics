package br.inatel.EC205.model;

import java.util.ArrayList;

/**
 *
 * @author amantedouglas
 */
public class GeneratePatterns { 
    
    public static ArrayList<Players> players = new ArrayList<Players>();
    Escalation escalation;
    
    public void setPlayer(ArrayList<Players> player){
        this.players = player;
    }
    
    public void setEscalation(Escalation escalation){
        this.escalation = escalation;
    }
    
    public void choose(int GK, int DC, int RB, int LB, int CDM, int CAM, int RW, int LW, int ST){
        
        int numberGK = GK;
        int numberDC = DC;
        int numberRB = RB;
        int numberLB = LB;
        int numerCDM = CDM;
        int numberCAM = CAM;
        int numberRW = RW;
        int numberLW = LW;
        int numberST = ST;
        int i;
        double biggerGK=0;
        double biggerDC1=0;
        double biggerDC2=0;
        double biggerDC3=0;
        double biggerRB=0;
        double biggerLB=0;
        double biggerCDM1=0;
        double biggerCDM2=0;
        double biggerCDM3=0;
        double biggerCAM1=0;
        double biggerCAM2=0;
        double biggerRW=0;
        double biggerLW=0;
        double biggerST1=0;
        double biggerST2=0;
        double IMC;
        double sum=0;
        String chosenNameGK = null;
        String chosenNameDC1 = null;
        String chosenNameDC2 = null;
        String chosenNameDC3 = null;
        String chosenNameRB = null;
        String chosenNameLB = null;
        String chosenNameCDM1 = null;
        String chosenNameCDM2 = null;
        String chosenNameCDM3 = null;
        String chosenNameCAM1 = null;
        String chosenNameCAM2 = null;
        String chosenNameRW = null;
        String chosenNameLW = null;
        String chosenNameST1 = null;
        String chosenNameST2 = null;
        int chosenShitNumberGK = 0;
        int chosenShirtNumberDC1 = 0;
        int chosenShirtNumberDC2 = 0;
        int chosenShirtNumberDC3 = 0;
        int chosenShirtNumberRB = 0;
        int chosenShirtNumberLB = 0;
        int chosenShirtNumberCDM1 = 0;
        int chosenShirtNumberCDM2 = 0;
        int chosenShirtNumberCDM3 = 0;
        int chosenShirtNumberCAM1 = 0;
        int chosenShirtNumberCAM2 = 0;
        int chosenShirtNumberRW = 0;
        int chosenShirtNumberLW = 0;
        int chosenShirtNumberST1 = 0;
        int chosenShirtNumberST2 = 0;
        
        
        for (Players player : players) {
            if(player.getPosition().equalsIgnoreCase("GK")){
                
                IMC = (player.getWeight()/(player.getHeight()*player.getHeight()));
                sum = (player.getPositioning()+player.getImpulse()+player.getForce());
                
                if((IMC>=18.5)&&(IMC<=34.99)){
                    if(sum>=biggerGK){
                        biggerGK = sum;
                        chosenNameGK = player.getName(); 
                        chosenShitNumberGK = player.getShirtNumber();
                    }
                }   
            }
            
            
            if(player.getPosition().equalsIgnoreCase("DC")){
                sum=0;
                IMC = (player.getWeight()/(player.getHeight()*player.getHeight()));
                sum = (player.getForce()+player.getBreath()+player.getImpulse()+player.getOverviewMarking()+player.getOverviewDisarm()+player.getPositioning());
                if((IMC>=18.5)&&(IMC<=36.99)){
                    if(sum>=biggerDC1){
                        biggerDC1 = sum;
                        chosenNameDC1 = player.getName();
                        chosenShirtNumberDC1 = player.getShirtNumber();
                    }
                    else if(sum>=biggerDC2){
                        biggerDC2 = sum;
                        chosenNameDC2 = player.getName();
                        chosenShirtNumberDC2 = player.getShirtNumber();
                    }
                    else if(sum>=biggerDC3){
                        biggerDC3 = sum;
                        chosenNameDC3 = player.getName();
                        chosenShirtNumberDC3 = player.getShirtNumber();
                    }
                }
                
            }
            
            if(player.getPosition().equalsIgnoreCase("RB")){
                sum=0;
                IMC = (player.getWeight()/(player.getHeight()*player.getHeight()));
                sum = (player.getBreath()+player.getOverviewMarking()+player.getOverviewDisarm()+player.getOverviewCrossing()+player.getPositioning());
                if((IMC>=18.5)&&(IMC<=33.99)){
                    if(sum>=biggerRB){
                        biggerRB = sum;
                        chosenNameRB = player.getName();
                        chosenShirtNumberRB = player.getShirtNumber();
                    }
                }
            }
            
            if(player.getPosition().equalsIgnoreCase("LB")){
                
                sum=0;
                IMC = (player.getWeight()/(player.getHeight()*player.getHeight()));
                sum = (player.getBreath()+player.getOverviewMarking()+player.getOverviewDisarm()+player.getOverviewCrossing()+player.getPositioning());
                if((IMC>=18.5)&&(IMC<33.99)){
                    if(sum>=biggerLB){
                        biggerLB = sum;
                        chosenNameLB = player.getName();
                        chosenShirtNumberLB = player.getShirtNumber();
                    }
                }
            }
            
            if(player.getPosition().equalsIgnoreCase("CDM")){
                
                sum=0;
                IMC = (player.getWeight()/(player.getHeight()*player.getHeight()));
                sum = (player.getOverviewPass()+player.getForce()+player.getBreath()+player.getImpulse()+player.getOverviewDisarm()+player.getOverviewMarking());
                if((IMC>=18.5)&&(IMC<=36.99)){
                    if(sum>=biggerCDM1){
                        biggerCDM1 = sum;
                        chosenNameCDM1 = player.getName();
                        chosenShirtNumberCDM1 = player.getShirtNumber();
                    }
                    else if(sum>=biggerCDM2){
                        biggerCDM2=sum;
                        chosenNameCDM2 = player.getName();
                        chosenShirtNumberCDM2 = player.getShirtNumber();
                    }
                    else if(sum>=biggerCDM3){
                        biggerCDM3=sum;
                        chosenNameCDM3  = player.getName();
                        chosenShirtNumberCDM3 = player.getShirtNumber();
                    }
                }
            }
            
            if(player.getPosition().equalsIgnoreCase("CAM")){
                sum=0;
                IMC = (player.getWeight()/(player.getHeight()*player.getHeight()));
                sum = (player.getLeader()+player.getOverviewDribbler()+player.getOverviewFinalization()+player.getOverviewCrossing()+player.getOverviewPass());
                if((IMC>=18.5)&&(IMC<=34.99)){
                    if(sum>=biggerCAM1){
                        biggerCAM1 = sum;
                        chosenNameCAM1 = player.getName();
                        chosenShirtNumberCAM1 = player.getShirtNumber();
                    }
                    else if(sum>=biggerCAM2){
                        biggerCAM2 = sum;
                        chosenNameCAM2 = player.getName();
                        chosenShirtNumberCAM2 = player.getShirtNumber();
                    }
                }
            }
            
            if(player.getPosition().equalsIgnoreCase("LW")){
                
                sum=0;
                IMC = (player.getWeight()/(player.getHeight()*player.getHeight()));
                sum = (player.getOverviewDribbler()+ player.getOverviewDisarm()+player.getOverviewPass()+player.getOverviewCrossing());
                if((IMC>=16.5)&&(IMC<=29)){
                    if(sum>=biggerLW){
                        biggerLW = sum;
                        chosenNameLW = player.getName();
                        chosenShirtNumberLW = player.getShirtNumber();
                    }
                }
            }
            
            if(player.getPosition().equalsIgnoreCase("RW")){
                
                sum=0;
                IMC = (player.getWeight()/(player.getHeight()*player.getHeight()));
                sum = (player.getOverviewDribbler()+ player.getOverviewDisarm()+player.getOverviewPass()+player.getOverviewCrossing());
                if((IMC>=16.5)&&(IMC<=29)){
                    if(sum>=biggerRW){
                        biggerRW = sum;
                        chosenNameRW = player.getName();
                        chosenShirtNumberRW = player.getShirtNumber();
                    
                    }
                }
            }
            
            if(player.getPosition().equalsIgnoreCase("ST")){
                
                sum=0;
                IMC = (player.getWeight()/(player.getHeight()*player.getHeight()));
                sum = (player.getForce()+player.getOverviewFinalization()+player.getImpulse());
                if((IMC>=18.5)&&(IMC<=36.99)){
                    if(sum>=biggerST1){
                        biggerST1 = sum;
                        chosenNameST1 = player.getName();
                        chosenShirtNumberST1 = player.getShirtNumber();
                    
                    }
                    else if(sum>=biggerST2){
                        biggerST2 = sum;
                        chosenNameST2 = player.getName();
                        chosenShirtNumberST2 = player.getShirtNumber();
                    
                    }
                }
            }
        }       
        
        if((GK==1)&&(DC==2)&&(RB==1)&&(LB==1)&&(CDM==2)&&(CAM==2)&&(ST==2)){ //4-4-2
            
            escalation.bestChoicePlayer(chosenNameGK);
            escalation.bestChoicePlayer(chosenNameDC1);
            escalation.bestChoicePlayer(chosenNameDC2);
            escalation.bestChoicePlayer(chosenNameRB);
            escalation.bestChoicePlayer(chosenNameLB);
            escalation.bestChoicePlayer(chosenNameCDM1);
            escalation.bestChoicePlayer(chosenNameCDM2);
            escalation.bestChoicePlayer(chosenNameCAM1);
            escalation.bestChoicePlayer(chosenNameCAM2);
            escalation.bestChoicePlayer(chosenNameST1);
            escalation.bestChoicePlayer(chosenNameST2);
        }
        
        else if((GK==1)&&(DC==3)&&(CDM==2)&&(CAM==2)&&(LW==1)&&(RW==1)&&(ST==1)){ //3-4-2
            
            
            
            escalation.bestChoicePlayer(chosenNameGK);
            escalation.bestChoicePlayer(chosenNameDC1);
            escalation.bestChoicePlayer(chosenNameDC2);
            escalation.bestChoicePlayer(chosenNameDC3);
            escalation.bestChoicePlayer(chosenNameCDM1);
            escalation.bestChoicePlayer(chosenNameCDM2);
            escalation.bestChoicePlayer(chosenNameCAM1);
            escalation.bestChoicePlayer(chosenNameCAM2);
            escalation.bestChoicePlayer(chosenNameLW);
            escalation.bestChoicePlayer(chosenNameRW);
            escalation.bestChoicePlayer(chosenNameST1);
            
        }
        
        else if((GK==1)&&(DC==3)&&(RB==1)&&(LB==1)&&(CDM==2)&&(CAM==1)&&(ST==2)){ //5-3-2
            
            
            
            escalation.bestChoicePlayer(chosenNameGK);
            escalation.bestChoicePlayer(chosenNameDC1);
            escalation.bestChoicePlayer(chosenNameDC2);
            escalation.bestChoicePlayer(chosenNameDC3);
            escalation.bestChoicePlayer(chosenNameRB);
            escalation.bestChoicePlayer(chosenNameLB);
            escalation.bestChoicePlayer(chosenNameCDM1);
            escalation.bestChoicePlayer(chosenNameCDM2);
            escalation.bestChoicePlayer(chosenNameCAM1);
            escalation.bestChoicePlayer(chosenNameST1);
            escalation.bestChoicePlayer(chosenNameST2);
            
        }
        else{ //4-5-1
            
            
            
            
            escalation.bestChoicePlayer(chosenNameGK);
            escalation.bestChoicePlayer(chosenNameDC1);
            escalation.bestChoicePlayer(chosenNameDC2);
            escalation.bestChoicePlayer(chosenNameRB);
            escalation.bestChoicePlayer(chosenNameLB);
            escalation.bestChoicePlayer(chosenNameCDM1);
            escalation.bestChoicePlayer(chosenNameCDM2);
            escalation.bestChoicePlayer(chosenNameCDM3);
            escalation.bestChoicePlayer(chosenNameLW);
            escalation.bestChoicePlayer(chosenNameRW);
            escalation.bestChoicePlayer(chosenNameST1);
            
            
            
        }
        
        
      
    }
    
}
