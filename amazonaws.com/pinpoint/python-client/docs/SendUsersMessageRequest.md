# SendUsersMessageRequest

Specifies the configuration and other settings for a message to send to all the endpoints that are associated with a list of users.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | **Dict** |  | [optional] 
**message_configuration** | [**SendMessagesRequestMessageRequestMessageConfiguration**](SendMessagesRequestMessageRequestMessageConfiguration.md) |  | 
**template_configuration** | [**SendMessagesRequestMessageRequestTemplateConfiguration**](SendMessagesRequestMessageRequestTemplateConfiguration.md) |  | [optional] 
**trace_id** | **str** |  | [optional] 
**users** | **Dict** |  | 

## Example

```python
from openapi_client.models.send_users_message_request import SendUsersMessageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SendUsersMessageRequest from a JSON string
send_users_message_request_instance = SendUsersMessageRequest.from_json(json)
# print the JSON string representation of the object
print(SendUsersMessageRequest.to_json())

# convert the object into a dict
send_users_message_request_dict = send_users_message_request_instance.to_dict()
# create an instance of SendUsersMessageRequest from a dict
send_users_message_request_from_dict = SendUsersMessageRequest.from_dict(send_users_message_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


