package spring.micro.servicios.bicicletas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.micro.servicios.bicicletas.entity.Bicicleta;
import spring.micro.servicios.bicicletas.repository.BicicletaRepository;

@Service
public class BicicletaService {

    @Autowired
    private BicicletaRepository bicicletaRepository;

    public List<Bicicleta> getAll() {
        return bicicletaRepository.findAll();
    }

    public Bicicleta getBicicletaById(Long id) {
        return bicicletaRepository.findById(id).orElse(null);
    }

    public Bicicleta save(Bicicleta bicicleta) {
        Bicicleta bicicletaNew = bicicletaRepository.save(bicicleta);
        return bicicletaNew;
    }
}
