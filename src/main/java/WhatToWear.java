import java.util.Scanner;
public class WhatToWear {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("What's the average temperature today?");
        int temperature = sc1.nextInt();

        System.out.println("Is it rainy, snowy, cloudy or sunny?");
        String weather = sc2.nextLine();

//      if sunny take sunglasses
        String result = weather.equals("sunny") ? "take sunglasses!" : "no need for sunglasses!";

//      if rainy, snowy or <15 take a coat
        if (weather.equals("rainy") || weather.equals("snowy") || temperature < 15){
            System.out.println("Take a coat and "+result);
//      if sunny and >22 take suncream
        } else if (temperature > 22 && weather.equals("sunny")) {
            System.out.println("Take suncream and "+result);
        } else {
            System.out.println("Take an extra layer and "+result);
        }

    }
}
