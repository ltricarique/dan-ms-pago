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
	public boolean equals(Object obj) {
		if (obj instanceof Efectivo)
			return ((Efectivo) obj).getId().equals(id);
		else
			return false;
	}

	@Override
	public String toString() {
		return "Efectivo [numeroRecibo=" + numeroRecibo + "]";
	}

}
