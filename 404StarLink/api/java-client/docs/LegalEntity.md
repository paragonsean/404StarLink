

# LegalEntity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**capabilities** |  | Contains key-value pairs that specify the actions that the legal entity can do in your platform.The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability. |  [optional] [readonly] |
|**documents** | [**List&lt;EntityReference&gt;**](EntityReference.md) | List of documents uploaded for the legal entity. |  [optional] |
|**entityAssociations** | [**List&lt;LegalEntityAssociation&gt;**](LegalEntityAssociation.md) | List of legal entities associated with the current legal entity. For example, ultimate beneficial owners associated with an organization through ownership or control, or as signatories. |  [optional] |
|**id** | **String** | The unique identifier of the legal entity. |  [readonly] |
|**individual** | [**Individual**](Individual.md) |  |  [optional] |
|**organization** | [**Organization**](Organization.md) |  |  [optional] |
|**reference** | **String** | Your reference for the legal entity, maximum 150 characters. |  [optional] |
|**transferInstruments** | [**List&lt;TransferInstrumentReference&gt;**](TransferInstrumentReference.md) | List of transfer instruments that the legal entity owns. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of legal entity.   Possible values: **individual** or **organization** |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;individual&quot; |
| ORGANIZATION | &quot;organization&quot; |



