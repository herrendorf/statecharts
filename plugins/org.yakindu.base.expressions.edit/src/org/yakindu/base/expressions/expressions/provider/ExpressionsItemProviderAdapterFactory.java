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
package org.yakindu.base.expressions.expressions.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.yakindu.base.expressions.expressions.util.ExpressionsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsItemProviderAdapterFactory extends ExpressionsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.BoolLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoolLiteralItemProvider boolLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.BoolLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoolLiteralAdapter() {
		if (boolLiteralItemProvider == null) {
			boolLiteralItemProvider = new BoolLiteralItemProvider(this);
		}

		return boolLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.IntLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntLiteralItemProvider intLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.IntLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntLiteralAdapter() {
		if (intLiteralItemProvider == null) {
			intLiteralItemProvider = new IntLiteralItemProvider(this);
		}

		return intLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.DoubleLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleLiteralItemProvider doubleLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.DoubleLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDoubleLiteralAdapter() {
		if (doubleLiteralItemProvider == null) {
			doubleLiteralItemProvider = new DoubleLiteralItemProvider(this);
		}

		return doubleLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.FloatLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatLiteralItemProvider floatLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.FloatLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFloatLiteralAdapter() {
		if (floatLiteralItemProvider == null) {
			floatLiteralItemProvider = new FloatLiteralItemProvider(this);
		}

		return floatLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.HexLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HexLiteralItemProvider hexLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.HexLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHexLiteralAdapter() {
		if (hexLiteralItemProvider == null) {
			hexLiteralItemProvider = new HexLiteralItemProvider(this);
		}

		return hexLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.StringLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringLiteralItemProvider stringLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.StringLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringLiteralAdapter() {
		if (stringLiteralItemProvider == null) {
			stringLiteralItemProvider = new StringLiteralItemProvider(this);
		}

		return stringLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.NullLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NullLiteralItemProvider nullLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.NullLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNullLiteralAdapter() {
		if (nullLiteralItemProvider == null) {
			nullLiteralItemProvider = new NullLiteralItemProvider(this);
		}

		return nullLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.AssignmentExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentExpressionItemProvider assignmentExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.AssignmentExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentExpressionAdapter() {
		if (assignmentExpressionItemProvider == null) {
			assignmentExpressionItemProvider = new AssignmentExpressionItemProvider(this);
		}

		return assignmentExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.ConditionalExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalExpressionItemProvider conditionalExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.ConditionalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionalExpressionAdapter() {
		if (conditionalExpressionItemProvider == null) {
			conditionalExpressionItemProvider = new ConditionalExpressionItemProvider(this);
		}

		return conditionalExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.LogicalOrExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalOrExpressionItemProvider logicalOrExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.LogicalOrExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalOrExpressionAdapter() {
		if (logicalOrExpressionItemProvider == null) {
			logicalOrExpressionItemProvider = new LogicalOrExpressionItemProvider(this);
		}

		return logicalOrExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.LogicalAndExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalAndExpressionItemProvider logicalAndExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.LogicalAndExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalAndExpressionAdapter() {
		if (logicalAndExpressionItemProvider == null) {
			logicalAndExpressionItemProvider = new LogicalAndExpressionItemProvider(this);
		}

		return logicalAndExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.LogicalNotExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalNotExpressionItemProvider logicalNotExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.LogicalNotExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalNotExpressionAdapter() {
		if (logicalNotExpressionItemProvider == null) {
			logicalNotExpressionItemProvider = new LogicalNotExpressionItemProvider(this);
		}

		return logicalNotExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.BitwiseXorExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitwiseXorExpressionItemProvider bitwiseXorExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.BitwiseXorExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBitwiseXorExpressionAdapter() {
		if (bitwiseXorExpressionItemProvider == null) {
			bitwiseXorExpressionItemProvider = new BitwiseXorExpressionItemProvider(this);
		}

		return bitwiseXorExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.BitwiseOrExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitwiseOrExpressionItemProvider bitwiseOrExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.BitwiseOrExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBitwiseOrExpressionAdapter() {
		if (bitwiseOrExpressionItemProvider == null) {
			bitwiseOrExpressionItemProvider = new BitwiseOrExpressionItemProvider(this);
		}

		return bitwiseOrExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.BitwiseAndExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitwiseAndExpressionItemProvider bitwiseAndExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.BitwiseAndExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBitwiseAndExpressionAdapter() {
		if (bitwiseAndExpressionItemProvider == null) {
			bitwiseAndExpressionItemProvider = new BitwiseAndExpressionItemProvider(this);
		}

		return bitwiseAndExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.LogicalRelationExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalRelationExpressionItemProvider logicalRelationExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.LogicalRelationExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalRelationExpressionAdapter() {
		if (logicalRelationExpressionItemProvider == null) {
			logicalRelationExpressionItemProvider = new LogicalRelationExpressionItemProvider(this);
		}

		return logicalRelationExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.ShiftExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShiftExpressionItemProvider shiftExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.ShiftExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShiftExpressionAdapter() {
		if (shiftExpressionItemProvider == null) {
			shiftExpressionItemProvider = new ShiftExpressionItemProvider(this);
		}

		return shiftExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.NumericalAddSubtractExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericalAddSubtractExpressionItemProvider numericalAddSubtractExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.NumericalAddSubtractExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumericalAddSubtractExpressionAdapter() {
		if (numericalAddSubtractExpressionItemProvider == null) {
			numericalAddSubtractExpressionItemProvider = new NumericalAddSubtractExpressionItemProvider(this);
		}

		return numericalAddSubtractExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.NumericalMultiplyDivideExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericalMultiplyDivideExpressionItemProvider numericalMultiplyDivideExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.NumericalMultiplyDivideExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumericalMultiplyDivideExpressionAdapter() {
		if (numericalMultiplyDivideExpressionItemProvider == null) {
			numericalMultiplyDivideExpressionItemProvider = new NumericalMultiplyDivideExpressionItemProvider(this);
		}

		return numericalMultiplyDivideExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.NumericalUnaryExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericalUnaryExpressionItemProvider numericalUnaryExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.NumericalUnaryExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumericalUnaryExpressionAdapter() {
		if (numericalUnaryExpressionItemProvider == null) {
			numericalUnaryExpressionItemProvider = new NumericalUnaryExpressionItemProvider(this);
		}

		return numericalUnaryExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.PrimitiveValueExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveValueExpressionItemProvider primitiveValueExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.PrimitiveValueExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimitiveValueExpressionAdapter() {
		if (primitiveValueExpressionItemProvider == null) {
			primitiveValueExpressionItemProvider = new PrimitiveValueExpressionItemProvider(this);
		}

		return primitiveValueExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.FeatureCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureCallItemProvider featureCallItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.FeatureCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureCallAdapter() {
		if (featureCallItemProvider == null) {
			featureCallItemProvider = new FeatureCallItemProvider(this);
		}

		return featureCallItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.ElementReferenceExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementReferenceExpressionItemProvider elementReferenceExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.ElementReferenceExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementReferenceExpressionAdapter() {
		if (elementReferenceExpressionItemProvider == null) {
			elementReferenceExpressionItemProvider = new ElementReferenceExpressionItemProvider(this);
		}

		return elementReferenceExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.ParenthesizedExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParenthesizedExpressionItemProvider parenthesizedExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.ParenthesizedExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParenthesizedExpressionAdapter() {
		if (parenthesizedExpressionItemProvider == null) {
			parenthesizedExpressionItemProvider = new ParenthesizedExpressionItemProvider(this);
		}

		return parenthesizedExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.expressions.expressions.TypeCastExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCastExpressionItemProvider typeCastExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.expressions.expressions.TypeCastExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeCastExpressionAdapter() {
		if (typeCastExpressionItemProvider == null) {
			typeCastExpressionItemProvider = new TypeCastExpressionItemProvider(this);
		}

		return typeCastExpressionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (boolLiteralItemProvider != null) boolLiteralItemProvider.dispose();
		if (intLiteralItemProvider != null) intLiteralItemProvider.dispose();
		if (doubleLiteralItemProvider != null) doubleLiteralItemProvider.dispose();
		if (floatLiteralItemProvider != null) floatLiteralItemProvider.dispose();
		if (hexLiteralItemProvider != null) hexLiteralItemProvider.dispose();
		if (stringLiteralItemProvider != null) stringLiteralItemProvider.dispose();
		if (nullLiteralItemProvider != null) nullLiteralItemProvider.dispose();
		if (assignmentExpressionItemProvider != null) assignmentExpressionItemProvider.dispose();
		if (conditionalExpressionItemProvider != null) conditionalExpressionItemProvider.dispose();
		if (logicalOrExpressionItemProvider != null) logicalOrExpressionItemProvider.dispose();
		if (logicalAndExpressionItemProvider != null) logicalAndExpressionItemProvider.dispose();
		if (logicalNotExpressionItemProvider != null) logicalNotExpressionItemProvider.dispose();
		if (bitwiseXorExpressionItemProvider != null) bitwiseXorExpressionItemProvider.dispose();
		if (bitwiseOrExpressionItemProvider != null) bitwiseOrExpressionItemProvider.dispose();
		if (bitwiseAndExpressionItemProvider != null) bitwiseAndExpressionItemProvider.dispose();
		if (logicalRelationExpressionItemProvider != null) logicalRelationExpressionItemProvider.dispose();
		if (shiftExpressionItemProvider != null) shiftExpressionItemProvider.dispose();
		if (numericalAddSubtractExpressionItemProvider != null) numericalAddSubtractExpressionItemProvider.dispose();
		if (numericalMultiplyDivideExpressionItemProvider != null) numericalMultiplyDivideExpressionItemProvider.dispose();
		if (numericalUnaryExpressionItemProvider != null) numericalUnaryExpressionItemProvider.dispose();
		if (primitiveValueExpressionItemProvider != null) primitiveValueExpressionItemProvider.dispose();
		if (featureCallItemProvider != null) featureCallItemProvider.dispose();
		if (elementReferenceExpressionItemProvider != null) elementReferenceExpressionItemProvider.dispose();
		if (parenthesizedExpressionItemProvider != null) parenthesizedExpressionItemProvider.dispose();
		if (typeCastExpressionItemProvider != null) typeCastExpressionItemProvider.dispose();
	}

}
