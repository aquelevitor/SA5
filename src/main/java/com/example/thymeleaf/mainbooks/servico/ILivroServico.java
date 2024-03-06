package com.example.thymeleaf.mainbooks.servico;

import java.util.List;
import com.example.thymeleaf.mainbooks.modelo.Livro;

public interface ILivroServico {

    public Livro salvarLivro(Livro livro);

    public List<Livro> buscarTodosLivros();

    public Livro bucarLivroPorId(Long id);

    public void deletarLivroPorId(Long id);

    public void atualizarLivro(Livro livro);

}