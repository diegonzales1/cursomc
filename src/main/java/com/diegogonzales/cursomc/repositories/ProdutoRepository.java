package com.diegogonzales.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegogonzales.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
