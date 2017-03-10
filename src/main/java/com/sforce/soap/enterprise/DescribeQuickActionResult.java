package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeQuickActionResult implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeQuickActionResult() {
  }
    
  
  /**
   * element  : accessLevelRequired of type {urn:enterprise.soap.sforce.com}ShareAccessLevel
   * java type: com.sforce.soap.enterprise.ShareAccessLevel
   */
  private static final com.sforce.ws.bind.TypeInfo accessLevelRequired__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","accessLevelRequired","urn:enterprise.soap.sforce.com","ShareAccessLevel",1,1,true);

  private boolean accessLevelRequired__is_set = false;

  private com.sforce.soap.enterprise.ShareAccessLevel accessLevelRequired;

  public com.sforce.soap.enterprise.ShareAccessLevel getAccessLevelRequired() {
    return accessLevelRequired;
  }

  

  public void setAccessLevelRequired(com.sforce.soap.enterprise.ShareAccessLevel accessLevelRequired) {
    this.accessLevelRequired = accessLevelRequired;
    accessLevelRequired__is_set = true;
  }
  
  /**
   * element  : actionEnumOrId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo actionEnumOrId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","actionEnumOrId","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean actionEnumOrId__is_set = false;

  private java.lang.String actionEnumOrId;

  public java.lang.String getActionEnumOrId() {
    return actionEnumOrId;
  }

  

  public void setActionEnumOrId(java.lang.String actionEnumOrId) {
    this.actionEnumOrId = actionEnumOrId;
    actionEnumOrId__is_set = true;
  }
  
  /**
   * element  : canvasApplicationId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo canvasApplicationId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","canvasApplicationId","urn:enterprise.soap.sforce.com","ID",1,1,true);

  private boolean canvasApplicationId__is_set = false;

  private java.lang.String canvasApplicationId;

  public java.lang.String getCanvasApplicationId() {
    return canvasApplicationId;
  }

  

  public void setCanvasApplicationId(java.lang.String canvasApplicationId) {
    this.canvasApplicationId = canvasApplicationId;
    canvasApplicationId__is_set = true;
  }
  
  /**
   * element  : canvasApplicationName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo canvasApplicationName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","canvasApplicationName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean canvasApplicationName__is_set = false;

  private java.lang.String canvasApplicationName;

  public java.lang.String getCanvasApplicationName() {
    return canvasApplicationName;
  }

  

  public void setCanvasApplicationName(java.lang.String canvasApplicationName) {
    this.canvasApplicationName = canvasApplicationName;
    canvasApplicationName__is_set = true;
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
   * element  : contextSobjectType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo contextSobjectType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","contextSobjectType","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean contextSobjectType__is_set = false;

  private java.lang.String contextSobjectType;

  public java.lang.String getContextSobjectType() {
    return contextSobjectType;
  }

  

  public void setContextSobjectType(java.lang.String contextSobjectType) {
    this.contextSobjectType = contextSobjectType;
    contextSobjectType__is_set = true;
  }
  
  /**
   * element  : defaultValues of type {urn:enterprise.soap.sforce.com}DescribeQuickActionDefaultValue
   * java type: com.sforce.soap.enterprise.DescribeQuickActionDefaultValue[]
   */
  private static final com.sforce.ws.bind.TypeInfo defaultValues__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","defaultValues","urn:enterprise.soap.sforce.com","DescribeQuickActionDefaultValue",0,-1,true);

  private boolean defaultValues__is_set = false;

  private com.sforce.soap.enterprise.DescribeQuickActionDefaultValue[] defaultValues = new com.sforce.soap.enterprise.DescribeQuickActionDefaultValue[0];

  public com.sforce.soap.enterprise.DescribeQuickActionDefaultValue[] getDefaultValues() {
    return defaultValues;
  }

  

  public void setDefaultValues(com.sforce.soap.enterprise.DescribeQuickActionDefaultValue[] defaultValues) {
    this.defaultValues = defaultValues;
    defaultValues__is_set = true;
  }
  
  /**
   * element  : height of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo height__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","height","http://www.w3.org/2001/XMLSchema","int",1,1,true);

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
   * element  : iconName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo iconName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","iconName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean iconName__is_set = false;

  private java.lang.String iconName;

  public java.lang.String getIconName() {
    return iconName;
  }

  

  public void setIconName(java.lang.String iconName) {
    this.iconName = iconName;
    iconName__is_set = true;
  }
  
  /**
   * element  : iconUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo iconUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","iconUrl","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean iconUrl__is_set = false;

  private java.lang.String iconUrl;

  public java.lang.String getIconUrl() {
    return iconUrl;
  }

  

  public void setIconUrl(java.lang.String iconUrl) {
    this.iconUrl = iconUrl;
    iconUrl__is_set = true;
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
   * element  : layout of type {urn:enterprise.soap.sforce.com}DescribeLayoutSection
   * java type: com.sforce.soap.enterprise.DescribeLayoutSection
   */
  private static final com.sforce.ws.bind.TypeInfo layout__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","layout","urn:enterprise.soap.sforce.com","DescribeLayoutSection",1,1,true);

  private boolean layout__is_set = false;

  private com.sforce.soap.enterprise.DescribeLayoutSection layout;

  public com.sforce.soap.enterprise.DescribeLayoutSection getLayout() {
    return layout;
  }

  

  public void setLayout(com.sforce.soap.enterprise.DescribeLayoutSection layout) {
    this.layout = layout;
    layout__is_set = true;
  }
  
  /**
   * element  : lightningComponentBundleId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo lightningComponentBundleId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","lightningComponentBundleId","urn:enterprise.soap.sforce.com","ID",1,1,true);

  private boolean lightningComponentBundleId__is_set = false;

  private java.lang.String lightningComponentBundleId;

  public java.lang.String getLightningComponentBundleId() {
    return lightningComponentBundleId;
  }

  

  public void setLightningComponentBundleId(java.lang.String lightningComponentBundleId) {
    this.lightningComponentBundleId = lightningComponentBundleId;
    lightningComponentBundleId__is_set = true;
  }
  
  /**
   * element  : lightningComponentBundleName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo lightningComponentBundleName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","lightningComponentBundleName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean lightningComponentBundleName__is_set = false;

  private java.lang.String lightningComponentBundleName;

  public java.lang.String getLightningComponentBundleName() {
    return lightningComponentBundleName;
  }

  

  public void setLightningComponentBundleName(java.lang.String lightningComponentBundleName) {
    this.lightningComponentBundleName = lightningComponentBundleName;
    lightningComponentBundleName__is_set = true;
  }
  
  /**
   * element  : lightningComponentQualifiedName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo lightningComponentQualifiedName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","lightningComponentQualifiedName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean lightningComponentQualifiedName__is_set = false;

  private java.lang.String lightningComponentQualifiedName;

  public java.lang.String getLightningComponentQualifiedName() {
    return lightningComponentQualifiedName;
  }

  

  public void setLightningComponentQualifiedName(java.lang.String lightningComponentQualifiedName) {
    this.lightningComponentQualifiedName = lightningComponentQualifiedName;
    lightningComponentQualifiedName__is_set = true;
  }
  
  /**
   * element  : miniIconUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo miniIconUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","miniIconUrl","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean miniIconUrl__is_set = false;

  private java.lang.String miniIconUrl;

  public java.lang.String getMiniIconUrl() {
    return miniIconUrl;
  }

  

  public void setMiniIconUrl(java.lang.String miniIconUrl) {
    this.miniIconUrl = miniIconUrl;
    miniIconUrl__is_set = true;
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
   * element  : showQuickActionLcHeader of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo showQuickActionLcHeader__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","showQuickActionLcHeader","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean showQuickActionLcHeader__is_set = false;

  private boolean showQuickActionLcHeader;

  public boolean getShowQuickActionLcHeader() {
    return showQuickActionLcHeader;
  }

  

  public boolean isShowQuickActionLcHeader() {
    return showQuickActionLcHeader;
  }

  

  public void setShowQuickActionLcHeader(boolean showQuickActionLcHeader) {
    this.showQuickActionLcHeader = showQuickActionLcHeader;
    showQuickActionLcHeader__is_set = true;
  }
  
  /**
   * element  : showQuickActionVfHeader of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo showQuickActionVfHeader__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","showQuickActionVfHeader","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean showQuickActionVfHeader__is_set = false;

  private boolean showQuickActionVfHeader;

  public boolean getShowQuickActionVfHeader() {
    return showQuickActionVfHeader;
  }

  

  public boolean isShowQuickActionVfHeader() {
    return showQuickActionVfHeader;
  }

  

  public void setShowQuickActionVfHeader(boolean showQuickActionVfHeader) {
    this.showQuickActionVfHeader = showQuickActionVfHeader;
    showQuickActionVfHeader__is_set = true;
  }
  
  /**
   * element  : targetParentField of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo targetParentField__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","targetParentField","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean targetParentField__is_set = false;

  private java.lang.String targetParentField;

  public java.lang.String getTargetParentField() {
    return targetParentField;
  }

  

  public void setTargetParentField(java.lang.String targetParentField) {
    this.targetParentField = targetParentField;
    targetParentField__is_set = true;
  }
  
  /**
   * element  : targetRecordTypeId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo targetRecordTypeId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","targetRecordTypeId","urn:enterprise.soap.sforce.com","ID",1,1,true);

  private boolean targetRecordTypeId__is_set = false;

  private java.lang.String targetRecordTypeId;

  public java.lang.String getTargetRecordTypeId() {
    return targetRecordTypeId;
  }

  

  public void setTargetRecordTypeId(java.lang.String targetRecordTypeId) {
    this.targetRecordTypeId = targetRecordTypeId;
    targetRecordTypeId__is_set = true;
  }
  
  /**
   * element  : targetSobjectType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo targetSobjectType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","targetSobjectType","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean targetSobjectType__is_set = false;

  private java.lang.String targetSobjectType;

  public java.lang.String getTargetSobjectType() {
    return targetSobjectType;
  }

  

  public void setTargetSobjectType(java.lang.String targetSobjectType) {
    this.targetSobjectType = targetSobjectType;
    targetSobjectType__is_set = true;
  }
  
  /**
   * element  : type of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo type__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","type","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean type__is_set = false;

  private java.lang.String type;

  public java.lang.String getType() {
    return type;
  }

  

  public void setType(java.lang.String type) {
    this.type = type;
    type__is_set = true;
  }
  
  /**
   * element  : visualforcePageName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo visualforcePageName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","visualforcePageName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean visualforcePageName__is_set = false;

  private java.lang.String visualforcePageName;

  public java.lang.String getVisualforcePageName() {
    return visualforcePageName;
  }

  

  public void setVisualforcePageName(java.lang.String visualforcePageName) {
    this.visualforcePageName = visualforcePageName;
    visualforcePageName__is_set = true;
  }
  
  /**
   * element  : visualforcePageUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo visualforcePageUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","visualforcePageUrl","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean visualforcePageUrl__is_set = false;

  private java.lang.String visualforcePageUrl;

  public java.lang.String getVisualforcePageUrl() {
    return visualforcePageUrl;
  }

  

  public void setVisualforcePageUrl(java.lang.String visualforcePageUrl) {
    this.visualforcePageUrl = visualforcePageUrl;
    visualforcePageUrl__is_set = true;
  }
  
  /**
   * element  : width of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo width__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","width","http://www.w3.org/2001/XMLSchema","int",1,1,true);

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
   
    __typeMapper.writeObject(__out, accessLevelRequired__typeInfo, accessLevelRequired, accessLevelRequired__is_set);
    __typeMapper.writeString(__out, actionEnumOrId__typeInfo, actionEnumOrId, actionEnumOrId__is_set);
    __typeMapper.writeString(__out, canvasApplicationId__typeInfo, canvasApplicationId, canvasApplicationId__is_set);
    __typeMapper.writeString(__out, canvasApplicationName__typeInfo, canvasApplicationName, canvasApplicationName__is_set);
    __typeMapper.writeObject(__out, colors__typeInfo, colors, colors__is_set);
    __typeMapper.writeString(__out, contextSobjectType__typeInfo, contextSobjectType, contextSobjectType__is_set);
    __typeMapper.writeObject(__out, defaultValues__typeInfo, defaultValues, defaultValues__is_set);
    __typeMapper.writeObject(__out, height__typeInfo, height, height__is_set);
    __typeMapper.writeString(__out, iconName__typeInfo, iconName, iconName__is_set);
    __typeMapper.writeString(__out, iconUrl__typeInfo, iconUrl, iconUrl__is_set);
    __typeMapper.writeObject(__out, icons__typeInfo, icons, icons__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeObject(__out, layout__typeInfo, layout, layout__is_set);
    __typeMapper.writeString(__out, lightningComponentBundleId__typeInfo, lightningComponentBundleId, lightningComponentBundleId__is_set);
    __typeMapper.writeString(__out, lightningComponentBundleName__typeInfo, lightningComponentBundleName, lightningComponentBundleName__is_set);
    __typeMapper.writeString(__out, lightningComponentQualifiedName__typeInfo, lightningComponentQualifiedName, lightningComponentQualifiedName__is_set);
    __typeMapper.writeString(__out, miniIconUrl__typeInfo, miniIconUrl, miniIconUrl__is_set);
    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
    __typeMapper.writeBoolean(__out, showQuickActionLcHeader__typeInfo, showQuickActionLcHeader, showQuickActionLcHeader__is_set);
    __typeMapper.writeBoolean(__out, showQuickActionVfHeader__typeInfo, showQuickActionVfHeader, showQuickActionVfHeader__is_set);
    __typeMapper.writeString(__out, targetParentField__typeInfo, targetParentField, targetParentField__is_set);
    __typeMapper.writeString(__out, targetRecordTypeId__typeInfo, targetRecordTypeId, targetRecordTypeId__is_set);
    __typeMapper.writeString(__out, targetSobjectType__typeInfo, targetSobjectType, targetSobjectType__is_set);
    __typeMapper.writeString(__out, type__typeInfo, type, type__is_set);
    __typeMapper.writeString(__out, visualforcePageName__typeInfo, visualforcePageName, visualforcePageName__is_set);
    __typeMapper.writeString(__out, visualforcePageUrl__typeInfo, visualforcePageUrl, visualforcePageUrl__is_set);
    __typeMapper.writeObject(__out, width__typeInfo, width, width__is_set);
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
    if (__typeMapper.verifyElement(__in, accessLevelRequired__typeInfo)) {
      setAccessLevelRequired((com.sforce.soap.enterprise.ShareAccessLevel)__typeMapper.readObject(__in, accessLevelRequired__typeInfo, com.sforce.soap.enterprise.ShareAccessLevel.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, actionEnumOrId__typeInfo)) {
      setActionEnumOrId((java.lang.String)__typeMapper.readString(__in, actionEnumOrId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, canvasApplicationId__typeInfo)) {
      setCanvasApplicationId((java.lang.String)__typeMapper.readString(__in, canvasApplicationId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, canvasApplicationName__typeInfo)) {
      setCanvasApplicationName((java.lang.String)__typeMapper.readString(__in, canvasApplicationName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, colors__typeInfo)) {
      setColors((com.sforce.soap.enterprise.DescribeColor[])__typeMapper.readObject(__in, colors__typeInfo, com.sforce.soap.enterprise.DescribeColor[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, contextSobjectType__typeInfo)) {
      setContextSobjectType((java.lang.String)__typeMapper.readString(__in, contextSobjectType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, defaultValues__typeInfo)) {
      setDefaultValues((com.sforce.soap.enterprise.DescribeQuickActionDefaultValue[])__typeMapper.readObject(__in, defaultValues__typeInfo, com.sforce.soap.enterprise.DescribeQuickActionDefaultValue[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, height__typeInfo)) {
      setHeight((java.lang.Integer)__typeMapper.readObject(__in, height__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, iconName__typeInfo)) {
      setIconName((java.lang.String)__typeMapper.readString(__in, iconName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, iconUrl__typeInfo)) {
      setIconUrl((java.lang.String)__typeMapper.readString(__in, iconUrl__typeInfo, java.lang.String.class));
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
    if (__typeMapper.verifyElement(__in, layout__typeInfo)) {
      setLayout((com.sforce.soap.enterprise.DescribeLayoutSection)__typeMapper.readObject(__in, layout__typeInfo, com.sforce.soap.enterprise.DescribeLayoutSection.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, lightningComponentBundleId__typeInfo)) {
      setLightningComponentBundleId((java.lang.String)__typeMapper.readString(__in, lightningComponentBundleId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, lightningComponentBundleName__typeInfo)) {
      setLightningComponentBundleName((java.lang.String)__typeMapper.readString(__in, lightningComponentBundleName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, lightningComponentQualifiedName__typeInfo)) {
      setLightningComponentQualifiedName((java.lang.String)__typeMapper.readString(__in, lightningComponentQualifiedName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, miniIconUrl__typeInfo)) {
      setMiniIconUrl((java.lang.String)__typeMapper.readString(__in, miniIconUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, showQuickActionLcHeader__typeInfo)) {
      setShowQuickActionLcHeader((boolean)__typeMapper.readBoolean(__in, showQuickActionLcHeader__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, showQuickActionVfHeader__typeInfo)) {
      setShowQuickActionVfHeader((boolean)__typeMapper.readBoolean(__in, showQuickActionVfHeader__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, targetParentField__typeInfo)) {
      setTargetParentField((java.lang.String)__typeMapper.readString(__in, targetParentField__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, targetRecordTypeId__typeInfo)) {
      setTargetRecordTypeId((java.lang.String)__typeMapper.readString(__in, targetRecordTypeId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, targetSobjectType__typeInfo)) {
      setTargetSobjectType((java.lang.String)__typeMapper.readString(__in, targetSobjectType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, type__typeInfo)) {
      setType((java.lang.String)__typeMapper.readString(__in, type__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, visualforcePageName__typeInfo)) {
      setVisualforcePageName((java.lang.String)__typeMapper.readString(__in, visualforcePageName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, visualforcePageUrl__typeInfo)) {
      setVisualforcePageUrl((java.lang.String)__typeMapper.readString(__in, visualforcePageUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, width__typeInfo)) {
      setWidth((java.lang.Integer)__typeMapper.readObject(__in, width__typeInfo, java.lang.Integer.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeQuickActionResult ");
    
    sb.append(" accessLevelRequired=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(accessLevelRequired)+"'\n");
    sb.append(" actionEnumOrId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(actionEnumOrId)+"'\n");
    sb.append(" canvasApplicationId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(canvasApplicationId)+"'\n");
    sb.append(" canvasApplicationName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(canvasApplicationName)+"'\n");
    sb.append(" colors=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(colors)+"'\n");
    sb.append(" contextSobjectType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(contextSobjectType)+"'\n");
    sb.append(" defaultValues=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(defaultValues)+"'\n");
    sb.append(" height=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(height)+"'\n");
    sb.append(" iconName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(iconName)+"'\n");
    sb.append(" iconUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(iconUrl)+"'\n");
    sb.append(" icons=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(icons)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" layout=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(layout)+"'\n");
    sb.append(" lightningComponentBundleId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(lightningComponentBundleId)+"'\n");
    sb.append(" lightningComponentBundleName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(lightningComponentBundleName)+"'\n");
    sb.append(" lightningComponentQualifiedName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(lightningComponentQualifiedName)+"'\n");
    sb.append(" miniIconUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(miniIconUrl)+"'\n");
    sb.append(" name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");
    sb.append(" showQuickActionLcHeader=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(showQuickActionLcHeader)+"'\n");
    sb.append(" showQuickActionVfHeader=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(showQuickActionVfHeader)+"'\n");
    sb.append(" targetParentField=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(targetParentField)+"'\n");
    sb.append(" targetRecordTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(targetRecordTypeId)+"'\n");
    sb.append(" targetSobjectType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(targetSobjectType)+"'\n");
    sb.append(" type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(type)+"'\n");
    sb.append(" visualforcePageName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(visualforcePageName)+"'\n");
    sb.append(" visualforcePageUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(visualforcePageUrl)+"'\n");
    sb.append(" width=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(width)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}