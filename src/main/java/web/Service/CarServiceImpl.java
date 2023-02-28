package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.CarDao.CarDao;
import web.CarDao.CarDaoImpl;
import web.Models.Cars;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarDaoImpl carDao;

    @Override
    public List<Cars> getCars(int count) {
        return carDao.getCars(count);
    }

}
