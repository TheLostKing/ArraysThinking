package com.example;

public class MangaCollection {
    public static void main(String[] args)
    {
        String[] favoriteMangaSeries = {"Rosario to Vampire", "Taiyou no Ie", "To Love Ru", "Good Ending", "Mirai Nikki",
                "Elfin Leid", "Sora no Otishimono", "The World God Only Knows", "Yamada-kun 7-Ni No Majo"};
        String[] physciallyOwnedMangaSeries = {"Rosario to Vampire", "Witch Hunter", "Yamada-kun 7-Ni No Majo", "World Trigger", "Kagerou Daze",
        "Durarara", "Log Horizon"};
        int amountOwnedAndInFavorites = 0;

        for(int x = 0; x < favoriteMangaSeries.length; x++)
        {
            for(int y = 0; y < physciallyOwnedMangaSeries.length; y++)
            {
                if(favoriteMangaSeries[x].equalsIgnoreCase(physciallyOwnedMangaSeries[y]))
                {
                    amountOwnedAndInFavorites++;
                }
            }
        }

        System.out.println("My favorites list is a top " + favoriteMangaSeries.length + " list");
        System.out.println("I physically own " + physciallyOwnedMangaSeries.length + " manga series");
        System.out.println("I physically own " + amountOwnedAndInFavorites + " of my favorite series");


    }
}
