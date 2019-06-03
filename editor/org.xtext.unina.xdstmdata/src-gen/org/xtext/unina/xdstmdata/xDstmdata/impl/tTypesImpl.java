/**
 * generated by Xtext 2.13.0
 */
package org.xtext.unina.xdstmdata.xDstmdata.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.unina.xdstmdata.xDstmdata.XDstmdataPackage;
import org.xtext.unina.xdstmdata.xDstmdata.cExtchannel;
import org.xtext.unina.xdstmdata.xDstmdata.cIntchannel;
import org.xtext.unina.xdstmdata.xDstmdata.tCompound;
import org.xtext.unina.xdstmdata.xDstmdata.tEnum;
import org.xtext.unina.xdstmdata.xDstmdata.tMultitype;
import org.xtext.unina.xdstmdata.xDstmdata.tTypes;
import org.xtext.unina.xdstmdata.xDstmdata.vVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tTypes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.unina.xdstmdata.xDstmdata.impl.tTypesImpl#getTEnum <em>TEnum</em>}</li>
 *   <li>{@link org.xtext.unina.xdstmdata.xDstmdata.impl.tTypesImpl#getTCompound <em>TCompound</em>}</li>
 *   <li>{@link org.xtext.unina.xdstmdata.xDstmdata.impl.tTypesImpl#getTMultitype <em>TMultitype</em>}</li>
 *   <li>{@link org.xtext.unina.xdstmdata.xDstmdata.impl.tTypesImpl#getCIntchannel <em>CIntchannel</em>}</li>
 *   <li>{@link org.xtext.unina.xdstmdata.xDstmdata.impl.tTypesImpl#getCExtchannel <em>CExtchannel</em>}</li>
 *   <li>{@link org.xtext.unina.xdstmdata.xDstmdata.impl.tTypesImpl#getVVariable <em>VVariable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class tTypesImpl extends MinimalEObjectImpl.Container implements tTypes
{
  /**
   * The cached value of the '{@link #getTEnum() <em>TEnum</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTEnum()
   * @generated
   * @ordered
   */
  protected EList<tEnum> tEnum;

  /**
   * The cached value of the '{@link #getTCompound() <em>TCompound</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTCompound()
   * @generated
   * @ordered
   */
  protected EList<tCompound> tCompound;

  /**
   * The cached value of the '{@link #getTMultitype() <em>TMultitype</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTMultitype()
   * @generated
   * @ordered
   */
  protected EList<tMultitype> tMultitype;

  /**
   * The cached value of the '{@link #getCIntchannel() <em>CIntchannel</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCIntchannel()
   * @generated
   * @ordered
   */
  protected EList<cIntchannel> cIntchannel;

  /**
   * The cached value of the '{@link #getCExtchannel() <em>CExtchannel</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCExtchannel()
   * @generated
   * @ordered
   */
  protected EList<cExtchannel> cExtchannel;

  /**
   * The cached value of the '{@link #getVVariable() <em>VVariable</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVVariable()
   * @generated
   * @ordered
   */
  protected EList<vVariable> vVariable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected tTypesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XDstmdataPackage.Literals.TTYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<tEnum> getTEnum()
  {
    if (tEnum == null)
    {
      tEnum = new EObjectContainmentEList<tEnum>(tEnum.class, this, XDstmdataPackage.TTYPES__TENUM);
    }
    return tEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<tCompound> getTCompound()
  {
    if (tCompound == null)
    {
      tCompound = new EObjectContainmentEList<tCompound>(tCompound.class, this, XDstmdataPackage.TTYPES__TCOMPOUND);
    }
    return tCompound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<tMultitype> getTMultitype()
  {
    if (tMultitype == null)
    {
      tMultitype = new EObjectContainmentEList<tMultitype>(tMultitype.class, this, XDstmdataPackage.TTYPES__TMULTITYPE);
    }
    return tMultitype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<cIntchannel> getCIntchannel()
  {
    if (cIntchannel == null)
    {
      cIntchannel = new EObjectContainmentEList<cIntchannel>(cIntchannel.class, this, XDstmdataPackage.TTYPES__CINTCHANNEL);
    }
    return cIntchannel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<cExtchannel> getCExtchannel()
  {
    if (cExtchannel == null)
    {
      cExtchannel = new EObjectContainmentEList<cExtchannel>(cExtchannel.class, this, XDstmdataPackage.TTYPES__CEXTCHANNEL);
    }
    return cExtchannel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<vVariable> getVVariable()
  {
    if (vVariable == null)
    {
      vVariable = new EObjectContainmentEList<vVariable>(vVariable.class, this, XDstmdataPackage.TTYPES__VVARIABLE);
    }
    return vVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XDstmdataPackage.TTYPES__TENUM:
        return ((InternalEList<?>)getTEnum()).basicRemove(otherEnd, msgs);
      case XDstmdataPackage.TTYPES__TCOMPOUND:
        return ((InternalEList<?>)getTCompound()).basicRemove(otherEnd, msgs);
      case XDstmdataPackage.TTYPES__TMULTITYPE:
        return ((InternalEList<?>)getTMultitype()).basicRemove(otherEnd, msgs);
      case XDstmdataPackage.TTYPES__CINTCHANNEL:
        return ((InternalEList<?>)getCIntchannel()).basicRemove(otherEnd, msgs);
      case XDstmdataPackage.TTYPES__CEXTCHANNEL:
        return ((InternalEList<?>)getCExtchannel()).basicRemove(otherEnd, msgs);
      case XDstmdataPackage.TTYPES__VVARIABLE:
        return ((InternalEList<?>)getVVariable()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XDstmdataPackage.TTYPES__TENUM:
        return getTEnum();
      case XDstmdataPackage.TTYPES__TCOMPOUND:
        return getTCompound();
      case XDstmdataPackage.TTYPES__TMULTITYPE:
        return getTMultitype();
      case XDstmdataPackage.TTYPES__CINTCHANNEL:
        return getCIntchannel();
      case XDstmdataPackage.TTYPES__CEXTCHANNEL:
        return getCExtchannel();
      case XDstmdataPackage.TTYPES__VVARIABLE:
        return getVVariable();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XDstmdataPackage.TTYPES__TENUM:
        getTEnum().clear();
        getTEnum().addAll((Collection<? extends tEnum>)newValue);
        return;
      case XDstmdataPackage.TTYPES__TCOMPOUND:
        getTCompound().clear();
        getTCompound().addAll((Collection<? extends tCompound>)newValue);
        return;
      case XDstmdataPackage.TTYPES__TMULTITYPE:
        getTMultitype().clear();
        getTMultitype().addAll((Collection<? extends tMultitype>)newValue);
        return;
      case XDstmdataPackage.TTYPES__CINTCHANNEL:
        getCIntchannel().clear();
        getCIntchannel().addAll((Collection<? extends cIntchannel>)newValue);
        return;
      case XDstmdataPackage.TTYPES__CEXTCHANNEL:
        getCExtchannel().clear();
        getCExtchannel().addAll((Collection<? extends cExtchannel>)newValue);
        return;
      case XDstmdataPackage.TTYPES__VVARIABLE:
        getVVariable().clear();
        getVVariable().addAll((Collection<? extends vVariable>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XDstmdataPackage.TTYPES__TENUM:
        getTEnum().clear();
        return;
      case XDstmdataPackage.TTYPES__TCOMPOUND:
        getTCompound().clear();
        return;
      case XDstmdataPackage.TTYPES__TMULTITYPE:
        getTMultitype().clear();
        return;
      case XDstmdataPackage.TTYPES__CINTCHANNEL:
        getCIntchannel().clear();
        return;
      case XDstmdataPackage.TTYPES__CEXTCHANNEL:
        getCExtchannel().clear();
        return;
      case XDstmdataPackage.TTYPES__VVARIABLE:
        getVVariable().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XDstmdataPackage.TTYPES__TENUM:
        return tEnum != null && !tEnum.isEmpty();
      case XDstmdataPackage.TTYPES__TCOMPOUND:
        return tCompound != null && !tCompound.isEmpty();
      case XDstmdataPackage.TTYPES__TMULTITYPE:
        return tMultitype != null && !tMultitype.isEmpty();
      case XDstmdataPackage.TTYPES__CINTCHANNEL:
        return cIntchannel != null && !cIntchannel.isEmpty();
      case XDstmdataPackage.TTYPES__CEXTCHANNEL:
        return cExtchannel != null && !cExtchannel.isEmpty();
      case XDstmdataPackage.TTYPES__VVARIABLE:
        return vVariable != null && !vVariable.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //tTypesImpl