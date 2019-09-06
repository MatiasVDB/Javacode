public class Concesionaria{

public static void main (String[] args){
	
	
// Constructores //
Coche auto1= new Coche ("Fiat", "Palio", 269.000);
Coche auto2= new Coche ("Ford", "Fiesta", 40000, 2011, 250000);

// Metodos aplicados a los objetos //
auto1.getMarca();
auto1.getPrecio();
auto1.setPrecio(300000);
auto1.getCantidadCoches();


//el metodo set permite modificar una variable statica en este caso el valor del auto cambió de 269.000 a 300.000// 
System.out.println("Marca: " +auto1.getMarca() + " " + "Modelo: " +auto1.getModelo() + " " +auto1.getCantidadCoches());
System.out.println("El precio del auto es: " +auto1.getPrecio());

// //
auto2.getPrecio();
auto2.getKilometros();
auto2.setKilometros(50000);
auto2.calcularAntiguedad();


System.out.println("Marca: " +auto2.getMarca() + " " + "Modelo: " +auto2.getModelo());
System.out.println("El precio del auto es: " +auto2.getPrecio() + " " + "Su kilometraje es: " +auto2.getKilometros() + "km" + " " + "Su antiguedad es de: " +auto2.calcularAntiguedad() + " " + "anos");
