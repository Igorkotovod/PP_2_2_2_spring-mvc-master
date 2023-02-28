package web.CarDao;


import org.springframework.stereotype.Repository;
import web.Models.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
        public class CarDaoImpl implements CarDao {

            private static final List<Cars> cars = new ArrayList<>();

            {
                cars.add(new Cars("VAZ", 2000, "White"));
                cars.add(new Cars("GAZ", 1999, "Green"));
                cars.add(new Cars("BMW", 2005, "Black"));
                cars.add(new Cars("Renault", 2015, "Gray"));
                cars.add(new Cars("Mercedes", 2022, "Blue"));
            }

            @Override
            public List<Cars> getCars(int count) {
                return cars.stream().limit(count).collect(Collectors.toList());
            }
        }

