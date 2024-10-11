# CustomMessageActivity

The settings for a custom message activity. This type of activity calls an AWS Lambda function or web hook that sends messages to participants.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_uri** | **str** |  | [optional] 
**endpoint_types** | **List** |  | [optional] 
**message_config** | [**CustomMessageActivityMessageConfig**](CustomMessageActivityMessageConfig.md) |  | [optional] 
**next_activity** | **str** |  | [optional] 
**template_name** | **str** |  | [optional] 
**template_version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.custom_message_activity import CustomMessageActivity

# TODO update the JSON string below
json = "{}"
# create an instance of CustomMessageActivity from a JSON string
custom_message_activity_instance = CustomMessageActivity.from_json(json)
# print the JSON string representation of the object
print(CustomMessageActivity.to_json())

# convert the object into a dict
custom_message_activity_dict = custom_message_activity_instance.to_dict()
# create an instance of CustomMessageActivity from a dict
custom_message_activity_from_dict = CustomMessageActivity.from_dict(custom_message_activity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


