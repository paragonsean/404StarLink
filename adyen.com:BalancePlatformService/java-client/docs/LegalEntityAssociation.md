

# LegalEntityAssociation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**associatorId** | **String** | The unique identifier of another legal entity with which the &#x60;legalEntityId&#x60; is associated. When the &#x60;legalEntityId&#x60; is associated to legal entities other than the current one, the response returns all the associations. |  [optional] [readonly] |
|**entityType** | **String** | The legal entity type of associated legal entity.   For example, **organization**, **soleProprietorship** or **individual**.  |  [optional] [readonly] |
|**jobTitle** | **String** | The individual&#39;s job title if the &#x60;type&#x60; is **uboThroughControl** or **signatory**. |  [optional] |
|**legalEntityId** | **String** | The unique identifier of the associated [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id). |  |
|**name** | **String** | The name of the associated [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id).  - For **individual**, &#x60;name.firstName&#x60; and &#x60;name.lastName&#x60;. - For **organization**, &#x60;legalName&#x60;. - For **soleProprietorship**, &#x60;name&#x60;. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | Defines the relationship of the legal entity to the current legal entity.   For example, **uboThroughOwnership**, **uboThroughControl**, **signatory**, or **soleProprietorship**.  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SIGNATORY | &quot;signatory&quot; |
| UBO_THROUGH_CONTROL | &quot;uboThroughControl&quot; |
| UBO_THROUGH_OWNERSHIP | &quot;uboThroughOwnership&quot; |



