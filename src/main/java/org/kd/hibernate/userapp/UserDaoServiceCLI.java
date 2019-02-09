package org.kd.hibernate.userapp;

import org.kd.hibernate.userapp.entity.User;
import org.kd.hibernate.userapp.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCLI implements CommandLineRunner {

    @Autowired
    private UserDAOService userDAOService;

    private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCLI.class);

    @Override
    public void run(String... args) throws Exception {
        var user = new User("Jacek", "Admin");
        long id = userDAOService.insert(user);
        log.info("new user created " + user);
    }


    public User getUserFromDao(){
            return userDAOService.getTransactByPrimaryKey(1);

    }
}
