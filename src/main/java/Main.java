package flowerstore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FlowerPack pack = new FlowerPack();
        Store store = new Store();
        FlowerBucket bucket = new FlowerBucket();
        store.search(pack);
        int total = 0;

        if(pack == null){
            System.out.println("There are no such flowers. Would you like to try again? (Y/n):");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            input.toLowerCase();
            if (input.equals("n")) return;
        }
        else{
            bucket.flowerPacks.add(pack);
            total += pack.getPrice();
            System.out.printf("Total price:" + total);
        }
        System.out.printf("Do you want to continue search? (Y/n):");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input.toLowerCase();

        while(input.equals("y")){
            store.search(pack);
            bucket.flowerPacks.add(pack);
            total += pack.getPrice();
            System.out.printf("Total price:" + total);
            System.out.printf("Do you want to continue search? (Y/n):");
            sc = new Scanner(System.in);
            input = sc.nextLine();
        }
        System.out.printf("Total price:" + total);

    }
}
