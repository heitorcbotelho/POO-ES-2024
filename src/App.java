import java.util.Scanner;

public class App {
    
    static Turma[] turmas = new Turma[10];
    static int quantidadeTurma = 0;
    static int quantidadeEstudantes = 0;
    static Scanner scanner = new Scanner(System.in);

    static Campus[] campi = new Campus[10];
    static int quantidadeCampus = 0;

    static Curso[] cursos = new Curso[10];
    static int quantidadeCurso = 0;
    public static void main(String[] args) throws Exception {
        int opcao = 0;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            roteador(opcao);
        } while (opcao != 0);
    }

    public static void roteador(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarTurma();
                break;
            case 2:
                cadastrarCampus();
                break;
            case 3:
                cadastrarCurso();
                break;
            case 4:
                //fazer cadastro de estudante
                break;
            case 5:
                //fazer cadastro de matricula
                break;    
            case 6:
                gerarRelatorio();
                break;
            default:
                if (opcao != 0) {
                    System.out.println("Opção inválida");
                }
                break;
        }
    }

    public static void gerarRelatorio() {
        for (int i = 0; i < quantidadeTurma; i++) {
            System.out.println("Nome turma: "+ turmas[i].nome);
            System.out.println("Numero minimo: "+ turmas[i].numeroMinimo);
            System.out.println("Ano de ingresso: "+ turmas[i].anoIngresso);
            System.out.println("===================================");
            System.out.println("Nome do campus: " + campi[i].nome);
            System.out.println("Endereço do campus" + campi[i].endereco);
            System.out.println("Cidade do campus: "+ campi[i].cidade);
            System.out.println("===================================");
            System.out.println("Nome do curso: " + cursos[i].nome);
            System.out.println("Duração do curso: " + cursos[i].duracao);
            System.out.println("Modalidade do curso: "+ cursos[i].modalidade);
    }

        public static void cadastrarCurso() {
            scanner.nextLine();
            Curso curso = new Curso();
            System.out.println("Digite o nome do curso: ");
            curso.nome = scanner.nextLine();
            System.out.println("Digite a duração do curso: ");
            curso.duracao = scanner.nextLine();
            System.out.println("Digite a modalidade do curso: ");
            curso.modalidade = scanner.nextLine();
            cursos[quantidadeCurso] = curso;
            quantidadeCurso++;
    }

    
    public static void cadastrarCampus() {
        scanner.nextLine();
        Campus campo = new Campus();
        System.out.println("Digite o nome do campus: ");
        campo.nome = scanner.nextLine();
        System.out.println("Digite o endereço do campus: ");
        campo.endereco = scanner.nextLine();
        System.out.println("Digite a cidade do campus: ");
        campo.cidade = scanner.nextLine();
        campi[quantidadeCampus] = campo;
        quantidadeCampus++;
    }

    public static void cadastrarTurma() {
        scanner.nextLine();//apaga o enter (\n)
        Turma turma = new Turma();
        System.out.println("Digite o nome da turma: ");
        turma.nome = scanner.nextLine();
        System.out.println("Digite a numero minimo de alunos: ");
        turma.numeroMinimo = scanner.nextInt();
        System.out.println("Digite o ano de ingresso: ");
        turma.anoIngresso = scanner.nextInt();
        turmas[quantidadeTurma] = turma;
        quantidadeTurma++;
    }

    public static void exibirMenu() {
        System.out.println("============================");
        System.out.println("[1] Cadastro de turma: ");
        System.out.println("[2] Cadastro de campus: ");
        System.out.println("[3] Cadastro de curso: ");
        System.out.println("[4] Cadastro de estudante: ");
        System.out.println("[5] Cadastro de matricula: ");
        System.out.println("[6] Exibir tudo: ");
        System.out.println("[0] Sair: ");
        System.out.println("============================");
    }
}
