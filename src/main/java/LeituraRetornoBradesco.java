import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LeituraRetornoBradesco implements LeituraRetorno {
    @Override
    public List<Boleto> lerArquivo(String nomeArquivo) {
        System.out.println("Lendo bradesco " + nomeArquivo);
        try (var reader = Files.newBufferedReader(Paths.get(nomeArquivo))) {
            String linha;
            var listBoleto = new ArrayList<Boleto>();
            while ((linha = reader.readLine()) != null) {
                var vetor = linha.split(";");
                var boleto = new Boleto();
                boleto.setId(Integer.parseInt(vetor[0]));
                boleto.setCodBanco(vetor[1]);
                boleto.setAgencia(String.format("%06d", Integer.parseInt(vetor[2])));
                boleto.setContaBancaria(String.format("%09d", Integer.parseInt(vetor[2])));
                boleto.setDataVencimento(LocalDate.parse(vetor[4], FORMATO_DATA));
                boleto.setDataPagamento(LocalDateTime.parse(vetor[5], FORMATO_DATA_HORA));
                boleto.setCpfCLiente(vetor[6].substring(0, 3) + "." + vetor[6].substring(3, 6) + "."
                        + vetor[6].substring(6, 9) + "-" + vetor[6].substring(9, 11));
                boleto.setValor(Double.parseDouble(vetor[7]));
                boleto.setMulta(Double.parseDouble(vetor[8]));

                boleto.setJuros(Double.parseDouble(vetor[9]));
                listBoleto.add(boleto);
                System.out.println(boleto);
            }
            return listBoleto;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
