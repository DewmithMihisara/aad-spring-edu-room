package lk.ijse.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Sandumi implements GoodGirl{
    @Override
    public void love() {
        System.out.println("Sandumi loves lahiru so much...");
    }
}
