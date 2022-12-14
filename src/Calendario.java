public class Calendario {
    private int dia = 1;
    private int mes = 1;
    private int anho = 1394;

    //Constructores
    public Calendario(){

    }
    public Calendario(int dia, int mes, int anho){
        if(dia < 31 && dia >0){
            this.dia=dia;
        }
        if(mes < 12 && mes >0){
            this.mes=mes;
        }
        if(anho > 0){
            this.anho=anho;
        }




    }
    //getters and setters
    public void setDia(int dia){
        this.dia = dia;
    }
    public int getDia(){
        return dia;
    }
    public void setMes(int mes){
        this.mes=mes;
    }
    public int getMes(){
        return mes;
    }
    public void setAnho(int anho){
        this.anho = anho;
    }
    public int getAnho(){
        return anho;
    }
    //methods

    public void incrementarDia(){
        if(dia <31){
            dia += 1;
        }else if(dia == 31 && mes == 12){
            dia = 1;
            mes=1;
            anho +=1;
        }else if(dia== 31){
            dia = 1;
            mes +=1;
        }

    }
    public void incrementarMes(){
        if(mes <12){
            mes+=1;
        }else if(mes== 12){
            mes = 1;
            anho +=1;
        }else
            System.out.println("No hay más de 12 meses");

    }

    public void incrementarAnho(int cantidad){
        if(this.anho == 0){
            System.out.println("Este año no existe");
        }else{
            anho += cantidad;
        }

    }

    public void mostrar(){
        System.out.println(dia + "/"+mes+"/"+anho);
    }
    public void fechas(){
        System.out.println("Esta función no hace nada");
    }

    public boolean iguales(Calendario otra_fecha){
        boolean fecha_dia = false;
        boolean fecha_mes= false;
        boolean fecha_anho=false;
        if(dia == otra_fecha.getDia()){
            fecha_dia= true;
        }
        if(mes == otra_fecha.getMes()){
            fecha_mes = true;
        }
        if(anho == otra_fecha.getAnho()){
            fecha_anho=true;
        }

        if(fecha_dia && fecha_mes && fecha_anho){

            System.out.println("Son iguales");
            return true;
        }else{
            System.out.println("Son diferentes");
            return false;
        }

    }
}
