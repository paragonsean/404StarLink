# LegalEntity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capabilities** | [**Dict[str, LegalEntityCapability]**](LegalEntityCapability.md) | Contains key-value pairs that specify the actions that the legal entity can do in your platform.The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability. | [optional] [readonly] 
**document_details** | [**List[DocumentReference]**](DocumentReference.md) | List of documents uploaded for the legal entity. | [optional] 
**documents** | [**List[EntityReference]**](EntityReference.md) | List of documents uploaded for the legal entity. | [optional] 
**entity_associations** | [**List[LegalEntityAssociation]**](LegalEntityAssociation.md) | List of legal entities associated with the current legal entity. For example, ultimate beneficial owners associated with an organization through ownership or control, or as signatories. | [optional] 
**id** | **str** | The unique identifier of the legal entity. | [readonly] 
**individual** | [**Individual**](Individual.md) | Information about the individual. Required if &#x60;type&#x60; is **individual**. | [optional] 
**organization** | [**Organization**](Organization.md) | Information about the organization. Required if &#x60;type&#x60; is **organization**. | [optional] 
**problems** | [**List[CapabilityProblem]**](CapabilityProblem.md) | List of the verification errors from capabilities for the legal entity. | [optional] 
**reference** | **str** | Your reference for the legal entity, maximum 150 characters. | [optional] 
**sole_proprietorship** | [**SoleProprietorship**](SoleProprietorship.md) | Information about the sole proprietorship. Required if &#x60;type&#x60; is **soleProprietorship**. | [optional] 
**transfer_instruments** | [**List[TransferInstrumentReference]**](TransferInstrumentReference.md) | List of transfer instruments that the legal entity owns. | [optional] 
**type** | **str** | The type of legal entity.   Possible values: **individual**, **organization**, or **soleProprietorship**. | [optional] 

## Example

```python
from openapi_client.models.legal_entity import LegalEntity

# TODO update the JSON string below
json = "{}"
# create an instance of LegalEntity from a JSON string
legal_entity_instance = LegalEntity.from_json(json)
# print the JSON string representation of the object
print(LegalEntity.to_json())

# convert the object into a dict
legal_entity_dict = legal_entity_instance.to_dict()
# create an instance of LegalEntity from a dict
legal_entity_from_dict = LegalEntity.from_dict(legal_entity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


