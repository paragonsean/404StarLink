# PushMessageActivityMessageConfig


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time_to_live** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.push_message_activity_message_config import PushMessageActivityMessageConfig

# TODO update the JSON string below
json = "{}"
# create an instance of PushMessageActivityMessageConfig from a JSON string
push_message_activity_message_config_instance = PushMessageActivityMessageConfig.from_json(json)
# print the JSON string representation of the object
print(PushMessageActivityMessageConfig.to_json())

# convert the object into a dict
push_message_activity_message_config_dict = push_message_activity_message_config_instance.to_dict()
# create an instance of PushMessageActivityMessageConfig from a dict
push_message_activity_message_config_from_dict = PushMessageActivityMessageConfig.from_dict(push_message_activity_message_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


