# PutEventStreamRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**write_event_stream** | [**PutEventStreamRequestWriteEventStream**](PutEventStreamRequestWriteEventStream.md) |  | 

## Example

```python
from openapi_client.models.put_event_stream_request import PutEventStreamRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PutEventStreamRequest from a JSON string
put_event_stream_request_instance = PutEventStreamRequest.from_json(json)
# print the JSON string representation of the object
print(PutEventStreamRequest.to_json())

# convert the object into a dict
put_event_stream_request_dict = put_event_stream_request_instance.to_dict()
# create an instance of PutEventStreamRequest from a dict
put_event_stream_request_from_dict = PutEventStreamRequest.from_dict(put_event_stream_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


