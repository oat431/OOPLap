package app;

import java.io.FileNotFoundException;

public class Regitration{
    private semester[] sem = new semester[3];
    private String[][] data1 ={{"1,001101,FUBDAMENTAL ENGLISH 1,3.00,B"}
                               ,{"2,206113,CAL FOR SOFTWARE ENGINEERING,3.00,B+"}
                               ,{"3,751100,ECONOMICS FOR EVERYDAY LIFE,3.00,D+"}
                               ,{"4,951100,MODERN LIFE AND ANIMATION,3.00,A"}
                               ,{"5,953103,PROGRAMMING LOGICAL THINKING,2.00,A"}
                               ,{"6,953211,COMPUTER ORGANIZATION,3.00,C+"}
                            };
    private String[][] data2 ={{}};
    private STring[][] data3 ={{}};

    public Regitration() throws FileNotFoundException{
        System.out.println();
        sem[0] = new semester(6,data1[0]);
        System.out.println("=============================");
        sem[1] = new semester(7);
        System.out.println("=============================");
        sem[2] = new semester(7);
    }
}