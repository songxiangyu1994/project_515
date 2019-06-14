package top.gnibbuq.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.gnibbuq.mapper.FirstMapper;
import top.gnibbuq.pojo.Commodity;
import top.gnibbuq.service.FirstService;

import java.util.List;
@Service
public class FirstServiceImpl implements FirstService {
    @Autowired
    private FirstMapper firstMapper;
    @Override
    public List<Commodity> selectThingsLess() {
        List<Commodity> lessCommodity = firstMapper.selectThingsLess();
        for (int i =0;i<lessCommodity.size();i++) {
            Commodity commodity = lessCommodity.get(i);
            if(commodity.getTotalBox()!=0){
                int number = commodity.getTheRemainingNumber();
                number += commodity.getTotalBox() * commodity.getFullBox();

                if(number>5){
                    lessCommodity.remove(i);
                }

            }

        }
        return lessCommodity;
    }
}
