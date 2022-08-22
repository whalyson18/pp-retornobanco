public class Principal {
    public static void main(String[] args) {
        ProcessarBoletos processarBoletos = new ProcessarBoletos(new LeituraRetornoBrasil());
        //ProcessarBoletos processarBoletos = ProcessarBoletos.newBancoBrasil();
        processarBoletos.processar("banco-brasil-1.csv");

        processarBoletos = new ProcessarBoletos(new LeituraRetornoBradesco());
        processarBoletos.processar("bradesco-1.csv");
    }
}
