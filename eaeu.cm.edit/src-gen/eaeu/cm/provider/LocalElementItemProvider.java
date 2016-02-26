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
package eaeu.cm.provider;


import eaeu.cm.CMPackage;
import eaeu.cm.LocalElement;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link eaeu.cm.LocalElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalElementItemProvider extends ElementItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalElementItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addLowerPropertyDescriptor(object);
            addUpperPropertyDescriptor(object);
            addBoundsPropertyDescriptor(object);
            addDefinitionPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Lower feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLowerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MultiplicityElement_lower_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_lower_feature", "_UI_MultiplicityElement_type"),
                 CMPackage.Literals.MULTIPLICITY_ELEMENT__LOWER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Upper feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUpperPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MultiplicityElement_upper_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_upper_feature", "_UI_MultiplicityElement_type"),
                 CMPackage.Literals.MULTIPLICITY_ELEMENT__UPPER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Bounds feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBoundsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MultiplicityElement_bounds_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_bounds_feature", "_UI_MultiplicityElement_type"),
                 CMPackage.Literals.MULTIPLICITY_ELEMENT__BOUNDS,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Definition feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDefinitionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_LocalElement_definition_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_LocalElement_definition_feature", "_UI_LocalElement_type"),
                 CMPackage.Literals.LOCAL_ELEMENT__DEFINITION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns LocalElement.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/LocalElement"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        LocalElement localElement = (LocalElement)object;
        return getString("_UI_LocalElement_type") + " " + localElement.getLower();
    }
    

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(LocalElement.class)) {
            case CMPackage.LOCAL_ELEMENT__LOWER:
            case CMPackage.LOCAL_ELEMENT__UPPER:
            case CMPackage.LOCAL_ELEMENT__BOUNDS:
            case CMPackage.LOCAL_ELEMENT__DEFINITION:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
