package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ChatterActivity extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ChatterActivity() {
  }
    
  
  /**
   * element  : CommentCount of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo CommentCount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CommentCount","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean CommentCount__is_set = false;

  private java.lang.Integer CommentCount;

  public java.lang.Integer getCommentCount() {
    return CommentCount;
  }

  

  public void setCommentCount(java.lang.Integer CommentCount) {
    this.CommentCount = CommentCount;
    CommentCount__is_set = true;
  }
  
  /**
   * element  : CommentReceivedCount of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo CommentReceivedCount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CommentReceivedCount","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean CommentReceivedCount__is_set = false;

  private java.lang.Integer CommentReceivedCount;

  public java.lang.Integer getCommentReceivedCount() {
    return CommentReceivedCount;
  }

  

  public void setCommentReceivedCount(java.lang.Integer CommentReceivedCount) {
    this.CommentReceivedCount = CommentReceivedCount;
    CommentReceivedCount__is_set = true;
  }
  
  /**
   * element  : InfluenceRawRank of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo InfluenceRawRank__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","InfluenceRawRank","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean InfluenceRawRank__is_set = false;

  private java.lang.Integer InfluenceRawRank;

  public java.lang.Integer getInfluenceRawRank() {
    return InfluenceRawRank;
  }

  

  public void setInfluenceRawRank(java.lang.Integer InfluenceRawRank) {
    this.InfluenceRawRank = InfluenceRawRank;
    InfluenceRawRank__is_set = true;
  }
  
  /**
   * element  : LikeReceivedCount of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo LikeReceivedCount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LikeReceivedCount","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean LikeReceivedCount__is_set = false;

  private java.lang.Integer LikeReceivedCount;

  public java.lang.Integer getLikeReceivedCount() {
    return LikeReceivedCount;
  }

  

  public void setLikeReceivedCount(java.lang.Integer LikeReceivedCount) {
    this.LikeReceivedCount = LikeReceivedCount;
    LikeReceivedCount__is_set = true;
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
   * element  : PostCount of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo PostCount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PostCount","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean PostCount__is_set = false;

  private java.lang.Integer PostCount;

  public java.lang.Integer getPostCount() {
    return PostCount;
  }

  

  public void setPostCount(java.lang.Integer PostCount) {
    this.PostCount = PostCount;
    PostCount__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ChatterActivity");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CommentCount__typeInfo, CommentCount, CommentCount__is_set);
    __typeMapper.writeObject(__out, CommentReceivedCount__typeInfo, CommentReceivedCount, CommentReceivedCount__is_set);
    __typeMapper.writeObject(__out, InfluenceRawRank__typeInfo, InfluenceRawRank, InfluenceRawRank__is_set);
    __typeMapper.writeObject(__out, LikeReceivedCount__typeInfo, LikeReceivedCount, LikeReceivedCount__is_set);
    __typeMapper.writeString(__out, ParentId__typeInfo, ParentId, ParentId__is_set);
    __typeMapper.writeObject(__out, PostCount__typeInfo, PostCount, PostCount__is_set);
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
    if (__typeMapper.isElement(__in, CommentCount__typeInfo)) {
      setCommentCount((java.lang.Integer)__typeMapper.readObject(__in, CommentCount__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CommentReceivedCount__typeInfo)) {
      setCommentReceivedCount((java.lang.Integer)__typeMapper.readObject(__in, CommentReceivedCount__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InfluenceRawRank__typeInfo)) {
      setInfluenceRawRank((java.lang.Integer)__typeMapper.readObject(__in, InfluenceRawRank__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LikeReceivedCount__typeInfo)) {
      setLikeReceivedCount((java.lang.Integer)__typeMapper.readObject(__in, LikeReceivedCount__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentId__typeInfo)) {
      setParentId((java.lang.String)__typeMapper.readString(__in, ParentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PostCount__typeInfo)) {
      setPostCount((java.lang.Integer)__typeMapper.readObject(__in, PostCount__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ChatterActivity ");
    sb.append(super.toString());
    sb.append(" CommentCount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CommentCount)+"'\n");
    sb.append(" CommentReceivedCount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CommentReceivedCount)+"'\n");
    sb.append(" InfluenceRawRank=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InfluenceRawRank)+"'\n");
    sb.append(" LikeReceivedCount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LikeReceivedCount)+"'\n");
    sb.append(" ParentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentId)+"'\n");
    sb.append(" PostCount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PostCount)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}