import java.util.Scanner;
public class WhatToWear {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("What's the average temperature today?");
        int temperature = sc1.nextInt();

        System.out.println("Is it rainy, snowy, cloudy or sunny?");
        String weather = sc2.nextLine();


        if (weather.equals("rainy") || weather.equals("snowy") || temperature < 15){
            System.out.println("Take a coat!");
        } else if (temperature > 22 && weather.equals("sunny")) {
            System.out.println("Take sunglasses and suncream");
        } else if (weather.equals("sunny")){
            System.out.println("Take sunglasses but no coat");
        } else {
            System.out.println("Take an extra layer");
        }
    }
}
