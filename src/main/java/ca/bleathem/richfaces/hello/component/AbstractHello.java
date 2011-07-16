package ca.bleathem.richfaces.hello.component;

import org.richfaces.cdk.annotations.*;

/**
 * A trivial hello world component
 */

@JsfComponent(type = "ca.bleathem.hello", family = "ca.bleathem.text", renderer = @JsfRenderer(type = "ca.bleathem.hello"), tag = @Tag(name="hello"))
abstract public class AbstractHello extends javax.faces.component.UIComponentBase {

}
