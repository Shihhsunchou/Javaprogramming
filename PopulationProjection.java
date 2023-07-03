public class PopulationProjection {
       public static void main(String[] args) {
        int currentPopulation = 312032486;
        int secondsPerYear = 365 * 24 * 60 * 60;
        
        int birthsPerYear = secondsPerYear / 7;
        int deathsPerYear = secondsPerYear / 13;
        int immigrantsPerYear = secondsPerYear / 45;
        
        int population = currentPopulation;
        
        // Calculate and display the population for each of the next five years
        for (int year = 1; year <= 5; year++) {
            population += birthsPerYear + immigrantsPerYear - deathsPerYear;
            System.out.println("Year " + year + " population: " + population);
        }
    }
}
