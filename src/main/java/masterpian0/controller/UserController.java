package masterpian0.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import masterpian0.model.User;
import masterpian0.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public ModelAndView showUser() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/user");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @GetMapping("/")
    public String index() {
        return "user/login";
    }

    @GetMapping(value = {"/login"})
    public String loginPage() {
        return "user/login";
    }

}
