package by.tourist.webapp.city;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CityService {
    @Autowired
    CityRepository repo;

    public void save(City city) {
        repo.save(city);
    }

    public List<City> listAll() {
        return (List<City>) repo.findAll();
    }

    public City get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
