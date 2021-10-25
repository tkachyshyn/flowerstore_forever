package flowerstore;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter @Setter
public class Store {
    public void search(FlowerPack pack){
        System.out.printf("Input flower type:");
        Scanner sc = new Scanner(System.in);
        String flowername = sc.nextLine();

        System.out.printf("Input color (in decimal):");
        sc = new Scanner(System.in);
        String flowercolor = sc.nextLine();

        System.out.printf("Input amount:");
        sc = new Scanner(System.in);
        String flowernum = sc.nextLine();
        int intflowernum = Integer.valueOf(flowernum);

        pack.amount = intflowernum;
        Flower flower = new Flower();

//        FlowerPack flower = new FlowerPack();
        flowername.toLowerCase();
        if(flowername.contentEquals("tulip")){
            flower = new Flower(Flowertype.TULIP);

            flower.price = 10;
        }
        else if(flowername.contentEquals("rose")){
            flower = new Flower(Flowertype.ROSE);
            flower.price = 20;
        }
        else if(flowername.contentEquals("chamomile")){
            flower = new Flower(Flowertype.CHAMOMILE);
            flower.price = 30;
        }
        else{
            flower = null;
        }
        pack.flower = flower;
        int index = 0;
        int[] intcolor = new int[3];
        String[] color = flowercolor.split(" ");
        for(int i = 0; i < 3; ++i){
            intcolor[i] = Integer.valueOf(color[i]);
        }
    }
}
