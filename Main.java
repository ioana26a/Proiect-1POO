import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int meniu,oraDes,oraInch;
        Scanner sc=new Scanner(System.in);
        String numeCautat,nume;
        Cofetarie cof=null;

        Calendar cal = Calendar.getInstance();
        int ora = cal.get(Calendar.HOUR_OF_DAY);

        do{
            System.out.println("\n1.Creare cofetarie");
            System.out.println("2.Actualizare cofetarie");
            System.out.println("3.Verificare program cofetarie");
            System.out.println("4.Initializare meniu cofetarie");
            System.out.println("5.Vizualizare meniu cofetarie");
            System.out.println("6.Adaugare prajitura");
            System.out.println("7.Actualizare prajitura");
            System.out.println("0.Iesire\n");
            System.out.print("Optiune:");
            meniu=sc.nextInt();
            switch (meniu) {
                case 1:
                    System.out.print("Introduceti nume cofetarie:");
                    nume= sc.next().concat(sc.nextLine());              //Pt a putea citi mai mult de un cuvant
                    System.out.print("Introduceti ora de deschidere:");
                    oraDes= sc.nextInt();
                    System.out.print("Introduceti ora de inchidere:");
                    oraInch= sc.nextInt();
                    cof = new Cofetarie(nume,oraDes,oraInch);
                    System.out.println(cof.toString());
                    break;
                case 2:
                    if(cof==null)
                        System.out.println("Nu exista cofetaria");
                    else {
                        cof.actualizareCofetarie();
                        System.out.println(cof.toString());
                    }
                    break;
                case 3:
                    if(cof==null)
                        System.out.println("Nu exista cofetaria");
                    else {
                        if(cof.verificareProgram(ora))
                            System.out.println("Cofetaria este deschisa");
                        else
                            System.out.println("Cofetaria este inchisa");
                    }
                    break;
                case 4:
                    if(cof==null)
                        System.out.println("Nu exista cofetaria");
                    else
                        cof.initializareMeniu();
                    break;
                case 5:
                    if(cof==null)
                        System.out.println("Nu exista cofetaria");
                    else {
                        cof.vizualizareMeniu();
                    }
                    break;
                case 6:
                    if(cof==null)
                        System.out.println("Nu exista cofetaria");
                    else
                        cof.adaugarePrajitura();
                    break;
                case 7:
                    if(cof==null)
                    System.out.println("Nu exista cofetaria");
                    else {
                        System.out.print("Cautati nume prajitura:");
                        numeCautat= sc.next();
                        cof.cautarePrajitura(numeCautat);
                    }
                    break;
                default:
                    break;
            }
        }
        while (meniu!=0);
    }
}
