package logic.dao;

import logic.entity.HomeTheaterAccessories;
import logic.exceptions.DbClientExeption;

import java.sql.SQLException;
import java.util.ArrayList;

public interface HomeTheaterAccessoriesDAO {

    ArrayList<HomeTheaterAccessories> getHomeTheaterAccessories() throws SQLException, DbClientExeption;

    HomeTheaterAccessories getHomeTheaterAccessoryByID(int id);

    ArrayList<HomeTheaterAccessories> getHomeTheaterAccessoriesByBrand(String brand);

    boolean addHomeTheaterAccessory(HomeTheaterAccessories homeTheaterAccessories);
    boolean editHomeTheaterAccessory(HomeTheaterAccessories homeTheaterAccessories);


}
