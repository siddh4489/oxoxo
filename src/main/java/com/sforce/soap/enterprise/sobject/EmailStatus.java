package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class EmailStatus extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public EmailStatus() {
  }
    
  
  /**
   * element  : CreatedBy of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo CreatedBy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean CreatedBy__is_set = false;

  private com.sforce.soap.enterprise.sobject.User CreatedBy;

  public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
    return CreatedBy;
  }

  

  public void setCreatedBy(com.sforce.soap.enterprise.sobject.User CreatedBy) {
    this.CreatedBy = CreatedBy;
    CreatedBy__is_set = true;
  }
  
  /**
   * element  : CreatedById of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CreatedById__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedById","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean CreatedById__is_set = false;

  private java.lang.String CreatedById;

  public java.lang.String getCreatedById() {
    return CreatedById;
  }

  

  public void setCreatedById(java.lang.String CreatedById) {
    this.CreatedById = CreatedById;
    CreatedById__is_set = true;
  }
  
  /**
   * element  : CreatedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo CreatedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean CreatedDate__is_set = false;

  private java.util.Calendar CreatedDate;

  public java.util.Calendar getCreatedDate() {
    return CreatedDate;
  }

  

  public void setCreatedDate(java.util.Calendar CreatedDate) {
    this.CreatedDate = CreatedDate;
    CreatedDate__is_set = true;
  }
  
  /**
   * element  : EmailTemplateName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EmailTemplateName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EmailTemplateName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean EmailTemplateName__is_set = false;

  private java.lang.String EmailTemplateName;

  public java.lang.String getEmailTemplateName() {
    return EmailTemplateName;
  }

  

  public void setEmailTemplateName(java.lang.String EmailTemplateName) {
    this.EmailTemplateName = EmailTemplateName;
    EmailTemplateName__is_set = true;
  }
  
  /**
   * element  : FirstOpenDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo FirstOpenDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FirstOpenDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean FirstOpenDate__is_set = false;

  private java.util.Calendar FirstOpenDate;

  public java.util.Calendar getFirstOpenDate() {
    return FirstOpenDate;
  }

  

  public void setFirstOpenDate(java.util.Calendar FirstOpenDate) {
    this.FirstOpenDate = FirstOpenDate;
    FirstOpenDate__is_set = true;
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
   * element  : LastOpenDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastOpenDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastOpenDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastOpenDate__is_set = false;

  private java.util.Calendar LastOpenDate;

  public java.util.Calendar getLastOpenDate() {
    return LastOpenDate;
  }

  

  public void setLastOpenDate(java.util.Calendar LastOpenDate) {
    this.LastOpenDate = LastOpenDate;
    LastOpenDate__is_set = true;
  }
  
  /**
   * element  : Task of type {urn:sobject.enterprise.soap.sforce.com}Task
   * java type: com.sforce.soap.enterprise.sobject.Task
   */
  private static final com.sforce.ws.bind.TypeInfo Task__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Task","urn:sobject.enterprise.soap.sforce.com","Task",0,1,true);

  private boolean Task__is_set = false;

  private com.sforce.soap.enterprise.sobject.Task Task;

  public com.sforce.soap.enterprise.sobject.Task getTask() {
    return Task;
  }

  

  public void setTask(com.sforce.soap.enterprise.sobject.Task Task) {
    this.Task = Task;
    Task__is_set = true;
  }
  
  /**
   * element  : TaskId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TaskId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TaskId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean TaskId__is_set = false;

  private java.lang.String TaskId;

  public java.lang.String getTaskId() {
    return TaskId;
  }

  

  public void setTaskId(java.lang.String TaskId) {
    this.TaskId = TaskId;
    TaskId__is_set = true;
  }
  
  /**
   * element  : TimesOpened of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo TimesOpened__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TimesOpened","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean TimesOpened__is_set = false;

  private java.lang.Integer TimesOpened;

  public java.lang.Integer getTimesOpened() {
    return TimesOpened;
  }

  

  public void setTimesOpened(java.lang.Integer TimesOpened) {
    this.TimesOpened = TimesOpened;
    TimesOpened__is_set = true;
  }
  
  /**
   * element  : Who of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo Who__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Who","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean Who__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name Who;

  public com.sforce.soap.enterprise.sobject.Name getWho() {
    return Who;
  }

  

  public void setWho(com.sforce.soap.enterprise.sobject.Name Who) {
    this.Who = Who;
    Who__is_set = true;
  }
  
  /**
   * element  : WhoId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo WhoId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","WhoId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean WhoId__is_set = false;

  private java.lang.String WhoId;

  public java.lang.String getWhoId() {
    return WhoId;
  }

  

  public void setWhoId(java.lang.String WhoId) {
    this.WhoId = WhoId;
    WhoId__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "EmailStatus");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, EmailTemplateName__typeInfo, EmailTemplateName, EmailTemplateName__is_set);
    __typeMapper.writeObject(__out, FirstOpenDate__typeInfo, FirstOpenDate, FirstOpenDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastOpenDate__typeInfo, LastOpenDate, LastOpenDate__is_set);
    __typeMapper.writeObject(__out, Task__typeInfo, Task, Task__is_set);
    __typeMapper.writeString(__out, TaskId__typeInfo, TaskId, TaskId__is_set);
    __typeMapper.writeObject(__out, TimesOpened__typeInfo, TimesOpened, TimesOpened__is_set);
    __typeMapper.writeObject(__out, Who__typeInfo, Who, Who__is_set);
    __typeMapper.writeString(__out, WhoId__typeInfo, WhoId, WhoId__is_set);
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
    if (__typeMapper.isElement(__in, CreatedBy__typeInfo)) {
      setCreatedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, CreatedBy__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatedById__typeInfo)) {
      setCreatedById((java.lang.String)__typeMapper.readString(__in, CreatedById__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatedDate__typeInfo)) {
      setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, CreatedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EmailTemplateName__typeInfo)) {
      setEmailTemplateName((java.lang.String)__typeMapper.readString(__in, EmailTemplateName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FirstOpenDate__typeInfo)) {
      setFirstOpenDate((java.util.Calendar)__typeMapper.readObject(__in, FirstOpenDate__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, LastOpenDate__typeInfo)) {
      setLastOpenDate((java.util.Calendar)__typeMapper.readObject(__in, LastOpenDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Task__typeInfo)) {
      setTask((com.sforce.soap.enterprise.sobject.Task)__typeMapper.readObject(__in, Task__typeInfo, com.sforce.soap.enterprise.sobject.Task.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TaskId__typeInfo)) {
      setTaskId((java.lang.String)__typeMapper.readString(__in, TaskId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TimesOpened__typeInfo)) {
      setTimesOpened((java.lang.Integer)__typeMapper.readObject(__in, TimesOpened__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Who__typeInfo)) {
      setWho((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, Who__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, WhoId__typeInfo)) {
      setWhoId((java.lang.String)__typeMapper.readString(__in, WhoId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[EmailStatus ");
    sb.append(super.toString());
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" EmailTemplateName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EmailTemplateName)+"'\n");
    sb.append(" FirstOpenDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FirstOpenDate)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LastOpenDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastOpenDate)+"'\n");
    sb.append(" Task=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Task)+"'\n");
    sb.append(" TaskId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaskId)+"'\n");
    sb.append(" TimesOpened=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TimesOpened)+"'\n");
    sb.append(" Who=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Who)+"'\n");
    sb.append(" WhoId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(WhoId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}