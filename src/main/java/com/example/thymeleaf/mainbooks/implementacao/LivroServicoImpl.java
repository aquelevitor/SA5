package com.example.thymeleaf.mainbooks.implementacao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.thymeleaf.mainbooks.excecao.LivroNaoEncontradoExcecao;
import com.example.thymeleaf.mainbooks.modelo.Livro;
import com.example.thymeleaf.mainbooks.repositorio.LivroRepositorio;
import com.example.thymeleaf.mainbooks.servico.ILivroServico;

@Service
public class LivroServicoImpl implements ILivroServico {

    @Autowired
    private LivroRepositorio repositorio;

    @Override
    public Livro salvarLivro(Livro livro) {
        return repositorio.save(livro);
    }

    @Override
    public List<Livro> buscarTodosLivros() {
        return repositorio.findAll();
    }

    @Override
    public Livro bucarLivroPorId(Long id) {
        Optional<Livro> opcional = repositorio.findById(id);
        if (opcional.isPresent()) {
            return opcional.get();
        } else {
            throw new LivroNaoEncontradoExcecao("Livro com id: " + id + " não encontrado.");
        }
    }

    @Override
    public void deletarLivroPorId(Long id) {
        repositorio.delete(bucarLivroPorId(id));
    }

    @Override
    public void atualizarLivro(Livro invoice) {
        repositorio.save(invoice);
    }
}
