package Service;

import entities.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DBEmployeeService {
    Connection con;



    public void createEmployee(Employee emp){
        con = DBConnection.createDBConnection();
        String query = "insert into employee values(?,?,?,?,?)";
        try{
            PreparedStatement pstm = con.prepareStatement(query);

            pstm.setString(1, emp.getFullName());
            pstm.setString(2,emp.getEmail());
            pstm.setInt(3, emp.getPhoneNumber());
            pstm.setString(4, emp.getDateOfBirth());
            pstm.setInt(5, emp.getMonthlySalary());
            int cnt = pstm.executeUpdate();
            if(cnt!=0){
                System.out.println("Employee Inserted Successfully!");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
