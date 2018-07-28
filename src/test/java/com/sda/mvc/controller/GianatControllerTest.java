package com.sda.mvc.controller;

import com.sda.mvc.model.Fatigue;
import com.sda.mvc.model.GiantModel;
import com.sda.mvc.model.Health;
import com.sda.mvc.model.Nourishment;
import com.sda.mvc.view.GiantView;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

public class GianatControllerTest {

    GiantModel model;
    GiantView view;
    GiantController controller;

    @BeforeEach
     void before()
    {
       model = mock(GiantModel.class);
       view = mock(GiantView.class);
       controller = new GiantController(model,view);


        verifyZeroInteractions(model,view);
    }
    //DisplayName ("Should check the setHealth in this model")
    @Test
    void test01 (){

        for (Health health : Health.values()){
            System.out.println(health.toString());
            controller.setHealth(health);
            verify(model).setHealth(health);
        }
    }


}
