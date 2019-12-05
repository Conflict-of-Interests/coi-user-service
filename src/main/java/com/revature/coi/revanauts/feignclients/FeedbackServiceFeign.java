package com.revature.coi.revanauts.feignclients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.revature.coi.revanauts.models.Feedback;

@FeignClient("feedback-service")
public interface FeedbackServiceFeign {
  
  @GetMapping("/feedback/associates/{id}")
  public List<Feedback> getFeedbackForAssociate(@PathVariable long id);

}
