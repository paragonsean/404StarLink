# ListQueuedMessagesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_token** | **str** |  | [optional] 
**downlink_queue_messages_list** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.list_queued_messages_response import ListQueuedMessagesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListQueuedMessagesResponse from a JSON string
list_queued_messages_response_instance = ListQueuedMessagesResponse.from_json(json)
# print the JSON string representation of the object
print(ListQueuedMessagesResponse.to_json())

# convert the object into a dict
list_queued_messages_response_dict = list_queued_messages_response_instance.to_dict()
# create an instance of ListQueuedMessagesResponse from a dict
list_queued_messages_response_from_dict = ListQueuedMessagesResponse.from_dict(list_queued_messages_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


