package org.cristian.webapp.ear.ejb.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.cristian.webapp.ear.ejb.entities.Usuario;
import org.cristian.webapp.ear.ejb.repositories.UsuaioRepository;

import java.util.List;

@Stateless
public class UsuarioServiceImpl implements UsuarioService{

    @Inject
    private UsuaioRepository repository;

    @Override
    public List<Usuario> listar() {
        return repository.listar();
    }
}
