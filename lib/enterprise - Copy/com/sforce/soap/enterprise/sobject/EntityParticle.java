package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class EntityParticle extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public EntityParticle() {
  }
    
  
  /**
   * element  : ByteLength of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo ByteLength__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ByteLength","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean ByteLength__is_set = false;

  private java.lang.Integer ByteLength;

  public java.lang.Integer getByteLength() {
    return ByteLength;
  }

  

  public void setByteLength(java.lang.Integer ByteLength) {
    this.ByteLength = ByteLength;
    ByteLength__is_set = true;
  }
  
  /**
   * element  : DataType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DataType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DataType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DataType__is_set = false;

  private java.lang.String DataType;

  public java.lang.String getDataType() {
    return DataType;
  }

  

  public void setDataType(java.lang.String DataType) {
    this.DataType = DataType;
    DataType__is_set = true;
  }
  
  /**
   * element  : DefaultValueFormula of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DefaultValueFormula__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DefaultValueFormula","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DefaultValueFormula__is_set = false;

  private java.lang.String DefaultValueFormula;

  public java.lang.String getDefaultValueFormula() {
    return DefaultValueFormula;
  }

  

  public void setDefaultValueFormula(java.lang.String DefaultValueFormula) {
    this.DefaultValueFormula = DefaultValueFormula;
    DefaultValueFormula__is_set = true;
  }
  
  /**
   * element  : DeveloperName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DeveloperName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DeveloperName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DeveloperName__is_set = false;

  private java.lang.String DeveloperName;

  public java.lang.String getDeveloperName() {
    return DeveloperName;
  }

  

  public void setDeveloperName(java.lang.String DeveloperName) {
    this.DeveloperName = DeveloperName;
    DeveloperName__is_set = true;
  }
  
  /**
   * element  : Digits of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo Digits__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Digits","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean Digits__is_set = false;

  private java.lang.Integer Digits;

  public java.lang.Integer getDigits() {
    return Digits;
  }

  

  public void setDigits(java.lang.Integer Digits) {
    this.Digits = Digits;
    Digits__is_set = true;
  }
  
  /**
   * element  : DurableId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DurableId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DurableId__is_set = false;

  private java.lang.String DurableId;

  public java.lang.String getDurableId() {
    return DurableId;
  }

  

  public void setDurableId(java.lang.String DurableId) {
    this.DurableId = DurableId;
    DurableId__is_set = true;
  }
  
  /**
   * element  : EntityDefinition of type {urn:sobject.enterprise.soap.sforce.com}EntityDefinition
   * java type: com.sforce.soap.enterprise.sobject.EntityDefinition
   */
  private static final com.sforce.ws.bind.TypeInfo EntityDefinition__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EntityDefinition","urn:sobject.enterprise.soap.sforce.com","EntityDefinition",0,1,true);

  private boolean EntityDefinition__is_set = false;

  private com.sforce.soap.enterprise.sobject.EntityDefinition EntityDefinition;

  public com.sforce.soap.enterprise.sobject.EntityDefinition getEntityDefinition() {
    return EntityDefinition;
  }

  

  public void setEntityDefinition(com.sforce.soap.enterprise.sobject.EntityDefinition EntityDefinition) {
    this.EntityDefinition = EntityDefinition;
    EntityDefinition__is_set = true;
  }
  
  /**
   * element  : EntityDefinitionId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EntityDefinitionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EntityDefinitionId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean EntityDefinitionId__is_set = false;

  private java.lang.String EntityDefinitionId;

  public java.lang.String getEntityDefinitionId() {
    return EntityDefinitionId;
  }

  

  public void setEntityDefinitionId(java.lang.String EntityDefinitionId) {
    this.EntityDefinitionId = EntityDefinitionId;
    EntityDefinitionId__is_set = true;
  }
  
  /**
   * element  : ExtraTypeInfo of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ExtraTypeInfo__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExtraTypeInfo","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ExtraTypeInfo__is_set = false;

  private java.lang.String ExtraTypeInfo;

  public java.lang.String getExtraTypeInfo() {
    return ExtraTypeInfo;
  }

  

  public void setExtraTypeInfo(java.lang.String ExtraTypeInfo) {
    this.ExtraTypeInfo = ExtraTypeInfo;
    ExtraTypeInfo__is_set = true;
  }
  
  /**
   * element  : FieldDefinition of type {urn:sobject.enterprise.soap.sforce.com}FieldDefinition
   * java type: com.sforce.soap.enterprise.sobject.FieldDefinition
   */
  private static final com.sforce.ws.bind.TypeInfo FieldDefinition__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FieldDefinition","urn:sobject.enterprise.soap.sforce.com","FieldDefinition",0,1,true);

  private boolean FieldDefinition__is_set = false;

  private com.sforce.soap.enterprise.sobject.FieldDefinition FieldDefinition;

  public com.sforce.soap.enterprise.sobject.FieldDefinition getFieldDefinition() {
    return FieldDefinition;
  }

  

  public void setFieldDefinition(com.sforce.soap.enterprise.sobject.FieldDefinition FieldDefinition) {
    this.FieldDefinition = FieldDefinition;
    FieldDefinition__is_set = true;
  }
  
  /**
   * element  : FieldDefinitionId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FieldDefinitionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FieldDefinitionId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FieldDefinitionId__is_set = false;

  private java.lang.String FieldDefinitionId;

  public java.lang.String getFieldDefinitionId() {
    return FieldDefinitionId;
  }

  

  public void setFieldDefinitionId(java.lang.String FieldDefinitionId) {
    this.FieldDefinitionId = FieldDefinitionId;
    FieldDefinitionId__is_set = true;
  }
  
  /**
   * element  : InlineHelpText of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo InlineHelpText__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","InlineHelpText","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean InlineHelpText__is_set = false;

  private java.lang.String InlineHelpText;

  public java.lang.String getInlineHelpText() {
    return InlineHelpText;
  }

  

  public void setInlineHelpText(java.lang.String InlineHelpText) {
    this.InlineHelpText = InlineHelpText;
    InlineHelpText__is_set = true;
  }
  
  /**
   * element  : IsApiFilterable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsApiFilterable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsApiFilterable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsApiFilterable__is_set = false;

  private java.lang.Boolean IsApiFilterable;

  public java.lang.Boolean getIsApiFilterable() {
    return IsApiFilterable;
  }

  

  public void setIsApiFilterable(java.lang.Boolean IsApiFilterable) {
    this.IsApiFilterable = IsApiFilterable;
    IsApiFilterable__is_set = true;
  }
  
  /**
   * element  : IsApiGroupable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsApiGroupable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsApiGroupable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsApiGroupable__is_set = false;

  private java.lang.Boolean IsApiGroupable;

  public java.lang.Boolean getIsApiGroupable() {
    return IsApiGroupable;
  }

  

  public void setIsApiGroupable(java.lang.Boolean IsApiGroupable) {
    this.IsApiGroupable = IsApiGroupable;
    IsApiGroupable__is_set = true;
  }
  
  /**
   * element  : IsApiSortable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsApiSortable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsApiSortable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsApiSortable__is_set = false;

  private java.lang.Boolean IsApiSortable;

  public java.lang.Boolean getIsApiSortable() {
    return IsApiSortable;
  }

  

  public void setIsApiSortable(java.lang.Boolean IsApiSortable) {
    this.IsApiSortable = IsApiSortable;
    IsApiSortable__is_set = true;
  }
  
  /**
   * element  : IsAutonumber of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsAutonumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsAutonumber","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsAutonumber__is_set = false;

  private java.lang.Boolean IsAutonumber;

  public java.lang.Boolean getIsAutonumber() {
    return IsAutonumber;
  }

  

  public void setIsAutonumber(java.lang.Boolean IsAutonumber) {
    this.IsAutonumber = IsAutonumber;
    IsAutonumber__is_set = true;
  }
  
  /**
   * element  : IsCalculated of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsCalculated__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsCalculated","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsCalculated__is_set = false;

  private java.lang.Boolean IsCalculated;

  public java.lang.Boolean getIsCalculated() {
    return IsCalculated;
  }

  

  public void setIsCalculated(java.lang.Boolean IsCalculated) {
    this.IsCalculated = IsCalculated;
    IsCalculated__is_set = true;
  }
  
  /**
   * element  : IsCaseSensitive of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsCaseSensitive__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsCaseSensitive","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsCaseSensitive__is_set = false;

  private java.lang.Boolean IsCaseSensitive;

  public java.lang.Boolean getIsCaseSensitive() {
    return IsCaseSensitive;
  }

  

  public void setIsCaseSensitive(java.lang.Boolean IsCaseSensitive) {
    this.IsCaseSensitive = IsCaseSensitive;
    IsCaseSensitive__is_set = true;
  }
  
  /**
   * element  : IsCompactLayoutable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsCompactLayoutable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsCompactLayoutable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsCompactLayoutable__is_set = false;

  private java.lang.Boolean IsCompactLayoutable;

  public java.lang.Boolean getIsCompactLayoutable() {
    return IsCompactLayoutable;
  }

  

  public void setIsCompactLayoutable(java.lang.Boolean IsCompactLayoutable) {
    this.IsCompactLayoutable = IsCompactLayoutable;
    IsCompactLayoutable__is_set = true;
  }
  
  /**
   * element  : IsComponent of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsComponent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsComponent","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsComponent__is_set = false;

  private java.lang.Boolean IsComponent;

  public java.lang.Boolean getIsComponent() {
    return IsComponent;
  }

  

  public void setIsComponent(java.lang.Boolean IsComponent) {
    this.IsComponent = IsComponent;
    IsComponent__is_set = true;
  }
  
  /**
   * element  : IsCompound of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsCompound__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsCompound","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsCompound__is_set = false;

  private java.lang.Boolean IsCompound;

  public java.lang.Boolean getIsCompound() {
    return IsCompound;
  }

  

  public void setIsCompound(java.lang.Boolean IsCompound) {
    this.IsCompound = IsCompound;
    IsCompound__is_set = true;
  }
  
  /**
   * element  : IsCreatable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsCreatable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsCreatable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsCreatable__is_set = false;

  private java.lang.Boolean IsCreatable;

  public java.lang.Boolean getIsCreatable() {
    return IsCreatable;
  }

  

  public void setIsCreatable(java.lang.Boolean IsCreatable) {
    this.IsCreatable = IsCreatable;
    IsCreatable__is_set = true;
  }
  
  /**
   * element  : IsDefaultedOnCreate of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsDefaultedOnCreate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsDefaultedOnCreate","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsDefaultedOnCreate__is_set = false;

  private java.lang.Boolean IsDefaultedOnCreate;

  public java.lang.Boolean getIsDefaultedOnCreate() {
    return IsDefaultedOnCreate;
  }

  

  public void setIsDefaultedOnCreate(java.lang.Boolean IsDefaultedOnCreate) {
    this.IsDefaultedOnCreate = IsDefaultedOnCreate;
    IsDefaultedOnCreate__is_set = true;
  }
  
  /**
   * element  : IsDependentPicklist of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsDependentPicklist__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsDependentPicklist","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsDependentPicklist__is_set = false;

  private java.lang.Boolean IsDependentPicklist;

  public java.lang.Boolean getIsDependentPicklist() {
    return IsDependentPicklist;
  }

  

  public void setIsDependentPicklist(java.lang.Boolean IsDependentPicklist) {
    this.IsDependentPicklist = IsDependentPicklist;
    IsDependentPicklist__is_set = true;
  }
  
  /**
   * element  : IsDeprecatedAndHidden of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsDeprecatedAndHidden__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsDeprecatedAndHidden","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsDeprecatedAndHidden__is_set = false;

  private java.lang.Boolean IsDeprecatedAndHidden;

  public java.lang.Boolean getIsDeprecatedAndHidden() {
    return IsDeprecatedAndHidden;
  }

  

  public void setIsDeprecatedAndHidden(java.lang.Boolean IsDeprecatedAndHidden) {
    this.IsDeprecatedAndHidden = IsDeprecatedAndHidden;
    IsDeprecatedAndHidden__is_set = true;
  }
  
  /**
   * element  : IsDisplayLocationInDecimal of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsDisplayLocationInDecimal__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsDisplayLocationInDecimal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsDisplayLocationInDecimal__is_set = false;

  private java.lang.Boolean IsDisplayLocationInDecimal;

  public java.lang.Boolean getIsDisplayLocationInDecimal() {
    return IsDisplayLocationInDecimal;
  }

  

  public void setIsDisplayLocationInDecimal(java.lang.Boolean IsDisplayLocationInDecimal) {
    this.IsDisplayLocationInDecimal = IsDisplayLocationInDecimal;
    IsDisplayLocationInDecimal__is_set = true;
  }
  
  /**
   * element  : IsEncrypted of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsEncrypted__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsEncrypted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsEncrypted__is_set = false;

  private java.lang.Boolean IsEncrypted;

  public java.lang.Boolean getIsEncrypted() {
    return IsEncrypted;
  }

  

  public void setIsEncrypted(java.lang.Boolean IsEncrypted) {
    this.IsEncrypted = IsEncrypted;
    IsEncrypted__is_set = true;
  }
  
  /**
   * element  : IsFieldHistoryTracked of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsFieldHistoryTracked__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsFieldHistoryTracked","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsFieldHistoryTracked__is_set = false;

  private java.lang.Boolean IsFieldHistoryTracked;

  public java.lang.Boolean getIsFieldHistoryTracked() {
    return IsFieldHistoryTracked;
  }

  

  public void setIsFieldHistoryTracked(java.lang.Boolean IsFieldHistoryTracked) {
    this.IsFieldHistoryTracked = IsFieldHistoryTracked;
    IsFieldHistoryTracked__is_set = true;
  }
  
  /**
   * element  : IsHighScaleNumber of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsHighScaleNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsHighScaleNumber","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsHighScaleNumber__is_set = false;

  private java.lang.Boolean IsHighScaleNumber;

  public java.lang.Boolean getIsHighScaleNumber() {
    return IsHighScaleNumber;
  }

  

  public void setIsHighScaleNumber(java.lang.Boolean IsHighScaleNumber) {
    this.IsHighScaleNumber = IsHighScaleNumber;
    IsHighScaleNumber__is_set = true;
  }
  
  /**
   * element  : IsHtmlFormatted of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsHtmlFormatted__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsHtmlFormatted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsHtmlFormatted__is_set = false;

  private java.lang.Boolean IsHtmlFormatted;

  public java.lang.Boolean getIsHtmlFormatted() {
    return IsHtmlFormatted;
  }

  

  public void setIsHtmlFormatted(java.lang.Boolean IsHtmlFormatted) {
    this.IsHtmlFormatted = IsHtmlFormatted;
    IsHtmlFormatted__is_set = true;
  }
  
  /**
   * element  : IsIdLookup of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsIdLookup__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsIdLookup","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsIdLookup__is_set = false;

  private java.lang.Boolean IsIdLookup;

  public java.lang.Boolean getIsIdLookup() {
    return IsIdLookup;
  }

  

  public void setIsIdLookup(java.lang.Boolean IsIdLookup) {
    this.IsIdLookup = IsIdLookup;
    IsIdLookup__is_set = true;
  }
  
  /**
   * element  : IsLayoutable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsLayoutable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsLayoutable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsLayoutable__is_set = false;

  private java.lang.Boolean IsLayoutable;

  public java.lang.Boolean getIsLayoutable() {
    return IsLayoutable;
  }

  

  public void setIsLayoutable(java.lang.Boolean IsLayoutable) {
    this.IsLayoutable = IsLayoutable;
    IsLayoutable__is_set = true;
  }
  
  /**
   * element  : IsListVisible of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsListVisible__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsListVisible","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsListVisible__is_set = false;

  private java.lang.Boolean IsListVisible;

  public java.lang.Boolean getIsListVisible() {
    return IsListVisible;
  }

  

  public void setIsListVisible(java.lang.Boolean IsListVisible) {
    this.IsListVisible = IsListVisible;
    IsListVisible__is_set = true;
  }
  
  /**
   * element  : IsNameField of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsNameField__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsNameField","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsNameField__is_set = false;

  private java.lang.Boolean IsNameField;

  public java.lang.Boolean getIsNameField() {
    return IsNameField;
  }

  

  public void setIsNameField(java.lang.Boolean IsNameField) {
    this.IsNameField = IsNameField;
    IsNameField__is_set = true;
  }
  
  /**
   * element  : IsNamePointing of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsNamePointing__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsNamePointing","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsNamePointing__is_set = false;

  private java.lang.Boolean IsNamePointing;

  public java.lang.Boolean getIsNamePointing() {
    return IsNamePointing;
  }

  

  public void setIsNamePointing(java.lang.Boolean IsNamePointing) {
    this.IsNamePointing = IsNamePointing;
    IsNamePointing__is_set = true;
  }
  
  /**
   * element  : IsNillable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsNillable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsNillable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsNillable__is_set = false;

  private java.lang.Boolean IsNillable;

  public java.lang.Boolean getIsNillable() {
    return IsNillable;
  }

  

  public void setIsNillable(java.lang.Boolean IsNillable) {
    this.IsNillable = IsNillable;
    IsNillable__is_set = true;
  }
  
  /**
   * element  : IsPermissionable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsPermissionable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsPermissionable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsPermissionable__is_set = false;

  private java.lang.Boolean IsPermissionable;

  public java.lang.Boolean getIsPermissionable() {
    return IsPermissionable;
  }

  

  public void setIsPermissionable(java.lang.Boolean IsPermissionable) {
    this.IsPermissionable = IsPermissionable;
    IsPermissionable__is_set = true;
  }
  
  /**
   * element  : IsUnique of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsUnique__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsUnique","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsUnique__is_set = false;

  private java.lang.Boolean IsUnique;

  public java.lang.Boolean getIsUnique() {
    return IsUnique;
  }

  

  public void setIsUnique(java.lang.Boolean IsUnique) {
    this.IsUnique = IsUnique;
    IsUnique__is_set = true;
  }
  
  /**
   * element  : IsUpdatable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsUpdatable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsUpdatable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsUpdatable__is_set = false;

  private java.lang.Boolean IsUpdatable;

  public java.lang.Boolean getIsUpdatable() {
    return IsUpdatable;
  }

  

  public void setIsUpdatable(java.lang.Boolean IsUpdatable) {
    this.IsUpdatable = IsUpdatable;
    IsUpdatable__is_set = true;
  }
  
  /**
   * element  : IsWorkflowFilterable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsWorkflowFilterable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsWorkflowFilterable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsWorkflowFilterable__is_set = false;

  private java.lang.Boolean IsWorkflowFilterable;

  public java.lang.Boolean getIsWorkflowFilterable() {
    return IsWorkflowFilterable;
  }

  

  public void setIsWorkflowFilterable(java.lang.Boolean IsWorkflowFilterable) {
    this.IsWorkflowFilterable = IsWorkflowFilterable;
    IsWorkflowFilterable__is_set = true;
  }
  
  /**
   * element  : IsWriteRequiresMasterRead of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsWriteRequiresMasterRead__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsWriteRequiresMasterRead","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsWriteRequiresMasterRead__is_set = false;

  private java.lang.Boolean IsWriteRequiresMasterRead;

  public java.lang.Boolean getIsWriteRequiresMasterRead() {
    return IsWriteRequiresMasterRead;
  }

  

  public void setIsWriteRequiresMasterRead(java.lang.Boolean IsWriteRequiresMasterRead) {
    this.IsWriteRequiresMasterRead = IsWriteRequiresMasterRead;
    IsWriteRequiresMasterRead__is_set = true;
  }
  
  /**
   * element  : Label of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Label__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Label","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Label__is_set = false;

  private java.lang.String Label;

  public java.lang.String getLabel() {
    return Label;
  }

  

  public void setLabel(java.lang.String Label) {
    this.Label = Label;
    Label__is_set = true;
  }
  
  /**
   * element  : Length of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo Length__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Length","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean Length__is_set = false;

  private java.lang.Integer Length;

  public java.lang.Integer getLength() {
    return Length;
  }

  

  public void setLength(java.lang.Integer Length) {
    this.Length = Length;
    Length__is_set = true;
  }
  
  /**
   * element  : Mask of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Mask__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Mask","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Mask__is_set = false;

  private java.lang.String Mask;

  public java.lang.String getMask() {
    return Mask;
  }

  

  public void setMask(java.lang.String Mask) {
    this.Mask = Mask;
    Mask__is_set = true;
  }
  
  /**
   * element  : MaskType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MaskType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaskType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MaskType__is_set = false;

  private java.lang.String MaskType;

  public java.lang.String getMaskType() {
    return MaskType;
  }

  

  public void setMaskType(java.lang.String MaskType) {
    this.MaskType = MaskType;
    MaskType__is_set = true;
  }
  
  /**
   * element  : MasterLabel of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MasterLabel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MasterLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MasterLabel__is_set = false;

  private java.lang.String MasterLabel;

  public java.lang.String getMasterLabel() {
    return MasterLabel;
  }

  

  public void setMasterLabel(java.lang.String MasterLabel) {
    this.MasterLabel = MasterLabel;
    MasterLabel__is_set = true;
  }
  
  /**
   * element  : Name of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Name__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Name__is_set = false;

  private java.lang.String Name;

  public java.lang.String getName() {
    return Name;
  }

  

  public void setName(java.lang.String Name) {
    this.Name = Name;
    Name__is_set = true;
  }
  
  /**
   * element  : NamespacePrefix of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo NamespacePrefix__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NamespacePrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean NamespacePrefix__is_set = false;

  private java.lang.String NamespacePrefix;

  public java.lang.String getNamespacePrefix() {
    return NamespacePrefix;
  }

  

  public void setNamespacePrefix(java.lang.String NamespacePrefix) {
    this.NamespacePrefix = NamespacePrefix;
    NamespacePrefix__is_set = true;
  }
  
  /**
   * element  : PicklistValues of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo PicklistValues__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PicklistValues","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean PicklistValues__is_set = false;

  private com.sforce.soap.enterprise.QueryResult PicklistValues;

  public com.sforce.soap.enterprise.QueryResult getPicklistValues() {
    return PicklistValues;
  }

  

  public void setPicklistValues(com.sforce.soap.enterprise.QueryResult PicklistValues) {
    this.PicklistValues = PicklistValues;
    PicklistValues__is_set = true;
  }
  
  /**
   * element  : Precision of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo Precision__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Precision","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean Precision__is_set = false;

  private java.lang.Integer Precision;

  public java.lang.Integer getPrecision() {
    return Precision;
  }

  

  public void setPrecision(java.lang.Integer Precision) {
    this.Precision = Precision;
    Precision__is_set = true;
  }
  
  /**
   * element  : QualifiedApiName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo QualifiedApiName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QualifiedApiName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean QualifiedApiName__is_set = false;

  private java.lang.String QualifiedApiName;

  public java.lang.String getQualifiedApiName() {
    return QualifiedApiName;
  }

  

  public void setQualifiedApiName(java.lang.String QualifiedApiName) {
    this.QualifiedApiName = QualifiedApiName;
    QualifiedApiName__is_set = true;
  }
  
  /**
   * element  : ReferenceTargetField of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ReferenceTargetField__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ReferenceTargetField","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ReferenceTargetField__is_set = false;

  private java.lang.String ReferenceTargetField;

  public java.lang.String getReferenceTargetField() {
    return ReferenceTargetField;
  }

  

  public void setReferenceTargetField(java.lang.String ReferenceTargetField) {
    this.ReferenceTargetField = ReferenceTargetField;
    ReferenceTargetField__is_set = true;
  }
  
  /**
   * element  : ReferenceTo of type {urn:enterprise.soap.sforce.com}RelationshipReferenceTo
   * java type: com.sforce.soap.enterprise.RelationshipReferenceTo
   */
  private static final com.sforce.ws.bind.TypeInfo ReferenceTo__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ReferenceTo","urn:enterprise.soap.sforce.com","RelationshipReferenceTo",0,1,true);

  private boolean ReferenceTo__is_set = false;

  private com.sforce.soap.enterprise.RelationshipReferenceTo ReferenceTo;

  public com.sforce.soap.enterprise.RelationshipReferenceTo getReferenceTo() {
    return ReferenceTo;
  }

  

  public void setReferenceTo(com.sforce.soap.enterprise.RelationshipReferenceTo ReferenceTo) {
    this.ReferenceTo = ReferenceTo;
    ReferenceTo__is_set = true;
  }
  
  /**
   * element  : RelationshipName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RelationshipName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RelationshipName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RelationshipName__is_set = false;

  private java.lang.String RelationshipName;

  public java.lang.String getRelationshipName() {
    return RelationshipName;
  }

  

  public void setRelationshipName(java.lang.String RelationshipName) {
    this.RelationshipName = RelationshipName;
    RelationshipName__is_set = true;
  }
  
  /**
   * element  : RelationshipOrder of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo RelationshipOrder__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RelationshipOrder","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean RelationshipOrder__is_set = false;

  private java.lang.Integer RelationshipOrder;

  public java.lang.Integer getRelationshipOrder() {
    return RelationshipOrder;
  }

  

  public void setRelationshipOrder(java.lang.Integer RelationshipOrder) {
    this.RelationshipOrder = RelationshipOrder;
    RelationshipOrder__is_set = true;
  }
  
  /**
   * element  : Scale of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo Scale__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Scale","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean Scale__is_set = false;

  private java.lang.Integer Scale;

  public java.lang.Integer getScale() {
    return Scale;
  }

  

  public void setScale(java.lang.Integer Scale) {
    this.Scale = Scale;
    Scale__is_set = true;
  }
  
  /**
   * element  : ServiceDataType of type {urn:sobject.enterprise.soap.sforce.com}DataType
   * java type: com.sforce.soap.enterprise.sobject.DataType
   */
  private static final com.sforce.ws.bind.TypeInfo ServiceDataType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ServiceDataType","urn:sobject.enterprise.soap.sforce.com","DataType",0,1,true);

  private boolean ServiceDataType__is_set = false;

  private com.sforce.soap.enterprise.sobject.DataType ServiceDataType;

  public com.sforce.soap.enterprise.sobject.DataType getServiceDataType() {
    return ServiceDataType;
  }

  

  public void setServiceDataType(com.sforce.soap.enterprise.sobject.DataType ServiceDataType) {
    this.ServiceDataType = ServiceDataType;
    ServiceDataType__is_set = true;
  }
  
  /**
   * element  : ServiceDataTypeId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ServiceDataTypeId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ServiceDataTypeId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ServiceDataTypeId__is_set = false;

  private java.lang.String ServiceDataTypeId;

  public java.lang.String getServiceDataTypeId() {
    return ServiceDataTypeId;
  }

  

  public void setServiceDataTypeId(java.lang.String ServiceDataTypeId) {
    this.ServiceDataTypeId = ServiceDataTypeId;
    ServiceDataTypeId__is_set = true;
  }
  
  /**
   * element  : ValueType of type {urn:sobject.enterprise.soap.sforce.com}DataType
   * java type: com.sforce.soap.enterprise.sobject.DataType
   */
  private static final com.sforce.ws.bind.TypeInfo ValueType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ValueType","urn:sobject.enterprise.soap.sforce.com","DataType",0,1,true);

  private boolean ValueType__is_set = false;

  private com.sforce.soap.enterprise.sobject.DataType ValueType;

  public com.sforce.soap.enterprise.sobject.DataType getValueType() {
    return ValueType;
  }

  

  public void setValueType(com.sforce.soap.enterprise.sobject.DataType ValueType) {
    this.ValueType = ValueType;
    ValueType__is_set = true;
  }
  
  /**
   * element  : ValueTypeId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ValueTypeId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ValueTypeId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ValueTypeId__is_set = false;

  private java.lang.String ValueTypeId;

  public java.lang.String getValueTypeId() {
    return ValueTypeId;
  }

  

  public void setValueTypeId(java.lang.String ValueTypeId) {
    this.ValueTypeId = ValueTypeId;
    ValueTypeId__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "EntityParticle");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ByteLength__typeInfo, ByteLength, ByteLength__is_set);
    __typeMapper.writeString(__out, DataType__typeInfo, DataType, DataType__is_set);
    __typeMapper.writeString(__out, DefaultValueFormula__typeInfo, DefaultValueFormula, DefaultValueFormula__is_set);
    __typeMapper.writeString(__out, DeveloperName__typeInfo, DeveloperName, DeveloperName__is_set);
    __typeMapper.writeObject(__out, Digits__typeInfo, Digits, Digits__is_set);
    __typeMapper.writeString(__out, DurableId__typeInfo, DurableId, DurableId__is_set);
    __typeMapper.writeObject(__out, EntityDefinition__typeInfo, EntityDefinition, EntityDefinition__is_set);
    __typeMapper.writeString(__out, EntityDefinitionId__typeInfo, EntityDefinitionId, EntityDefinitionId__is_set);
    __typeMapper.writeString(__out, ExtraTypeInfo__typeInfo, ExtraTypeInfo, ExtraTypeInfo__is_set);
    __typeMapper.writeObject(__out, FieldDefinition__typeInfo, FieldDefinition, FieldDefinition__is_set);
    __typeMapper.writeString(__out, FieldDefinitionId__typeInfo, FieldDefinitionId, FieldDefinitionId__is_set);
    __typeMapper.writeString(__out, InlineHelpText__typeInfo, InlineHelpText, InlineHelpText__is_set);
    __typeMapper.writeObject(__out, IsApiFilterable__typeInfo, IsApiFilterable, IsApiFilterable__is_set);
    __typeMapper.writeObject(__out, IsApiGroupable__typeInfo, IsApiGroupable, IsApiGroupable__is_set);
    __typeMapper.writeObject(__out, IsApiSortable__typeInfo, IsApiSortable, IsApiSortable__is_set);
    __typeMapper.writeObject(__out, IsAutonumber__typeInfo, IsAutonumber, IsAutonumber__is_set);
    __typeMapper.writeObject(__out, IsCalculated__typeInfo, IsCalculated, IsCalculated__is_set);
    __typeMapper.writeObject(__out, IsCaseSensitive__typeInfo, IsCaseSensitive, IsCaseSensitive__is_set);
    __typeMapper.writeObject(__out, IsCompactLayoutable__typeInfo, IsCompactLayoutable, IsCompactLayoutable__is_set);
    __typeMapper.writeObject(__out, IsComponent__typeInfo, IsComponent, IsComponent__is_set);
    __typeMapper.writeObject(__out, IsCompound__typeInfo, IsCompound, IsCompound__is_set);
    __typeMapper.writeObject(__out, IsCreatable__typeInfo, IsCreatable, IsCreatable__is_set);
    __typeMapper.writeObject(__out, IsDefaultedOnCreate__typeInfo, IsDefaultedOnCreate, IsDefaultedOnCreate__is_set);
    __typeMapper.writeObject(__out, IsDependentPicklist__typeInfo, IsDependentPicklist, IsDependentPicklist__is_set);
    __typeMapper.writeObject(__out, IsDeprecatedAndHidden__typeInfo, IsDeprecatedAndHidden, IsDeprecatedAndHidden__is_set);
    __typeMapper.writeObject(__out, IsDisplayLocationInDecimal__typeInfo, IsDisplayLocationInDecimal, IsDisplayLocationInDecimal__is_set);
    __typeMapper.writeObject(__out, IsEncrypted__typeInfo, IsEncrypted, IsEncrypted__is_set);
    __typeMapper.writeObject(__out, IsFieldHistoryTracked__typeInfo, IsFieldHistoryTracked, IsFieldHistoryTracked__is_set);
    __typeMapper.writeObject(__out, IsHighScaleNumber__typeInfo, IsHighScaleNumber, IsHighScaleNumber__is_set);
    __typeMapper.writeObject(__out, IsHtmlFormatted__typeInfo, IsHtmlFormatted, IsHtmlFormatted__is_set);
    __typeMapper.writeObject(__out, IsIdLookup__typeInfo, IsIdLookup, IsIdLookup__is_set);
    __typeMapper.writeObject(__out, IsLayoutable__typeInfo, IsLayoutable, IsLayoutable__is_set);
    __typeMapper.writeObject(__out, IsListVisible__typeInfo, IsListVisible, IsListVisible__is_set);
    __typeMapper.writeObject(__out, IsNameField__typeInfo, IsNameField, IsNameField__is_set);
    __typeMapper.writeObject(__out, IsNamePointing__typeInfo, IsNamePointing, IsNamePointing__is_set);
    __typeMapper.writeObject(__out, IsNillable__typeInfo, IsNillable, IsNillable__is_set);
    __typeMapper.writeObject(__out, IsPermissionable__typeInfo, IsPermissionable, IsPermissionable__is_set);
    __typeMapper.writeObject(__out, IsUnique__typeInfo, IsUnique, IsUnique__is_set);
    __typeMapper.writeObject(__out, IsUpdatable__typeInfo, IsUpdatable, IsUpdatable__is_set);
    __typeMapper.writeObject(__out, IsWorkflowFilterable__typeInfo, IsWorkflowFilterable, IsWorkflowFilterable__is_set);
    __typeMapper.writeObject(__out, IsWriteRequiresMasterRead__typeInfo, IsWriteRequiresMasterRead, IsWriteRequiresMasterRead__is_set);
    __typeMapper.writeString(__out, Label__typeInfo, Label, Label__is_set);
    __typeMapper.writeObject(__out, Length__typeInfo, Length, Length__is_set);
    __typeMapper.writeString(__out, Mask__typeInfo, Mask, Mask__is_set);
    __typeMapper.writeString(__out, MaskType__typeInfo, MaskType, MaskType__is_set);
    __typeMapper.writeString(__out, MasterLabel__typeInfo, MasterLabel, MasterLabel__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, NamespacePrefix__typeInfo, NamespacePrefix, NamespacePrefix__is_set);
    __typeMapper.writeObject(__out, PicklistValues__typeInfo, PicklistValues, PicklistValues__is_set);
    __typeMapper.writeObject(__out, Precision__typeInfo, Precision, Precision__is_set);
    __typeMapper.writeString(__out, QualifiedApiName__typeInfo, QualifiedApiName, QualifiedApiName__is_set);
    __typeMapper.writeString(__out, ReferenceTargetField__typeInfo, ReferenceTargetField, ReferenceTargetField__is_set);
    __typeMapper.writeObject(__out, ReferenceTo__typeInfo, ReferenceTo, ReferenceTo__is_set);
    __typeMapper.writeString(__out, RelationshipName__typeInfo, RelationshipName, RelationshipName__is_set);
    __typeMapper.writeObject(__out, RelationshipOrder__typeInfo, RelationshipOrder, RelationshipOrder__is_set);
    __typeMapper.writeObject(__out, Scale__typeInfo, Scale, Scale__is_set);
    __typeMapper.writeObject(__out, ServiceDataType__typeInfo, ServiceDataType, ServiceDataType__is_set);
    __typeMapper.writeString(__out, ServiceDataTypeId__typeInfo, ServiceDataTypeId, ServiceDataTypeId__is_set);
    __typeMapper.writeObject(__out, ValueType__typeInfo, ValueType, ValueType__is_set);
    __typeMapper.writeString(__out, ValueTypeId__typeInfo, ValueTypeId, ValueTypeId__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   super.loadFields(__in, __typeMapper);
    __in.peekTag();
    if (__typeMapper.isElement(__in, ByteLength__typeInfo)) {
      setByteLength((java.lang.Integer)__typeMapper.readObject(__in, ByteLength__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DataType__typeInfo)) {
      setDataType((java.lang.String)__typeMapper.readString(__in, DataType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DefaultValueFormula__typeInfo)) {
      setDefaultValueFormula((java.lang.String)__typeMapper.readString(__in, DefaultValueFormula__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DeveloperName__typeInfo)) {
      setDeveloperName((java.lang.String)__typeMapper.readString(__in, DeveloperName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Digits__typeInfo)) {
      setDigits((java.lang.Integer)__typeMapper.readObject(__in, Digits__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DurableId__typeInfo)) {
      setDurableId((java.lang.String)__typeMapper.readString(__in, DurableId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EntityDefinition__typeInfo)) {
      setEntityDefinition((com.sforce.soap.enterprise.sobject.EntityDefinition)__typeMapper.readObject(__in, EntityDefinition__typeInfo, com.sforce.soap.enterprise.sobject.EntityDefinition.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EntityDefinitionId__typeInfo)) {
      setEntityDefinitionId((java.lang.String)__typeMapper.readString(__in, EntityDefinitionId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExtraTypeInfo__typeInfo)) {
      setExtraTypeInfo((java.lang.String)__typeMapper.readString(__in, ExtraTypeInfo__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FieldDefinition__typeInfo)) {
      setFieldDefinition((com.sforce.soap.enterprise.sobject.FieldDefinition)__typeMapper.readObject(__in, FieldDefinition__typeInfo, com.sforce.soap.enterprise.sobject.FieldDefinition.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FieldDefinitionId__typeInfo)) {
      setFieldDefinitionId((java.lang.String)__typeMapper.readString(__in, FieldDefinitionId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InlineHelpText__typeInfo)) {
      setInlineHelpText((java.lang.String)__typeMapper.readString(__in, InlineHelpText__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsApiFilterable__typeInfo)) {
      setIsApiFilterable((java.lang.Boolean)__typeMapper.readObject(__in, IsApiFilterable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsApiGroupable__typeInfo)) {
      setIsApiGroupable((java.lang.Boolean)__typeMapper.readObject(__in, IsApiGroupable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsApiSortable__typeInfo)) {
      setIsApiSortable((java.lang.Boolean)__typeMapper.readObject(__in, IsApiSortable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsAutonumber__typeInfo)) {
      setIsAutonumber((java.lang.Boolean)__typeMapper.readObject(__in, IsAutonumber__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsCalculated__typeInfo)) {
      setIsCalculated((java.lang.Boolean)__typeMapper.readObject(__in, IsCalculated__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsCaseSensitive__typeInfo)) {
      setIsCaseSensitive((java.lang.Boolean)__typeMapper.readObject(__in, IsCaseSensitive__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsCompactLayoutable__typeInfo)) {
      setIsCompactLayoutable((java.lang.Boolean)__typeMapper.readObject(__in, IsCompactLayoutable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsComponent__typeInfo)) {
      setIsComponent((java.lang.Boolean)__typeMapper.readObject(__in, IsComponent__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsCompound__typeInfo)) {
      setIsCompound((java.lang.Boolean)__typeMapper.readObject(__in, IsCompound__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsCreatable__typeInfo)) {
      setIsCreatable((java.lang.Boolean)__typeMapper.readObject(__in, IsCreatable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDefaultedOnCreate__typeInfo)) {
      setIsDefaultedOnCreate((java.lang.Boolean)__typeMapper.readObject(__in, IsDefaultedOnCreate__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDependentPicklist__typeInfo)) {
      setIsDependentPicklist((java.lang.Boolean)__typeMapper.readObject(__in, IsDependentPicklist__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeprecatedAndHidden__typeInfo)) {
      setIsDeprecatedAndHidden((java.lang.Boolean)__typeMapper.readObject(__in, IsDeprecatedAndHidden__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDisplayLocationInDecimal__typeInfo)) {
      setIsDisplayLocationInDecimal((java.lang.Boolean)__typeMapper.readObject(__in, IsDisplayLocationInDecimal__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsEncrypted__typeInfo)) {
      setIsEncrypted((java.lang.Boolean)__typeMapper.readObject(__in, IsEncrypted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsFieldHistoryTracked__typeInfo)) {
      setIsFieldHistoryTracked((java.lang.Boolean)__typeMapper.readObject(__in, IsFieldHistoryTracked__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsHighScaleNumber__typeInfo)) {
      setIsHighScaleNumber((java.lang.Boolean)__typeMapper.readObject(__in, IsHighScaleNumber__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsHtmlFormatted__typeInfo)) {
      setIsHtmlFormatted((java.lang.Boolean)__typeMapper.readObject(__in, IsHtmlFormatted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsIdLookup__typeInfo)) {
      setIsIdLookup((java.lang.Boolean)__typeMapper.readObject(__in, IsIdLookup__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsLayoutable__typeInfo)) {
      setIsLayoutable((java.lang.Boolean)__typeMapper.readObject(__in, IsLayoutable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsListVisible__typeInfo)) {
      setIsListVisible((java.lang.Boolean)__typeMapper.readObject(__in, IsListVisible__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsNameField__typeInfo)) {
      setIsNameField((java.lang.Boolean)__typeMapper.readObject(__in, IsNameField__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsNamePointing__typeInfo)) {
      setIsNamePointing((java.lang.Boolean)__typeMapper.readObject(__in, IsNamePointing__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsNillable__typeInfo)) {
      setIsNillable((java.lang.Boolean)__typeMapper.readObject(__in, IsNillable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsPermissionable__typeInfo)) {
      setIsPermissionable((java.lang.Boolean)__typeMapper.readObject(__in, IsPermissionable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsUnique__typeInfo)) {
      setIsUnique((java.lang.Boolean)__typeMapper.readObject(__in, IsUnique__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsUpdatable__typeInfo)) {
      setIsUpdatable((java.lang.Boolean)__typeMapper.readObject(__in, IsUpdatable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsWorkflowFilterable__typeInfo)) {
      setIsWorkflowFilterable((java.lang.Boolean)__typeMapper.readObject(__in, IsWorkflowFilterable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsWriteRequiresMasterRead__typeInfo)) {
      setIsWriteRequiresMasterRead((java.lang.Boolean)__typeMapper.readObject(__in, IsWriteRequiresMasterRead__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, Label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Length__typeInfo)) {
      setLength((java.lang.Integer)__typeMapper.readObject(__in, Length__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Mask__typeInfo)) {
      setMask((java.lang.String)__typeMapper.readString(__in, Mask__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaskType__typeInfo)) {
      setMaskType((java.lang.String)__typeMapper.readString(__in, MaskType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MasterLabel__typeInfo)) {
      setMasterLabel((java.lang.String)__typeMapper.readString(__in, MasterLabel__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NamespacePrefix__typeInfo)) {
      setNamespacePrefix((java.lang.String)__typeMapper.readString(__in, NamespacePrefix__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PicklistValues__typeInfo)) {
      setPicklistValues((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, PicklistValues__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Precision__typeInfo)) {
      setPrecision((java.lang.Integer)__typeMapper.readObject(__in, Precision__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QualifiedApiName__typeInfo)) {
      setQualifiedApiName((java.lang.String)__typeMapper.readString(__in, QualifiedApiName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ReferenceTargetField__typeInfo)) {
      setReferenceTargetField((java.lang.String)__typeMapper.readString(__in, ReferenceTargetField__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ReferenceTo__typeInfo)) {
      setReferenceTo((com.sforce.soap.enterprise.RelationshipReferenceTo)__typeMapper.readObject(__in, ReferenceTo__typeInfo, com.sforce.soap.enterprise.RelationshipReferenceTo.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RelationshipName__typeInfo)) {
      setRelationshipName((java.lang.String)__typeMapper.readString(__in, RelationshipName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RelationshipOrder__typeInfo)) {
      setRelationshipOrder((java.lang.Integer)__typeMapper.readObject(__in, RelationshipOrder__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Scale__typeInfo)) {
      setScale((java.lang.Integer)__typeMapper.readObject(__in, Scale__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ServiceDataType__typeInfo)) {
      setServiceDataType((com.sforce.soap.enterprise.sobject.DataType)__typeMapper.readObject(__in, ServiceDataType__typeInfo, com.sforce.soap.enterprise.sobject.DataType.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ServiceDataTypeId__typeInfo)) {
      setServiceDataTypeId((java.lang.String)__typeMapper.readString(__in, ServiceDataTypeId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ValueType__typeInfo)) {
      setValueType((com.sforce.soap.enterprise.sobject.DataType)__typeMapper.readObject(__in, ValueType__typeInfo, com.sforce.soap.enterprise.sobject.DataType.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ValueTypeId__typeInfo)) {
      setValueTypeId((java.lang.String)__typeMapper.readString(__in, ValueTypeId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[EntityParticle ");
    sb.append(super.toString());
    sb.append(" ByteLength=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ByteLength)+"'\n");
    sb.append(" DataType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DataType)+"'\n");
    sb.append(" DefaultValueFormula=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DefaultValueFormula)+"'\n");
    sb.append(" DeveloperName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DeveloperName)+"'\n");
    sb.append(" Digits=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Digits)+"'\n");
    sb.append(" DurableId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DurableId)+"'\n");
    sb.append(" EntityDefinition=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EntityDefinition)+"'\n");
    sb.append(" EntityDefinitionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EntityDefinitionId)+"'\n");
    sb.append(" ExtraTypeInfo=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExtraTypeInfo)+"'\n");
    sb.append(" FieldDefinition=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FieldDefinition)+"'\n");
    sb.append(" FieldDefinitionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FieldDefinitionId)+"'\n");
    sb.append(" InlineHelpText=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InlineHelpText)+"'\n");
    sb.append(" IsApiFilterable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsApiFilterable)+"'\n");
    sb.append(" IsApiGroupable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsApiGroupable)+"'\n");
    sb.append(" IsApiSortable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsApiSortable)+"'\n");
    sb.append(" IsAutonumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsAutonumber)+"'\n");
    sb.append(" IsCalculated=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsCalculated)+"'\n");
    sb.append(" IsCaseSensitive=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsCaseSensitive)+"'\n");
    sb.append(" IsCompactLayoutable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsCompactLayoutable)+"'\n");
    sb.append(" IsComponent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsComponent)+"'\n");
    sb.append(" IsCompound=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsCompound)+"'\n");
    sb.append(" IsCreatable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsCreatable)+"'\n");
    sb.append(" IsDefaultedOnCreate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDefaultedOnCreate)+"'\n");
    sb.append(" IsDependentPicklist=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDependentPicklist)+"'\n");
    sb.append(" IsDeprecatedAndHidden=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeprecatedAndHidden)+"'\n");
    sb.append(" IsDisplayLocationInDecimal=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDisplayLocationInDecimal)+"'\n");
    sb.append(" IsEncrypted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsEncrypted)+"'\n");
    sb.append(" IsFieldHistoryTracked=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsFieldHistoryTracked)+"'\n");
    sb.append(" IsHighScaleNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsHighScaleNumber)+"'\n");
    sb.append(" IsHtmlFormatted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsHtmlFormatted)+"'\n");
    sb.append(" IsIdLookup=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsIdLookup)+"'\n");
    sb.append(" IsLayoutable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsLayoutable)+"'\n");
    sb.append(" IsListVisible=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsListVisible)+"'\n");
    sb.append(" IsNameField=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsNameField)+"'\n");
    sb.append(" IsNamePointing=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsNamePointing)+"'\n");
    sb.append(" IsNillable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsNillable)+"'\n");
    sb.append(" IsPermissionable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsPermissionable)+"'\n");
    sb.append(" IsUnique=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsUnique)+"'\n");
    sb.append(" IsUpdatable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsUpdatable)+"'\n");
    sb.append(" IsWorkflowFilterable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsWorkflowFilterable)+"'\n");
    sb.append(" IsWriteRequiresMasterRead=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsWriteRequiresMasterRead)+"'\n");
    sb.append(" Label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Label)+"'\n");
    sb.append(" Length=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Length)+"'\n");
    sb.append(" Mask=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Mask)+"'\n");
    sb.append(" MaskType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaskType)+"'\n");
    sb.append(" MasterLabel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MasterLabel)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" NamespacePrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NamespacePrefix)+"'\n");
    sb.append(" PicklistValues=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PicklistValues)+"'\n");
    sb.append(" Precision=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Precision)+"'\n");
    sb.append(" QualifiedApiName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QualifiedApiName)+"'\n");
    sb.append(" ReferenceTargetField=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReferenceTargetField)+"'\n");
    sb.append(" ReferenceTo=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReferenceTo)+"'\n");
    sb.append(" RelationshipName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RelationshipName)+"'\n");
    sb.append(" RelationshipOrder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RelationshipOrder)+"'\n");
    sb.append(" Scale=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Scale)+"'\n");
    sb.append(" ServiceDataType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ServiceDataType)+"'\n");
    sb.append(" ServiceDataTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ServiceDataTypeId)+"'\n");
    sb.append(" ValueType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ValueType)+"'\n");
    sb.append(" ValueTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ValueTypeId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}