import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Boleto {
    @Setter @Getter
    private int id;

    @Setter @Getter
    private String codBanco;

    @Setter @Getter
    private LocalDate dataVencimento;

    @Setter @Getter
    private LocalDateTime dataPagamento;

    @Setter @Getter
    private String cpfCLiente;

    @Setter @Getter
    private double valor;

    @Setter @Getter
    private double multa;

    @Setter @Getter
    private double juros;

    @Setter @Getter
    private String agencia;

    @Setter @Getter
    private String contaBancaria;

    @Override
    public String toString() {
        return "Boleto{" +
                "id=" + id +
                ", codBanco='" + codBanco + '\'' +
                ", dataVencimento=" + dataVencimento +
                ", dataPagamento=" + dataPagamento +
                ", cpfCLiente='" + cpfCLiente + '\'' +
                ", valor=" + valor +
                ", multa=" + multa +
                ", juros=" + juros +
                ", agencia='" + agencia + '\'' +
                ", contaBancaria='" + contaBancaria + '\'' +
                '}';
    }
}
