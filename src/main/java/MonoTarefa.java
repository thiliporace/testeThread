public class MonoTarefa {

  MinhaTarefa tarefa1 = new MinhaTarefa("Listar", "Produtos");
  MinhaTarefa tarefa2 = new MinhaTarefa("Atualizar", "Produtos");
  MinhaTarefa tarefa3 = new MinhaTarefa("Excluir", "Usuario");

  public void run() {
    // executa a tarefa1, tarefa2 e tarefa3
    tarefa1.run();
    tarefa2.run();
    tarefa3.run();
  }
}