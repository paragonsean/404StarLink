# SendMessagesRequestMessageRequest

Specifies the configuration and other settings for a message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | **Dict** |  | [optional] 
**context** | **Dict** |  | [optional] 
**endpoints** | **Dict** |  | [optional] 
**message_configuration** | [**SendMessagesRequestMessageRequestMessageConfiguration**](SendMessagesRequestMessageRequestMessageConfiguration.md) |  | [optional] 
**template_configuration** | [**SendMessagesRequestMessageRequestTemplateConfiguration**](SendMessagesRequestMessageRequestTemplateConfiguration.md) |  | [optional] 
**trace_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.send_messages_request_message_request import SendMessagesRequestMessageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SendMessagesRequestMessageRequest from a JSON string
send_messages_request_message_request_instance = SendMessagesRequestMessageRequest.from_json(json)
# print the JSON string representation of the object
print(SendMessagesRequestMessageRequest.to_json())

# convert the object into a dict
send_messages_request_message_request_dict = send_messages_request_message_request_instance.to_dict()
# create an instance of SendMessagesRequestMessageRequest from a dict
send_messages_request_message_request_from_dict = SendMessagesRequestMessageRequest.from_dict(send_messages_request_message_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


