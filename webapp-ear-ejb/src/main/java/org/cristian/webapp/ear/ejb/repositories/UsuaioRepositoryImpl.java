package org.cristian.webapp.ear.ejb.repositories;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.cristian.webapp.ear.ejb.entities.Usuario;

import java.util.List;

@RequestScoped
public class UsuaioRepositoryImpl implements UsuaioRepository{

    @Inject
    private EntityManager em;

    @Override
    public List<Usuario> listar() {
        return em.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
    }
}
