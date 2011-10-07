package ca.bleathem.richfaces.jquery.component;

import org.richfaces.cdk.annotations.*;

@JsfComponent(
        type = "ca.bleathem.richfaces.jquery.Datepicker",
        family = "ca.bleathem.Datepicker",
        renderer = @JsfRenderer(type = "ca.bleathem.jquery.DatepickerRenderer"),
        tag = @Tag(name="datepicker"))
abstract public class AbstractDatepicker extends javax.faces.component.UIInput {

    @Attribute
    public abstract String getDateFormat();

    @Attribute
    public abstract String getShowOn();

    @Attribute
    public abstract String getButtonImageOnly();

}
