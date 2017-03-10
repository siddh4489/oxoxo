package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Drug_Test__Tag extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Drug_Test__Tag() {
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
   * element  : IsDeleted of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsDeleted__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsDeleted__is_set = false;

  private java.lang.Boolean IsDeleted;

  public java.lang.Boolean getIsDeleted() {
    return IsDeleted;
  }

  

  public void setIsDeleted(java.lang.Boolean IsDeleted) {
    this.IsDeleted = IsDeleted;
    IsDeleted__is_set = true;
  }
  
  /**
   * element  : Item of type {urn:sobject.enterprise.soap.sforce.com}Drug_Test__c
   * java type: com.sforce.soap.enterprise.sobject.Drug_Test__c
   */
  private static final com.sforce.ws.bind.TypeInfo Item__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Item","urn:sobject.enterprise.soap.sforce.com","Drug_Test__c",0,1,true);

  private boolean Item__is_set = false;

  private com.sforce.soap.enterprise.sobject.Drug_Test__c Item;

  public com.sforce.soap.enterprise.sobject.Drug_Test__c getItem() {
    return Item;
  }

  

  public void setItem(com.sforce.soap.enterprise.sobject.Drug_Test__c Item) {
    this.Item = Item;
    Item__is_set = true;
  }
  
  /**
   * element  : ItemId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ItemId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ItemId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ItemId__is_set = false;

  private java.lang.String ItemId;

  public java.lang.String getItemId() {
    return ItemId;
  }

  

  public void setItemId(java.lang.String ItemId) {
    this.ItemId = ItemId;
    ItemId__is_set = true;
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
   * element  : TagDefinition of type {urn:sobject.enterprise.soap.sforce.com}TagDefinition
   * java type: com.sforce.soap.enterprise.sobject.TagDefinition
   */
  private static final com.sforce.ws.bind.TypeInfo TagDefinition__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TagDefinition","urn:sobject.enterprise.soap.sforce.com","TagDefinition",0,1,true);

  private boolean TagDefinition__is_set = false;

  private com.sforce.soap.enterprise.sobject.TagDefinition TagDefinition;

  public com.sforce.soap.enterprise.sobject.TagDefinition getTagDefinition() {
    return TagDefinition;
  }

  

  public void setTagDefinition(com.sforce.soap.enterprise.sobject.TagDefinition TagDefinition) {
    this.TagDefinition = TagDefinition;
    TagDefinition__is_set = true;
  }
  
  /**
   * element  : TagDefinitionId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TagDefinitionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TagDefinitionId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean TagDefinitionId__is_set = false;

  private java.lang.String TagDefinitionId;

  public java.lang.String getTagDefinitionId() {
    return TagDefinitionId;
  }

  

  public void setTagDefinitionId(java.lang.String TagDefinitionId) {
    this.TagDefinitionId = TagDefinitionId;
    TagDefinitionId__is_set = true;
  }
  
  /**
   * element  : Type of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Type__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Type","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Type__is_set = false;

  private java.lang.String Type;

  public java.lang.String getType() {
    return Type;
  }

  

  public void setType(java.lang.String Type) {
    this.Type = Type;
    Type__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Drug_Test__Tag");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, Item__typeInfo, Item, Item__is_set);
    __typeMapper.writeString(__out, ItemId__typeInfo, ItemId, ItemId__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, TagDefinition__typeInfo, TagDefinition, TagDefinition__is_set);
    __typeMapper.writeString(__out, TagDefinitionId__typeInfo, TagDefinitionId, TagDefinitionId__is_set);
    __typeMapper.writeString(__out, Type__typeInfo, Type, Type__is_set);
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
    if (__typeMapper.isElement(__in, CreatedDate__typeInfo)) {
      setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, CreatedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Item__typeInfo)) {
      setItem((com.sforce.soap.enterprise.sobject.Drug_Test__c)__typeMapper.readObject(__in, Item__typeInfo, com.sforce.soap.enterprise.sobject.Drug_Test__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ItemId__typeInfo)) {
      setItemId((java.lang.String)__typeMapper.readString(__in, ItemId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TagDefinition__typeInfo)) {
      setTagDefinition((com.sforce.soap.enterprise.sobject.TagDefinition)__typeMapper.readObject(__in, TagDefinition__typeInfo, com.sforce.soap.enterprise.sobject.TagDefinition.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TagDefinitionId__typeInfo)) {
      setTagDefinitionId((java.lang.String)__typeMapper.readString(__in, TagDefinitionId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Type__typeInfo)) {
      setType((java.lang.String)__typeMapper.readString(__in, Type__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Drug_Test__Tag ");
    sb.append(super.toString());
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" Item=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Item)+"'\n");
    sb.append(" ItemId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ItemId)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" TagDefinition=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TagDefinition)+"'\n");
    sb.append(" TagDefinitionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TagDefinitionId)+"'\n");
    sb.append(" Type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Type)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}