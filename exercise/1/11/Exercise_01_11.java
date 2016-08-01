public class Exercise_01_11 {
   public static void main(String[] agrs) {
      int years = 0, secondsOfYear, people = 312032486;
      secondsOfYear = 365 * 24 * 60 * 60;
      for (int i = 1; i <= (secondsOfYear * 5); i++) {
         if ((i % 7) == 0)
            people = people + 1;
         if ((i % 13) == 0)
            people = people - 1;
         if ((i % 45) == 0)
            people = people + 1;
         if ((i % secondsOfYear) == 0) {
            years = years + 1;
            System.out.println(years + " Years later, The population is " + people);
         }
      }      
   }
}