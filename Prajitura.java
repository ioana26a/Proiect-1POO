public class Prajitura {
        private String nume;
        private int pret;
        public Prajitura(){

        }

        public void setNume(String nume) {
                this.nume = nume;
        }

        public void setPret(int pret) {
                this.pret = pret;
        }

        public String getNume() {
                return nume;
        }

        public String toString(){
                return "Prajitura " + nume + " costa " + pret + " lei.";
        }
}
