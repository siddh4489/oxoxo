package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class GroupMember extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public GroupMember() {
  }
    
  
  /**
   * element  : Group of type {urn:sobject.enterprise.soap.sforce.com}Group
   * java type: com.sforce.soap.enterprise.sobject.Group
   */
  private static final com.sforce.ws.bind.TypeInfo Group__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Group","urn:sobject.enterprise.soap.sforce.com","Group",0,1,true);

  private boolean Group__is_set = false;

  private com.sforce.soap.enterprise.sobject.Group Group;

  public com.sforce.soap.enterprise.sobject.Group getGroup() {
    return Group;
  }

  

  public void setGroup(com.sforce.soap.enterprise.sobject.Group Group) {
    this.Group = Group;
    Group__is_set = true;
  }
  
  /**
   * element  : GroupId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo GroupId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","GroupId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean GroupId__is_set = false;

  private java.lang.String GroupId;

  public java.lang.String getGroupId() {
    return GroupId;
  }

  

  public void setGroupId(java.lang.String GroupId) {
    this.GroupId = GroupId;
    GroupId__is_set = true;
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
   * element  : UserOrGroupId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserOrGroupId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserOrGroupId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean UserOrGroupId__is_set = false;

  private java.lang.String UserOrGroupId;

  public java.lang.String getUserOrGroupId() {
    return UserOrGroupId;
  }

  

  public void setUserOrGroupId(java.lang.String UserOrGroupId) {
    this.UserOrGroupId = UserOrGroupId;
    UserOrGroupId__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "GroupMember");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Group__typeInfo, Group, Group__is_set);
    __typeMapper.writeString(__out, GroupId__typeInfo, GroupId, GroupId__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, UserOrGroupId__typeInfo, UserOrGroupId, UserOrGroupId__is_set);
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
    if (__typeMapper.isElement(__in, Group__typeInfo)) {
      setGroup((com.sforce.soap.enterprise.sobject.Group)__typeMapper.readObject(__in, Group__typeInfo, com.sforce.soap.enterprise.sobject.Group.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, GroupId__typeInfo)) {
      setGroupId((java.lang.String)__typeMapper.readString(__in, GroupId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserOrGroupId__typeInfo)) {
      setUserOrGroupId((java.lang.String)__typeMapper.readString(__in, UserOrGroupId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[GroupMember ");
    sb.append(super.toString());
    sb.append(" Group=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Group)+"'\n");
    sb.append(" GroupId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(GroupId)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" UserOrGroupId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserOrGroupId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}