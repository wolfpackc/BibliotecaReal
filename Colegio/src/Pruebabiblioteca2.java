class Libro{
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}





public class Pruebabiblioteca2 {
     private Libro[] libro;

    public Pruebabiblioteca2(){
        Libro l5=new Libro("ceda","julio");
        Libro l56=new Libro("cedvrfva","juli54o");
        libro=new Libro[4];
        libro[0]=new Libro("julioverne","xxx");
        libro[1]=l5;
        libro[2]=l56;
        libro[3]=new Libro("hellletlose","pedro");
    }

    public Libro SearchPerAutor(String aut){
        Libro libroEncontrado=null;
        boolean encontrado=false;
        for (int i=0;i<this.libro.length && !encontrado;i++){
            if (aut.equals(libro[i].getAutor())){
                encontrado=true;
                libroEncontrado=new Libro(this.libro[i].getTitulo(),this.libro[i].getAutor());


            }
        }

        return libroEncontrado;
    }

//    public Libro SearchPerTitulo(String tit){
//
//
//    }
    public static void main(String[] args) {
        Pruebabiblioteca2 biblioteca1=new Pruebabiblioteca2();
        Libro l1=biblioteca1.SearchPerAutor("julio");
        l1.toString();



    }

}
