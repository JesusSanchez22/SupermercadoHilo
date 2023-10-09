public class CajeraThread extends Thread{

    private String nombre;
    private Cliente cliente;
    private long initialTime;

    public CajeraThread() {
    }

    public CajeraThread(String nombre, Cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }

    private void esperarXsegundos(int segundos){
        try{
            Thread.sleep(segundos + 1000);
        } catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void run(){

        for(int i= 0; i < this.cliente.getCarroCompra().length; i++){

            // se procesa el pedido en x segundos
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesando el producto " + (i + 1) + " del cliente "
            + this.cliente.getNombre() + " -> tiempo: " + (System.currentTimeMillis() - this.initialTime)/1000
            + "seg");
        }

        System.out.println("La cajera " + this.nombre + " comienza a procesar " +
                "la compra del cliente " + this.cliente.getNombre() + " en el tiempo "
                + (System.currentTimeMillis() - this.initialTime)/1000 + " seg");
    }
}
