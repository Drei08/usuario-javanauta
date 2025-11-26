package com.javanauta.usuario.infrastructure.repository;


import com.javanauta.usuario.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
    @Override
    Optional<Telefone> findById(Long id);
}
