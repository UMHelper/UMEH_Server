package top.umeh.database;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.umeh.proj.Prof;
import top.umeh.service.ProfService;

import java.util.List;

@SpringBootTest
public class ProfTest {

    @Autowired
    ProfService profService;

    @Test
    public void insertTest(){
        Prof prof=new Prof ();
        int num=profService.getAll ().size ();
        prof.setName ("TEST"+num);
        profService.insert (prof);
    }

    @Test
    public void getByNameTest(){
        Prof prof=profService.getByName ("TEST1");
        Assert.assertEquals ("TEST1",prof.getName ());
    }

    @Test
    public void getAllTest(){
        List<Prof> profList=profService.getAll ();
        Assert.assertNotNull (profList);
    }
}
