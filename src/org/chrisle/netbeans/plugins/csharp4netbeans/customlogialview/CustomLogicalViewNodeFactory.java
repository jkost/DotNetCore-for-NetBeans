package org.chrisle.netbeans.plugins.csharp4netbeans.customlogialview;

import org.chrisle.netbeans.plugins.csharp4netbeans.subproject.ReferencesNode;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ui.support.NodeFactory;
import org.netbeans.spi.project.ui.support.NodeFactorySupport;
import org.netbeans.spi.project.ui.support.NodeList;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.util.Exceptions;

@NodeFactory.Registration(projectType = "org-chrisle-netbeans-plugins-csharp4netbeans")
public class CustomLogicalViewNodeFactory implements NodeFactory {

    @Override
    public NodeList createNodes(Project project) {
        //Optionally, only return a new node
        //if some item is in the project's lookup:
        //MyCoolLookupItem item = project.getLookup().lookup(MyCoolLookupItem.class);
        //if (item != null) {
        try {
            ReferencesNode nd = new ReferencesNode(project);
            return NodeFactorySupport.fixedNodeList(nd);
        } catch (DataObjectNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        }
    //}

    //If the above try/catch fails, e.g.,
    //our item isn't in the lookup,
    //then return an empty list of nodes:
    return NodeFactorySupport.fixedNodeList();
    }
}