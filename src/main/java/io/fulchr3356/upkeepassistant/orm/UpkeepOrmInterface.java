package io.fulchr3356.upkeepassistant.orm;

import io.fulchr3356.upkeepassistant.models.EntityInterface;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public interface UpkeepOrmInterface<EntityType extends EntityInterface<Integer>> {
    ResultSet getResultSet();
    HashMap<Integer, EntityType> toMap() throws SQLException;
}
