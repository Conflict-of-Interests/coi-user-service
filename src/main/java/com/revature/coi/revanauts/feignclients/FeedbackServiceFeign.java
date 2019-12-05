package com.revature.coi.revanauts.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("feedback-service")
public interface FeedbackServiceFeign {
  
  @GetMapping("/feedback/{id}")
  public String getFeedback(@PathVariable long id);

}
