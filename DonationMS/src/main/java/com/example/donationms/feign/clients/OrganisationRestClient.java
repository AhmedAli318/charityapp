package com.example.donationms.feign.clients;

import com.example.donationms.feign.mappers.Organisation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "organisation-ms")
public interface OrganisationRestClient {
    @GetMapping("/organisations/{id}")
    Organisation Afficherorganisation(@PathVariable("id") Long organisationId);
}
