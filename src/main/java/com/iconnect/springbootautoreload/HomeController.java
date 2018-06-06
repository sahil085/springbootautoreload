package com.iconnect.springbootautoreload;


import com.iconnect.springbootautoreload.domain.User;
import com.iconnect.springbootautoreload.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/")
    public String krishna()
    {

        Authentication authentication=SecurityContextHolder.getContext().getAuthentication();

        if(!(authentication instanceof AnonymousAuthenticationToken))
        {
            return "redirect:/dashboard";
        }
//        User user=new User();
//        user.setEnabled(true);
//        user.setPassword(new BCryptPasswordEncoder().encode("123"));
//        user.setUsername("rks1");
//      user.setRole("ADMIN");
//        userRepo.save(user);


        return "index";
    }

    @GetMapping("/dashboard")
    public String dash()
    {

        Authentication authentication=SecurityContextHolder.getContext().getAuthentication();

        if((authentication instanceof AnonymousAuthenticationToken))
        {
            return "redirect:/";
        }
        return "dashboard";
    }

    @GetMapping("/user")
    public String user()
    {
        return "user/user";
    }


}
