import java.util.ArrayList;

public class LineaFactura {
	ArrayList <Articulo> listaArt= new ArrayList <Articulo> ();
	
	private String codigo;
	private int cantidad;
	private double totalLinea;
	
	public LineaFactura(String cod, int cant, double tL) {
		codigo = cod;
		cantidad = cant;
		totalLinea = tL;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double getTotalLinea() {
		return totalLinea;
	}
	
	public void setTotalLinea(double totalLinea) {
		totalLinea=cantidad;
		this.totalLinea = totalLinea;
		
	}
	
}
