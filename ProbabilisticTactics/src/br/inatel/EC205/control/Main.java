/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.EC205.control;

import br.inatel.EC205.model.Escalation;
import br.inatel.EC205.model.Teams;
import br.inatel.EC205.model.Statistics;
import br.inatel.EC205.model.Players;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author casasbahia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Players []player = new Players[40];
        
        Escalation escalation = new Escalation();
        Teams []team = new Teams[16]; 
        Random random = new Random(); //number of random [0 - 20]
     
        Statistics sst = new Statistics();
        
        Scanner valueT = new Scanner(System.in);
    
        int i;
        
        for(i=0;i<40;i++){
            player[i] = new Players();
            // O ERRO QUE ESTAVA DANDO AQUI, FALTA POR A VARIAVEL "STATISTICS COMO PUBLIC NA CLASSE PLAYER",
            // se não vc não consegue acessa-la o/
            player[i].statistics = sst;
        }
        
        for(i=0;i<16;i++){
            team[i] = new Teams();
            // O ERRO QUE ESTAVA DANDO AQUI, FALTA POR A VARIAVEL "TEAMS COMO PUBLIC NA CLASSE ESCALATION",
            // se não vc não consegue acessa-la o/
            escalation.teams[i] = team[i];
        }
        
        
        //Datas of players
      
        player[0].register("Alexandre Bernandez","DC", "Chile", 89.2, 77.1, 20.4, 1.78, 80.4, 55.4, 77.9, 25, 69.1, 77.2, 80.8, 33.8, 20.9, 60.3, 69.8,44);
        player[1].register("Kylian Moore","ST", "França", 86.4, 60.6, 20.4, 1.88, 66.6, 43.9, 65.3, 31, 65.2, 57.5, 74.5, 63.6, 80.2, 40.4, 66.6,9);
        player[2].register("Marco Lemo","CAM", "Espanha", 77.0, 70.1, 44.4, 1.58, 50.5, 52.2, 82.2, 26, 65.5, 63.2, 35.7, 74.7, 74.3, 58.8, 78.7,20);
        player[3].register("Gabriel Pereira","ST", "Brasil", 69.9, 57.7, 65.4, 1.93, 83.2, 41.6, 65.3, 22, 58.9, 91.3, 58.8, 76.4, 67.9, 73.5, 63.3,18);
        player[4].register("Alban Lafount","GK", "França", 82.9, 40.0, 60.2, 1.78, 53.3, 43.4, 73.9, 41, 34.1, 64.4, 45.3, 63.6, 30.9, 80.3, 49.9,22);
        player[5].register("Dani Ceballos","CDM", "Alemanha", 72.3, 33.3, 20.4, 1.66, 73.4, 53.4, 37.6, 24, 76.1, 55.6, 57.8, 88.6, 88.9, 50.6, 77.5,5);
        player[6].register("Chistian Lopedo","DC", "Bolivia", 80.2, 79.9, 56.6, 1.68, 86.6, 67.6, 55.9, 27, 89.6, 67.2, 67.0, 63.8, 67.6, 88.3, 76.5,14);
        player[7].register("Pedro Manoel","DC", "Espanha", 78.1, 45.5, 71.3, 1.63, 44.4, 78.5, 67.6, 28, 61.5, 71.1, 67.7, 76.7, 70.7, 34.3, 44.8,3);
        player[8].register("Richard Emannuel","CDM", "Inglaterra", 70.1, 55.5, 40.6, 1.66, 37.8, 86.4, 47.9, 18, 64.1, 46.4, 55.5, 35.8, 77.3, 50.3, 79.4,15);
        player[9].register("Rogerio Martial","LB", "Espanha", 66.7, 81.5, 80.5, 1.68, 77.7, 75.4, 55.5, 20, 86.1, 67.5, 37.5, 51.4, 81.7, 77.7, 73.4,13);
        player[10].register("Davinson Sanchezit","RB", "Dinamarca", 81.2, 70.0, 20.4, 1.75, 80.4, 55.4, 77.9, 21, 69.1, 77.2, 80.4, 33.8, 20.9, 60.3, 39.3,61);
        player[11].register("Sality Lerow","LW", "Alemanha", 55.2, 47.1, 20.4, 1.64, 80.4, 55.4, 77.9, 35, 69.1, 77.2, 80.8, 73.7, 74.5, 60.3, 66.3,21);
        player[12].register("Youri Sachiw","CDM", "Coreia do Sul", 74.2, 77.1, 20.4, 1.84, 80.4, 75.4, 66.9, 30, 83.1, 63.2, 53.3, 33.8, 84.4, 60.3, 79.8,23);
        player[13].register("Zizoh Pedih","ST", "Egito", 80.4, 77.1, 20.4, 1.55, 65.3, 47.6, 73.3, 27, 54.4, 53.3, 75.3, 84.3, 23.6, 73.6, 55.7,29);
        player[14].register("Breno Bolanoz","RB", "Costa Rica", 61.4, 74.1, 20.4, 1.84, 63.4, 73.3, 67.7, 24, 88.1, 85.8, 74.5, 57.4, 84.4, 76.3, 59.4,2);
        player[15].register("Ezequiel Marcolit","RW", "Argentina", 59.6, 57.1, 63.3, 1.42, 63.6, 73.4, 64.9, 25, 75.5, 37.5, 63.3, 74.3, 83.3, 77.7, 47.5,17);
        player[16].register("Pierre De Arrascat","RW", "Argentina", 68.8, 82.1, 60.6, 1.66, 84.6, 66.4, 87.3, 25, 88.3, 68.6, 64.4, 74.5, 50.5, 44.3, 88.3,26);
        player[17].register("Manoel Bitanoz","GK", "Uruguai", 79.5, 55.1, 38.8, 1.88, 64.4, 68.8, 68.4, 26, 66.6, 84.4, 46.6, 85.5, 84.4, 60.3, 44.6,1);
        player[18].register("Andreas Pulito","CAM", "Espanha", 70.4, 77.1, 20.4, 1.48, 80.4, 55.4, 77.9, 23, 69.1, 77.2, 80.8, 33.8, 80.9, 40.3, 69.5,55);
        player[19].register("Kohug Mohhi","GK", "Japão", 77.7, 57.5, 66.4, 1.58, 73.7, 75.7, 74.4, 33, 79.7, 47.4, 49.5, 55.8, 68.7, 66.3, 79.5,42);
        player[20].register("Rodrygo Silva","ST", "Brasil", 69.0, 55.5, 64.4, 1.48, 45.5, 37.9, 64.9, 27, 69.1, 66.2, 40.4, 73.8, 70.5, 58.4, 64.3,99);
        player[21].register("Silvirit Chisti","RW", "Holanda", 59.8, 87.1, 88.8, 1.66, 54.4, 64.4, 64.9, 25, 57.3, 75.6, 47.4, 74.4, 55.5, 77.7, 54.4,31);
        player[22].register("Matthihs Manowishi","LB", "Dinamarca", 80.2, 47.4, 67.6, 1.91, 88.8, 86.6, 58.8, 21, 77.5, 76.6, 65.5, 75.5, 75.5, 75.3, 66.3,32);
        player[23].register("Romeryto Callanos","CDM", "Argentina", 75.5, 76.1, 40.6, 1.83, 64.4, 68.4, 63.3, 20, 53.5, 64.4, 64.7, 68.8, 24.4, 77.3, 59.5,65);
        player[24].register("Andreas Silva","ST", "Portugal", 80.1, 77.1, 20.4, 2.01, 80.4, 55.4, 77.9, 26, 69.1, 77.2, 80.8, 33.8, 20.9, 60.3, 69.8,25);
        player[25].register("Meyer Max","RB", "Inglaterra", 80.4, 60.0, 75.5, 1.73, 66.6, 77.5, 66.9, 23, 54.3, 64.4, 64.4, 74.4, 75.3, 45.3, 69.4,41);
        player[26].register("Coman Kijowhishi","LW", "França", 55.3, 63.3, 63.6, 1.55, 60.3, 73.3, 46.9, 32, 86.5, 66.4, 58.5, 78.5, 85.5, 68.3, 80.2,11);
        player[27].register("Antonio Sabrani","ST", "Paraguai", 80.2, 53.3, 53.7, 1.77, 36.7, 74.4, 59.5, 30, 65.5, 74.4, 56.8, 63.6, 44.7, 74.4, 45.4,29);
        player[28].register("Diayne Amatth","CDM", "Senegal", 79.9, 77.1, 20.4, 1.36, 80.4, 54.7, 56.6, 25, 79.1, 74.4, 75.8, 53.5, 20.9, 60.4, 59.3,10);
        player[29].register("Han Kwang","DC", "Coreia do Sul", 66.2, 47.7, 77.4, 1.66, 47.4, 41.4, 70.6, 28, 77.7, 50.2, 75.8, 46.8, 20.9, 60.3, 84.4,45);
        player[30].register("Joalito Makito","RB", "Espanha", 49.9, 75.5, 20.4, 1.63, 80.4, 33.3, 35.9, 29, 65.4, 70.3, 73.8, 54.4, 20.4, 64.3, 91.0,33);
        player[31].register("Osho Mowo","LB", "Russia", 69.0, 57.5, 66.7, 1.49, 66.0, 53.3, 78.8, 40, 65.0, 75.7, 85.8, 55.5, 73.3, 55.5, 71.3,80);
        player[32].register("Felipe Farah","ST", "Brasil", 85.3, 74.4, 64.7, 1.82, 47.7, 58.8, 87.0, 24, 68.1, 67.6, 88.5, 75.5, 85.9, 84.3, 55.5,30);
        player[33].register("Makotiti Mokowo","CAM", "Russia", 68.5, 76.8, 70.7, 1.66, 70.7, 85.6, 69.6, 27, 56.9, 55.2, 60.6, 66.8, 60.3, 52.2, 49.8,40);
        player[34].register("Diogo Jota","LW", "Brasil", 57.4, 70.0, 66.6, 1.68, 60.3, 63.5, 47.4, 21, 64.6, 46.2, 65.5, 54.4, 64.4, 60.4, 66.6,61);
        player[35].register("Allichi Shown","ST", "Dinamarca", 82.2, 76.5, 77.7, 1.73, 85.4, 55.8, 57.9, 20, 56.1, 44.2, 77.8, 54.8, 25.9, 60.3, 79.6,28);
        player[36].register("Cristiano Meloz","LB", "Argentina", 69.9, 67.2, 22.6, 1.59, 43.6, 64.4, 46.3, 19, 46.1, 73.2, 63.8, 73.3, 80.4, 75.3, 73.7,43);
        player[37].register("Huggano Romero","CAM", "Uruguai", 79.4, 73.1, 70.3, 1.63, 86.4, 57.5, 72.5, 22, 62.2, 72.6, 85.6, 68.5, 55.9, 67.3, 89.9,50);
        player[38].register("Rolando Paiva","LW", "Brasil", 59.5, 77.1, 80.2, 1.68, 55.3, 63.3, 74.9, 22, 69.1, 67.4, 44.8, 67.5, 48.9, 86.3, 48.0,66);
        player[39].register("Denzer Manchow","RW", "Holanda", 70.4, 77.6, 53.4, 1.81, 46.5, 53.3, 63.6, 33, 77.3, 74.6, 69.9, 71.2, 60.2, 72.2, 63.3,88);
        
        for(i=0;i<40;i++){
            player[i].statistics.setYellowCard(random.nextInt(20)); //number random gerate of [0-20]
            player[i].statistics.setRedCard(random.nextInt(20)); //number random gerate of [0-20]
        }
        
        // O ERRO QUE ESTAVA DANDO AQUI, FALTA POR A VARIAVEL "GAMES COMO PUBLIC NA CLASSE STATISTICS",
        // se não vc não consegue acessa-la o
        sst.games[0] = "Bitbucket 2 x 1 Origin";
        sst.games[1] = "Bitbucket 1 x 0 Cabrid";
        sst.games[2] = "Chuchuq 1 x 1 Bitbucket";
        sst.games[3] = "Bitbucket 0 x 2 Noniw";
        sst.games[4] = "Bitbucket 2 x 2 Mowqilio";
        sst.games[5] = "Powlif 3 x 2 Bitbucket";
        sst.games[6] = "Bitbucket 1 x 0 Bakapowho";
        sst.games[7] = "Choolsa 1 x 2 Bitbucket";
        sst.games[8] = "Bitbucket 3 x 0 Paraloppy ";
        sst.games[9] = "Gabbywol 1 x 0 Bitbucket";
        sst.games[10] = "Pahol 1 x 1 Bitbucket";
        sst.games[11] = "Bitbucket 2 x 0 Panatilows";
        sst.games[12] = "Hollo 0 x 0 Bitbucket";
        sst.games[13] = "Excheloh 1 x 0 Bitbucket";
        sst.games[14] = "Kalakazi 2 x 3 Bitbucket";
        
        int gs0, gs1, gs2, gs3, gs4, gs5, gs6, gs7, gs8, gs9, gs10, gs11, gs12, gs13, gs14, gs15;
        
        int gf0, gf1, gf2, gf3, gf4, gf5, gf6, gf7, gf8, gf9, gf10, gf11, gf12, gf13, gf14, gf15;
        
        int ca0,ca1,ca2,ca3,ca4,ca5,ca6,ca7,ca8,ca9,ca10,ca11,ca12,ca13,ca14,ca15;
        
        int cv0,cv1,cv2,cv3,cv4,cv5,cv6,cv7,cv8,cv9,cv10,cv11,cv12,cv13,cv14,cv15;
        
        int v0 ,v1 ,v2 ,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14,v15;
        
        int d0,d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15;
        
        int e0,e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15;
        
        gs0 = random.nextInt(64);
        gf0 = random.nextInt(64);
        gs1 = random.nextInt(64);
        gf1 = random.nextInt(64);
        gs2 = random.nextInt(64);
        gf2 = random.nextInt(64);
        gs3 = random.nextInt(64);
        gf3 = random.nextInt(64);
        gs4 = random.nextInt(64);
        gf4 = random.nextInt(64);
        gs5 = random.nextInt(64);
        gf5 = random.nextInt(64);
        gs6 = random.nextInt(64);
        gf6 = random.nextInt(64);
        gs7 = random.nextInt(64);
        gf7 = random.nextInt(64);
        gs8 = random.nextInt(64);
        gf8 = random.nextInt(64);
        gs9 = random.nextInt(64);
        gf9 = random.nextInt(64);
        gs10 = random.nextInt(64);
        gf10 = random.nextInt(64);
        gs11 = random.nextInt(64);
        gf11 = random.nextInt(64);
        gs12 = random.nextInt(64);
        gf12 = random.nextInt(64);
        gs13 = random.nextInt(64);
        gf13 = random.nextInt(64);
        gs14 = random.nextInt(64);
        gf14 = random.nextInt(64);
        gs15 = random.nextInt(64);
        gf15 = random.nextInt(64);
        ca0 = random.nextInt(80);
        cv0 = random.nextInt(32);
        ca1 = random.nextInt(80);
        cv1 = random.nextInt(32);
        ca2 = random.nextInt(80);
        cv2 = random.nextInt(32);
        ca3 = random.nextInt(80);
        cv3 = random.nextInt(32);
        ca4 = random.nextInt(80);
        cv4 = random.nextInt(32);
        ca5 = random.nextInt(80);
        cv5 = random.nextInt(32);
        ca6 = random.nextInt(80);
        cv6 = random.nextInt(32);
        ca7 = random.nextInt(80);
        cv7 = random.nextInt(32);
        ca8 = random.nextInt(80);
        cv8 = random.nextInt(32);
        ca9 = random.nextInt(80);
        cv9 = random.nextInt(32);
        ca10 = random.nextInt(80);
        cv10 = random.nextInt(32);
        ca11 = random.nextInt(80);
        cv11 = random.nextInt(32);
        ca12 = random.nextInt(80);
        cv12 = random.nextInt(32);
        ca13 = random.nextInt(80);
        cv13 = random.nextInt(32);
        ca14 = random.nextInt(80);
        cv14 = random.nextInt(32);
        ca15 = random.nextInt(80);
        cv15 = random.nextInt(32);
        d0 = random.nextInt(16);
        v0 = random.nextInt(16);
        e0 = random.nextInt(16);
        d1 = random.nextInt(16);
        e1 = random.nextInt(16);
        v1 = random.nextInt(16);
        d2 = random.nextInt(16);
        e2 = random.nextInt(16);
        v2 = random.nextInt(16);
        e3 = random.nextInt(16);
        d3 = random.nextInt(16);
        v3 = random.nextInt(16);
        d4 = random.nextInt(16);
        v4 = random.nextInt(16);
        e4 = random.nextInt(16);
        d5 = random.nextInt(16);
        v5 = random.nextInt(16);
        e5 = random.nextInt(16);
        d6 = random.nextInt(16);
        v6 = random.nextInt(16);
        e6 = random.nextInt(16);
        d7 = random.nextInt(16);
        v7 = random.nextInt(16);
        e7 = random.nextInt(16);
        d8 = random.nextInt(16);
        v8 = random.nextInt(16);
        e8 = random.nextInt(16);
        d9 = random.nextInt(16);
        v9 = random.nextInt(16);
        e9 = random.nextInt(16);
        d10 = random.nextInt(16);
        v10 = random.nextInt(16);
        e10 = random.nextInt(16);
        d11 = random.nextInt(16);
        v11 = random.nextInt(16);
        e11 = random.nextInt(16);
        d12 = random.nextInt(16);
        v12 = random.nextInt(16);
        e12 = random.nextInt(16);
        d13 = random.nextInt(16);
        v13 = random.nextInt(16);
        e13 = random.nextInt(16);
        d14 = random.nextInt(16);
        v14 = random.nextInt(16);
        e14 = random.nextInt(16);
        d15 = random.nextInt(16);
        v15 = random.nextInt(16);
        e15 = random.nextInt(16);
       
        escalation.teams[0].insertion("Kalakazi",gs0 , gf0, ca0, cv0, v0, d0, e0);
        escalation.teams[1].insertion("Origin",gs1 , gf1, ca1, cv1, v1, d1, e1);
        escalation.teams[2].insertion("Cabrid",gs2 , gf2, ca2, cv2, v2, d2, e2);
        escalation.teams[3].insertion("Chuchuq",gs3 , gf3, ca3, cv3, v3, d3, e3);
        escalation.teams[4].insertion("Nowin",gs4 , gf4, ca4, cv4, v4, d4, e4);
        escalation.teams[5].insertion("Powlif",gs5 , gf5, ca5, cv5, v5, d5, e5);
        escalation.teams[6].insertion("Choolsa",gs6 , gf6, ca6, cv6, v6, d6, e6);
        escalation.teams[7].insertion("Excheloh",gs7 , gf7, ca7, cv7, v7, d7, e7);
        escalation.teams[8].insertion("Hollo",gs8 , gf8, ca8, cv8, v8, d8, e8);
        escalation.teams[9].insertion("Bitbucket",gs9 , gf9, ca9, cv9, v9, d9, e9);
        escalation.teams[10].insertion("Panatilows",gs10 , gf10, ca10, cv10, v10, d10, e10);
        escalation.teams[11].insertion("Gabbywol",gs11 , gf11, ca11, cv11, v11, d11, e11);
        escalation.teams[12].insertion("Paraloppy",gs12 , gf12, ca12, cv12, v12, d12, e12);
        escalation.teams[13].insertion("Payol",gs13 , gf13, ca13, cv13, v13, d13, e13);
        escalation.teams[14].insertion("Mowqilio",gs14 , gf14, ca14, cv14, v14, d14, e14);
        escalation.teams[15].insertion("Bakapowho",gs15 , gf15, ca15, cv15, v15, d15, e15);
    }
    
}
