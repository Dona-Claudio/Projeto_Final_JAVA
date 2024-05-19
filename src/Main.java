import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dono> donos = new ArrayList<>();
        ArrayList<Animal> animais = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);


        int opc;

        do {

            System.out.println("digite {1} para cadastrar cliente");
            System.out.println("digite {2} para consultar todos os clientes");
            System.out.println("digite {3} para cadastrar Animais");
            System.out.println("digite {4} para consultar todos os animais");
            System.out.println("digite {5} para consultar vacinas por tipo de animal");
            System.out.println("digite {6} para consultar todos as vacinas");
            opc = scanner.nextInt();
            scanner.nextLine(); // limpa buffer
            switch (opc){
                case 1:
                    System.out.println("digitou 1");

                    System.out.println("digite o código do dono");
                    BigInteger rg_ = scanner.nextBigInteger();
                    System.out.println("digite o cpf fo dono");
                    int cpf_ = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("digite o nome do dono");
                    String nomeDono_ = scanner.nextLine();
                    System.out.println("digite a idade do dono");
                    int idadeDono_ = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("digite o endereço do dono");
                    String enderecoDono_ = scanner.nextLine();
                    System.out.println("qual o plano do dono");
                    int planoDono_ = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("digite o código do animal 1");
                    BigInteger codigoAnimal1 = scanner.nextBigInteger();
                    scanner.nextLine();
                    System.out.println("digite o código do animal 2");
                    BigInteger codigoAnimal2 = scanner.nextBigInteger();
                    scanner.nextLine();
                    System.out.println("digite o código do animal 3");
                    BigInteger codigoAnimal3 = scanner.nextBigInteger();
                    scanner.nextLine();

                    donos.add(new Dono(rg_, cpf_, nomeDono_, idadeDono_, enderecoDono_, planoDono_, codigoAnimal1, codigoAnimal2, codigoAnimal3));

                    System.out.println();
                    break;

                case 2:
                    System.out.println("digitou 2");
                    for(Dono dono : donos){
                        dono.mostrarDados();
                    }
                    System.out.println();
                    break;
            }
        }while (opc != 0);


        //donos.mostrarDados();

    }
}