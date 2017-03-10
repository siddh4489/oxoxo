package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class NameCaseValue implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public NameCaseValue() {
  }
    
  
  /**
   * element  : article of type {urn:enterprise.soap.sforce.com}Article
   * java type: com.sforce.soap.enterprise.Article
   */
  private static final com.sforce.ws.bind.TypeInfo article__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","article","urn:enterprise.soap.sforce.com","Article",1,1,true);

  private boolean article__is_set = false;

  private com.sforce.soap.enterprise.Article article;

  public com.sforce.soap.enterprise.Article getArticle() {
    return article;
  }

  

  public void setArticle(com.sforce.soap.enterprise.Article article) {
    this.article = article;
    article__is_set = true;
  }
  
  /**
   * element  : caseType of type {urn:enterprise.soap.sforce.com}CaseType
   * java type: com.sforce.soap.enterprise.CaseType
   */
  private static final com.sforce.ws.bind.TypeInfo caseType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","caseType","urn:enterprise.soap.sforce.com","CaseType",1,1,true);

  private boolean caseType__is_set = false;

  private com.sforce.soap.enterprise.CaseType caseType;

  public com.sforce.soap.enterprise.CaseType getCaseType() {
    return caseType;
  }

  

  public void setCaseType(com.sforce.soap.enterprise.CaseType caseType) {
    this.caseType = caseType;
    caseType__is_set = true;
  }
  
  /**
   * element  : number of type {urn:enterprise.soap.sforce.com}GrammaticalNumber
   * java type: com.sforce.soap.enterprise.GrammaticalNumber
   */
  private static final com.sforce.ws.bind.TypeInfo number__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","number","urn:enterprise.soap.sforce.com","GrammaticalNumber",1,1,true);

  private boolean number__is_set = false;

  private com.sforce.soap.enterprise.GrammaticalNumber number;

  public com.sforce.soap.enterprise.GrammaticalNumber getNumber() {
    return number;
  }

  

  public void setNumber(com.sforce.soap.enterprise.GrammaticalNumber number) {
    this.number = number;
    number__is_set = true;
  }
  
  /**
   * element  : possessive of type {urn:enterprise.soap.sforce.com}Possessive
   * java type: com.sforce.soap.enterprise.Possessive
   */
  private static final com.sforce.ws.bind.TypeInfo possessive__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","possessive","urn:enterprise.soap.sforce.com","Possessive",1,1,true);

  private boolean possessive__is_set = false;

  private com.sforce.soap.enterprise.Possessive possessive;

  public com.sforce.soap.enterprise.Possessive getPossessive() {
    return possessive;
  }

  

  public void setPossessive(com.sforce.soap.enterprise.Possessive possessive) {
    this.possessive = possessive;
    possessive__is_set = true;
  }
  
  /**
   * element  : value of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo value__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","value","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean value__is_set = false;

  private java.lang.String value;

  public java.lang.String getValue() {
    return value;
  }

  

  public void setValue(java.lang.String value) {
    this.value = value;
    value__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   
    __typeMapper.writeObject(__out, article__typeInfo, article, article__is_set);
    __typeMapper.writeObject(__out, caseType__typeInfo, caseType, caseType__is_set);
    __typeMapper.writeObject(__out, number__typeInfo, number, number__is_set);
    __typeMapper.writeObject(__out, possessive__typeInfo, possessive, possessive__is_set);
    __typeMapper.writeString(__out, value__typeInfo, value, value__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, article__typeInfo)) {
      setArticle((com.sforce.soap.enterprise.Article)__typeMapper.readObject(__in, article__typeInfo, com.sforce.soap.enterprise.Article.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, caseType__typeInfo)) {
      setCaseType((com.sforce.soap.enterprise.CaseType)__typeMapper.readObject(__in, caseType__typeInfo, com.sforce.soap.enterprise.CaseType.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, number__typeInfo)) {
      setNumber((com.sforce.soap.enterprise.GrammaticalNumber)__typeMapper.readObject(__in, number__typeInfo, com.sforce.soap.enterprise.GrammaticalNumber.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, possessive__typeInfo)) {
      setPossessive((com.sforce.soap.enterprise.Possessive)__typeMapper.readObject(__in, possessive__typeInfo, com.sforce.soap.enterprise.Possessive.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, value__typeInfo)) {
      setValue((java.lang.String)__typeMapper.readString(__in, value__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[NameCaseValue ");
    
    sb.append(" article=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(article)+"'\n");
    sb.append(" caseType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(caseType)+"'\n");
    sb.append(" number=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(number)+"'\n");
    sb.append(" possessive=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(possessive)+"'\n");
    sb.append(" value=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(value)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}