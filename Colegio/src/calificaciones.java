public class calificaciones {
    public static void main(String[] args) {
        String calificaciones=new String("7-7-5-4-9-3");
        String[] notasCad=calificaciones.split("-");
        int[] notas=new int[notasCad.length];

        for(int i=0;i<notas.length;i++){
            notas[i]=Integer.parseInt(notasCad[i]);

        }
    }
}
