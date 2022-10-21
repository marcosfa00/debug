public class Main {
    public static void main(String[] args) {

        Calendario cumple = new Calendario(29,10,1940);
        cumple.mostrar();

        Calendario cumple_abuela = new Calendario(1,11,1944);

        cumple_abuela.mostrar();

        Calendario fecha_mal = new Calendario(34,10,200);

        fecha_mal.mostrar(); //se cambia el día mal puesto por el valor por defecto que es 1

        cumple.incrementarDia();
        cumple.incrementarDia();
        cumple.incrementarDia(); //incremento en
        cumple.mostrar();


        cumple.iguales(cumple_abuela);


        cumple.incrementarAnho(4);
        cumple.mostrar();
        cumple_abuela.mostrar();


        cumple.iguales(cumple_abuela);


        cumple.incrementarMes();
        cumple.mostrar();
        cumple.incrementarMes();
        cumple.mostrar();
    }
}