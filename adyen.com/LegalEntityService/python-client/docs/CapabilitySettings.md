# CapabilitySettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount_per_industry** | [**Dict[str, Amount]**](Amount.md) | The maximum amount a card holder can spend per industry. | [optional] 
**authorized_card_users** | **bool** | The number of card holders who can use the card. | [optional] 
**funding_source** | **List[str]** | The funding source of the card, for example **debit**. | [optional] 
**interval** | **str** | The period when the rule conditions apply. | [optional] 
**max_amount** | [**Amount**](Amount.md) | The maximum amount a card holder can withdraw per day. | [optional] 

## Example

```python
from openapi_client.models.capability_settings import CapabilitySettings

# TODO update the JSON string below
json = "{}"
# create an instance of CapabilitySettings from a JSON string
capability_settings_instance = CapabilitySettings.from_json(json)
# print the JSON string representation of the object
print(CapabilitySettings.to_json())

# convert the object into a dict
capability_settings_dict = capability_settings_instance.to_dict()
# create an instance of CapabilitySettings from a dict
capability_settings_from_dict = CapabilitySettings.from_dict(capability_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


