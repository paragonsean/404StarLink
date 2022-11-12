# LegalEntityInfoRequiredType


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capabilities** | [**Dict[str, LegalEntityCapability]**](LegalEntityCapability.md) | Contains key-value pairs that specify the actions that the legal entity can do in your platform.The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability. | [optional] [readonly] 
**entity_associations** | [**List[LegalEntityAssociation]**](LegalEntityAssociation.md) | List of legal entities associated with the current legal entity. For example, ultimate beneficial owners associated with an organization through ownership or control, or as signatories. | [optional] 
**individual** | [**Individual**](Individual.md) | Information about the individual. Required if &#x60;type&#x60; is **individual**. | [optional] 
**organization** | [**Organization**](Organization.md) | Information about the organization. Required if &#x60;type&#x60; is **organization**. | [optional] 
**reference** | **str** | Your reference for the legal entity, maximum 150 characters. | [optional] 
**sole_proprietorship** | [**SoleProprietorship**](SoleProprietorship.md) | Information about the sole proprietorship. Required if &#x60;type&#x60; is **soleProprietorship**. | [optional] 
**type** | **str** | The type of legal entity.   Possible values: **individual**, **organization**, or **soleProprietorship**. | 

## Example

```python
from openapi_client.models.legal_entity_info_required_type import LegalEntityInfoRequiredType

# TODO update the JSON string below
json = "{}"
# create an instance of LegalEntityInfoRequiredType from a JSON string
legal_entity_info_required_type_instance = LegalEntityInfoRequiredType.from_json(json)
# print the JSON string representation of the object
print(LegalEntityInfoRequiredType.to_json())

# convert the object into a dict
legal_entity_info_required_type_dict = legal_entity_info_required_type_instance.to_dict()
# create an instance of LegalEntityInfoRequiredType from a dict
legal_entity_info_required_type_from_dict = LegalEntityInfoRequiredType.from_dict(legal_entity_info_required_type_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


