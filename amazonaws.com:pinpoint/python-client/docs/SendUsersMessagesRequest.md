# SendUsersMessagesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**send_users_message_request** | [**SendUsersMessagesRequestSendUsersMessageRequest**](SendUsersMessagesRequestSendUsersMessageRequest.md) |  | 

## Example

```python
from openapi_client.models.send_users_messages_request import SendUsersMessagesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SendUsersMessagesRequest from a JSON string
send_users_messages_request_instance = SendUsersMessagesRequest.from_json(json)
# print the JSON string representation of the object
print(SendUsersMessagesRequest.to_json())

# convert the object into a dict
send_users_messages_request_dict = send_users_messages_request_instance.to_dict()
# create an instance of SendUsersMessagesRequest from a dict
send_users_messages_request_from_dict = SendUsersMessagesRequest.from_dict(send_users_messages_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


