# DirectMessageConfigurationADMMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**Action**](Action.md) |  | [optional] 
**body** | **str** |  | [optional] 
**consolidation_key** | **str** |  | [optional] 
**data** | **Dict** |  | [optional] 
**expires_after** | **str** |  | [optional] 
**icon_reference** | **str** |  | [optional] 
**image_icon_url** | **str** |  | [optional] 
**image_url** | **str** |  | [optional] 
**md5** | **str** |  | [optional] 
**raw_content** | **str** |  | [optional] 
**silent_push** | **bool** |  | [optional] 
**small_image_icon_url** | **str** |  | [optional] 
**sound** | **str** |  | [optional] 
**substitutions** | **Dict** |  | [optional] 
**title** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.direct_message_configuration_adm_message import DirectMessageConfigurationADMMessage

# TODO update the JSON string below
json = "{}"
# create an instance of DirectMessageConfigurationADMMessage from a JSON string
direct_message_configuration_adm_message_instance = DirectMessageConfigurationADMMessage.from_json(json)
# print the JSON string representation of the object
print(DirectMessageConfigurationADMMessage.to_json())

# convert the object into a dict
direct_message_configuration_adm_message_dict = direct_message_configuration_adm_message_instance.to_dict()
# create an instance of DirectMessageConfigurationADMMessage from a dict
direct_message_configuration_adm_message_from_dict = DirectMessageConfigurationADMMessage.from_dict(direct_message_configuration_adm_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


