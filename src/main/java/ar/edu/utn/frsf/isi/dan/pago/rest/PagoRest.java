package ar.edu.utn.frsf.isi.dan.pago.rest;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.utn.frsf.isi.dan.pago.model.Pago;
import ar.edu.utn.frsf.isi.dan.pago.service.PagoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author Leandro Heraldo Tricarique
 * @author Francisco Tomas Gautero
 *
 */
@RestController
@RequestMapping(Api.PAGO_BASE_PATH)
@CrossOrigin
@Tag(name = "PagoRest", description = "Permite gestionar los pagos de los clientes.")
public class PagoRest
{
	@Autowired
	private PagoService pagoService;

	/**
	 * Registra un pago de un cliente.
	 * 
	 * @param pago
	 * @return
	 */
	@RolesAllowed(Role.EMPLEADO)
	@PostMapping
	@Operation(summary = "Registra el pago de un Cliente.")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Pago Registrado"),
		@ApiResponse(responseCode = "401", description = "No autorizado"), @ApiResponse(responseCode = "403", description = "Prohibido"),
		@ApiResponse(responseCode = "404", description = "Cliente inexistente") })
	public ResponseEntity<?> registrarPago(@RequestBody @Valid Pago pago)
	{
		return ResponseEntity.ok(pagoService.guardarPago(pago));
	}

	/**
	 * Retorna el estado de cuenta corriente de un cliente con un detalle de Pagos y Facturas.
	 * 
	 * @param id
	 * @return
	 */
	@RolesAllowed(Role.EMPLEADO)
	@GetMapping
	@Operation(summary = "Recupera los pagos de un cliente.")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Pagos recuperados"),
		@ApiResponse(responseCode = "401", description = "No autorizado"), @ApiResponse(responseCode = "403", description = "Prohibido"),
		@ApiResponse(responseCode = "404", description = "Cliente inexistente") })
	public ResponseEntity<?> estadoCuenta(@RequestParam(name = "id") Long id)
	{
		return ResponseEntity.ok(pagoService.obtenerEstadoCuenta(id));
	}

	@GetMapping(path = "/instancia")
	@Operation(summary = "Retorna información de la instancia.")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Información de la instancia"),
		@ApiResponse(responseCode = "401", description = "No autorizado"), @ApiResponse(responseCode = "403", description = "Prohibido"),
		@ApiResponse(responseCode = "404", description = "Recurso no encontrado") })
	public ResponseEntity<?> instancia()
	{
		return ResponseEntity.ok("dan-ms-pago -> [OK]");
	}
}
