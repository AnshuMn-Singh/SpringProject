package module3.a1EagerInitializer;

import org.springframework.stereotype.Component;

@Component
public class ClassB{
    private ClassA classA;

    public ClassB ( ClassA classA ) {
        System.out.println ("some initializer" );
        this.classA = classA;
    }
}
