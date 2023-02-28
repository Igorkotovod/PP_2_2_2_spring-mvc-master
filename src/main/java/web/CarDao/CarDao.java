package web.CarDao;

import web.Models.Cars;

import java.util.List;

public interface CarDao {
    List<Cars> getCars(int count);
}
