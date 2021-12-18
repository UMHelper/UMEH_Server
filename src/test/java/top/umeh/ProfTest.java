package top.umeh;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.umeh.service.ProfService;

@SpringBootTest
public class ProfTest {
    @Autowired
    ProfService profService;
    @Test
    public void profTest(){
        System.out.println (profService.getAll ());
    }
}
