package ca.bleathem.richfaces.input.component;

import org.richfaces.cdk.annotations.*;

@JsfComponent(
        type = "ca.bleathem.richfaces.input.Input",
        family = "ca.bleathem.input",
        renderer = @JsfRenderer(type = "ca.bleathem.input"),
        tag = @Tag(name="input"))
abstract public class AbstractInput extends javax.faces.component.UIInput {

}
