public class ProcessarBoletos {
    private LeituraRetorno leituraRetorno;

    //public static ProcessarBoletos newBancoBrasil(){
    //    return new ProcessarBoletos(new LeituraRetornoBrasil());
    //}

    //public static ProcessarBoletos newBradesco(){
    //    return new ProcessarBoletos(new LeituraRetornoBradesco());
    //}

    public ProcessarBoletos(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public void processar(String nomeArquivo){
        leituraRetorno.lerArquivo(nomeArquivo);
    }
}
