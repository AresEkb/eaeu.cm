package eaeu.ced.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import eaeu.ced.Container;

public class SetSuitableRealizationsAction implements IExternalJavaAction {

    public SetSuitableRealizationsAction() {
    }

    @Override
    public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
        Container container = (Container) selections.iterator().next();
        container.setSuitableRealizations(false);
    }

    @Override
    public boolean canExecute(Collection<? extends EObject> selections) {
        return selections.size() == 1 && selections.iterator().next() instanceof Container;
    }

}
