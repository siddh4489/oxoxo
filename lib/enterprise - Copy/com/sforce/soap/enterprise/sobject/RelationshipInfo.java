package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class RelationshipInfo extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public RelationshipInfo() {
  }
    
  
  /**
   * element  : ChildSobject of type {urn:sobject.enterprise.soap.sforce.com}EntityDefinition
   * java type: com.sforce.soap.enterprise.sobject.EntityDefinition
   */
  private static final com.sforce.ws.bind.TypeInfo ChildSobject__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ChildSobject","urn:sobject.enterprise.soap.sforce.com","EntityDefinition",0,1,true);

  private boolean ChildSobject__is_set = false;

  private com.sforce.soap.enterprise.sobject.EntityDefinition ChildSobject;

  public com.sforce.soap.enterprise.sobject.EntityDefinition getChildSobject() {
    return ChildSobject;
  }

  

  public void setChildSobject(com.sforce.soap.enterprise.sobject.EntityDefinition ChildSobject) {
    this.ChildSobject = ChildSobject;
    ChildSobject__is_set = true;
  }
  
  /**
   * element  : ChildSobjectId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ChildSobjectId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ChildSobjectId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ChildSobjectId__is_set = false;

  private java.lang.String ChildSobjectId;

  public java.lang.String getChildSobjectId() {
    return ChildSobjectId;
  }

  

  public void setChildSobjectId(java.lang.String ChildSobjectId) {
    this.ChildSobjectId = ChildSobjectId;
    ChildSobjectId__is_set = true;
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
   * element  : Field of type {urn:sobject.enterprise.soap.sforce.com}FieldDefinition
   * java type: com.sforce.soap.enterprise.sobject.FieldDefinition
   */
  private static final com.sforce.ws.bind.TypeInfo Field__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Field","urn:sobject.enterprise.soap.sforce.com","FieldDefinition",0,1,true);

  private boolean Field__is_set = false;

  private com.sforce.soap.enterprise.sobject.FieldDefinition Field;

  public com.sforce.soap.enterprise.sobject.FieldDefinition getField() {
    return Field;
  }

  

  public void setField(com.sforce.soap.enterprise.sobject.FieldDefinition Field) {
    this.Field = Field;
    Field__is_set = true;
  }
  
  /**
   * element  : FieldId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FieldId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FieldId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FieldId__is_set = false;

  private java.lang.String FieldId;

  public java.lang.String getFieldId() {
    return FieldId;
  }

  

  public void setFieldId(java.lang.String FieldId) {
    this.FieldId = FieldId;
    FieldId__is_set = true;
  }
  
  /**
   * element  : IsCascadeDelete of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsCascadeDelete__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsCascadeDelete","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsCascadeDelete__is_set = false;

  private java.lang.Boolean IsCascadeDelete;

  public java.lang.Boolean getIsCascadeDelete() {
    return IsCascadeDelete;
  }

  

  public void setIsCascadeDelete(java.lang.Boolean IsCascadeDelete) {
    this.IsCascadeDelete = IsCascadeDelete;
    IsCascadeDelete__is_set = true;
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
   * element  : IsRestrictedDelete of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsRestrictedDelete__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsRestrictedDelete","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsRestrictedDelete__is_set = false;

  private java.lang.Boolean IsRestrictedDelete;

  public java.lang.Boolean getIsRestrictedDelete() {
    return IsRestrictedDelete;
  }

  

  public void setIsRestrictedDelete(java.lang.Boolean IsRestrictedDelete) {
    this.IsRestrictedDelete = IsRestrictedDelete;
    IsRestrictedDelete__is_set = true;
  }
  
  /**
   * element  : JunctionIdListNames of type {urn:enterprise.soap.sforce.com}JunctionIdListNames
   * java type: com.sforce.soap.enterprise.JunctionIdListNames
   */
  private static final com.sforce.ws.bind.TypeInfo JunctionIdListNames__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","JunctionIdListNames","urn:enterprise.soap.sforce.com","JunctionIdListNames",0,1,true);

  private boolean JunctionIdListNames__is_set = false;

  private com.sforce.soap.enterprise.JunctionIdListNames JunctionIdListNames;

  public com.sforce.soap.enterprise.JunctionIdListNames getJunctionIdListNames() {
    return JunctionIdListNames;
  }

  

  public void setJunctionIdListNames(com.sforce.soap.enterprise.JunctionIdListNames JunctionIdListNames) {
    this.JunctionIdListNames = JunctionIdListNames;
    JunctionIdListNames__is_set = true;
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
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "RelationshipInfo");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ChildSobject__typeInfo, ChildSobject, ChildSobject__is_set);
    __typeMapper.writeString(__out, ChildSobjectId__typeInfo, ChildSobjectId, ChildSobjectId__is_set);
    __typeMapper.writeString(__out, DurableId__typeInfo, DurableId, DurableId__is_set);
    __typeMapper.writeObject(__out, Field__typeInfo, Field, Field__is_set);
    __typeMapper.writeString(__out, FieldId__typeInfo, FieldId, FieldId__is_set);
    __typeMapper.writeObject(__out, IsCascadeDelete__typeInfo, IsCascadeDelete, IsCascadeDelete__is_set);
    __typeMapper.writeObject(__out, IsDeprecatedAndHidden__typeInfo, IsDeprecatedAndHidden, IsDeprecatedAndHidden__is_set);
    __typeMapper.writeObject(__out, IsRestrictedDelete__typeInfo, IsRestrictedDelete, IsRestrictedDelete__is_set);
    __typeMapper.writeObject(__out, JunctionIdListNames__typeInfo, JunctionIdListNames, JunctionIdListNames__is_set);
    __typeMapper.writeObject(__out, RelationshipDomains__typeInfo, RelationshipDomains, RelationshipDomains__is_set);
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
    if (__typeMapper.isElement(__in, ChildSobject__typeInfo)) {
      setChildSobject((com.sforce.soap.enterprise.sobject.EntityDefinition)__typeMapper.readObject(__in, ChildSobject__typeInfo, com.sforce.soap.enterprise.sobject.EntityDefinition.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ChildSobjectId__typeInfo)) {
      setChildSobjectId((java.lang.String)__typeMapper.readString(__in, ChildSobjectId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DurableId__typeInfo)) {
      setDurableId((java.lang.String)__typeMapper.readString(__in, DurableId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Field__typeInfo)) {
      setField((com.sforce.soap.enterprise.sobject.FieldDefinition)__typeMapper.readObject(__in, Field__typeInfo, com.sforce.soap.enterprise.sobject.FieldDefinition.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FieldId__typeInfo)) {
      setFieldId((java.lang.String)__typeMapper.readString(__in, FieldId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsCascadeDelete__typeInfo)) {
      setIsCascadeDelete((java.lang.Boolean)__typeMapper.readObject(__in, IsCascadeDelete__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeprecatedAndHidden__typeInfo)) {
      setIsDeprecatedAndHidden((java.lang.Boolean)__typeMapper.readObject(__in, IsDeprecatedAndHidden__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsRestrictedDelete__typeInfo)) {
      setIsRestrictedDelete((java.lang.Boolean)__typeMapper.readObject(__in, IsRestrictedDelete__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, JunctionIdListNames__typeInfo)) {
      setJunctionIdListNames((com.sforce.soap.enterprise.JunctionIdListNames)__typeMapper.readObject(__in, JunctionIdListNames__typeInfo, com.sforce.soap.enterprise.JunctionIdListNames.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RelationshipDomains__typeInfo)) {
      setRelationshipDomains((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, RelationshipDomains__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[RelationshipInfo ");
    sb.append(super.toString());
    sb.append(" ChildSobject=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ChildSobject)+"'\n");
    sb.append(" ChildSobjectId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ChildSobjectId)+"'\n");
    sb.append(" DurableId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DurableId)+"'\n");
    sb.append(" Field=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Field)+"'\n");
    sb.append(" FieldId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FieldId)+"'\n");
    sb.append(" IsCascadeDelete=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsCascadeDelete)+"'\n");
    sb.append(" IsDeprecatedAndHidden=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeprecatedAndHidden)+"'\n");
    sb.append(" IsRestrictedDelete=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsRestrictedDelete)+"'\n");
    sb.append(" JunctionIdListNames=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(JunctionIdListNames)+"'\n");
    sb.append(" RelationshipDomains=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RelationshipDomains)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}