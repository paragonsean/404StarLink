# SendMessagesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_request** | [**SendMessagesRequestMessageRequest**](SendMessagesRequestMessageRequest.md) |  | 

## Example

```python
from openapi_client.models.send_messages_request import SendMessagesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SendMessagesRequest from a JSON string
send_messages_request_instance = SendMessagesRequest.from_json(json)
# print the JSON string representation of the object
print(SendMessagesRequest.to_json())

# convert the object into a dict
send_messages_request_dict = send_messages_request_instance.to_dict()
# create an instance of SendMessagesRequest from a dict
send_messages_request_from_dict = SendMessagesRequest.from_dict(send_messages_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


