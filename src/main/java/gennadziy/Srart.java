package gennadziy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Srart {
    public static void main ( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext ( "app.xml" );
        Performer performer= context.getBean ( "poeticJuggler", Performer.class );
        performer.perform ();
        System.out.println ("\n" );
        Performer performer1= context.getBean ( "juggler", Performer.class );
        performer1.perform ();
        Instrumentalist instrumentalist= context.getBean ( "instrumentalist", Instrumentalist.class );
        instrumentalist.perform ();
    }
}
