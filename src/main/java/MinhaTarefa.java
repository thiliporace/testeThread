
public class MinhaTarefa {
  
  private String tarefa;
  private String tipo;
  
  public MinhaTarefa(String tarefa, String tipo) {
    this.tarefa = tarefa;
    this.tipo = tipo;
  }

  public void run() {
    System.out.println();
    System.out.println("Executando a tarefa: " + tarefa);
    System.out.println("Tipo de tarefa: " + tipo);
    System.out.println();
  }

  
}
