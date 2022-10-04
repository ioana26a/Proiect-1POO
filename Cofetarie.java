import java.util.ArrayList;
import java.util.Scanner;

public class Cofetarie {
        private String nume;
        private int oraInchidere;
        private int oraDeschidere;

        ArrayList<Prajitura> meniuCofetarie = new ArrayList<>();

        Scanner sc=new Scanner(System.in);

        public Cofetarie(String nume,int oraDeschidere,int oraInchidere){  //Initializeaza starea obiectului
                this.nume=nume;
                this.oraDeschidere=oraDeschidere;
                this.oraInchidere=oraInchidere;
        }

        @Override
        public String toString() {
                return "Cofetaria " + nume + " este deschisa in intervalul orar " + oraDeschidere + ":00-" + oraInchidere + ":00.";
        }

        public boolean verificareProgram(int n){
                return (n>=oraDeschidere&&n<=oraInchidere);
        } //Verifica daca cofetaria este deshisa/inchisa

        public void initializareMeniu(){                //creeaza un meniu initial dupa ce a fost creat obiectul cofetarie
                Scanner sc=new Scanner(System.in);
                System.out.print("Introduceti numarul de prajituri ");
                int n=sc.nextInt();
                for(int i=0;i<n;i++){
                        adaugarePrajitura();
                }
        }
        public void vizualizareMeniu(){                 //parcurge meniul cofetariei. afiseaza numele si pretul fiecarei prajituri
                System.out.println("------------Meniu " + nume + "------------");
                for(Prajitura p:meniuCofetarie)
                        System.out.println(p.toString());
        }
        public void actualizareCofetarie(){               //Actualizeaza numele si/sau programul cofetariei
                int opt=-1;
                while(opt!=0){
                        System.out.println("\n1.Actualizare nume ");
                        System.out.println("2.Actualizare program");
                        System.out.println("0.Iesire\n");
                        System.out.print("Alegeti o optiune ");
                        opt=sc.nextInt();
                        if(opt==1){
                                System.out.print("Scrieti nume ");
                                String numeNou= sc.next();
                                nume=numeNou;
                        } else if (opt==2) {
                                System.out.print("Introduceti ora de deschidere ");
                                int oraDes= sc.nextInt();
                                System.out.print("Introduceti ora de inchidere ");
                                int oraInch= sc.nextInt();
                                oraDeschidere=oraDes;
                                oraInchidere=oraInch;

                        }
                        else return;
                }
        }
        public void adaugarePrajitura(){                        //Creeaza un obiect prajitura
                Prajitura p=new Prajitura();
                meniuCofetarie.add(p);
                System.out.print("Introduceti nume prajitura ");
                p.setNume(sc.next());
                System.out.print("Introduceti pret prajitura ");
                p.setPret(sc.nextInt());

        }
        public void cautarePrajitura(String numeCautat) {        //Cauta o prajitura dupa nume dupa care o actualizeaza
                for (Prajitura p : meniuCofetarie) {
                        if (p.getNume().equals(numeCautat))
                                p.actualizarePrajitura();
                        else return;
                }
        }


}
