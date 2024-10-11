# SendUsersMessagesRequestSendUsersMessageRequest

Specifies the configuration and other settings for a message to send to all the endpoints that are associated with a list of users.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | **Dict** |  | [optional] 
**message_configuration** | [**SendMessagesRequestMessageRequestMessageConfiguration**](SendMessagesRequestMessageRequestMessageConfiguration.md) |  | [optional] 
**template_configuration** | [**SendMessagesRequestMessageRequestTemplateConfiguration**](SendMessagesRequestMessageRequestTemplateConfiguration.md) |  | [optional] 
**trace_id** | **str** |  | [optional] 
**users** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.send_users_messages_request_send_users_message_request import SendUsersMessagesRequestSendUsersMessageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SendUsersMessagesRequestSendUsersMessageRequest from a JSON string
send_users_messages_request_send_users_message_request_instance = SendUsersMessagesRequestSendUsersMessageRequest.from_json(json)
# print the JSON string representation of the object
print(SendUsersMessagesRequestSendUsersMessageRequest.to_json())

# convert the object into a dict
send_users_messages_request_send_users_message_request_dict = send_users_messages_request_send_users_message_request_instance.to_dict()
# create an instance of SendUsersMessagesRequestSendUsersMessageRequest from a dict
send_users_messages_request_send_users_message_request_from_dict = SendUsersMessagesRequestSendUsersMessageRequest.from_dict(send_users_messages_request_send_users_message_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


