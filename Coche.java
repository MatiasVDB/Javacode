class Coche{


// Declaración variables//
private static int ceroKM;
private static int anoActual = 2019;
private static int cantidadCoches;
private String marca;
private String modelo;
private int kilometros;
private int ano;
private double precio;
private int calcularAntiguedad;

// Constructor por default //
public Coche (){
this.ceroKM=ceroKM;
this.anoActual=anoActual;
this.cantidadCoches=cantidadCoches;
this.marca=marca;
this.modelo=modelo;
this.kilometros=kilometros;
this.ano=ano;
this.precio=precio;

}

// Constructor Objeto1 //
public Coche(String marca, String modelo, double precio){
	
	this.marca=marca;
	this.modelo=modelo;
	this.precio=precio;
	
}

// Constructor Objeto2 //
public Coche(String marca, String modelo, int kilometros, int ano, double precio){
	
	this.marca=marca;
	this.modelo=modelo;
	this.kilometros=kilometros;
	this.ano=ano;
	this.precio=precio;
	
}

// Métodos //
public String getMarca(){
	return this.marca;
	
}

public String getModelo(){
	return this.modelo;
	
}

public static int getCantidadCoches(){

return cantidadCoches = 2;

}

public void setKilometros(int kilometros){
	
	this.kilometros=kilometros;
	
}

public void setPrecio(double precio){
	this.precio = precio;
	// esta variable permite almacenar el nuevo valor (precio) así usando el metodo get.Precio() podemos ver el nuevo valor modificado//
}

public double getPrecio(){
return this.precio;
	
}

public int calcularAntiguedad(){
	
calcularAntiguedad = anoActual - ano;

return this.calcularAntiguedad;

}

public int getKilometros(){
return this.kilometros;
	
}
	



}
