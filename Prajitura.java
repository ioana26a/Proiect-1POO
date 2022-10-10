import java.util.Scanner;

public class Prajitura {                        //Clasa este folosita pentru a crea meniul cofetariei
        private String nume;
        private int pret;
        public Prajitura(String nume,int pret){
                this.nume=nume;
                this.pret=pret;
        }
        public String getNume() {
                return nume;
        }
        public void setNume(String nume) {
                this.nume = nume;
        }

        public void setPret(int pret) {
                this.pret = pret;
        }

        public String toString(){
                return "Prajitura " + nume + " costa " + pret + " lei.";
        }

        public void actualizarePrajitura(){           //Actualizeaza numele si/sau pretul unei prajituri din meniul cofetariei
                int opt=-1;
                Scanner sc=new Scanner(System.in);
                while(opt!=0){
                        System.out.println("1.Actualizare nume prajitura");
                        System.out.println("2.Actualizare pret prajitura");
                        System.out.println("0.Iesire");
                        System.out.print("Alegeti o optiune ");
                        opt=sc.nextInt();
                        if(opt==1){
                                System.out.print("Introduceti nume ");
                                nume=sc.next();
                        } else if (opt==2) {
                                System.out.print("Introduceti pret ");
                                pret= sc.nextInt();
                        }
                        else return;
                }
        }
}
