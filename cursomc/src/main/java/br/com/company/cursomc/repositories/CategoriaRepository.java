package br.com.company.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.company.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
