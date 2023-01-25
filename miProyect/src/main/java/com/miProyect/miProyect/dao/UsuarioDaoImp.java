package com.miProyect.miProyect.dao;

import com.miProyect.miProyect.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Repository
@Transactional

public class UsuarioDaoImp implements UsuarioDao{

  @PersistenceContext
  private EntityManager entityManager;

  @Override
  public List<User> getUsuarios() {

    String query = "FROM Usuario";
    return entityManager.createQuery(query).getResultList();
  }
}
