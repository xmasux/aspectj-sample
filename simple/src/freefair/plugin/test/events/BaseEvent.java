package freefair.plugin.test.events;

import jdk.jfr.*;

@Name("com.teamscale.TODO")
@Category({ "TODO" })
@Label("TODO")
@Description("TODO.")
@StackTrace(true)
public class BaseEvent extends Event {
    @Label("Method Name")
    public String methodName;

    @Label("Fully Qualified Class Name")
    public String fullyQualifiedClassName;

    @Label("Method Offset")
    public int methodOffset;

    @Label("Component")
    public String component;
}
