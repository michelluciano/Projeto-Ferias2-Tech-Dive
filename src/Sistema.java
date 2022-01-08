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
    Turma auxTurma = null;


    public static void main(String[] args) {
        // chama o menu principal do sistema
        Sistema s = new Sistema();
        s.menuPrincipal();
        s.popular();


    }

    private void popular() {
        //populando assunto
        Assuntos assunto1 = new Assuntos();
        //populando turma
        Turma turma1 = new Turma();
        turma1.setId(1);
        turma1.setNomeTurma("Turma 1");
        turma1.setQtdAlunos(10);
        turma1.setAssunto("Java");
        turma1.setDataInicio("22/12/2021");
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

    }


    // método que exibe o menu principal do sistema
    public int menuPrincipal(){
        System.out.println(docente);
        System.out.println(turma);

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
                    System.out.println(docente);// teste
                    break;
                case 3:
                    ///docenteTurma();
                    Turma temp; // serve para várias operações neste menu
                    String pesquisaAgencia; // serve para as pesquisas das turmas
                    Docente docenteAtual = null; // guarda o docente

                    // para gerenciar uma turma nós precisamos de um docente
                    while(docenteAtual == null){
                        System.out.print("\nInforme o id ou nome do docente: ");
                        String pesquisaDocente = input.nextLine();
                        // chamamos o método que pesquisa o docente
                        Docente d = pesquisarDocente(pesquisaDocente);
                        if(d == null){ // docente não encotrado
                            System.out.print("\nO docente não foi encontrado.\n\nDigite 1 para pesquisar novamente ou 2 para voltar ao menu anterior: ");
                            opcao = Integer.parseInt(input.nextLine());
                            if(opcao == 2){
                                break; // saímos daqui e voltamos para o menu anterior
                            }
                        }
                        else{
                            // encontrado.
                            docenteAtual = d;
                        }
                    }


                    while(true){ // mostra o menu de forma repetitiva até o usuário usar a opção de sair

                        System.out.println("\n:: G E R E N C I A R   T U R M A ::\n");
                        System.out.println("Docente selecionado: " + docenteAtual.getNomeDocecnte() + "\n");

                        System.out.println("Escolha a opção desejada");
                        System.out.println("1 - Nova Turma");
                        System.out.println("00 - Voltar Menu Anterior");
                        System.out.print("Sua opção: ");
                        opcao = Integer.parseInt(input.nextLine()); // lê a opção do usuário

                        switch(opcao){
                            case 1: // vamos cadastrar uma nova
                                System.out.print("\nDigite a descrição da turma: ");
                                nome = input.nextLine();
                                System.out.print("Digite a quantidade de alunos: ");
                                qtdAluno = input.nextInt();
                                System.out.print("Digite o assunto da matéria: ");
                                input.nextLine();
                                assunto = input.nextLine();
                                System.out.print("Digite A data de inicio das aulas: ");
                                data = input.nextLine();
                                formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                dataAjus = LocalDate.parse(data, formato);

                                // vamos incrementar o contador
                                Turma.contadorTurma++;

                                // agora vamos criar um novo objeto da classe Agencia
                                Turma t = new Turma(Turma.contadorTurma,nome,qtdAluno,assunto,data,docenteAtual);
                                // e o adicionamos no ArrayList
                                docenteAtual.getTurma().add(t);

                                // e finalmente mostramos uma mensagem de sucesso.
                                System.out.println("\nA Turma foi criada com sucesso");

                                break;
                            case 00:
                                return 0;

                        }
                    }

                case 4:
                    //listarTurma();
                    System.out.println("-------LISTA DE Turmas-------");
                    if (turma.isEmpty()) {
                        System.out.println("Não existem turmas cadastrados.");
                    } else {
                        for (int i = 0; i < turma.size(); i++) {
                            auxTurma = turma.get(i);
                            System.out.println("------------------------------------");
                            System.out.println(" - Id:               \t" + auxTurma.getId());
                            System.out.println(" - Nome:             \t" + auxTurma.getNomeTurma());
                            System.out.println(" - QUantidade Alunos:\t" + auxTurma.getQtdAlunos());
                            System.out.println(" - Assunto:          \t" + auxTurma.getAssunto());
                            System.out.println(" - Data:             \t" + auxTurma.getDataInicio());
                            System.out.println(" - Docente:          \t" + auxTurma.getDocente());

                        }
                    }
                    System.out.println("--------------------------------");
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
            }// fim primeiro switch
        }// FIM primeiro laço while
    }// FIM menu principal


    //metodo
    public Docente pesquisarDocente(String pesquisaDocente) {
        Docente d = null;

        // este existe?
        for(int i = 0; i < docente.size(); i++){
            // pesquisa pelo id
            if(Integer.toString(docente.get(i).getIdDocente()).equals(pesquisaDocente)){
                return docente.get(i);
            }
            // pesquisar por nome
            else if(docente.get(i).getNomeDocecnte().contains(pesquisaDocente)){
                return docente.get(i);
            }
        }
        return d;
    }


} // FIM SISTEMA





