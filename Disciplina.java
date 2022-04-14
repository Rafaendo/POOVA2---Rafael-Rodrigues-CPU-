class Disciplina {

  String nome;
  Professor professor;
  float notaFinal;

  void exibirRelatorioDisc(){
     String nome = "Nome: " + nome + "Professor: " + professor + "Nota Final: " + notaFinal;
  }
   float retornarNotaFinal(){
     return notaFinal;
     
   }
}