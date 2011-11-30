package ca.bleathem.richfaces.jquery.component;

import org.richfaces.cdk.annotations.*;

@JsfComponent(
        type = "ca.bleathem.richfaces.jquery.Tab",
        family = "ca.bleathem.Tab",
        renderer = @JsfRenderer(type = "ca.bleathem.jquery.TabRenderer"),
        tag = @Tag(name="tab"))
abstract public class AbstractTab extends javax.faces.component.UIPanel {
    @Attribute
    public abstract String getTitle();
}
