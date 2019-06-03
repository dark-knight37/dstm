/**
 * generated by Xtext 2.13.0
 */
package org.xtext.unina.xdstmdata.xDstmdata.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.unina.xdstmdata.xDstmdata.XDstmdataFactory;
import org.xtext.unina.xdstmdata.xDstmdata.XDstmdataPackage;
import org.xtext.unina.xdstmdata.xDstmdata.cExtchannel;
import org.xtext.unina.xdstmdata.xDstmdata.cIntchannel;
import org.xtext.unina.xdstmdata.xDstmdata.channel_specifier;
import org.xtext.unina.xdstmdata.xDstmdata.composingtype;
import org.xtext.unina.xdstmdata.xDstmdata.subtype;
import org.xtext.unina.xdstmdata.xDstmdata.tCompound;
import org.xtext.unina.xdstmdata.xDstmdata.tEnum;
import org.xtext.unina.xdstmdata.xDstmdata.tMultitype;
import org.xtext.unina.xdstmdata.xDstmdata.tTypes;
import org.xtext.unina.xdstmdata.xDstmdata.vVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XDstmdataPackageImpl extends EPackageImpl implements XDstmdataPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tTypesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tEnumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tCompoundEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subtypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass channel_specifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tMultitypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass composingtypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cIntchannelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cExtchannelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vVariableEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.unina.xdstmdata.xDstmdata.XDstmdataPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private XDstmdataPackageImpl()
  {
    super(eNS_URI, XDstmdataFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link XDstmdataPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static XDstmdataPackage init()
  {
    if (isInited) return (XDstmdataPackage)EPackage.Registry.INSTANCE.getEPackage(XDstmdataPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredXDstmdataPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    XDstmdataPackageImpl theXDstmdataPackage = registeredXDstmdataPackage instanceof XDstmdataPackageImpl ? (XDstmdataPackageImpl)registeredXDstmdataPackage : new XDstmdataPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theXDstmdataPackage.createPackageContents();

    // Initialize created meta-data
    theXDstmdataPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theXDstmdataPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(XDstmdataPackage.eNS_URI, theXDstmdataPackage);
    return theXDstmdataPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettTypes()
  {
    return tTypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettTypes_TEnum()
  {
    return (EReference)tTypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettTypes_TCompound()
  {
    return (EReference)tTypesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettTypes_TMultitype()
  {
    return (EReference)tTypesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettTypes_CIntchannel()
  {
    return (EReference)tTypesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettTypes_CExtchannel()
  {
    return (EReference)tTypesEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettTypes_VVariable()
  {
    return (EReference)tTypesEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettEnum()
  {
    return tEnumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettEnum_Name()
  {
    return (EAttribute)tEnumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettEnum_Literals()
  {
    return (EAttribute)tEnumEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettCompound()
  {
    return tCompoundEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettCompound_Name()
  {
    return (EAttribute)tCompoundEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettCompound_Subtypes()
  {
    return (EReference)tCompoundEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsubtype()
  {
    return subtypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsubtype_TString()
  {
    return (EAttribute)subtypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsubtype_TChn()
  {
    return (EReference)subtypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsubtype_TID()
  {
    return (EAttribute)subtypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getchannel_specifier()
  {
    return channel_specifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getchannel_specifier_Type()
  {
    return (EAttribute)channel_specifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettMultitype()
  {
    return tMultitypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettMultitype_Name()
  {
    return (EAttribute)tMultitypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettMultitype_Composingtypes()
  {
    return (EReference)tMultitypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcomposingtype()
  {
    return composingtypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcomposingtype_TString()
  {
    return (EAttribute)composingtypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcomposingtype_TChn()
  {
    return (EReference)composingtypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcomposingtype_TID()
  {
    return (EAttribute)composingtypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcIntchannel()
  {
    return cIntchannelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcIntchannel_Name()
  {
    return (EAttribute)cIntchannelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcIntchannel_Bound()
  {
    return (EAttribute)cIntchannelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcIntchannel_TString()
  {
    return (EAttribute)cIntchannelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcIntchannel_TChn()
  {
    return (EReference)cIntchannelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcIntchannel_TID()
  {
    return (EAttribute)cIntchannelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcExtchannel()
  {
    return cExtchannelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcExtchannel_Name()
  {
    return (EAttribute)cExtchannelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcExtchannel_TString()
  {
    return (EAttribute)cExtchannelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcExtchannel_TChn()
  {
    return (EReference)cExtchannelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcExtchannel_TID()
  {
    return (EAttribute)cExtchannelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvVariable()
  {
    return vVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvVariable_TString()
  {
    return (EAttribute)vVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvVariable_TChn()
  {
    return (EReference)vVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvVariable_TID()
  {
    return (EAttribute)vVariableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvVariable_Name()
  {
    return (EAttribute)vVariableEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDstmdataFactory getXDstmdataFactory()
  {
    return (XDstmdataFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    tTypesEClass = createEClass(TTYPES);
    createEReference(tTypesEClass, TTYPES__TENUM);
    createEReference(tTypesEClass, TTYPES__TCOMPOUND);
    createEReference(tTypesEClass, TTYPES__TMULTITYPE);
    createEReference(tTypesEClass, TTYPES__CINTCHANNEL);
    createEReference(tTypesEClass, TTYPES__CEXTCHANNEL);
    createEReference(tTypesEClass, TTYPES__VVARIABLE);

    tEnumEClass = createEClass(TENUM);
    createEAttribute(tEnumEClass, TENUM__NAME);
    createEAttribute(tEnumEClass, TENUM__LITERALS);

    tCompoundEClass = createEClass(TCOMPOUND);
    createEAttribute(tCompoundEClass, TCOMPOUND__NAME);
    createEReference(tCompoundEClass, TCOMPOUND__SUBTYPES);

    subtypeEClass = createEClass(SUBTYPE);
    createEAttribute(subtypeEClass, SUBTYPE__TSTRING);
    createEReference(subtypeEClass, SUBTYPE__TCHN);
    createEAttribute(subtypeEClass, SUBTYPE__TID);

    channel_specifierEClass = createEClass(CHANNEL_SPECIFIER);
    createEAttribute(channel_specifierEClass, CHANNEL_SPECIFIER__TYPE);

    tMultitypeEClass = createEClass(TMULTITYPE);
    createEAttribute(tMultitypeEClass, TMULTITYPE__NAME);
    createEReference(tMultitypeEClass, TMULTITYPE__COMPOSINGTYPES);

    composingtypeEClass = createEClass(COMPOSINGTYPE);
    createEAttribute(composingtypeEClass, COMPOSINGTYPE__TSTRING);
    createEReference(composingtypeEClass, COMPOSINGTYPE__TCHN);
    createEAttribute(composingtypeEClass, COMPOSINGTYPE__TID);

    cIntchannelEClass = createEClass(CINTCHANNEL);
    createEAttribute(cIntchannelEClass, CINTCHANNEL__NAME);
    createEAttribute(cIntchannelEClass, CINTCHANNEL__BOUND);
    createEAttribute(cIntchannelEClass, CINTCHANNEL__TSTRING);
    createEReference(cIntchannelEClass, CINTCHANNEL__TCHN);
    createEAttribute(cIntchannelEClass, CINTCHANNEL__TID);

    cExtchannelEClass = createEClass(CEXTCHANNEL);
    createEAttribute(cExtchannelEClass, CEXTCHANNEL__NAME);
    createEAttribute(cExtchannelEClass, CEXTCHANNEL__TSTRING);
    createEReference(cExtchannelEClass, CEXTCHANNEL__TCHN);
    createEAttribute(cExtchannelEClass, CEXTCHANNEL__TID);

    vVariableEClass = createEClass(VVARIABLE);
    createEAttribute(vVariableEClass, VVARIABLE__TSTRING);
    createEReference(vVariableEClass, VVARIABLE__TCHN);
    createEAttribute(vVariableEClass, VVARIABLE__TID);
    createEAttribute(vVariableEClass, VVARIABLE__NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(tTypesEClass, tTypes.class, "tTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettTypes_TEnum(), this.gettEnum(), null, "tEnum", null, 0, -1, tTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettTypes_TCompound(), this.gettCompound(), null, "tCompound", null, 0, -1, tTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettTypes_TMultitype(), this.gettMultitype(), null, "tMultitype", null, 0, -1, tTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettTypes_CIntchannel(), this.getcIntchannel(), null, "cIntchannel", null, 0, -1, tTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettTypes_CExtchannel(), this.getcExtchannel(), null, "cExtchannel", null, 0, -1, tTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettTypes_VVariable(), this.getvVariable(), null, "vVariable", null, 0, -1, tTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tEnumEClass, tEnum.class, "tEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettEnum_Name(), ecorePackage.getEString(), "name", null, 0, 1, tEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gettEnum_Literals(), ecorePackage.getEString(), "literals", null, 0, -1, tEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tCompoundEClass, tCompound.class, "tCompound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettCompound_Name(), ecorePackage.getEString(), "name", null, 0, 1, tCompound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettCompound_Subtypes(), this.getsubtype(), null, "subtypes", null, 0, -1, tCompound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subtypeEClass, subtype.class, "subtype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsubtype_TString(), ecorePackage.getEString(), "tString", null, 0, 1, subtype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsubtype_TChn(), this.getchannel_specifier(), null, "tChn", null, 0, 1, subtype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsubtype_TID(), ecorePackage.getEString(), "tID", null, 0, 1, subtype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(channel_specifierEClass, channel_specifier.class, "channel_specifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getchannel_specifier_Type(), ecorePackage.getEString(), "type", null, 0, 1, channel_specifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tMultitypeEClass, tMultitype.class, "tMultitype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettMultitype_Name(), ecorePackage.getEString(), "name", null, 0, 1, tMultitype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettMultitype_Composingtypes(), this.getcomposingtype(), null, "composingtypes", null, 0, -1, tMultitype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(composingtypeEClass, composingtype.class, "composingtype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcomposingtype_TString(), ecorePackage.getEString(), "tString", null, 0, 1, composingtype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcomposingtype_TChn(), this.getchannel_specifier(), null, "tChn", null, 0, 1, composingtype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcomposingtype_TID(), ecorePackage.getEString(), "tID", null, 0, 1, composingtype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cIntchannelEClass, cIntchannel.class, "cIntchannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcIntchannel_Name(), ecorePackage.getEString(), "name", null, 0, 1, cIntchannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcIntchannel_Bound(), ecorePackage.getEInt(), "bound", null, 0, 1, cIntchannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcIntchannel_TString(), ecorePackage.getEString(), "tString", null, 0, 1, cIntchannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcIntchannel_TChn(), this.getchannel_specifier(), null, "tChn", null, 0, 1, cIntchannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcIntchannel_TID(), ecorePackage.getEString(), "tID", null, 0, 1, cIntchannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cExtchannelEClass, cExtchannel.class, "cExtchannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcExtchannel_Name(), ecorePackage.getEString(), "name", null, 0, 1, cExtchannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcExtchannel_TString(), ecorePackage.getEString(), "tString", null, 0, 1, cExtchannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcExtchannel_TChn(), this.getchannel_specifier(), null, "tChn", null, 0, 1, cExtchannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcExtchannel_TID(), ecorePackage.getEString(), "tID", null, 0, 1, cExtchannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vVariableEClass, vVariable.class, "vVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getvVariable_TString(), ecorePackage.getEString(), "tString", null, 0, 1, vVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvVariable_TChn(), this.getchannel_specifier(), null, "tChn", null, 0, 1, vVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getvVariable_TID(), ecorePackage.getEString(), "tID", null, 0, 1, vVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getvVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, vVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //XDstmdataPackageImpl
