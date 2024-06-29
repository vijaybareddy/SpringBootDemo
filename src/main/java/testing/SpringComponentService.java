package testing;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class SpringComponentService {
    public String sayHello(){
        return "From @Component Bean ";
    }
}
