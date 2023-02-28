package web.Service;

import web.Models.Cars;
import java.util.List;

public interface CarService {
        List<Cars> getCars(int count);
}
