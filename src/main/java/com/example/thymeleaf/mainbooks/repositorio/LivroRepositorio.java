package com.example.thymeleaf.mainbooks.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.thymeleaf.mainbooks.modelo.Livro;

public interface LivroRepositorio extends JpaRepository<Livro, Long> {

}