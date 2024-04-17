package de.wzrd.quoteservice.rest;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteErrorController implements ErrorController {

    @RequestMapping(value = "/error")
    public ResponseEntity<String> error(HttpServletRequest request, HttpServletResponse response) {
        return ResponseEntity.status(404).body("Oh fuck");
    }
}
