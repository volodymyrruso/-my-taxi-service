package taxi.dao;

import java.util.Optional;
import taxi.model.Driver;

public interface DriverDao extends GenericDao<Driver> {
    Optional findByLogin(String login);
}
