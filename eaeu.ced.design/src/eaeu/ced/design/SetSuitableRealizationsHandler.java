package eaeu.ced.design;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.table.metamodel.table.DLine;
import org.eclipse.ui.handlers.HandlerUtil;

import eaeu.ced.Container;
import eaeu.ced.Document;

public class SetSuitableRealizationsHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        if (selection instanceof ITreeSelection) {
            Object selectedElement = ((ITreeSelection) selection).getFirstElement();
            if (selectedElement instanceof DLine) {
                DLine line = (DLine) selectedElement;
                EObject target = line.getTarget();
                if (target instanceof Container) {
                    Container container = (Container) target;
                    
                    Document doc = container.getDocument();
                    EObject model = doc.getRealizationModel();
                    /*if (model instanceof Model) {
                        Model umlModel = (Model) model;
                        //umlModel.allOwnedElements()
                    }*/
                    
                    Session session = SessionManager.INSTANCE.getSession(target);
                    TransactionalEditingDomain ted = session.getTransactionalEditingDomain();
                    ted.getCommandStack().execute(new RecordingCommand(ted) {
                        @Override
                        protected void doExecute() {
                            container.setSuitableRealizations(false);
                        }
                    });
                }
            }
        }
        return null;
    }

}
