package by.tourist.webapp.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping("/")
    public ModelAndView home() {
        List<City> listCity = cityService.listAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listCity", listCity);
        return mav;
    }
}
