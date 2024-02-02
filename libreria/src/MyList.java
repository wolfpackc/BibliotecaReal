public class MyList {
    private static final int Default_increment_size = 10;
    private int[] lista;
    private int current;

    public MyList() {
        lista = new int[Default_increment_size];
        current = 0;

    }





    //get devuelve el elemento de la psocion que me pasa por parametro
    //me pasaran un index.
    public int getPos(int index) {
        return lista[index];
    }

    /**
     * metodo add me pasaran item y lo añado al final de la lista.
     */
    public void Add(int item) {
//        boolean add=false;
//        for (int i=0;i< lista.length && !add;i++){
//            if (lista[i]==0){
//                lista[i]=item;
//                add =true;
//            }
//        }
        lista[current] = item;
        current++;
        if (current >= lista.length) {
            Resize();
        }

    }

    //devuelve la longitud de la lista, es decir el numero de datos insertados;
    public int Length(int[] lista) {
        return current;
    }

    public int size(int[] lista) {
        return lista.length;
    }

    //met que me imprima mi lista
    public void Print() {
        for (int i = 0; i < current; i++) {
            System.out.println(" " + lista[i] + "/");
        }
    }

    //me insertan 10 elementos;
    //y copia los elementos de la lista en el array y luego hacemos que la lista sea ese nuevo array
    private void copy(int[] array) {

        for (int i = 0; i < current; i++) {
            array[i] = lista[i];
        }
        lista = array;
    }

    //metodo donde le decimos el tamaño nuevo
    private void Resize() {
        int[] newarray = new int[current + Default_increment_size];
        copy(newarray);
    }

    //añadirlo en cierta posicion de una lista lista.add(en el indice 3 meteme el dato 5)
    public void AddIndex(int indice, int valor) {

        for (int i = indice; i < lista.length; i++) {
            lista[i] = lista[i++];
            if (i == indice) {
                lista[i] = valor;
            }
        }






    }

    //metodo remove que elimine el ultimo elemento de la lista;
    //si nos sobran 10 celdas lo redimensionamos
    public void DeleteLast(){
        lista[lista.length-1]=0;
        current--;
        int cont=0;
        for (int i=current;i<lista.length;i++){
            cont++;
        }
        if (cont >10){
            int[] listanueva=new int[lista.length-Default_increment_size];
            for (int i=0;i<listanueva.length;i++){
                listanueva[i]=lista[i];
            }
            lista=listanueva;
        }
    }



    //remove el indice que yo quiera
    public void DeleteSelect(int index){
        lista[index]=0;
        for (int i=index;i< lista.length-1;i++){
            lista[i]=lista[i+1];
        }
    }


    public static void main(String[] args) {
        MyList lista1=new MyList();
        lista1.Add(1);
        lista1.Add(2);
        lista1.Add(3);
        lista1.Add(4);
        lista1.Add(5);
        lista1.Add(6);
        lista1.Add(7);
        lista1.Add(8);
        lista1.Add(9);
        lista1.Add(10);
        System.out.println(lista1.current);

        lista1.Add(11);
        lista1.Print();
        lista1.DeleteLast();
        lista1.Print();
        System.out.println("-----");
        lista1.DeleteSelect(1);
        lista1.Print();






    }
}