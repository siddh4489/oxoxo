package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class SetupEntityAccess extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public SetupEntityAccess() {
  }
    
  
  /**
   * element  : Parent of type {urn:sobject.enterprise.soap.sforce.com}PermissionSet
   * java type: com.sforce.soap.enterprise.sobject.PermissionSet
   */
  private static final com.sforce.ws.bind.TypeInfo Parent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Parent","urn:sobject.enterprise.soap.sforce.com","PermissionSet",0,1,true);

  private boolean Parent__is_set = false;

  private com.sforce.soap.enterprise.sobject.PermissionSet Parent;

  public com.sforce.soap.enterprise.sobject.PermissionSet getParent() {
    return Parent;
  }

  

  public void setParent(com.sforce.soap.enterprise.sobject.PermissionSet Parent) {
    this.Parent = Parent;
    Parent__is_set = true;
  }
  
  /**
   * element  : ParentId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ParentId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ParentId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ParentId__is_set = false;

  private java.lang.String ParentId;

  public java.lang.String getParentId() {
    return ParentId;
  }

  

  public void setParentId(java.lang.String ParentId) {
    this.ParentId = ParentId;
    ParentId__is_set = true;
  }
  
  /**
   * element  : SetupEntityId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SetupEntityId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SetupEntityId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean SetupEntityId__is_set = false;

  private java.lang.String SetupEntityId;

  public java.lang.String getSetupEntityId() {
    return SetupEntityId;
  }

  

  public void setSetupEntityId(java.lang.String SetupEntityId) {
    this.SetupEntityId = SetupEntityId;
    SetupEntityId__is_set = true;
  }
  
  /**
   * element  : SetupEntityType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SetupEntityType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SetupEntityType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SetupEntityType__is_set = false;

  private java.lang.String SetupEntityType;

  public java.lang.String getSetupEntityType() {
    return SetupEntityType;
  }

  

  public void setSetupEntityType(java.lang.String SetupEntityType) {
    this.SetupEntityType = SetupEntityType;
    SetupEntityType__is_set = true;
  }
  
  /**
   * element  : SystemModstamp of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo SystemModstamp__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean SystemModstamp__is_set = false;

  private java.util.Calendar SystemModstamp;

  public java.util.Calendar getSystemModstamp() {
    return SystemModstamp;
  }

  

  public void setSystemModstamp(java.util.Calendar SystemModstamp) {
    this.SystemModstamp = SystemModstamp;
    SystemModstamp__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "SetupEntityAccess");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Parent__typeInfo, Parent, Parent__is_set);
    __typeMapper.writeString(__out, ParentId__typeInfo, ParentId, ParentId__is_set);
    __typeMapper.writeString(__out, SetupEntityId__typeInfo, SetupEntityId, SetupEntityId__is_set);
    __typeMapper.writeString(__out, SetupEntityType__typeInfo, SetupEntityType, SetupEntityType__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
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
    if (__typeMapper.isElement(__in, Parent__typeInfo)) {
      setParent((com.sforce.soap.enterprise.sobject.PermissionSet)__typeMapper.readObject(__in, Parent__typeInfo, com.sforce.soap.enterprise.sobject.PermissionSet.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentId__typeInfo)) {
      setParentId((java.lang.String)__typeMapper.readString(__in, ParentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SetupEntityId__typeInfo)) {
      setSetupEntityId((java.lang.String)__typeMapper.readString(__in, SetupEntityId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SetupEntityType__typeInfo)) {
      setSetupEntityType((java.lang.String)__typeMapper.readString(__in, SetupEntityType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SetupEntityAccess ");
    sb.append(super.toString());
    sb.append(" Parent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Parent)+"'\n");
    sb.append(" ParentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentId)+"'\n");
    sb.append(" SetupEntityId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SetupEntityId)+"'\n");
    sb.append(" SetupEntityType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SetupEntityType)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}