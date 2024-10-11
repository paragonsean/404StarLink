# SendUsersMessageResponse

Provides information about which users and endpoints a message was sent to.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | 
**request_id** | **str** |  | [optional] 
**result** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.send_users_message_response import SendUsersMessageResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SendUsersMessageResponse from a JSON string
send_users_message_response_instance = SendUsersMessageResponse.from_json(json)
# print the JSON string representation of the object
print(SendUsersMessageResponse.to_json())

# convert the object into a dict
send_users_message_response_dict = send_users_message_response_instance.to_dict()
# create an instance of SendUsersMessageResponse from a dict
send_users_message_response_from_dict = SendUsersMessageResponse.from_dict(send_users_message_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


