package edu.wgu.d387_sample_code.internationalization;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TZConvertController {

    @GetMapping("/presentation")
    public ResponseEntity announcePresentation() {

        String announcement = "Hello!: The presentation is starting at: " + TZConvert.getTime();
        return new ResponseEntity (announcement, HttpStatus.OK);

    }

}
