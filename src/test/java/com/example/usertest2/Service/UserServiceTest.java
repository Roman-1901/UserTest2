package com.example.usertest2.Service;

import com.example.usertest2.Dao.UserDaoImpl;
import com.example.usertest2.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @Mock
    private UserDaoImpl userMock;

    @InjectMocks
    private UserService out;



    @Test
    public void checkUserTrue() {
        when(userMock.getUserByName("test"))
                .thenReturn(new User("test"));

        assertTrue(out.checkUserExist(new User("test")));
    }

    @Test
    public void checkUserFalse() {
        when(userMock.getUserByName("test"))
                .thenReturn(null);
        assertFalse(out.checkUserExist(new User("test")));
    }

}