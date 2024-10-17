package com.user.controller;

import com.user.entity.User;
import com.user.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

//    private Logger logger = LoggerFactory.getLogger(UserController.class);

    //create
    @PostMapping("/creatuser")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    //single user get

    //    @CircuitBreaker(name = "ratingHotelBreaker", fallbackMethod = "ratingHotelFallback")
//    @Retry(name = "ratingHotelService", fallbackMethod = "ratingHotelFallback")
//    @RateLimiter(name = "userRateLimiter", fallbackMethod = "ratingHotelFallback")
    @GetMapping("getuserbyid/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable Integer userId) {
//        logger.info("Get Single User Handler: UserController");
//        logger.info("Retry count: {}", retryCount);
        User user = userService.getUser(userId);
        return ResponseEntity.ok(user);
    }

    //creating fall back  method for circuitbreaker


//    public ResponseEntity<User> ratingHotelFallback(String userId, Exception ex) {
////        logger.info("Fallback is executed because service is down : ", ex.getMessage());
//
//        ex.printStackTrace();
//
//        User user = User.builder().email("dummy@gmail.com").name("Dummy").about("This user is created dummy because some service is down").userId("141234").build();
//        return new ResponseEntity<>(user, HttpStatus.BAD_REQUEST);
//    }


    //all user get
    @GetMapping("/getAllUser")
    public ResponseEntity<List<User>> getAllUser() {
        List<User> allUser = userService.getAllUser();
        return ResponseEntity.ok(allUser);
    }

    @PutMapping("/updateuserbyid/{userId}")
    public ResponseEntity<User> updateUserById(@PathVariable Integer userId, @RequestBody User user) {
        User updateUser = userService.updateUserById(userId, user);
//        ResponseEntity<User> userResponseEntity = new ResponseEntity<>(updateUser, HttpStatus.ACCEPTED);
//        return userResponseEntity;
        return new ResponseEntity<>(updateUser, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/deleteuserbyid/{userId}")
    public ResponseEntity<User> deleteUserById(@PathVariable Integer userId) {
        User user = userService.getUser(userId);

        if (user != null) {
            userService.deleteUserById(userId);
            return ResponseEntity.ok(user);
        } else {

            return ResponseEntity.notFound().build();
        }
    }

}
