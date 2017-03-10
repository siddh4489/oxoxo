package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ContentFolderLink extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ContentFolderLink() {
  }
    
  
  /**
   * element  : ContentFolder of type {urn:sobject.enterprise.soap.sforce.com}ContentFolder
   * java type: com.sforce.soap.enterprise.sobject.ContentFolder
   */
  private static final com.sforce.ws.bind.TypeInfo ContentFolder__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentFolder","urn:sobject.enterprise.soap.sforce.com","ContentFolder",0,1,true);

  private boolean ContentFolder__is_set = false;

  private com.sforce.soap.enterprise.sobject.ContentFolder ContentFolder;

  public com.sforce.soap.enterprise.sobject.ContentFolder getContentFolder() {
    return ContentFolder;
  }

  

  public void setContentFolder(com.sforce.soap.enterprise.sobject.ContentFolder ContentFolder) {
    this.ContentFolder = ContentFolder;
    ContentFolder__is_set = true;
  }
  
  /**
   * element  : ContentFolderId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ContentFolderId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentFolderId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ContentFolderId__is_set = false;

  private java.lang.String ContentFolderId;

  public java.lang.String getContentFolderId() {
    return ContentFolderId;
  }

  

  public void setContentFolderId(java.lang.String ContentFolderId) {
    this.ContentFolderId = ContentFolderId;
    ContentFolderId__is_set = true;
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
   * element  : ParentEntityId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ParentEntityId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ParentEntityId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ParentEntityId__is_set = false;

  private java.lang.String ParentEntityId;

  public java.lang.String getParentEntityId() {
    return ParentEntityId;
  }

  

  public void setParentEntityId(java.lang.String ParentEntityId) {
    this.ParentEntityId = ParentEntityId;
    ParentEntityId__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ContentFolderLink");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ContentFolder__typeInfo, ContentFolder, ContentFolder__is_set);
    __typeMapper.writeString(__out, ContentFolderId__typeInfo, ContentFolderId, ContentFolderId__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeString(__out, ParentEntityId__typeInfo, ParentEntityId, ParentEntityId__is_set);
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
    if (__typeMapper.isElement(__in, ContentFolder__typeInfo)) {
      setContentFolder((com.sforce.soap.enterprise.sobject.ContentFolder)__typeMapper.readObject(__in, ContentFolder__typeInfo, com.sforce.soap.enterprise.sobject.ContentFolder.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentFolderId__typeInfo)) {
      setContentFolderId((java.lang.String)__typeMapper.readString(__in, ContentFolderId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentEntityId__typeInfo)) {
      setParentEntityId((java.lang.String)__typeMapper.readString(__in, ParentEntityId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ContentFolderLink ");
    sb.append(super.toString());
    sb.append(" ContentFolder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentFolder)+"'\n");
    sb.append(" ContentFolderId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentFolderId)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" ParentEntityId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentEntityId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}