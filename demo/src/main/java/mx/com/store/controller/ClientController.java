package mx.com.store.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "api/v1/clients")
public class ClientController {

    @GetMapping(value = "/{clientId}")
    public ResponseEntity<?> getClientById(@PathVariable(value = "clientId") String clientId) {
        ClientResponseDTO responseDTO = new ClientResponseDTO();

        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
    }

    @PostMapping
    public ResponseEntity<ClientResponseDTO> createClient(@PathVariable String clientId, @RequestBody ClientRequestDTO requestDTO) {
        ClientResponseDTO responseDTO = new ClientResponseDTO();
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }


    @PutMapping(value = "{clientId}")
    public ResponseEntity<ClientResponseDTO> updateClientById(@PathVariable String clientId, @RequestBody ClientRequestDTO requestDTO){
        ClientResponseDTO responseDTO = new ClientResponseDTO();
        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
    }


    @DeleteMapping
    public ResponseEntity<Void> deleteClientByID(@PathVariable String clientID){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
