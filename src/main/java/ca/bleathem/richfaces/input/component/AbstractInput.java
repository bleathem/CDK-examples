package ca.bleathem.richfaces.input.component;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.JsfComponent;
import org.richfaces.cdk.annotations.JsfRenderer;
import org.richfaces.cdk.annotations.Tag;

/**
 * A trivial input component
 */

@JsfComponent(
        type = "ca.bleathem.richfaces.input.Input",
        family = "ca.bleathem.input",
        renderer = @JsfRenderer(type = "ca.bleathem.input"),
        tag = @Tag(name="input"))
abstract public class AbstractInput extends javax.faces.component.UIInput {

}
