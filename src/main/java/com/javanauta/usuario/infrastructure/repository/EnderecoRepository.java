package com.javanauta.usuario.infrastructure.repository;


import com.javanauta.usuario.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    @Override
    Optional<Endereco> findById(Long id);
}
