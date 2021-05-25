package jarvis.smbr.co.id.mm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import jarvis.smbr.co.id.mm.service.MMService;



@RestController
public class MMRestController {
    @Autowired
    MMService mmService;

    @GetMapping("/jarvis/mm/sayHi")
    public String sayHi() {
        return "Hi , Jarvis - SAP MM here";
    }

    @PostMapping(value = "/jarvis/sap-mm", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> sapHCMService(
            @RequestHeader(name = "awesome-jarvis", required = true) String serviceMapping, @RequestBody String payload)
            throws Exception {
        String result = "";
        if (payload != null && serviceMapping != null) {
            switch (serviceMapping) {
                case "MM-Book":
                    result = mmService.bookHandler(payload);
                    break;
               
                default:
                    ;
            }
        }

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}