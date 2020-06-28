package br.com.agenda.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agenda.entity.Operadora;
import br.com.agenda.repository.OperadoraRepository;

@Service
public class OperadoraService {

	@Autowired
	OperadoraRepository operadoraRepository;

	public Operadora save(Operadora entity) {
		return operadoraRepository.save(entity);
	}

	public Iterable<Operadora> findAll(org.springframework.data.domain.Pageable pageable) {
		return operadoraRepository.findAll(pageable);
	}
	
	public Operadora findById(Long id) {
		return operadoraRepository.findById(id).get();
	}

	
}
