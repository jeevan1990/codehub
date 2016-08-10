package net.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// This controller delegates the views for screens
@Controller
public class ViewController {

	@RequestMapping(value="/userInbox" ,method = RequestMethod.GET)
    public String getAuthenticateView() {
        return "UserInbox";
    }
	
	
}
