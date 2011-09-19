package ca.bleathem.richfaces.jquery.component;

import org.richfaces.cdk.annotations.JsfComponent;
import org.richfaces.cdk.annotations.JsfRenderer;
import org.richfaces.cdk.annotations.Tag;

/**
 * A trivial input component
 */

@JsfComponent(
        type = "ca.bleathem.richfaces.jquery.Calendar",
        family = "ca.bleathem.Calendar",
        renderer = @JsfRenderer(type = "ca.bleathem.jquery.CalendarRenderer"),
        tag = @Tag(name="cal"))
abstract public class AbstractCalendar extends javax.faces.component.UIInput {

}
