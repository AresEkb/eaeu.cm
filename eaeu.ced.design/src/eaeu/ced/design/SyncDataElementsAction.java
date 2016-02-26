package eaeu.ced.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import eaeu.ced.DataSet;

public class SyncDataElementsAction implements IExternalJavaAction {

    public SyncDataElementsAction() {
    }

    @Override
    public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
        DataSet dataSet = (DataSet) selections.iterator().next();
        dataSet.syncDataElements();
    }

    @Override
    public boolean canExecute(Collection<? extends EObject> selections) {
        return selections.size() == 1 && selections.iterator().next() instanceof DataSet;
    }

}
