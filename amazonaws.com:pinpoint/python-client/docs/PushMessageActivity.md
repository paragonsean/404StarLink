# PushMessageActivity

Specifies the settings for a push notification activity in a journey. This type of activity sends a push notification to participants.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_config** | [**PushMessageActivityMessageConfig**](PushMessageActivityMessageConfig.md) |  | [optional] 
**next_activity** | **str** |  | [optional] 
**template_name** | **str** |  | [optional] 
**template_version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.push_message_activity import PushMessageActivity

# TODO update the JSON string below
json = "{}"
# create an instance of PushMessageActivity from a JSON string
push_message_activity_instance = PushMessageActivity.from_json(json)
# print the JSON string representation of the object
print(PushMessageActivity.to_json())

# convert the object into a dict
push_message_activity_dict = push_message_activity_instance.to_dict()
# create an instance of PushMessageActivity from a dict
push_message_activity_from_dict = PushMessageActivity.from_dict(push_message_activity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


