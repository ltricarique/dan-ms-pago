package ar.edu.utn.frsf.isi.dan.pago.model;

/**
 * @author Leandro Heraldo Tricarique
 *
 */
public class Transferencia extends MedioPago {
	private String cbuOrigen;
	private String cbuDestino;
	private Long codigoTransferencia;
	
	public String getCbuOrigen() {
		return cbuOrigen;
	}
	
	public void setCbuOrigen(String cbuOrigen) {
		this.cbuOrigen = cbuOrigen;
	}
	
	public String getCbuDestino() {
		return cbuDestino;
	}
	
	public void setCbuDestino(String cbuDestino) {
		this.cbuDestino = cbuDestino;
	}
	
	public Long getCodigoTransferencia() {
		return codigoTransferencia;
	}
	
	public void setCodigoTransferencia(Long codigoTransferencia) {
		this.codigoTransferencia = codigoTransferencia;
	}

	@Override
	public String toString() {
		return "Transferencia [id=" + id + ", cbuOrigen=" + cbuOrigen + ", cbuDestino=" + cbuDestino + ", codigoTransferencia="
				+ codigoTransferencia + "]";
	}

	
}
