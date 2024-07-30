import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Cliente {
    private String nome;
    private LocalDate dataNascimento;

    public Cliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        this.nome = scanner.nextLine();

        System.out.println("Digite a data de nascimento do cliente (dd/MM/yyyy): ");
        String dataNascimentoStr = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);

    }


    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public int getIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();

    }


}