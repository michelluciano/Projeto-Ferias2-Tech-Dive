import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Sistema {
    public static ArrayList<Turma> turma = new ArrayList<>();
    public static ArrayList<Docente> docente = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    Docente auxDocente = null;


    public static void main(String[] args) {
        // chama o menu principal do sistema
        Sistema s = new Sistema();
        s.menuPrincipal();
        //populando assunto
        Assuntos assunto1 = new Assuntos();
        //populando turma
        Turma turma1 = new Turma(1,"Turma 1",10,"Java","23/11/2015");
        turma.add(turma1);
        Turma turma2 = new Turma(2,"Turma 2",20,"HTML","23/11/2014");
        turma.add(turma2);
        Turma turma3 = new Turma(3,"Turma 3",30,"CSS","23/11/2016");
        turma.add(turma3);
        System.out.println(turma);
        //populando docente
        Docente docente1 = new Docente(1,"Marcos");
        docente.add(docente1);
        Docente docente2 = new Docente(2,"Michel");
        docente.add(docente2);
        Docente docente3 = new Docente(3,"Luciano");
        docente.add(docente3);

        System.out.println(docente);
    }

    // método que exibe o menu principal do sistema
    public void menuPrincipal(){
        while(true){

            System.out.println("\n::       T E C H  D I V E        ::\n");
            System.out.println("\n:: S I S T E M A   D O C E N T E ::\n");
            System.out.println("Bem-vindo(a) ao sistema. Escolha a opção desejada");
            System.out.println("1 - Cadastrar Turma");
            System.out.println("2 - Cadastrar Docente");
            System.out.println("3 - Definir docentes para uma determinada turma");
            System.out.println("4 - Listar turmas com seus respectivos assuntos, docentes e semanas");
            System.out.println("5 - Listar todos os docentes");
            System.out.println("6 - Listar um docente e suas semanas de aula já definidas");
            System.out.println("7 - Sair");
            System.out.print("Sua opção: ");
            int opcao = Integer.parseInt(input.nextLine()); // lê a opção do usuário

            switch(opcao){
                case 1:
                    System.out.print("\nDigite a descrição da turma: ");
                    String nome = input.nextLine();
                    System.out.print("Digite a quantidade de alunos: ");
                    int qtdAluno = input.nextInt();
                    System.out.print("Digite o assunto da matéria: ");
                    input.nextLine();
                    String assunto = input.nextLine();
                    System.out.print("Digite A data de inicio das aulas: ");
                    String data = input.nextLine();
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate dataAjus = LocalDate.parse(data, formato);

                    Turma.contadorTurma++; //incrementar o contador
                    Turma tur = new Turma(Turma.contadorTurma,nome,qtdAluno,assunto,data);
                    turma.add(tur); //adiciona no ArrayList
                    // e finalmente mostramos uma mensagem de sucesso.
                    System.out.println("\nTurma cadastrada com sucesso!");
                    System.out.println(turma);// teste
                    break;
                case 2:
                    System.out.print("\nDigite o nome do Docente: ");
                    String nomeDoc = input.nextLine();

                    Docente.contadorDocente++; //incrementar o contador
                    Docente doc = new Docente(Docente.contadorDocente,nomeDoc);
                    docente.add(doc); //adiciona no ArrayList
                    // e finalmente mostramos uma mensagem de sucesso.
                    System.out.println("\nTurma cadastrada com sucesso!");
                    System.out.println(turma);// teste
                    break;
                case 3:
                    ///docenteTurma(); // chama o menu do cliente
                    break;
                case 4:
                    //listarTurma(); // chama o menu do cliente
                    break;
                case 5:
                    // listar todos
                    System.out.println("-------LISTA DE DOCENTES-------");
                    if (docente.isEmpty()) {
                        System.out.println("Não existem docentes cadastrados.");
                    } else {
                        for (int i = 0; i < docente.size(); i++) {
                            auxDocente = docente.get(i);
                            System.out.println("------------------------------------");
                            System.out.println(" - Id:               \t" + auxDocente.getIdDocente());
                            System.out.println(" - Nome:             \t" + auxDocente.getNomeDocecnte());
                            System.out.println(" - Turma:            \t" + auxDocente.getTurmaDocente());
                        }
                    }
                    System.out.println("--------------------------------");
                    break;
                case 6:
                    //docenteAula(); // chama o menu do cliente
                    break;
                case 7:
                    System.out.println("\nObrigado por usar o Sistema\n");
                    System.exit(0);
            }
        }
    }


}
