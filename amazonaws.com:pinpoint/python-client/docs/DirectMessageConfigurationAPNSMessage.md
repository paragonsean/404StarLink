# DirectMessageConfigurationAPNSMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apns_push_type** | **str** |  | [optional] 
**action** | [**Action**](Action.md) |  | [optional] 
**badge** | **int** |  | [optional] 
**body** | **str** |  | [optional] 
**category** | **str** |  | [optional] 
**collapse_id** | **str** |  | [optional] 
**data** | **Dict** |  | [optional] 
**media_url** | **str** |  | [optional] 
**preferred_authentication_method** | **str** |  | [optional] 
**priority** | **str** |  | [optional] 
**raw_content** | **str** |  | [optional] 
**silent_push** | **bool** |  | [optional] 
**sound** | **str** |  | [optional] 
**substitutions** | **Dict** |  | [optional] 
**thread_id** | **str** |  | [optional] 
**time_to_live** | **int** |  | [optional] 
**title** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.direct_message_configuration_apns_message import DirectMessageConfigurationAPNSMessage

# TODO update the JSON string below
json = "{}"
# create an instance of DirectMessageConfigurationAPNSMessage from a JSON string
direct_message_configuration_apns_message_instance = DirectMessageConfigurationAPNSMessage.from_json(json)
# print the JSON string representation of the object
print(DirectMessageConfigurationAPNSMessage.to_json())

# convert the object into a dict
direct_message_configuration_apns_message_dict = direct_message_configuration_apns_message_instance.to_dict()
# create an instance of DirectMessageConfigurationAPNSMessage from a dict
direct_message_configuration_apns_message_from_dict = DirectMessageConfigurationAPNSMessage.from_dict(direct_message_configuration_apns_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


