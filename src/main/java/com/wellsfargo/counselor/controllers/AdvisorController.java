
package com.wellsfargo.counselor.controllers;

import com.wellsfargo.counselor.entities.Advisor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/advisors")
public class AdvisorController {

    private final List<Advisor> advisorList = List.of(
            new Advisor("Moslim", "Eldawi", "Cairo", "0123456789", "moslimtamer@gmail.com"),
            new Advisor("Sohiyb", "Eldawi", "Alexandria", "0127654321", "sohiybtamer@gmail.com")

    );

    @GetMapping
    public List<Advisor> getAdvisors() {
        return advisorList;
    }
}
