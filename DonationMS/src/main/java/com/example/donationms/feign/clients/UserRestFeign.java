package com.example.donationms.feign.clients;

import com.example.donationms.feign.mappers.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-ms")
public interface UserRestFeign {
    @GetMapping("/users/{id}")
    User AfficherUser(@PathVariable("id") Long userId);
}
