package post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Topics {

    @Autowired //bu annotation ile topicservice servisini bura inject eledik
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<TopicPOJO> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}") // burda id'nin variable oldugunu soylemek ucun onu moterizelere aldiq
    public TopicPOJO getTopic(@PathVariable String id) { //@PathVariable annotation ile biz deyirik ki, burdaki id ile yuxaridaki variable id eynidir.
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    //biz bunun post metod oldugunu demeliyik default olaraq get'dir
    public void addTopic(@RequestBody TopicPOJO topicPOJO) { // burdaki annotation ile ise biz deyirik ki, topicpojo formatina cevir post edilecek data'ni
        topicService.addTopic(topicPOJO);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody TopicPOJO topicPOJO,@PathVariable String id) {
        topicService.updateTopic(id,topicPOJO);
    }
}
