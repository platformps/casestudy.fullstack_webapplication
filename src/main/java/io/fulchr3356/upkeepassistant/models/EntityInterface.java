package io.fulchr3356.upkeepassistant.models;

import java.io.Serializable;

public interface EntityInterface<IdType extends Serializable> {
    IdType getId();
}
