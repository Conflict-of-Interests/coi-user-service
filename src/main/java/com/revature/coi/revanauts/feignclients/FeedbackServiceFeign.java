package com.revature.coi.revanauts.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("feedback-service")
public interface FeedbackServiceFeign {
//  This is not right, but in the right vein:
  @GetMapping("/feedback/{id}")
  public Object getFeedback(@PathVariable long id);

}
