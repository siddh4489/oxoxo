package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ContentWorkspaceDoc extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ContentWorkspaceDoc() {
  }
    
  
  /**
   * element  : ContentDocument of type {urn:sobject.enterprise.soap.sforce.com}ContentDocument
   * java type: com.sforce.soap.enterprise.sobject.ContentDocument
   */
  private static final com.sforce.ws.bind.TypeInfo ContentDocument__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentDocument","urn:sobject.enterprise.soap.sforce.com","ContentDocument",0,1,true);

  private boolean ContentDocument__is_set = false;

  private com.sforce.soap.enterprise.sobject.ContentDocument ContentDocument;

  public com.sforce.soap.enterprise.sobject.ContentDocument getContentDocument() {
    return ContentDocument;
  }

  

  public void setContentDocument(com.sforce.soap.enterprise.sobject.ContentDocument ContentDocument) {
    this.ContentDocument = ContentDocument;
    ContentDocument__is_set = true;
  }
  
  /**
   * element  : ContentDocumentId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ContentDocumentId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentDocumentId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ContentDocumentId__is_set = false;

  private java.lang.String ContentDocumentId;

  public java.lang.String getContentDocumentId() {
    return ContentDocumentId;
  }

  

  public void setContentDocumentId(java.lang.String ContentDocumentId) {
    this.ContentDocumentId = ContentDocumentId;
    ContentDocumentId__is_set = true;
  }
  
  /**
   * element  : ContentWorkspace of type {urn:sobject.enterprise.soap.sforce.com}ContentWorkspace
   * java type: com.sforce.soap.enterprise.sobject.ContentWorkspace
   */
  private static final com.sforce.ws.bind.TypeInfo ContentWorkspace__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentWorkspace","urn:sobject.enterprise.soap.sforce.com","ContentWorkspace",0,1,true);

  private boolean ContentWorkspace__is_set = false;

  private com.sforce.soap.enterprise.sobject.ContentWorkspace ContentWorkspace;

  public com.sforce.soap.enterprise.sobject.ContentWorkspace getContentWorkspace() {
    return ContentWorkspace;
  }

  

  public void setContentWorkspace(com.sforce.soap.enterprise.sobject.ContentWorkspace ContentWorkspace) {
    this.ContentWorkspace = ContentWorkspace;
    ContentWorkspace__is_set = true;
  }
  
  /**
   * element  : ContentWorkspaceId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ContentWorkspaceId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentWorkspaceId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ContentWorkspaceId__is_set = false;

  private java.lang.String ContentWorkspaceId;

  public java.lang.String getContentWorkspaceId() {
    return ContentWorkspaceId;
  }

  

  public void setContentWorkspaceId(java.lang.String ContentWorkspaceId) {
    this.ContentWorkspaceId = ContentWorkspaceId;
    ContentWorkspaceId__is_set = true;
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
   * element  : IsOwner of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsOwner__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsOwner","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsOwner__is_set = false;

  private java.lang.Boolean IsOwner;

  public java.lang.Boolean getIsOwner() {
    return IsOwner;
  }

  

  public void setIsOwner(java.lang.Boolean IsOwner) {
    this.IsOwner = IsOwner;
    IsOwner__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ContentWorkspaceDoc");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ContentDocument__typeInfo, ContentDocument, ContentDocument__is_set);
    __typeMapper.writeString(__out, ContentDocumentId__typeInfo, ContentDocumentId, ContentDocumentId__is_set);
    __typeMapper.writeObject(__out, ContentWorkspace__typeInfo, ContentWorkspace, ContentWorkspace__is_set);
    __typeMapper.writeString(__out, ContentWorkspaceId__typeInfo, ContentWorkspaceId, ContentWorkspaceId__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsOwner__typeInfo, IsOwner, IsOwner__is_set);
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
    if (__typeMapper.isElement(__in, ContentDocument__typeInfo)) {
      setContentDocument((com.sforce.soap.enterprise.sobject.ContentDocument)__typeMapper.readObject(__in, ContentDocument__typeInfo, com.sforce.soap.enterprise.sobject.ContentDocument.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentDocumentId__typeInfo)) {
      setContentDocumentId((java.lang.String)__typeMapper.readString(__in, ContentDocumentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentWorkspace__typeInfo)) {
      setContentWorkspace((com.sforce.soap.enterprise.sobject.ContentWorkspace)__typeMapper.readObject(__in, ContentWorkspace__typeInfo, com.sforce.soap.enterprise.sobject.ContentWorkspace.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentWorkspaceId__typeInfo)) {
      setContentWorkspaceId((java.lang.String)__typeMapper.readString(__in, ContentWorkspaceId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatedDate__typeInfo)) {
      setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, CreatedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsOwner__typeInfo)) {
      setIsOwner((java.lang.Boolean)__typeMapper.readObject(__in, IsOwner__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ContentWorkspaceDoc ");
    sb.append(super.toString());
    sb.append(" ContentDocument=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocument)+"'\n");
    sb.append(" ContentDocumentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentId)+"'\n");
    sb.append(" ContentWorkspace=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentWorkspace)+"'\n");
    sb.append(" ContentWorkspaceId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentWorkspaceId)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsOwner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsOwner)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}