/** 
 * Copyright (c) 2015 committers of YAKINDU and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * Contributors:
 * committers of YAKINDU - initial API and implementation
 *
*/
package org.yakindu.sct.model.sgen.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.yakindu.base.expressions.ExpressionsRuntimeModule;
import org.yakindu.base.expressions.interpreter.IExpressionInterpreter;
import org.yakindu.sct.model.sgen.DeprecatableElement;
import org.yakindu.sct.model.sgen.FeatureConfiguration;
import org.yakindu.sct.model.sgen.FeatureParameter;
import org.yakindu.sct.model.sgen.FeatureParameterValue;
import org.yakindu.sct.model.sgen.FeatureType;
import org.yakindu.sct.model.sgen.FeatureTypeLibrary;
import org.yakindu.sct.model.sgen.GeneratorConfiguration;
import org.yakindu.sct.model.sgen.GeneratorEntry;
import org.yakindu.sct.model.sgen.GeneratorModel;
import org.yakindu.sct.model.sgen.ParameterTypes;
import org.yakindu.sct.model.sgen.PropertyDefinition;
import org.yakindu.sct.model.sgen.SGenFactory;
import org.yakindu.sct.model.sgen.SGenPackage;
import org.yakindu.sct.model.sgen.util.BuiltinExpressionsInterpreter;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SGenFactoryImpl extends EFactoryImpl implements SGenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SGenFactory init() {
		try {
			SGenFactory theSGenFactory = (SGenFactory)EPackage.Registry.INSTANCE.getEFactory(SGenPackage.eNS_URI);
			if (theSGenFactory != null) {
				return theSGenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SGenFactoryImpl();
	}
	
	protected Injector injector;

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SGenFactoryImpl() {
		injector = Guice.createInjector(new ExpressionsRuntimeModule() {
			@Override
			public void configure(Binder binder) {
				binder.bind(IExpressionInterpreter.class).to(BuiltinExpressionsInterpreter.class);
				super.configure(binder);
			}
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SGenPackage.GENERATOR_MODEL: return createGeneratorModel();
			case SGenPackage.GENERATOR_CONFIGURATION: return createGeneratorConfiguration();
			case SGenPackage.FEATURE_TYPE: return createFeatureType();
			case SGenPackage.FEATURE_PARAMETER: return createFeatureParameter();
			case SGenPackage.FEATURE_CONFIGURATION: return createFeatureConfiguration();
			case SGenPackage.GENERATOR_ENTRY: return createGeneratorEntry();
			case SGenPackage.FEATURE_PARAMETER_VALUE: return createFeatureParameterValue();
			case SGenPackage.FEATURE_TYPE_LIBRARY: return createFeatureTypeLibrary();
			case SGenPackage.DEPRECATABLE_ELEMENT: return createDeprecatableElement();
			case SGenPackage.PROPERTY_DEFINITION: return createPropertyDefinition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SGenPackage.PARAMETER_TYPES:
				return createParameterTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SGenPackage.PARAMETER_TYPES:
				return convertParameterTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorModel createGeneratorModel() {
		GeneratorModelImpl generatorModel = new GeneratorModelImpl();
		return generatorModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorConfiguration createGeneratorConfiguration() {
		GeneratorConfigurationImpl generatorConfiguration = new GeneratorConfigurationImpl();
		return generatorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureType createFeatureType() {
		FeatureTypeImpl featureType = new FeatureTypeImpl();
		return featureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureParameter createFeatureParameter() {
		FeatureParameterImpl featureParameter = new FeatureParameterImpl();
		return featureParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureConfiguration createFeatureConfiguration() {
		FeatureConfigurationImpl featureConfiguration = new FeatureConfigurationImpl();
		return featureConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorEntry createGeneratorEntry() {
		GeneratorEntryImpl generatorEntry = new GeneratorEntryImpl();
		return generatorEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FeatureParameterValue createFeatureParameterValue() {
		FeatureParameterValueImpl featureParameterValue = new FeatureParameterValueImpl();
		injector.injectMembers(featureParameterValue);
		return featureParameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureTypeLibrary createFeatureTypeLibrary() {
		FeatureTypeLibraryImpl featureTypeLibrary = new FeatureTypeLibraryImpl();
		return featureTypeLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeprecatableElement createDeprecatableElement() {
		DeprecatableElementImpl deprecatableElement = new DeprecatableElementImpl();
		return deprecatableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyDefinition createPropertyDefinition() {
		PropertyDefinitionImpl propertyDefinition = new PropertyDefinitionImpl();
		return propertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterTypes createParameterTypesFromString(EDataType eDataType, String initialValue) {
		ParameterTypes result = ParameterTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGenPackage getSGenPackage() {
		return (SGenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SGenPackage getPackage() {
		return SGenPackage.eINSTANCE;
	}

} //SGenFactoryImpl
