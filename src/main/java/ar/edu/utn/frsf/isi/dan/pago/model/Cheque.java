package ar.edu.utn.frsf.isi.dan.pago.model;

import java.time.Instant;

/**
 * @author Leandro Heraldo Tricarique
 *
 */
public class Cheque extends MedioPago {
	private Integer numeroCheque;
	private Instant fechaCobro;
	private String banco;
	
	public Integer getNumeroCheque() {
		return numeroCheque;
	}
	
	public void setNumeroCheque(Integer numeroCheque) {
		this.numeroCheque = numeroCheque;
	}
	
	public Instant getFechaCobro() {
		return fechaCobro;
	}
	
	public void setFechaCobro(Instant fechaCobro) {
		this.fechaCobro = fechaCobro;
	}
	
	public String getBanco() {
		return banco;
	}
	
	public void setBanco(String banco) {
		this.banco = banco;
	}

	@Override
	public String toString() {
		return "Cheque [id=" + id + ", numeroCheque=" + numeroCheque + ", fechaCobro=" + fechaCobro + ", banco=" + banco + "]";
	}
	
}
