class Aluno {

  String nome;
  int matricula;
  Curso curso;

  void exibirRelatorio(){
     String nome = "Nome: " + nome + "Curso: " + curso;
    return Relatorio;
  }
  Aluno(String n, int matricular, Curso disciplina){
    System.out.println("Construtor do aluno");
    nome = n;
    matricula = matricular;
    Curso = disciplina;
  }
}