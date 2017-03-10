package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class KnowledgeSettings implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public KnowledgeSettings() {
  }
    
  
  /**
   * element  : defaultLanguage of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo defaultLanguage__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","defaultLanguage","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean defaultLanguage__is_set = false;

  private java.lang.String defaultLanguage;

  public java.lang.String getDefaultLanguage() {
    return defaultLanguage;
  }

  

  public void setDefaultLanguage(java.lang.String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    defaultLanguage__is_set = true;
  }
  
  /**
   * element  : knowledgeEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo knowledgeEnabled__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","knowledgeEnabled","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean knowledgeEnabled__is_set = false;

  private boolean knowledgeEnabled;

  public boolean getKnowledgeEnabled() {
    return knowledgeEnabled;
  }

  

  public boolean isKnowledgeEnabled() {
    return knowledgeEnabled;
  }

  

  public void setKnowledgeEnabled(boolean knowledgeEnabled) {
    this.knowledgeEnabled = knowledgeEnabled;
    knowledgeEnabled__is_set = true;
  }
  
  /**
   * element  : languages of type {urn:enterprise.soap.sforce.com}KnowledgeLanguageItem
   * java type: com.sforce.soap.enterprise.KnowledgeLanguageItem[]
   */
  private static final com.sforce.ws.bind.TypeInfo languages__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","languages","urn:enterprise.soap.sforce.com","KnowledgeLanguageItem",0,-1,true);

  private boolean languages__is_set = false;

  private com.sforce.soap.enterprise.KnowledgeLanguageItem[] languages = new com.sforce.soap.enterprise.KnowledgeLanguageItem[0];

  public com.sforce.soap.enterprise.KnowledgeLanguageItem[] getLanguages() {
    return languages;
  }

  

  public void setLanguages(com.sforce.soap.enterprise.KnowledgeLanguageItem[] languages) {
    this.languages = languages;
    languages__is_set = true;
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
   
    __typeMapper.writeString(__out, defaultLanguage__typeInfo, defaultLanguage, defaultLanguage__is_set);
    __typeMapper.writeBoolean(__out, knowledgeEnabled__typeInfo, knowledgeEnabled, knowledgeEnabled__is_set);
    __typeMapper.writeObject(__out, languages__typeInfo, languages, languages__is_set);
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
    if (__typeMapper.isElement(__in, defaultLanguage__typeInfo)) {
      setDefaultLanguage((java.lang.String)__typeMapper.readString(__in, defaultLanguage__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, knowledgeEnabled__typeInfo)) {
      setKnowledgeEnabled((boolean)__typeMapper.readBoolean(__in, knowledgeEnabled__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, languages__typeInfo)) {
      setLanguages((com.sforce.soap.enterprise.KnowledgeLanguageItem[])__typeMapper.readObject(__in, languages__typeInfo, com.sforce.soap.enterprise.KnowledgeLanguageItem[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[KnowledgeSettings ");
    
    sb.append(" defaultLanguage=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(defaultLanguage)+"'\n");
    sb.append(" knowledgeEnabled=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(knowledgeEnabled)+"'\n");
    sb.append(" languages=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(languages)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}