package spring.micro.servicios.bicicletas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.micro.servicios.bicicletas.entity.Bicicleta;
import spring.micro.servicios.bicicletas.service.BicicletaService;

@RestController
@RequestMapping("/api/bicicletas")
public class BicicletaController {

    @Autowired
    private BicicletaService bicicletaService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Bicicleta>> getAll() {
        List<Bicicleta> bicicletas = bicicletaService.getAll();
        if(bicicletas.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(bicicletas);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Bicicleta> getById(@PathVariable("id") Long id) {
        Bicicleta bicicleta = bicicletaService.getBicicletaById(id);
        if(bicicleta == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(bicicleta);
    }

    @PostMapping()
    public ResponseEntity<Bicicleta> save(@RequestBody Bicicleta bicicleta) {
        Bicicleta bicicletaNew = bicicletaService.save(bicicleta);
        return ResponseEntity.ok(bicicletaNew);
    }

}
