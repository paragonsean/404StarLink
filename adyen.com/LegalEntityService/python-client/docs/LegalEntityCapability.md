# LegalEntityCapability


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowed** | **bool** | Indicates whether the capability is allowed. Adyen sets this to **true** if the verification is successful  | [optional] [readonly] 
**allowed_level** | **str** | The capability level that is allowed for the legal entity.  Possible values: **notApplicable**, **low**, **medium**, **high**. | [optional] [readonly] 
**allowed_settings** | [**CapabilitySettings**](CapabilitySettings.md) | The settings that were allowed for the Legal Entity. | [optional] [readonly] 
**requested** | **bool** | Indicates whether the capability is requested. To check whether the Legal Entity is permitted to use the capability,  | [optional] [readonly] 
**requested_level** | **str** | The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**. | [optional] [readonly] 
**requested_settings** | [**CapabilitySettings**](CapabilitySettings.md) | The settings that are requested for the Legal Entity. | [optional] [readonly] 
**transfer_instruments** | [**List[SupportingEntityCapability]**](SupportingEntityCapability.md) | Capability status for transfer instruments associated with legal entity | [optional] 
**verification_status** | **str** | The status of the verification checks for the capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the &#x60;errors&#x60; array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability.  | [optional] [readonly] 

## Example

```python
from openapi_client.models.legal_entity_capability import LegalEntityCapability

# TODO update the JSON string below
json = "{}"
# create an instance of LegalEntityCapability from a JSON string
legal_entity_capability_instance = LegalEntityCapability.from_json(json)
# print the JSON string representation of the object
print(LegalEntityCapability.to_json())

# convert the object into a dict
legal_entity_capability_dict = legal_entity_capability_instance.to_dict()
# create an instance of LegalEntityCapability from a dict
legal_entity_capability_from_dict = LegalEntityCapability.from_dict(legal_entity_capability_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


