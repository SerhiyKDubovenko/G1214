package logic.dao;

import logic.entity.HomeTheaterAccessories;
import logic.exceptions.DbClientExeption;
import logic.util.DbHandler;
import logic.util.MySQLConnectionHandler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class HomeTheaterAccessoriesDAOImpl implements HomeTheaterAccessoriesDAO {


    public ArrayList<HomeTheaterAccessories> getHomeTheaterAccessories(){
        ArrayList<HomeTheaterAccessories> listOfAccessories = new ArrayList<HomeTheaterAccessories>();

        Connection conn = null;
        try{
            conn = MySQLConnectionHandler.getConnection(DbHandler.HOST_MYSQL_DB,
                    DbHandler.MYSQL_DB, DbHandler.MYSQL_USER, DbHandler.MYSQL_PASSWORD);
        }catch(DbClientExeption dcex){
            dcex.printStackTrace();
        }

        Statement st = null;
        ResultSet rs = null;
        try{
            st = conn.createStatement();
            rs = st.executeQuery("select ID, NAME, MATERIAL, WEIGHT, SIZE, COLOR, USE_WITH, BRAND_KEY, SUBCATEGORY_KEY, ORDER_ID from HomeTheaterAccessories");
            while (rs.next()){
                listOfAccessories.add(new HomeTheaterAccessories(rs.getInt("ID"),
                rs.getString("NAME"), rs.getString("MATERIAL"), rs.getDouble("WEIGHT"),
                        rs.getDouble("SIZE"), rs.getString("COLOR"), rs.getString("USE_WITH"),
                rs.getInt("BRAND_KEY"), rs.getInt("SUBCATEGORY_KEY"), rs.getInt("ORDER_ID")));
            }
        }catch(SQLException sqlex){
            try{
                throw new DbClientExeption("Application obtain blocker during creation statement", sqlex);
            }catch (DbClientExeption dcex){
                dcex.printStackTrace();
            }
        }finally {
            try {
                rs.close();
            } catch (SQLException sqlex) {
                try{
                    throw new DbClientExeption("Application obtain blocker during closing result set", sqlex);
                }catch (DbClientExeption dcex){
                    dcex.printStackTrace();
                }
            }
            try {
                st.close();
            } catch (SQLException sqlex) {
                try{
                    throw new DbClientExeption("Application obtain blocker during creation statement", sqlex);
                }catch (DbClientExeption dcex){
                    dcex.printStackTrace();
                }
            }
        }
        return listOfAccessories;
    }





    public HomeTheaterAccessories getHomeTheaterAccessoryByID(int id) {
        return null;
    }

    public ArrayList<HomeTheaterAccessories> getHomeTheaterAccessoriesByBrand(String brand) {
        return null;
    }

    public boolean addHomeTheaterAccessory(HomeTheaterAccessories homeTheaterAccessories) {
        return false;
    }


    public static void main(String[] args) {

        HomeTheaterAccessoriesDAOImpl htaDAO = new HomeTheaterAccessoriesDAOImpl();
        ArrayList<HomeTheaterAccessories> listOfAccessories = htaDAO.getHomeTheaterAccessories();

        System.out.println(listOfAccessories);
    }
}
