package com.thiagoxavier.cadastro_usuario.infrastructure.repository;

import com.thiagoxavier.cadastro_usuario.infrastructure.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByEmail(String email);

    @Transactional //Caso de algum erro ele não deleta
    void deleteByEmail(String email);
}
