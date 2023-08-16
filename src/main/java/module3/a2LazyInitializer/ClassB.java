package module3.a2LazyInitializer;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ClassB {
    private ClassA classA;

    public ClassB ( ClassA classA ) {
        System.out.println ("some initializer lazy" );
        this.classA = classA;
    }

    void  doSomething(){
        System.out.println ("do Something" );
    }
}