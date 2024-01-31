class Libro{
    private static int num_libros;
    private String titulo;
     private String autor;
     private int[] idiomas;
     static {
         num_libros=0;
     }
     public Libro(String tit,String aut){
         titulo=tit;
         autor=aut;
         idiomas=new int[3];
         num_libros++;
     }

    public String getTitulo() {
        return titulo;
    }


    public String getAutor() {
        return autor;
    }

    public int[] getIdiomas() {
        return idiomas;
    }
}
public class Biblioteca {

    private Libro[] libro;

    public Biblioteca(){
        Libro librohack=new Libro("redhat","ismael");
        libro=new Libro[3];
        libro[0]=new Libro("los juegos del hambre","benito");
        libro[1]=librohack;
        libro[2]=new Libro("fisica cuantica","pedro");


    }

    public  Libro SearchPerAutor(String autor){
        Libro lib=null;
        boolean encontrado=false;
        for(int i=0;i< libro.length && !encontrado;i++){
            if (autor.equals(libro[i].getAutor())){
                encontrado=true;

                lib=new Libro(libro[i].getTitulo(),libro[i].getAutor());
            }

        }

        return lib;

    }
//    public  Libro SearchperTitulo(String titulo){
//
//
//    }

    public static void main(String[] args) {

        Biblioteca bibli1=new Biblioteca();
        System.out.println(bibli1.libro[2].getIdiomas()[1]);
        Libro librito1;
        librito1= bibli1.SearchPerAutor("ismhael");
        if (librito1 ==null){
            System.out.println("no encontrado");
        }else{
            System.out.println(librito1.getAutor()+ librito1.getTitulo());
        }



    }



}
