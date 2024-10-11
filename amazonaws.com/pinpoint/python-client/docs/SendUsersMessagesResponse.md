# SendUsersMessagesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**send_users_message_response** | [**SendUsersMessageResponse**](SendUsersMessageResponse.md) |  | 

## Example

```python
from openapi_client.models.send_users_messages_response import SendUsersMessagesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SendUsersMessagesResponse from a JSON string
send_users_messages_response_instance = SendUsersMessagesResponse.from_json(json)
# print the JSON string representation of the object
print(SendUsersMessagesResponse.to_json())

# convert the object into a dict
send_users_messages_response_dict = send_users_messages_response_instance.to_dict()
# create an instance of SendUsersMessagesResponse from a dict
send_users_messages_response_from_dict = SendUsersMessagesResponse.from_dict(send_users_messages_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


