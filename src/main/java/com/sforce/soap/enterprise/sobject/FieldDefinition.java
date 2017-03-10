package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class FieldDefinition extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public FieldDefinition() {
  }
    
  
  /**
   * element  : ControlledFields of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo ControlledFields__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ControlledFields","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean ControlledFields__is_set = false;

  private com.sforce.soap.enterprise.QueryResult ControlledFields;

  public com.sforce.soap.enterprise.QueryResult getControlledFields() {
    return ControlledFields;
  }

  

  public void setControlledFields(com.sforce.soap.enterprise.QueryResult ControlledFields) {
    this.ControlledFields = ControlledFields;
    ControlledFields__is_set = true;
  }
  
  /**
   * element  : ControllingFieldDefinition of type {urn:sobject.enterprise.soap.sforce.com}FieldDefinition
   * java type: com.sforce.soap.enterprise.sobject.FieldDefinition
   */
  private static final com.sforce.ws.bind.TypeInfo ControllingFieldDefinition__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ControllingFieldDefinition","urn:sobject.enterprise.soap.sforce.com","FieldDefinition",0,1,true);

  private boolean ControllingFieldDefinition__is_set = false;

  private com.sforce.soap.enterprise.sobject.FieldDefinition ControllingFieldDefinition;

  public com.sforce.soap.enterprise.sobject.FieldDefinition getControllingFieldDefinition() {
    return ControllingFieldDefinition;
  }

  

  public void setControllingFieldDefinition(com.sforce.soap.enterprise.sobject.FieldDefinition ControllingFieldDefinition) {
    this.ControllingFieldDefinition = ControllingFieldDefinition;
    ControllingFieldDefinition__is_set = true;
  }
  
  /**
   * element  : ControllingFieldDefinitionId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ControllingFieldDefinitionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ControllingFieldDefinitionId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ControllingFieldDefinitionId__is_set = false;

  private java.lang.String ControllingFieldDefinitionId;

  public java.lang.String getControllingFieldDefinitionId() {
    return ControllingFieldDefinitionId;
  }

  

  public void setControllingFieldDefinitionId(java.lang.String ControllingFieldDefinitionId) {
    this.ControllingFieldDefinitionId = ControllingFieldDefinitionId;
    ControllingFieldDefinitionId__is_set = true;
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
   * element  : IsIndexed of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsIndexed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsIndexed","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsIndexed__is_set = false;

  private java.lang.Boolean IsIndexed;

  public java.lang.Boolean getIsIndexed() {
    return IsIndexed;
  }

  

  public void setIsIndexed(java.lang.Boolean IsIndexed) {
    this.IsIndexed = IsIndexed;
    IsIndexed__is_set = true;
  }
  
  /**
   * element  : IsListFilterable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsListFilterable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsListFilterable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsListFilterable__is_set = false;

  private java.lang.Boolean IsListFilterable;

  public java.lang.Boolean getIsListFilterable() {
    return IsListFilterable;
  }

  

  public void setIsListFilterable(java.lang.Boolean IsListFilterable) {
    this.IsListFilterable = IsListFilterable;
    IsListFilterable__is_set = true;
  }
  
  /**
   * element  : IsListSortable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsListSortable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsListSortable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsListSortable__is_set = false;

  private java.lang.Boolean IsListSortable;

  public java.lang.Boolean getIsListSortable() {
    return IsListSortable;
  }

  

  public void setIsListSortable(java.lang.Boolean IsListSortable) {
    this.IsListSortable = IsListSortable;
    IsListSortable__is_set = true;
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
   * element  : LastModifiedBy of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo LastModifiedBy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastModifiedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean LastModifiedBy__is_set = false;

  private com.sforce.soap.enterprise.sobject.User LastModifiedBy;

  public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
    return LastModifiedBy;
  }

  

  public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User LastModifiedBy) {
    this.LastModifiedBy = LastModifiedBy;
    LastModifiedBy__is_set = true;
  }
  
  /**
   * element  : LastModifiedById of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LastModifiedById__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastModifiedById","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LastModifiedById__is_set = false;

  private java.lang.String LastModifiedById;

  public java.lang.String getLastModifiedById() {
    return LastModifiedById;
  }

  

  public void setLastModifiedById(java.lang.String LastModifiedById) {
    this.LastModifiedById = LastModifiedById;
    LastModifiedById__is_set = true;
  }
  
  /**
   * element  : LastModifiedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastModifiedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastModifiedDate__is_set = false;

  private java.util.Calendar LastModifiedDate;

  public java.util.Calendar getLastModifiedDate() {
    return LastModifiedDate;
  }

  

  public void setLastModifiedDate(java.util.Calendar LastModifiedDate) {
    this.LastModifiedDate = LastModifiedDate;
    LastModifiedDate__is_set = true;
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
   * element  : Particles of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Particles__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Particles","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Particles__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Particles;

  public com.sforce.soap.enterprise.QueryResult getParticles() {
    return Particles;
  }

  

  public void setParticles(com.sforce.soap.enterprise.QueryResult Particles) {
    this.Particles = Particles;
    Particles__is_set = true;
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
   * element  : Publisher of type {urn:sobject.enterprise.soap.sforce.com}Publisher
   * java type: com.sforce.soap.enterprise.sobject.Publisher
   */
  private static final com.sforce.ws.bind.TypeInfo Publisher__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Publisher","urn:sobject.enterprise.soap.sforce.com","Publisher",0,1,true);

  private boolean Publisher__is_set = false;

  private com.sforce.soap.enterprise.sobject.Publisher Publisher;

  public com.sforce.soap.enterprise.sobject.Publisher getPublisher() {
    return Publisher;
  }

  

  public void setPublisher(com.sforce.soap.enterprise.sobject.Publisher Publisher) {
    this.Publisher = Publisher;
    Publisher__is_set = true;
  }
  
  /**
   * element  : PublisherId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PublisherId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PublisherId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PublisherId__is_set = false;

  private java.lang.String PublisherId;

  public java.lang.String getPublisherId() {
    return PublisherId;
  }

  

  public void setPublisherId(java.lang.String PublisherId) {
    this.PublisherId = PublisherId;
    PublisherId__is_set = true;
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
   * element  : RelationshipDomains of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo RelationshipDomains__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RelationshipDomains","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean RelationshipDomains__is_set = false;

  private com.sforce.soap.enterprise.QueryResult RelationshipDomains;

  public com.sforce.soap.enterprise.QueryResult getRelationshipDomains() {
    return RelationshipDomains;
  }

  

  public void setRelationshipDomains(com.sforce.soap.enterprise.QueryResult RelationshipDomains) {
    this.RelationshipDomains = RelationshipDomains;
    RelationshipDomains__is_set = true;
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
   * element  : RunningUserFieldAccess of type {urn:sobject.enterprise.soap.sforce.com}UserFieldAccess
   * java type: com.sforce.soap.enterprise.sobject.UserFieldAccess
   */
  private static final com.sforce.ws.bind.TypeInfo RunningUserFieldAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RunningUserFieldAccess","urn:sobject.enterprise.soap.sforce.com","UserFieldAccess",0,1,true);

  private boolean RunningUserFieldAccess__is_set = false;

  private com.sforce.soap.enterprise.sobject.UserFieldAccess RunningUserFieldAccess;

  public com.sforce.soap.enterprise.sobject.UserFieldAccess getRunningUserFieldAccess() {
    return RunningUserFieldAccess;
  }

  

  public void setRunningUserFieldAccess(com.sforce.soap.enterprise.sobject.UserFieldAccess RunningUserFieldAccess) {
    this.RunningUserFieldAccess = RunningUserFieldAccess;
    RunningUserFieldAccess__is_set = true;
  }
  
  /**
   * element  : RunningUserFieldAccessId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RunningUserFieldAccessId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RunningUserFieldAccessId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RunningUserFieldAccessId__is_set = false;

  private java.lang.String RunningUserFieldAccessId;

  public java.lang.String getRunningUserFieldAccessId() {
    return RunningUserFieldAccessId;
  }

  

  public void setRunningUserFieldAccessId(java.lang.String RunningUserFieldAccessId) {
    this.RunningUserFieldAccessId = RunningUserFieldAccessId;
    RunningUserFieldAccessId__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "FieldDefinition");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ControlledFields__typeInfo, ControlledFields, ControlledFields__is_set);
    __typeMapper.writeObject(__out, ControllingFieldDefinition__typeInfo, ControllingFieldDefinition, ControllingFieldDefinition__is_set);
    __typeMapper.writeString(__out, ControllingFieldDefinitionId__typeInfo, ControllingFieldDefinitionId, ControllingFieldDefinitionId__is_set);
    __typeMapper.writeString(__out, DataType__typeInfo, DataType, DataType__is_set);
    __typeMapper.writeString(__out, DeveloperName__typeInfo, DeveloperName, DeveloperName__is_set);
    __typeMapper.writeString(__out, DurableId__typeInfo, DurableId, DurableId__is_set);
    __typeMapper.writeObject(__out, EntityDefinition__typeInfo, EntityDefinition, EntityDefinition__is_set);
    __typeMapper.writeString(__out, EntityDefinitionId__typeInfo, EntityDefinitionId, EntityDefinitionId__is_set);
    __typeMapper.writeString(__out, ExtraTypeInfo__typeInfo, ExtraTypeInfo, ExtraTypeInfo__is_set);
    __typeMapper.writeObject(__out, IsApiFilterable__typeInfo, IsApiFilterable, IsApiFilterable__is_set);
    __typeMapper.writeObject(__out, IsApiGroupable__typeInfo, IsApiGroupable, IsApiGroupable__is_set);
    __typeMapper.writeObject(__out, IsApiSortable__typeInfo, IsApiSortable, IsApiSortable__is_set);
    __typeMapper.writeObject(__out, IsCalculated__typeInfo, IsCalculated, IsCalculated__is_set);
    __typeMapper.writeObject(__out, IsCompactLayoutable__typeInfo, IsCompactLayoutable, IsCompactLayoutable__is_set);
    __typeMapper.writeObject(__out, IsCompound__typeInfo, IsCompound, IsCompound__is_set);
    __typeMapper.writeObject(__out, IsFieldHistoryTracked__typeInfo, IsFieldHistoryTracked, IsFieldHistoryTracked__is_set);
    __typeMapper.writeObject(__out, IsHighScaleNumber__typeInfo, IsHighScaleNumber, IsHighScaleNumber__is_set);
    __typeMapper.writeObject(__out, IsHtmlFormatted__typeInfo, IsHtmlFormatted, IsHtmlFormatted__is_set);
    __typeMapper.writeObject(__out, IsIndexed__typeInfo, IsIndexed, IsIndexed__is_set);
    __typeMapper.writeObject(__out, IsListFilterable__typeInfo, IsListFilterable, IsListFilterable__is_set);
    __typeMapper.writeObject(__out, IsListSortable__typeInfo, IsListSortable, IsListSortable__is_set);
    __typeMapper.writeObject(__out, IsListVisible__typeInfo, IsListVisible, IsListVisible__is_set);
    __typeMapper.writeObject(__out, IsNameField__typeInfo, IsNameField, IsNameField__is_set);
    __typeMapper.writeObject(__out, IsNillable__typeInfo, IsNillable, IsNillable__is_set);
    __typeMapper.writeObject(__out, IsWorkflowFilterable__typeInfo, IsWorkflowFilterable, IsWorkflowFilterable__is_set);
    __typeMapper.writeString(__out, Label__typeInfo, Label, Label__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, Length__typeInfo, Length, Length__is_set);
    __typeMapper.writeString(__out, MasterLabel__typeInfo, MasterLabel, MasterLabel__is_set);
    __typeMapper.writeString(__out, NamespacePrefix__typeInfo, NamespacePrefix, NamespacePrefix__is_set);
    __typeMapper.writeObject(__out, Particles__typeInfo, Particles, Particles__is_set);
    __typeMapper.writeObject(__out, Precision__typeInfo, Precision, Precision__is_set);
    __typeMapper.writeObject(__out, Publisher__typeInfo, Publisher, Publisher__is_set);
    __typeMapper.writeString(__out, PublisherId__typeInfo, PublisherId, PublisherId__is_set);
    __typeMapper.writeString(__out, QualifiedApiName__typeInfo, QualifiedApiName, QualifiedApiName__is_set);
    __typeMapper.writeString(__out, ReferenceTargetField__typeInfo, ReferenceTargetField, ReferenceTargetField__is_set);
    __typeMapper.writeObject(__out, ReferenceTo__typeInfo, ReferenceTo, ReferenceTo__is_set);
    __typeMapper.writeObject(__out, RelationshipDomains__typeInfo, RelationshipDomains, RelationshipDomains__is_set);
    __typeMapper.writeString(__out, RelationshipName__typeInfo, RelationshipName, RelationshipName__is_set);
    __typeMapper.writeObject(__out, RunningUserFieldAccess__typeInfo, RunningUserFieldAccess, RunningUserFieldAccess__is_set);
    __typeMapper.writeString(__out, RunningUserFieldAccessId__typeInfo, RunningUserFieldAccessId, RunningUserFieldAccessId__is_set);
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
    if (__typeMapper.isElement(__in, ControlledFields__typeInfo)) {
      setControlledFields((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ControlledFields__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ControllingFieldDefinition__typeInfo)) {
      setControllingFieldDefinition((com.sforce.soap.enterprise.sobject.FieldDefinition)__typeMapper.readObject(__in, ControllingFieldDefinition__typeInfo, com.sforce.soap.enterprise.sobject.FieldDefinition.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ControllingFieldDefinitionId__typeInfo)) {
      setControllingFieldDefinitionId((java.lang.String)__typeMapper.readString(__in, ControllingFieldDefinitionId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DataType__typeInfo)) {
      setDataType((java.lang.String)__typeMapper.readString(__in, DataType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DeveloperName__typeInfo)) {
      setDeveloperName((java.lang.String)__typeMapper.readString(__in, DeveloperName__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, IsCalculated__typeInfo)) {
      setIsCalculated((java.lang.Boolean)__typeMapper.readObject(__in, IsCalculated__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsCompactLayoutable__typeInfo)) {
      setIsCompactLayoutable((java.lang.Boolean)__typeMapper.readObject(__in, IsCompactLayoutable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsCompound__typeInfo)) {
      setIsCompound((java.lang.Boolean)__typeMapper.readObject(__in, IsCompound__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, IsIndexed__typeInfo)) {
      setIsIndexed((java.lang.Boolean)__typeMapper.readObject(__in, IsIndexed__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsListFilterable__typeInfo)) {
      setIsListFilterable((java.lang.Boolean)__typeMapper.readObject(__in, IsListFilterable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsListSortable__typeInfo)) {
      setIsListSortable((java.lang.Boolean)__typeMapper.readObject(__in, IsListSortable__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, IsNillable__typeInfo)) {
      setIsNillable((java.lang.Boolean)__typeMapper.readObject(__in, IsNillable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsWorkflowFilterable__typeInfo)) {
      setIsWorkflowFilterable((java.lang.Boolean)__typeMapper.readObject(__in, IsWorkflowFilterable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, Label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastModifiedBy__typeInfo)) {
      setLastModifiedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, LastModifiedBy__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastModifiedById__typeInfo)) {
      setLastModifiedById((java.lang.String)__typeMapper.readString(__in, LastModifiedById__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastModifiedDate__typeInfo)) {
      setLastModifiedDate((java.util.Calendar)__typeMapper.readObject(__in, LastModifiedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Length__typeInfo)) {
      setLength((java.lang.Integer)__typeMapper.readObject(__in, Length__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MasterLabel__typeInfo)) {
      setMasterLabel((java.lang.String)__typeMapper.readString(__in, MasterLabel__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NamespacePrefix__typeInfo)) {
      setNamespacePrefix((java.lang.String)__typeMapper.readString(__in, NamespacePrefix__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Particles__typeInfo)) {
      setParticles((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Particles__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Precision__typeInfo)) {
      setPrecision((java.lang.Integer)__typeMapper.readObject(__in, Precision__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Publisher__typeInfo)) {
      setPublisher((com.sforce.soap.enterprise.sobject.Publisher)__typeMapper.readObject(__in, Publisher__typeInfo, com.sforce.soap.enterprise.sobject.Publisher.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PublisherId__typeInfo)) {
      setPublisherId((java.lang.String)__typeMapper.readString(__in, PublisherId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, RelationshipDomains__typeInfo)) {
      setRelationshipDomains((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, RelationshipDomains__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RelationshipName__typeInfo)) {
      setRelationshipName((java.lang.String)__typeMapper.readString(__in, RelationshipName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RunningUserFieldAccess__typeInfo)) {
      setRunningUserFieldAccess((com.sforce.soap.enterprise.sobject.UserFieldAccess)__typeMapper.readObject(__in, RunningUserFieldAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserFieldAccess.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RunningUserFieldAccessId__typeInfo)) {
      setRunningUserFieldAccessId((java.lang.String)__typeMapper.readString(__in, RunningUserFieldAccessId__typeInfo, java.lang.String.class));
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
    sb.append("[FieldDefinition ");
    sb.append(super.toString());
    sb.append(" ControlledFields=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ControlledFields)+"'\n");
    sb.append(" ControllingFieldDefinition=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ControllingFieldDefinition)+"'\n");
    sb.append(" ControllingFieldDefinitionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ControllingFieldDefinitionId)+"'\n");
    sb.append(" DataType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DataType)+"'\n");
    sb.append(" DeveloperName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DeveloperName)+"'\n");
    sb.append(" DurableId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DurableId)+"'\n");
    sb.append(" EntityDefinition=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EntityDefinition)+"'\n");
    sb.append(" EntityDefinitionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EntityDefinitionId)+"'\n");
    sb.append(" ExtraTypeInfo=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExtraTypeInfo)+"'\n");
    sb.append(" IsApiFilterable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsApiFilterable)+"'\n");
    sb.append(" IsApiGroupable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsApiGroupable)+"'\n");
    sb.append(" IsApiSortable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsApiSortable)+"'\n");
    sb.append(" IsCalculated=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsCalculated)+"'\n");
    sb.append(" IsCompactLayoutable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsCompactLayoutable)+"'\n");
    sb.append(" IsCompound=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsCompound)+"'\n");
    sb.append(" IsFieldHistoryTracked=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsFieldHistoryTracked)+"'\n");
    sb.append(" IsHighScaleNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsHighScaleNumber)+"'\n");
    sb.append(" IsHtmlFormatted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsHtmlFormatted)+"'\n");
    sb.append(" IsIndexed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsIndexed)+"'\n");
    sb.append(" IsListFilterable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsListFilterable)+"'\n");
    sb.append(" IsListSortable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsListSortable)+"'\n");
    sb.append(" IsListVisible=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsListVisible)+"'\n");
    sb.append(" IsNameField=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsNameField)+"'\n");
    sb.append(" IsNillable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsNillable)+"'\n");
    sb.append(" IsWorkflowFilterable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsWorkflowFilterable)+"'\n");
    sb.append(" Label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Label)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" Length=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Length)+"'\n");
    sb.append(" MasterLabel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MasterLabel)+"'\n");
    sb.append(" NamespacePrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NamespacePrefix)+"'\n");
    sb.append(" Particles=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Particles)+"'\n");
    sb.append(" Precision=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Precision)+"'\n");
    sb.append(" Publisher=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Publisher)+"'\n");
    sb.append(" PublisherId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PublisherId)+"'\n");
    sb.append(" QualifiedApiName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QualifiedApiName)+"'\n");
    sb.append(" ReferenceTargetField=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReferenceTargetField)+"'\n");
    sb.append(" ReferenceTo=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReferenceTo)+"'\n");
    sb.append(" RelationshipDomains=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RelationshipDomains)+"'\n");
    sb.append(" RelationshipName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RelationshipName)+"'\n");
    sb.append(" RunningUserFieldAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RunningUserFieldAccess)+"'\n");
    sb.append(" RunningUserFieldAccessId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RunningUserFieldAccessId)+"'\n");
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