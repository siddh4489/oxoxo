package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeLayoutButton implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeLayoutButton() {
  }
    
  
  /**
   * element  : behavior of type {urn:enterprise.soap.sforce.com}WebLinkWindowType
   * java type: com.sforce.soap.enterprise.WebLinkWindowType
   */
  private static final com.sforce.ws.bind.TypeInfo behavior__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","behavior","urn:enterprise.soap.sforce.com","WebLinkWindowType",0,1,true);

  private boolean behavior__is_set = false;

  private com.sforce.soap.enterprise.WebLinkWindowType behavior;

  public com.sforce.soap.enterprise.WebLinkWindowType getBehavior() {
    return behavior;
  }

  

  public void setBehavior(com.sforce.soap.enterprise.WebLinkWindowType behavior) {
    this.behavior = behavior;
    behavior__is_set = true;
  }
  
  /**
   * element  : colors of type {urn:enterprise.soap.sforce.com}DescribeColor
   * java type: com.sforce.soap.enterprise.DescribeColor[]
   */
  private static final com.sforce.ws.bind.TypeInfo colors__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","colors","urn:enterprise.soap.sforce.com","DescribeColor",0,-1,true);

  private boolean colors__is_set = false;

  private com.sforce.soap.enterprise.DescribeColor[] colors = new com.sforce.soap.enterprise.DescribeColor[0];

  public com.sforce.soap.enterprise.DescribeColor[] getColors() {
    return colors;
  }

  

  public void setColors(com.sforce.soap.enterprise.DescribeColor[] colors) {
    this.colors = colors;
    colors__is_set = true;
  }
  
  /**
   * element  : content of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo content__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","content","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean content__is_set = false;

  private java.lang.String content;

  public java.lang.String getContent() {
    return content;
  }

  

  public void setContent(java.lang.String content) {
    this.content = content;
    content__is_set = true;
  }
  
  /**
   * element  : contentSource of type {urn:enterprise.soap.sforce.com}WebLinkType
   * java type: com.sforce.soap.enterprise.WebLinkType
   */
  private static final com.sforce.ws.bind.TypeInfo contentSource__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","contentSource","urn:enterprise.soap.sforce.com","WebLinkType",0,1,true);

  private boolean contentSource__is_set = false;

  private com.sforce.soap.enterprise.WebLinkType contentSource;

  public com.sforce.soap.enterprise.WebLinkType getContentSource() {
    return contentSource;
  }

  

  public void setContentSource(com.sforce.soap.enterprise.WebLinkType contentSource) {
    this.contentSource = contentSource;
    contentSource__is_set = true;
  }
  
  /**
   * element  : custom of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo custom__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","custom","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean custom__is_set = false;

  private boolean custom;

  public boolean getCustom() {
    return custom;
  }

  

  public boolean isCustom() {
    return custom;
  }

  

  public void setCustom(boolean custom) {
    this.custom = custom;
    custom__is_set = true;
  }
  
  /**
   * element  : encoding of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo encoding__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","encoding","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean encoding__is_set = false;

  private java.lang.String encoding;

  public java.lang.String getEncoding() {
    return encoding;
  }

  

  public void setEncoding(java.lang.String encoding) {
    this.encoding = encoding;
    encoding__is_set = true;
  }
  
  /**
   * element  : height of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo height__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","height","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean height__is_set = false;

  private java.lang.Integer height;

  public java.lang.Integer getHeight() {
    return height;
  }

  

  public void setHeight(java.lang.Integer height) {
    this.height = height;
    height__is_set = true;
  }
  
  /**
   * element  : icons of type {urn:enterprise.soap.sforce.com}DescribeIcon
   * java type: com.sforce.soap.enterprise.DescribeIcon[]
   */
  private static final com.sforce.ws.bind.TypeInfo icons__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","icons","urn:enterprise.soap.sforce.com","DescribeIcon",0,-1,true);

  private boolean icons__is_set = false;

  private com.sforce.soap.enterprise.DescribeIcon[] icons = new com.sforce.soap.enterprise.DescribeIcon[0];

  public com.sforce.soap.enterprise.DescribeIcon[] getIcons() {
    return icons;
  }

  

  public void setIcons(com.sforce.soap.enterprise.DescribeIcon[] icons) {
    this.icons = icons;
    icons__is_set = true;
  }
  
  /**
   * element  : label of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo label__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean label__is_set = false;

  private java.lang.String label;

  public java.lang.String getLabel() {
    return label;
  }

  

  public void setLabel(java.lang.String label) {
    this.label = label;
    label__is_set = true;
  }
  
  /**
   * element  : menubar of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo menubar__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","menubar","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean menubar__is_set = false;

  private java.lang.Boolean menubar;

  public java.lang.Boolean getMenubar() {
    return menubar;
  }

  

  public void setMenubar(java.lang.Boolean menubar) {
    this.menubar = menubar;
    menubar__is_set = true;
  }
  
  /**
   * element  : name of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean name__is_set = false;

  private java.lang.String name;

  public java.lang.String getName() {
    return name;
  }

  

  public void setName(java.lang.String name) {
    this.name = name;
    name__is_set = true;
  }
  
  /**
   * element  : overridden of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo overridden__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","overridden","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean overridden__is_set = false;

  private boolean overridden;

  public boolean getOverridden() {
    return overridden;
  }

  

  public boolean isOverridden() {
    return overridden;
  }

  

  public void setOverridden(boolean overridden) {
    this.overridden = overridden;
    overridden__is_set = true;
  }
  
  /**
   * element  : resizeable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo resizeable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","resizeable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean resizeable__is_set = false;

  private java.lang.Boolean resizeable;

  public java.lang.Boolean getResizeable() {
    return resizeable;
  }

  

  public void setResizeable(java.lang.Boolean resizeable) {
    this.resizeable = resizeable;
    resizeable__is_set = true;
  }
  
  /**
   * element  : scrollbars of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo scrollbars__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","scrollbars","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean scrollbars__is_set = false;

  private java.lang.Boolean scrollbars;

  public java.lang.Boolean getScrollbars() {
    return scrollbars;
  }

  

  public void setScrollbars(java.lang.Boolean scrollbars) {
    this.scrollbars = scrollbars;
    scrollbars__is_set = true;
  }
  
  /**
   * element  : showsLocation of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo showsLocation__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","showsLocation","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean showsLocation__is_set = false;

  private java.lang.Boolean showsLocation;

  public java.lang.Boolean getShowsLocation() {
    return showsLocation;
  }

  

  public void setShowsLocation(java.lang.Boolean showsLocation) {
    this.showsLocation = showsLocation;
    showsLocation__is_set = true;
  }
  
  /**
   * element  : showsStatus of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo showsStatus__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","showsStatus","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean showsStatus__is_set = false;

  private java.lang.Boolean showsStatus;

  public java.lang.Boolean getShowsStatus() {
    return showsStatus;
  }

  

  public void setShowsStatus(java.lang.Boolean showsStatus) {
    this.showsStatus = showsStatus;
    showsStatus__is_set = true;
  }
  
  /**
   * element  : toolbar of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo toolbar__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","toolbar","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean toolbar__is_set = false;

  private java.lang.Boolean toolbar;

  public java.lang.Boolean getToolbar() {
    return toolbar;
  }

  

  public void setToolbar(java.lang.Boolean toolbar) {
    this.toolbar = toolbar;
    toolbar__is_set = true;
  }
  
  /**
   * element  : url of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo url__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","url","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean url__is_set = false;

  private java.lang.String url;

  public java.lang.String getUrl() {
    return url;
  }

  

  public void setUrl(java.lang.String url) {
    this.url = url;
    url__is_set = true;
  }
  
  /**
   * element  : width of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo width__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","width","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean width__is_set = false;

  private java.lang.Integer width;

  public java.lang.Integer getWidth() {
    return width;
  }

  

  public void setWidth(java.lang.Integer width) {
    this.width = width;
    width__is_set = true;
  }
  
  /**
   * element  : windowPosition of type {urn:enterprise.soap.sforce.com}WebLinkPosition
   * java type: com.sforce.soap.enterprise.WebLinkPosition
   */
  private static final com.sforce.ws.bind.TypeInfo windowPosition__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","windowPosition","urn:enterprise.soap.sforce.com","WebLinkPosition",0,1,true);

  private boolean windowPosition__is_set = false;

  private com.sforce.soap.enterprise.WebLinkPosition windowPosition;

  public com.sforce.soap.enterprise.WebLinkPosition getWindowPosition() {
    return windowPosition;
  }

  

  public void setWindowPosition(com.sforce.soap.enterprise.WebLinkPosition windowPosition) {
    this.windowPosition = windowPosition;
    windowPosition__is_set = true;
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
   
    __typeMapper.writeObject(__out, behavior__typeInfo, behavior, behavior__is_set);
    __typeMapper.writeObject(__out, colors__typeInfo, colors, colors__is_set);
    __typeMapper.writeString(__out, content__typeInfo, content, content__is_set);
    __typeMapper.writeObject(__out, contentSource__typeInfo, contentSource, contentSource__is_set);
    __typeMapper.writeBoolean(__out, custom__typeInfo, custom, custom__is_set);
    __typeMapper.writeString(__out, encoding__typeInfo, encoding, encoding__is_set);
    __typeMapper.writeObject(__out, height__typeInfo, height, height__is_set);
    __typeMapper.writeObject(__out, icons__typeInfo, icons, icons__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeObject(__out, menubar__typeInfo, menubar, menubar__is_set);
    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
    __typeMapper.writeBoolean(__out, overridden__typeInfo, overridden, overridden__is_set);
    __typeMapper.writeObject(__out, resizeable__typeInfo, resizeable, resizeable__is_set);
    __typeMapper.writeObject(__out, scrollbars__typeInfo, scrollbars, scrollbars__is_set);
    __typeMapper.writeObject(__out, showsLocation__typeInfo, showsLocation, showsLocation__is_set);
    __typeMapper.writeObject(__out, showsStatus__typeInfo, showsStatus, showsStatus__is_set);
    __typeMapper.writeObject(__out, toolbar__typeInfo, toolbar, toolbar__is_set);
    __typeMapper.writeString(__out, url__typeInfo, url, url__is_set);
    __typeMapper.writeObject(__out, width__typeInfo, width, width__is_set);
    __typeMapper.writeObject(__out, windowPosition__typeInfo, windowPosition, windowPosition__is_set);
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
    if (__typeMapper.isElement(__in, behavior__typeInfo)) {
      setBehavior((com.sforce.soap.enterprise.WebLinkWindowType)__typeMapper.readObject(__in, behavior__typeInfo, com.sforce.soap.enterprise.WebLinkWindowType.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, colors__typeInfo)) {
      setColors((com.sforce.soap.enterprise.DescribeColor[])__typeMapper.readObject(__in, colors__typeInfo, com.sforce.soap.enterprise.DescribeColor[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, content__typeInfo)) {
      setContent((java.lang.String)__typeMapper.readString(__in, content__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, contentSource__typeInfo)) {
      setContentSource((com.sforce.soap.enterprise.WebLinkType)__typeMapper.readObject(__in, contentSource__typeInfo, com.sforce.soap.enterprise.WebLinkType.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, custom__typeInfo)) {
      setCustom((boolean)__typeMapper.readBoolean(__in, custom__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, encoding__typeInfo)) {
      setEncoding((java.lang.String)__typeMapper.readString(__in, encoding__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, height__typeInfo)) {
      setHeight((java.lang.Integer)__typeMapper.readObject(__in, height__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, icons__typeInfo)) {
      setIcons((com.sforce.soap.enterprise.DescribeIcon[])__typeMapper.readObject(__in, icons__typeInfo, com.sforce.soap.enterprise.DescribeIcon[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, menubar__typeInfo)) {
      setMenubar((java.lang.Boolean)__typeMapper.readObject(__in, menubar__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, overridden__typeInfo)) {
      setOverridden((boolean)__typeMapper.readBoolean(__in, overridden__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, resizeable__typeInfo)) {
      setResizeable((java.lang.Boolean)__typeMapper.readObject(__in, resizeable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, scrollbars__typeInfo)) {
      setScrollbars((java.lang.Boolean)__typeMapper.readObject(__in, scrollbars__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, showsLocation__typeInfo)) {
      setShowsLocation((java.lang.Boolean)__typeMapper.readObject(__in, showsLocation__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, showsStatus__typeInfo)) {
      setShowsStatus((java.lang.Boolean)__typeMapper.readObject(__in, showsStatus__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, toolbar__typeInfo)) {
      setToolbar((java.lang.Boolean)__typeMapper.readObject(__in, toolbar__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, url__typeInfo)) {
      setUrl((java.lang.String)__typeMapper.readString(__in, url__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, width__typeInfo)) {
      setWidth((java.lang.Integer)__typeMapper.readObject(__in, width__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, windowPosition__typeInfo)) {
      setWindowPosition((com.sforce.soap.enterprise.WebLinkPosition)__typeMapper.readObject(__in, windowPosition__typeInfo, com.sforce.soap.enterprise.WebLinkPosition.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeLayoutButton ");
    
    sb.append(" behavior=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(behavior)+"'\n");
    sb.append(" colors=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(colors)+"'\n");
    sb.append(" content=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(content)+"'\n");
    sb.append(" contentSource=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(contentSource)+"'\n");
    sb.append(" custom=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(custom)+"'\n");
    sb.append(" encoding=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(encoding)+"'\n");
    sb.append(" height=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(height)+"'\n");
    sb.append(" icons=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(icons)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" menubar=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(menubar)+"'\n");
    sb.append(" name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");
    sb.append(" overridden=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(overridden)+"'\n");
    sb.append(" resizeable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(resizeable)+"'\n");
    sb.append(" scrollbars=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(scrollbars)+"'\n");
    sb.append(" showsLocation=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(showsLocation)+"'\n");
    sb.append(" showsStatus=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(showsStatus)+"'\n");
    sb.append(" toolbar=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(toolbar)+"'\n");
    sb.append(" url=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(url)+"'\n");
    sb.append(" width=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(width)+"'\n");
    sb.append(" windowPosition=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(windowPosition)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}