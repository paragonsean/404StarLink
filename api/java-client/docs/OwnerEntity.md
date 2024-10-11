

# OwnerEntity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the resource that owns the document. For &#x60;type&#x60; **legalEntity**, this value is the unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id). For &#x60;type&#x60; **bankAccount**, this value is the unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id). |  |
|**type** | **String** | Type of resource that owns the document.  Possible values: **legalEntity**, **bankAccount**. |  |



