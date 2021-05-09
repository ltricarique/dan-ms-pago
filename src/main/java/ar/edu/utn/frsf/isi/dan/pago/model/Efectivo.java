package ar.edu.utn.frsf.isi.dan.pago.model;

/**
 * @author Leandro Heraldo Tricarique
 *
 */
public class Efectivo extends MedioPago {
	private Integer numeroRecibo;

	public Integer getNumeroRecibo() {
		return numeroRecibo;
	}

	public void setNumeroRecibo(Integer numeroRecibo) {
		this.numeroRecibo = numeroRecibo;
	}

	@Override
	public String toString() {
		return "Efectivo [id=" + id + ", numeroRecibo=" + numeroRecibo + "]";
	}

}
