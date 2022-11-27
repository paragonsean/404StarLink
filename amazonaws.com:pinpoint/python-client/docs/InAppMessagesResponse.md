# InAppMessagesResponse

Get in-app messages response object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**in_app_message_campaigns** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.in_app_messages_response import InAppMessagesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of InAppMessagesResponse from a JSON string
in_app_messages_response_instance = InAppMessagesResponse.from_json(json)
# print the JSON string representation of the object
print(InAppMessagesResponse.to_json())

# convert the object into a dict
in_app_messages_response_dict = in_app_messages_response_instance.to_dict()
# create an instance of InAppMessagesResponse from a dict
in_app_messages_response_from_dict = InAppMessagesResponse.from_dict(in_app_messages_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


