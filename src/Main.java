public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Cliente1",new int[]{2,2,1,3,4,5});
        Cliente cliente2 = new Cliente("Cliente2",new int[]{1,5,7,8,6,9});
        Cliente cliente3 = new Cliente("Cliente3", new int[]{2,34,5,6,7,1});

        // muestra la diferencia entre el 1 de enero de 1970 y el momento actual en milisegundos
        long initialTime=System.currentTimeMillis();


        CajeraThread cajera1 = new CajeraThread("Cajera1",cliente1,initialTime);
        CajeraThread cajera2 = new CajeraThread("Cajera2",cliente2,initialTime);
        CajeraThread cajera3 = new CajeraThread("Cajera3", cliente3, initialTime);

        cajera1.start();
        cajera2.start();
        cajera3.start();

    }
}