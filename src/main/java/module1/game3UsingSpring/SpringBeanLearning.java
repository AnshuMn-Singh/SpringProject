package module1.game3UsingSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String  name, int age){  }

record Address(String firstLine, String city){ }

record FullAddress(String village, Address address){ }

@Configuration
public class SpringBeanLearning {

    @Bean
    public String name(){
        return "Anshu";
    }

    @Bean
    public int age(){
        return 10;
    }

    @Bean
    public Person person(){
        return new Person ( "ans", 20 );
    }

    @Bean
    public Person person2MethodCall(){
        return new Person ( name (), age () );
    }

    @Bean
    public Person person2Parameter(String name, int age ){
        return new Person ( name, age);
    }


    @Bean
//    @Primary
    public Address address(){
        return new Address ( "as", "as" );
    }

    // we can also give custom name for bean also
    @Bean("address2")
    @Qualifier("AddressQualifier")
    public Address address1(){
        return new Address ( "ads", "as" );
    }

    @Bean
    @Primary
    public FullAddress fullAddress(@Qualifier("AddressQualifier") Address address){
        return new FullAddress ( "village", address );
    }

    @Bean
    public FullAddress fullAddress2MethodCall(){
        return new FullAddress ( "village", address() );
    }
}
