package di;

import java.lang.annotation.*;
//import anotações

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Inject {
}