
public class Main {
  public static void main(String[] args) {
    MonoTarefa tarefa = new MonoTarefa();
    MinhaThread thread = new MinhaThread();
    
    tarefa.run();
    thread.run();
  }
}
