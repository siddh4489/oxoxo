package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class PicklistValueInfo extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public PicklistValueInfo() {
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
   * element  : EntityParticle of type {urn:sobject.enterprise.soap.sforce.com}EntityParticle
   * java type: com.sforce.soap.enterprise.sobject.EntityParticle
   */
  private static final com.sforce.ws.bind.TypeInfo EntityParticle__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EntityParticle","urn:sobject.enterprise.soap.sforce.com","EntityParticle",0,1,true);

  private boolean EntityParticle__is_set = false;

  private com.sforce.soap.enterprise.sobject.EntityParticle EntityParticle;

  public com.sforce.soap.enterprise.sobject.EntityParticle getEntityParticle() {
    return EntityParticle;
  }

  

  public void setEntityParticle(com.sforce.soap.enterprise.sobject.EntityParticle EntityParticle) {
    this.EntityParticle = EntityParticle;
    EntityParticle__is_set = true;
  }
  
  /**
   * element  : EntityParticleId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EntityParticleId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EntityParticleId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean EntityParticleId__is_set = false;

  private java.lang.String EntityParticleId;

  public java.lang.String getEntityParticleId() {
    return EntityParticleId;
  }

  

  public void setEntityParticleId(java.lang.String EntityParticleId) {
    this.EntityParticleId = EntityParticleId;
    EntityParticleId__is_set = true;
  }
  
  /**
   * element  : IsActive of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsActive__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsActive","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsActive__is_set = false;

  private java.lang.Boolean IsActive;

  public java.lang.Boolean getIsActive() {
    return IsActive;
  }

  

  public void setIsActive(java.lang.Boolean IsActive) {
    this.IsActive = IsActive;
    IsActive__is_set = true;
  }
  
  /**
   * element  : IsDefaultValue of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsDefaultValue__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsDefaultValue","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsDefaultValue__is_set = false;

  private java.lang.Boolean IsDefaultValue;

  public java.lang.Boolean getIsDefaultValue() {
    return IsDefaultValue;
  }

  

  public void setIsDefaultValue(java.lang.Boolean IsDefaultValue) {
    this.IsDefaultValue = IsDefaultValue;
    IsDefaultValue__is_set = true;
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
   * element  : ValidFor of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ValidFor__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ValidFor","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ValidFor__is_set = false;

  private java.lang.String ValidFor;

  public java.lang.String getValidFor() {
    return ValidFor;
  }

  

  public void setValidFor(java.lang.String ValidFor) {
    this.ValidFor = ValidFor;
    ValidFor__is_set = true;
  }
  
  /**
   * element  : Value of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Value__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Value","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Value__is_set = false;

  private java.lang.String Value;

  public java.lang.String getValue() {
    return Value;
  }

  

  public void setValue(java.lang.String Value) {
    this.Value = Value;
    Value__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "PicklistValueInfo");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, DurableId__typeInfo, DurableId, DurableId__is_set);
    __typeMapper.writeObject(__out, EntityParticle__typeInfo, EntityParticle, EntityParticle__is_set);
    __typeMapper.writeString(__out, EntityParticleId__typeInfo, EntityParticleId, EntityParticleId__is_set);
    __typeMapper.writeObject(__out, IsActive__typeInfo, IsActive, IsActive__is_set);
    __typeMapper.writeObject(__out, IsDefaultValue__typeInfo, IsDefaultValue, IsDefaultValue__is_set);
    __typeMapper.writeString(__out, Label__typeInfo, Label, Label__is_set);
    __typeMapper.writeString(__out, ValidFor__typeInfo, ValidFor, ValidFor__is_set);
    __typeMapper.writeString(__out, Value__typeInfo, Value, Value__is_set);
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
    if (__typeMapper.isElement(__in, DurableId__typeInfo)) {
      setDurableId((java.lang.String)__typeMapper.readString(__in, DurableId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EntityParticle__typeInfo)) {
      setEntityParticle((com.sforce.soap.enterprise.sobject.EntityParticle)__typeMapper.readObject(__in, EntityParticle__typeInfo, com.sforce.soap.enterprise.sobject.EntityParticle.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EntityParticleId__typeInfo)) {
      setEntityParticleId((java.lang.String)__typeMapper.readString(__in, EntityParticleId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsActive__typeInfo)) {
      setIsActive((java.lang.Boolean)__typeMapper.readObject(__in, IsActive__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDefaultValue__typeInfo)) {
      setIsDefaultValue((java.lang.Boolean)__typeMapper.readObject(__in, IsDefaultValue__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, Label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ValidFor__typeInfo)) {
      setValidFor((java.lang.String)__typeMapper.readString(__in, ValidFor__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Value__typeInfo)) {
      setValue((java.lang.String)__typeMapper.readString(__in, Value__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[PicklistValueInfo ");
    sb.append(super.toString());
    sb.append(" DurableId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DurableId)+"'\n");
    sb.append(" EntityParticle=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EntityParticle)+"'\n");
    sb.append(" EntityParticleId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EntityParticleId)+"'\n");
    sb.append(" IsActive=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsActive)+"'\n");
    sb.append(" IsDefaultValue=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDefaultValue)+"'\n");
    sb.append(" Label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Label)+"'\n");
    sb.append(" ValidFor=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ValidFor)+"'\n");
    sb.append(" Value=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Value)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}