public class Asesor01 extends AsesorComercial
{
    /**
     * Si el asesor está disponible, éste va a contestar, de lo contrario,
     * se transferirá la petición a otro asesor
     */
    public void contactar(){
        if(getDisponib()){
            System.out.println("Buenos días centro de servicio"+
            " al cliente de Burritos LATAM soy Andrea, ¿Con quién tengo el gusto?");
        }else{
            getNext().contactar();
        }
    } 
}
