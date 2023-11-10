package contollers;


import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping(value = "/api_check", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> livenessCheck() {
        return ResponseEntity.ok("200 Up and Running");
    }



}
