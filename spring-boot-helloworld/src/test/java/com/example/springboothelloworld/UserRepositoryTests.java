package com.example.springboothelloworld;

import com.example.springboothelloworld.repository.UserRepository;
import com.example.springboothelloworld.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        System.out.println("date:"+formattedDate);
        userRepository.save(new User("bb2", "bb@126.com", "bb", "bb123456",formattedDate));
        userRepository.save(new User("cc3", "cc@126.com", "cc", "cc123456",formattedDate));


//      Assert.assertEquals(9, userRepository.findAll().size());
        Assert.assertEquals("cc", userRepository.findByUserNameOrEmail("cc3", "cc@126.com").get(0).getNickName());
//      userRepository.delete(userRepository.findByUserName("aa1"));
    }

}