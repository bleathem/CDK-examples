package ca.bleathem.richfaces.jquery.component;

import org.richfaces.cdk.annotations.*;

@JsfComponent(
        type = "ca.bleathem.richfaces.jquery.Calendar",
        family = "ca.bleathem.Calendar",
        renderer = @JsfRenderer(type = "ca.bleathem.jquery.CalendarRenderer"),
        tag = @Tag(name="cal"))
abstract public class AbstractCalendar extends javax.faces.component.UIInput {

    @Attribute
    public abstract String getDateFormat();

    @Attribute()
    public abstract String getShowOn();

    @Attribute()
    public abstract String getButtonImageOnly();

}
