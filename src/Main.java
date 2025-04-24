import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //initialisation
        int nbrSecret = 0;
        int nbr = 0;
        boolean flag = true;

        //Début du programme
        System.out.println("génération du nombre secret");
        nbrSecret = (int)(Math.random() * 100);
        System.out.println("Code secret généré !");
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            System.out.print("Votre nombre secret: ");
            nbr= scanner.nextInt();
            if (nbrSecret < nbr) {
                flag = true;
                System.out.println("Trop grand !");
            }
            else if (nbrSecret > nbr) {
                flag = true;
                System.out.println("Trop petit !");
            }

            else {
                flag = false;
                System.out.println("Bien joué !");
                scanner.close();
                break;

            }
        }

    }
}