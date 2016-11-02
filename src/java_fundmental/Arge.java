
package java_fundmental;

public class Arge {

    /*
     * In a small town the population is p0 = 1000 at the beginning of a year. The population regularly increases by 2
     * percent per year and moreover 50 new inhabitants per year come to live in the town. How many years does the town
     * need to see its population greater or equal to p = 1200 inhabitants?
     * At the end of the first year there will be:
     * 1000 + 1000 * 0.02 + 50 => 1070 inhabitants
     * At the end of the 2nd year there will be:
     * 1070 + 1070 * 0.02 + 50 => 1141 inhabitants (number of inhabitants is an integer)
     * At the end of the 3rd year there will be:
     * 1141 + 1141 * 0.02 + 50 => 1213
     * It will need 3 entire years.
     * More generally given parameters:
     * p0, percent, aug (inhabitants coming or leaving each year), p (population to surpass)
     * the function nb_year should return n number of entire years needed to get a population greater or equal to p.
     * aug is an integer (> 0), percent a positive or null floating number, p0 and p are positive integers (> 0)
     * Examples:
     * nb_year(1500, 5, 100, 5000) -> 15
     * nb_year(1500000, 2.5, 10000, 2000000) -> 10
     */

    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code

        double nowpopul = p0;

        for (int year = 1;; year++) {

            double popul = nowpopul + (nowpopul * percent / 100) + aug;

            if (popul > p) {
                return year;
            }

            nowpopul = popul;
        }
    }

    /*
     * int year = 0;
     * double pop = p0;
     * for (;pop < p; year++) pop = pop + pop * (percent/100.0) + aug;
     * return year;
     */

    public static void main(String[] args) {
        System.out.println(Arge.nbYear(1500, 5, 100, 5000));
    }
}
