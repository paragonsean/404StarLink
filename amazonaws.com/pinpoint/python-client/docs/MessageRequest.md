# MessageRequest

Specifies the configuration and other settings for a message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | **Dict** |  | [optional] 
**context** | **Dict** |  | [optional] 
**endpoints** | **Dict** |  | [optional] 
**message_configuration** | [**SendMessagesRequestMessageRequestMessageConfiguration**](SendMessagesRequestMessageRequestMessageConfiguration.md) |  | 
**template_configuration** | [**SendMessagesRequestMessageRequestTemplateConfiguration**](SendMessagesRequestMessageRequestTemplateConfiguration.md) |  | [optional] 
**trace_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.message_request import MessageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of MessageRequest from a JSON string
message_request_instance = MessageRequest.from_json(json)
# print the JSON string representation of the object
print(MessageRequest.to_json())

# convert the object into a dict
message_request_dict = message_request_instance.to_dict()
# create an instance of MessageRequest from a dict
message_request_from_dict = MessageRequest.from_dict(message_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


