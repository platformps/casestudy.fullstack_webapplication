package io.fulchr3356.upkeepassistant.controllers;
import io.fulchr3356.upkeepassistant.models.EntityInterface;
import java.util.Optional;

public interface ControllerInterface<Entity extends EntityInterface<Integer> > {
    Optional<Entity> findById(Integer id);
    Iterable<Entity> findAll();
    void update(Entity entity);
    void add(Entity entity);
    void delete(Integer id);
}
