package lk.ijse.bean;

import lk.ijse.util.WhitePussy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("big ass")
@WhitePussy
public class Sandumi implements GoodGirl{
    @Override
    public void love() {
        System.out.println("Sandumi loves lahiru so much...");
    }
}
