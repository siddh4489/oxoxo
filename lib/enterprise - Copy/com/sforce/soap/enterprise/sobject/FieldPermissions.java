package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class FieldPermissions extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public FieldPermissions() {
  }
    
  
  /**
   * element  : Field of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Field__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Field","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Field__is_set = false;

  private java.lang.String Field;

  public java.lang.String getField() {
    return Field;
  }

  

  public void setField(java.lang.String Field) {
    this.Field = Field;
    Field__is_set = true;
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
   * element  : PermissionsEdit of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEdit__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEdit","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEdit__is_set = false;

  private java.lang.Boolean PermissionsEdit;

  public java.lang.Boolean getPermissionsEdit() {
    return PermissionsEdit;
  }

  

  public void setPermissionsEdit(java.lang.Boolean PermissionsEdit) {
    this.PermissionsEdit = PermissionsEdit;
    PermissionsEdit__is_set = true;
  }
  
  /**
   * element  : PermissionsRead of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsRead__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsRead","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsRead__is_set = false;

  private java.lang.Boolean PermissionsRead;

  public java.lang.Boolean getPermissionsRead() {
    return PermissionsRead;
  }

  

  public void setPermissionsRead(java.lang.Boolean PermissionsRead) {
    this.PermissionsRead = PermissionsRead;
    PermissionsRead__is_set = true;
  }
  
  /**
   * element  : SobjectType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SobjectType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SobjectType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SobjectType__is_set = false;

  private java.lang.String SobjectType;

  public java.lang.String getSobjectType() {
    return SobjectType;
  }

  

  public void setSobjectType(java.lang.String SobjectType) {
    this.SobjectType = SobjectType;
    SobjectType__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "FieldPermissions");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, Field__typeInfo, Field, Field__is_set);
    __typeMapper.writeObject(__out, Parent__typeInfo, Parent, Parent__is_set);
    __typeMapper.writeString(__out, ParentId__typeInfo, ParentId, ParentId__is_set);
    __typeMapper.writeObject(__out, PermissionsEdit__typeInfo, PermissionsEdit, PermissionsEdit__is_set);
    __typeMapper.writeObject(__out, PermissionsRead__typeInfo, PermissionsRead, PermissionsRead__is_set);
    __typeMapper.writeString(__out, SobjectType__typeInfo, SobjectType, SobjectType__is_set);
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
    if (__typeMapper.isElement(__in, Field__typeInfo)) {
      setField((java.lang.String)__typeMapper.readString(__in, Field__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Parent__typeInfo)) {
      setParent((com.sforce.soap.enterprise.sobject.PermissionSet)__typeMapper.readObject(__in, Parent__typeInfo, com.sforce.soap.enterprise.sobject.PermissionSet.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentId__typeInfo)) {
      setParentId((java.lang.String)__typeMapper.readString(__in, ParentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEdit__typeInfo)) {
      setPermissionsEdit((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEdit__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsRead__typeInfo)) {
      setPermissionsRead((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsRead__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SobjectType__typeInfo)) {
      setSobjectType((java.lang.String)__typeMapper.readString(__in, SobjectType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[FieldPermissions ");
    sb.append(super.toString());
    sb.append(" Field=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Field)+"'\n");
    sb.append(" Parent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Parent)+"'\n");
    sb.append(" ParentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentId)+"'\n");
    sb.append(" PermissionsEdit=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEdit)+"'\n");
    sb.append(" PermissionsRead=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsRead)+"'\n");
    sb.append(" SobjectType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SobjectType)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}