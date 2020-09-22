package com.github.perscholas.repositories;

import com.github.perscholas.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRegistrationRepo extends CrudRepository<User, Long> {

    /*
    static int register(User user) {
        int status=0;
        try{
            Connection con= DatabaseConnector.getCon();
            PreparedStatement prepStatement=con.prepareStatement("insert into user values(?,?,?,?,?,?)");
            prepStatement.setLong(1,user.getId());
            prepStatement.setString(2,user.getName());
            prepStatement.setString(3,user.getEmail());
            prepStatement.setString(4,user.getAddress());
            prepStatement.setString(5,user.getPhNumber());
            prepStatement.setString(6,user.getPassword());

            status=prepStatement.executeUpdate();
        }catch(Exception e){}

        return status;
    }

     */

}


