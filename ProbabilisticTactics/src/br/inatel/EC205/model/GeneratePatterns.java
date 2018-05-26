package br.inatel.EC205.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author casasbahia
 */
public class GeneratePatterns { 
    
    Players [] player;
    Escalation escalation;
    
    public void Choose(int GK, int DC, int RB, int LB, int CDM, int CAM, int RW, int LW, int ST){
        
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
        
        for (i = 0; i < player.length; i++) {
            if(player[i].getPosition().equalsIgnoreCase("GK")){
                IMC = ((player[i].getHeight()*player[i].getHeight())/player[i].getWeight());
                sum = (player[i].getPositioning()+player[i].getImpulse()+player[i].getForce());
                if((IMC>=18.5)&&(IMC<=34.99)){
                    if(sum>biggerGK){
                        biggerGK = sum;
                        chosenNameGK = player[i].getName(); 
                        chosenShitNumberGK = player[i].getShirtNumber();
                    }
                }
                
            }
            if(player[i].getPosition().equalsIgnoreCase("DC")){
                sum=0;
                IMC = ((player[i].getHeight()*player[i].getHeight())/player[i].getWeight());
                sum = (player[i].getForce()+player[i].getBreath()+player[i].getImpulse()+player[i].getOverviewMarking()+player[i].getOverviewDisarm()+player[i].getPositioning());
                if((IMC>=18.5)&&(IMC<=36.99)){
                    if(sum>biggerDC1){
                        biggerDC1 = sum;
                        chosenNameDC1 = player[i].getName();
                        chosenShirtNumberDC1 = player[i].getShirtNumber();
                    }
                    else if(sum>biggerDC2){
                        biggerDC2 = sum;
                        chosenNameDC2 = player[i].getName();
                        chosenShirtNumberDC2 = player[i].getShirtNumber();
                    }
                    else if(sum>biggerDC3){
                        biggerDC3 = sum;
                        chosenNameDC3 = player[i].getName();
                        chosenShirtNumberDC3 = player[i].getShirtNumber();
                    }
                }
                
            }
            
            if(player[i].getPosition().equalsIgnoreCase("RB")){
                sum=0;
                IMC = ((player[i].getHeight()*player[i].getHeight())/player[i].getWeight());
                sum = (player[i].getBreath()+player[i].getOverviewMarking()+player[i].getOverviewDisarm()+player[i].getOverviewCrossing()+player[i].getPositioning());
                if((IMC>=18.5)&&(IMC<=33.99)){
                    if(sum>biggerRB){
                        biggerRB = sum;
                        chosenNameRB = player[i].getName();
                        chosenShirtNumberRB = player[i].getShirtNumber();
                    }
                }
            }
            
            if(player[i].getPosition().equalsIgnoreCase("LB")){
                
                sum=0;
                IMC = ((player[i].getHeight()*player[i].getHeight())/player[i].getWeight());
                sum = (player[i].getBreath()+player[i].getOverviewMarking()+player[i].getOverviewDisarm()+player[i].getOverviewCrossing()+player[i].getPositioning());
                if((IMC>=18.5)&&(IMC<33.99)){
                    if(sum>biggerLB){
                        biggerLB = sum;
                        chosenNameLB = player[i].getName();
                        chosenShirtNumberLB = player[i].getShirtNumber();
                    }
                }
            }
            
            if(player[i].getPosition().equalsIgnoreCase("CDM")){
                
                sum=0;
                IMC = ((player[i].getHeight()*player[i].getHeight())/player[i].getWeight());
                sum = (player[i].getOverviewPass()+player[i].getForce()+player[i].getBreath()+player[i].getImpulse()+player[i].getOverviewDisarm()+player[i].getOverviewMarking());
                if((IMC>=18.5)&&(IMC<=36.99)){
                    if(sum>biggerCDM1){
                        biggerCDM1 = sum;
                        chosenNameCDM1 = player[i].getName();
                        chosenShirtNumberCDM1 = player[i].getShirtNumber();
                    }
                    else if(sum>biggerCDM2){
                        biggerCDM2=sum;
                        chosenNameCDM2 = player[i].getName();
                        chosenShirtNumberCDM2 = player[i].getShirtNumber();
                    }
                    else if(sum>biggerCDM3){
                        biggerCDM3=sum;
                        chosenNameCDM3  = player[i].getName();
                        chosenShirtNumberCDM3 = player[i].getShirtNumber();
                    }
                }
            }
            
            if(player[i].getPosition().equalsIgnoreCase("CAM")){
                sum=0;
                IMC = ((player[i].getHeight()*player[i].getHeight())/player[i].getWeight());
                sum = (player[i].getLeader()+player[i].getOverviewDribbler()+player[i].getOverviewFinalization()+player[i].getOverviewCrossing()+player[i].getOverviewPass());
                if((IMC>=18.5)&&(IMC<=34.99)){
                    if(sum>biggerCAM1){
                        biggerCAM1 = sum;
                        chosenNameCAM1 = player[i].getName();
                        chosenShirtNumberCAM1 = player[i].getShirtNumber();
                    }
                    else if(sum>biggerCAM2){
                        biggerCAM2 = sum;
                        chosenNameCAM2 = player[i].getName();
                        chosenShirtNumberCAM2 = player[i].getShirtNumber();
                    }
                }
            }
            
            if(player[i].getPosition().equalsIgnoreCase("LW")){
                
                sum=0;
                IMC = ((player[i].getHeight()*player[i].getHeight())/player[i].getWeight());
                sum = (player[i].getOverviewDribbler()+ player[i].getOverviewDisarm()+player[i].getOverviewPass()+player[i].getOverviewCrossing());
                if((IMC>=16.5)&&(IMC<=29)){
                    if(sum>biggerLW){
                        biggerLW = sum;
                        chosenNameLW = player[i].getName();
                        chosenShirtNumberLW = player[i].getShirtNumber();
                    }
                }
            }
            
            if(player[i].getPosition().equalsIgnoreCase("RW")){
                
                sum=0;
                IMC = ((player[i].getHeight()*player[i].getHeight())/player[i].getWeight());
                sum = (player[i].getOverviewDribbler()+ player[i].getOverviewDisarm()+player[i].getOverviewPass()+player[i].getOverviewCrossing());
                if((IMC>=16.5)&&(IMC<=29)){
                    if(sum>biggerRW){
                        biggerRW = sum;
                        chosenNameRW = player[i].getName();
                        chosenShirtNumberRW = player[i].getShirtNumber();
                    
                    }
                }
            }
            
            if(player[i].getPosition().equalsIgnoreCase("ST")){
                
                sum=0;
                IMC = ((player[i].getHeight()*player[i].getHeight())/player[i].getWeight());
                sum = (player[i].getForce()+player[i].getOverviewFinalization()+player[i].getImpulse());
                if((IMC>=18.5)&&(IMC<=36.99)){
                    if(sum>biggerST1){
                        biggerST1 = sum;
                        chosenNameST1 = player[i].getName();
                        chosenShirtNumberST1 = player[i].getShirtNumber();
                    
                    }
                    else if(sum>biggerST2){
                        biggerST2 = sum;
                        chosenNameST2 = player[i].getName();
                        chosenShirtNumberST2 = player[i].getShirtNumber();
                    
                    }
                }
            }
        }
        
        if((GK==1)&&(DC==2)&&(RB==1)&&(LB==1)&&(CDM==2)&&(CAM==2)&&(ST==2)){ //4-4-2
            
            
            escalation.bestChoicePlayer(chosenNameGK,chosenShitNumberGK);
            escalation.bestChoicePlayer(chosenNameDC1,chosenShirtNumberDC1);
            escalation.bestChoicePlayer(chosenNameDC2,chosenShirtNumberDC2);
            escalation.bestChoicePlayer(chosenNameRB,chosenShirtNumberRB);
            escalation.bestChoicePlayer(chosenNameLB,chosenShirtNumberLB);
            escalation.bestChoicePlayer(chosenNameCDM1,chosenShirtNumberCDM1);
            escalation.bestChoicePlayer(chosenNameCDM2,chosenShirtNumberCDM2);
            escalation.bestChoicePlayer(chosenNameCAM1,chosenShirtNumberCAM1);
            escalation.bestChoicePlayer(chosenNameCAM2,chosenShirtNumberCAM2);
            escalation.bestChoicePlayer(chosenNameST1,chosenShirtNumberST1);
            escalation.bestChoicePlayer(chosenNameST2,chosenShirtNumberST2);
        }
        
        else if((GK==1)&&(DC==3)&&(CDM==2)&&(CAM==2)&&(LW==1)&&(RW==1)&&(ST==1)){ //3-4-2
            
            escalation.bestChoicePlayer(chosenNameGK,chosenShitNumberGK);
            escalation.bestChoicePlayer(chosenNameDC1,chosenShirtNumberDC1);
            escalation.bestChoicePlayer(chosenNameDC2,chosenShirtNumberDC2);
            escalation.bestChoicePlayer(chosenNameDC3,chosenShirtNumberDC3);
            escalation.bestChoicePlayer(chosenNameCDM1,chosenShirtNumberCDM1);
            escalation.bestChoicePlayer(chosenNameCDM2,chosenShirtNumberCDM2);
            escalation.bestChoicePlayer(chosenNameCAM1,chosenShirtNumberCAM1);
            escalation.bestChoicePlayer(chosenNameCAM2,chosenShirtNumberCAM2);
            escalation.bestChoicePlayer(chosenNameLW,chosenShirtNumberLW);
            escalation.bestChoicePlayer(chosenNameRW,chosenShirtNumberRW);
            escalation.bestChoicePlayer(chosenNameST1,chosenShirtNumberST1);
            
        }
        
        else if((GK==1)&&(DC==3)&&(RB==1)&&(LB==1)&&(CDM==2)&&(CAM==1)&&(ST==2)){ //5-3-2
            
            escalation.bestChoicePlayer(chosenNameGK,chosenShitNumberGK);
            escalation.bestChoicePlayer(chosenNameDC1,chosenShirtNumberDC1);
            escalation.bestChoicePlayer(chosenNameDC2,chosenShirtNumberDC2);
            escalation.bestChoicePlayer(chosenNameDC3,chosenShirtNumberDC3);
            escalation.bestChoicePlayer(chosenNameRB,chosenShirtNumberRB);
            escalation.bestChoicePlayer(chosenNameLB,chosenShirtNumberLB);
            escalation.bestChoicePlayer(chosenNameCDM1,chosenShirtNumberCDM1);
            escalation.bestChoicePlayer(chosenNameCDM2,chosenShirtNumberCDM2);
            escalation.bestChoicePlayer(chosenNameCAM1,chosenShirtNumberCAM1);
            escalation.bestChoicePlayer(chosenNameST1,chosenShirtNumberST1);
            escalation.bestChoicePlayer(chosenNameST2,chosenShirtNumberST2);
            
        }
        else{ //4-5-1
            
            escalation.bestChoicePlayer(chosenNameGK,chosenShitNumberGK);
            escalation.bestChoicePlayer(chosenNameDC1,chosenShirtNumberDC1);
            escalation.bestChoicePlayer(chosenNameDC2,chosenShirtNumberDC2);
            escalation.bestChoicePlayer(chosenNameRB,chosenShirtNumberRB);
            escalation.bestChoicePlayer(chosenNameLB,chosenShirtNumberLB);
            escalation.bestChoicePlayer(chosenNameCDM1,chosenShirtNumberCDM1);
            escalation.bestChoicePlayer(chosenNameCDM2,chosenShirtNumberCDM2);
            escalation.bestChoicePlayer(chosenNameCDM3,chosenShirtNumberCDM3);
            escalation.bestChoicePlayer(chosenNameLW,chosenShirtNumberLW);
            escalation.bestChoicePlayer(chosenNameRW,chosenShirtNumberRW);
            escalation.bestChoicePlayer(chosenNameST1,chosenShirtNumberST1);
            
        }
      
    }
    
}
