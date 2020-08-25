


//Might not need but to much to delete

//package io.fulchr3356.upkeepassistant.orm;
//
//import io.fulchr3356.upkeepassistant.models.Employee;
//import io.fulchr3356.upkeepassistant.models.EmployeeBuilder;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.HashMap;
//
//public class EmployeeOrm implements UpkeepOrmInterface<Employee>{
//    private final ResultSet resultSet;
//
//    public EmployeeOrm(ResultSet resultSet){
//        this.resultSet = resultSet;
//    }
//    @Override
//    public ResultSet getResultSet() {
//        return resultSet;
//    }
//
//    @Override
//    public HashMap<Integer, Employee> toMap() throws SQLException {
//        HashMap<Integer,Employee> tempMap = new HashMap<>();
//        while(getResultSet().next()){
//            Integer id = getResultSet().getInt("id");
//            tempMap.put(id,new EmployeeBuilder()
//                    .withId(id)
//                    .withFirstName(getResultSet().getString("first_name"))
//                    .withLastName(getResultSet().getString("last_name"))
//                    .withEmail(getResultSet().getString("email"))
//                    .withPassword(getResultSet().getString("password"))
//                    .withSalary(getResultSet().getDouble("salary"))
//                    .withDepartment(getResultSet().getString("department"))
//                    .withPosition(getResultSet().getString("position")).build());
//        }
//        return tempMap;
//    }
//}
