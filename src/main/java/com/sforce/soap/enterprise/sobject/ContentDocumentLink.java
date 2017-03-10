package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ContentDocumentLink extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ContentDocumentLink() {
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
   * element  : LinkedEntity of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo LinkedEntity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LinkedEntity","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean LinkedEntity__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name LinkedEntity;

  public com.sforce.soap.enterprise.sobject.Name getLinkedEntity() {
    return LinkedEntity;
  }

  

  public void setLinkedEntity(com.sforce.soap.enterprise.sobject.Name LinkedEntity) {
    this.LinkedEntity = LinkedEntity;
    LinkedEntity__is_set = true;
  }
  
  /**
   * element  : LinkedEntityId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LinkedEntityId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LinkedEntityId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LinkedEntityId__is_set = false;

  private java.lang.String LinkedEntityId;

  public java.lang.String getLinkedEntityId() {
    return LinkedEntityId;
  }

  

  public void setLinkedEntityId(java.lang.String LinkedEntityId) {
    this.LinkedEntityId = LinkedEntityId;
    LinkedEntityId__is_set = true;
  }
  
  /**
   * element  : ShareType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ShareType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ShareType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ShareType__is_set = false;

  private java.lang.String ShareType;

  public java.lang.String getShareType() {
    return ShareType;
  }

  

  public void setShareType(java.lang.String ShareType) {
    this.ShareType = ShareType;
    ShareType__is_set = true;
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
   * element  : Visibility of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Visibility__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Visibility","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Visibility__is_set = false;

  private java.lang.String Visibility;

  public java.lang.String getVisibility() {
    return Visibility;
  }

  

  public void setVisibility(java.lang.String Visibility) {
    this.Visibility = Visibility;
    Visibility__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ContentDocumentLink");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ContentDocument__typeInfo, ContentDocument, ContentDocument__is_set);
    __typeMapper.writeString(__out, ContentDocumentId__typeInfo, ContentDocumentId, ContentDocumentId__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LinkedEntity__typeInfo, LinkedEntity, LinkedEntity__is_set);
    __typeMapper.writeString(__out, LinkedEntityId__typeInfo, LinkedEntityId, LinkedEntityId__is_set);
    __typeMapper.writeString(__out, ShareType__typeInfo, ShareType, ShareType__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, Visibility__typeInfo, Visibility, Visibility__is_set);
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
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LinkedEntity__typeInfo)) {
      setLinkedEntity((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, LinkedEntity__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LinkedEntityId__typeInfo)) {
      setLinkedEntityId((java.lang.String)__typeMapper.readString(__in, LinkedEntityId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ShareType__typeInfo)) {
      setShareType((java.lang.String)__typeMapper.readString(__in, ShareType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Visibility__typeInfo)) {
      setVisibility((java.lang.String)__typeMapper.readString(__in, Visibility__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ContentDocumentLink ");
    sb.append(super.toString());
    sb.append(" ContentDocument=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocument)+"'\n");
    sb.append(" ContentDocumentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentId)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LinkedEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LinkedEntity)+"'\n");
    sb.append(" LinkedEntityId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LinkedEntityId)+"'\n");
    sb.append(" ShareType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShareType)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Visibility=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Visibility)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}