# DeleteEventStreamResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_stream** | [**EventStream**](EventStream.md) |  | 

## Example

```python
from openapi_client.models.delete_event_stream_response import DeleteEventStreamResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteEventStreamResponse from a JSON string
delete_event_stream_response_instance = DeleteEventStreamResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteEventStreamResponse.to_json())

# convert the object into a dict
delete_event_stream_response_dict = delete_event_stream_response_instance.to_dict()
# create an instance of DeleteEventStreamResponse from a dict
delete_event_stream_response_from_dict = DeleteEventStreamResponse.from_dict(delete_event_stream_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


