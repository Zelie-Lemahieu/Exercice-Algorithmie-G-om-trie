
public class Main {
    public static void main(String[] args) {
        System.out.println(aireTriangle(5, 4));
        System.out.println(findHypotenus(5, 4));
        int[] tab = new int[]{1, 8, 4, 2};
        System.out.println(findMax(tab));
        System.out.println(somme(tab));
        System.out.println(moyenne(tab));

    }

    public static int aireTriangle(int base, int hauteur) {
        return (base * hauteur) / 2;
    }

    public static double findHypotenus(int cote1, int cote2) {
        return Math.sqrt((cote1 * cote1) + (cote2 * cote2));
    }

    public static int findMax(int[] t) {
        int max = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
            }
        }
        return max;

    }
    public static int somme (int [] t) {
        int somme = 0;
        for (int i =0; i < t.length; i++){
            somme += t[i];
        }
       return somme;
    }
    public static double moyenne(int[]t){
        return somme (t)/t.length;
    }
}