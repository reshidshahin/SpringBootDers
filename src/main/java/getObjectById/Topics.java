package getObjectById;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Topics {

    @Autowired //bu annotation ile topicservice servisini bura inject eledik
    private TopicService topicService;


    @RequestMapping("/topics")
    public List<TopicPOJO> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}") // burda id'nin variable oldugunu soylemek ucun onu moterizelere aldiq
    public TopicPOJO getTopic(@PathVariable String id){ //@PathVariable annotation ile biz deyirik ki, burdaki id ile yuxaridaki variable id eynidir.
        return topicService.getTopic(id);
    }

}
