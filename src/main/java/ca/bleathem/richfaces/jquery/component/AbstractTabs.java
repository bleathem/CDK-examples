package ca.bleathem.richfaces.jquery.component;

import org.richfaces.cdk.annotations.*;

import javax.faces.component.UIComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JsfComponent(
        type = "ca.bleathem.richfaces.jquery.Tabs",
        family = "ca.bleathem.Tabs",
        renderer = @JsfRenderer(type = "ca.bleathem.jquery.TabsRenderer"),
        tag = @Tag(name="tabs"))
abstract public class AbstractTabs extends javax.faces.component.UIPanel {
}
