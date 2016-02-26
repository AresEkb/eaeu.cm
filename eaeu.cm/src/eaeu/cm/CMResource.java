/**
 * Copyright (c) 2015, 2016 Denis Nikiforov.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Denis Nikiforov - initial API and implementation
 */
package eaeu.cm;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class CMResource extends XMIResourceImpl {

    public CMResource() {
        super();
    }
    
    public CMResource(URI uri) {
        super(uri);
    }
    
    @Override
    protected boolean useUUIDs() {
        return true;
    }
}
