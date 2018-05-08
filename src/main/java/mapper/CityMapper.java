package mapper;

import po.City;
import po.Country;

import java.util.List;

public interface CityMapper {

    List<City> getCitys();

    List<City> getCountrycity(String countryname);//获取某国家城市列表

    Country getCitysbyCountry(String countryname);
}
