package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class SearchLayout extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public SearchLayout() {
  }
    
  
  /**
   * element  : ButtonsDisplayed of type {urn:enterprise.soap.sforce.com}SearchLayoutButtonsDisplayed
   * java type: com.sforce.soap.enterprise.SearchLayoutButtonsDisplayed
   */
  private static final com.sforce.ws.bind.TypeInfo ButtonsDisplayed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ButtonsDisplayed","urn:enterprise.soap.sforce.com","SearchLayoutButtonsDisplayed",0,1,true);

  private boolean ButtonsDisplayed__is_set = false;

  private com.sforce.soap.enterprise.SearchLayoutButtonsDisplayed ButtonsDisplayed;

  public com.sforce.soap.enterprise.SearchLayoutButtonsDisplayed getButtonsDisplayed() {
    return ButtonsDisplayed;
  }

  

  public void setButtonsDisplayed(com.sforce.soap.enterprise.SearchLayoutButtonsDisplayed ButtonsDisplayed) {
    this.ButtonsDisplayed = ButtonsDisplayed;
    ButtonsDisplayed__is_set = true;
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
   * element  : FieldsDisplayed of type {urn:enterprise.soap.sforce.com}SearchLayoutFieldsDisplayed
   * java type: com.sforce.soap.enterprise.SearchLayoutFieldsDisplayed
   */
  private static final com.sforce.ws.bind.TypeInfo FieldsDisplayed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FieldsDisplayed","urn:enterprise.soap.sforce.com","SearchLayoutFieldsDisplayed",0,1,true);

  private boolean FieldsDisplayed__is_set = false;

  private com.sforce.soap.enterprise.SearchLayoutFieldsDisplayed FieldsDisplayed;

  public com.sforce.soap.enterprise.SearchLayoutFieldsDisplayed getFieldsDisplayed() {
    return FieldsDisplayed;
  }

  

  public void setFieldsDisplayed(com.sforce.soap.enterprise.SearchLayoutFieldsDisplayed FieldsDisplayed) {
    this.FieldsDisplayed = FieldsDisplayed;
    FieldsDisplayed__is_set = true;
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
   * element  : LayoutType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LayoutType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LayoutType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LayoutType__is_set = false;

  private java.lang.String LayoutType;

  public java.lang.String getLayoutType() {
    return LayoutType;
  }

  

  public void setLayoutType(java.lang.String LayoutType) {
    this.LayoutType = LayoutType;
    LayoutType__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "SearchLayout");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ButtonsDisplayed__typeInfo, ButtonsDisplayed, ButtonsDisplayed__is_set);
    __typeMapper.writeString(__out, DurableId__typeInfo, DurableId, DurableId__is_set);
    __typeMapper.writeObject(__out, EntityDefinition__typeInfo, EntityDefinition, EntityDefinition__is_set);
    __typeMapper.writeString(__out, EntityDefinitionId__typeInfo, EntityDefinitionId, EntityDefinitionId__is_set);
    __typeMapper.writeObject(__out, FieldsDisplayed__typeInfo, FieldsDisplayed, FieldsDisplayed__is_set);
    __typeMapper.writeString(__out, Label__typeInfo, Label, Label__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, LayoutType__typeInfo, LayoutType, LayoutType__is_set);
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
    if (__typeMapper.isElement(__in, ButtonsDisplayed__typeInfo)) {
      setButtonsDisplayed((com.sforce.soap.enterprise.SearchLayoutButtonsDisplayed)__typeMapper.readObject(__in, ButtonsDisplayed__typeInfo, com.sforce.soap.enterprise.SearchLayoutButtonsDisplayed.class));
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
    if (__typeMapper.isElement(__in, FieldsDisplayed__typeInfo)) {
      setFieldsDisplayed((com.sforce.soap.enterprise.SearchLayoutFieldsDisplayed)__typeMapper.readObject(__in, FieldsDisplayed__typeInfo, com.sforce.soap.enterprise.SearchLayoutFieldsDisplayed.class));
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
    if (__typeMapper.isElement(__in, LayoutType__typeInfo)) {
      setLayoutType((java.lang.String)__typeMapper.readString(__in, LayoutType__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SearchLayout ");
    sb.append(super.toString());
    sb.append(" ButtonsDisplayed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ButtonsDisplayed)+"'\n");
    sb.append(" DurableId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DurableId)+"'\n");
    sb.append(" EntityDefinition=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EntityDefinition)+"'\n");
    sb.append(" EntityDefinitionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EntityDefinitionId)+"'\n");
    sb.append(" FieldsDisplayed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FieldsDisplayed)+"'\n");
    sb.append(" Label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Label)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LayoutType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LayoutType)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}