public class Opgave1_11b {


    /*
    (Population projection) The U.S. Census Bureau projects population based on the
following assumptions:
■■ One birth every 7 seconds
■■ One death every 13 seconds
■■ One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. Assume that
the current population is 312,032,486, and one year has 365 days.
     */


    public static void main(String[] args) {

        System.out.println("Current population: 312032486");
        System.out.println("Yearly Population projection formula: ");
        System.out.println("Current population + ((births per year)");
        System.out.println("Current population - (deaths per year)");
        System.out.println("Current population + (new immigrants per year))");
        System.out.println("Current population * year.");
        System.out.println("Year 1: ");
        System.out.println(312032486 + (((312032486 / 7)
                - (312032486 / 13)
                + (312032486 / 45))));
        System.out.println("Year 2: ");
        System.out.println(312032486 + (((312032486 / 7)
                - (312032486 / 13)
                + (312032486 / 45)))* 2);
        System.out.println("Year 3: ");
        System.out.println(312032486 + (((312032486 / 7)
                - (312032486 / 13)
                + (312032486 / 45)))* 3);
        System.out.println("Year 4: ");
        System.out.println(312032486 + (((312032486 / 7)
                - (312032486 / 13)
                + (312032486 / 45)))* 4);
        System.out.println("Year 5: ");
        System.out.println(312032486 + (((312032486 / 7)
                - (312032486 / 13)
                + (312032486 / 45)))* 5);

    }
}
