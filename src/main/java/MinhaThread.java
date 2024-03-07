
public class MinhaThread {

  int nucleos = Runtime.getRuntime().availableProcessors();

  public void run() {
    System.out.println();

    System.out.println("Thread principal: " + Thread.currentThread().getName());

    System.out.println("Numero de nucleos: " + nucleos);

    System.out.println();

    for (int i = 0; i < nucleos; i++) {
      // cria uma Thread a cada interação
      new Thread("" + i) {
        public void run() {
          long soma = 0;
          System.out.println("Thread: " + getName());
          for (int i = 0; i < 10000000; i++) {
            soma += i;
            System.out.println(soma);
          }
        }

      }.run();
    }

  }

}