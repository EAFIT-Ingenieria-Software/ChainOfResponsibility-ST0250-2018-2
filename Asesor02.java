public class Asesor02 extends AsesorComercial
{
    public void contactar(){
        if(getDisponib()){
            System.out.println("Buenos días centro de servicio"+
            " al cliente de Burritos LATAM soy Santiago, ¿Con quién tengo el gusto?");
        }else{
            getNext().contactar();
        }
    } 
}
