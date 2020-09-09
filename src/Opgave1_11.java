public class Opgave1_11 {

    public static void main(String[] args) {

            int day = 31536000;
            int births = 7;
            int deaths = 13;
            int immigrant = 45;
            int years = 0;
            int population = 312032486;

            while (years != 5){
                population = (day / births) + population;
                population = population - (day / deaths);
                population = (day / immigrant) + population;
                years++;
                System.out.println("år " + years + " " + population);
            }
        }
}
