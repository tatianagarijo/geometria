/**
 * @autor Tatiana Garijo Amorós
 * @version 1.2
 */
public class Rectangulo_TGA extends FiguraGeometrica_TGA {
	private double l1;
	private double l2;
	
	/**
	 * método constructor parametizado recibe valores de los lados del rectangulo y cadena de texto indicando el tipo de figura 
	 * @param l1 valor recibido que corresponde al lado grande del rectángulo
	 * @param l2 valor recibido que corresponde al lado grande del pequeño
	 * @param tipoFigura valor recibido que corresponde al tipo de figura
	 */
	public Rectangulo_TGA(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * método para calcular el área
	 * @return devuelve el resultado de calcular el área
	 */

	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * método para calcular el perímetro
	 * @return deuelve el resultado de calcular el perímetro
	 */
	
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
