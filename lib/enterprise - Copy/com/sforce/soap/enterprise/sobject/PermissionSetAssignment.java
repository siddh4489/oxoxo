package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class PermissionSetAssignment extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public PermissionSetAssignment() {
  }
    
  
  /**
   * element  : Assignee of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Assignee__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assignee","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Assignee__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Assignee;

  public com.sforce.soap.enterprise.sobject.User getAssignee() {
    return Assignee;
  }

  

  public void setAssignee(com.sforce.soap.enterprise.sobject.User Assignee) {
    this.Assignee = Assignee;
    Assignee__is_set = true;
  }
  
  /**
   * element  : AssigneeId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AssigneeId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AssigneeId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean AssigneeId__is_set = false;

  private java.lang.String AssigneeId;

  public java.lang.String getAssigneeId() {
    return AssigneeId;
  }

  

  public void setAssigneeId(java.lang.String AssigneeId) {
    this.AssigneeId = AssigneeId;
    AssigneeId__is_set = true;
  }
  
  /**
   * element  : PermissionSet of type {urn:sobject.enterprise.soap.sforce.com}PermissionSet
   * java type: com.sforce.soap.enterprise.sobject.PermissionSet
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionSet__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionSet","urn:sobject.enterprise.soap.sforce.com","PermissionSet",0,1,true);

  private boolean PermissionSet__is_set = false;

  private com.sforce.soap.enterprise.sobject.PermissionSet PermissionSet;

  public com.sforce.soap.enterprise.sobject.PermissionSet getPermissionSet() {
    return PermissionSet;
  }

  

  public void setPermissionSet(com.sforce.soap.enterprise.sobject.PermissionSet PermissionSet) {
    this.PermissionSet = PermissionSet;
    PermissionSet__is_set = true;
  }
  
  /**
   * element  : PermissionSetId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionSetId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionSetId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean PermissionSetId__is_set = false;

  private java.lang.String PermissionSetId;

  public java.lang.String getPermissionSetId() {
    return PermissionSetId;
  }

  

  public void setPermissionSetId(java.lang.String PermissionSetId) {
    this.PermissionSetId = PermissionSetId;
    PermissionSetId__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "PermissionSetAssignment");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Assignee__typeInfo, Assignee, Assignee__is_set);
    __typeMapper.writeString(__out, AssigneeId__typeInfo, AssigneeId, AssigneeId__is_set);
    __typeMapper.writeObject(__out, PermissionSet__typeInfo, PermissionSet, PermissionSet__is_set);
    __typeMapper.writeString(__out, PermissionSetId__typeInfo, PermissionSetId, PermissionSetId__is_set);
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
    if (__typeMapper.isElement(__in, Assignee__typeInfo)) {
      setAssignee((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Assignee__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AssigneeId__typeInfo)) {
      setAssigneeId((java.lang.String)__typeMapper.readString(__in, AssigneeId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionSet__typeInfo)) {
      setPermissionSet((com.sforce.soap.enterprise.sobject.PermissionSet)__typeMapper.readObject(__in, PermissionSet__typeInfo, com.sforce.soap.enterprise.sobject.PermissionSet.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionSetId__typeInfo)) {
      setPermissionSetId((java.lang.String)__typeMapper.readString(__in, PermissionSetId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[PermissionSetAssignment ");
    sb.append(super.toString());
    sb.append(" Assignee=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assignee)+"'\n");
    sb.append(" AssigneeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AssigneeId)+"'\n");
    sb.append(" PermissionSet=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionSet)+"'\n");
    sb.append(" PermissionSetId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionSetId)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}