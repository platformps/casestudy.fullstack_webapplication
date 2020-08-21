package io.fulchr3356.upkeepassistant.orm;

import io.fulchr3356.upkeepassistant.models.EntityInterface;

import java.sql.ResultSet;
import java.util.HashMap;

public interface UpkeepDaoInterface<EntityType extends EntityInterface<Integer>> {
    ResultSet getResultSet();
    HashMap<String, EntityType> toMap();
}
