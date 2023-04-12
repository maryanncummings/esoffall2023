import whoknows.MyModel;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MyWhoKnows implements PropertyChangeListener {
    public MyWhoKnows(MyModel model) {
        model.addChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        System.out.println("Changed property: " + event.getPropertyName() + " [old -> "
            + event.getOldValue() + "] | [new -> " + event.getNewValue() +"]");
    }
}
