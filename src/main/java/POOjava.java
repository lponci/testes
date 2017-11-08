import java.util.Scanner;

public class POOjava {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BICs", "BLACKs", 0.9f);
        Scanner input = new Scanner(System.in);
        String rabisco, isTamp;

        c1.status();
        if (c1.getTampa() == "Sim") {
            System.out.println("Gostaria de destampar para rabiscar? \n S ou N");
            isTamp = input.next();
            if ((isTamp.equals("")) || ("S".equalsIgnoreCase(isTamp))) {
                c1.destampar();
                System.out.println("Destampada.... Gostaria de Rabiscar? \n S ou N");
                rabisco = input.next();
                if ("S".equalsIgnoreCase(rabisco)) {
                    c1.rabiscar();
                    int cargaAtual = c1.getCarga();
                    System.out.print("Carga atual " + cargaAtual + "%");
                } else if ("N".equalsIgnoreCase(rabisco)) {
                    System.out.println("Entao... MORRE DEACHO!!!");
                }
            } else if ("N".equalsIgnoreCase(isTamp)) {
                System.out.println("Entao... MORRE DEACHO!!!");
            }
        }
    }
}

