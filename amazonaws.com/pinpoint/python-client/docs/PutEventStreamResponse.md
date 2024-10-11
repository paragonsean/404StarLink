# PutEventStreamResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_stream** | [**EventStream**](EventStream.md) |  | 

## Example

```python
from openapi_client.models.put_event_stream_response import PutEventStreamResponse

# TODO update the JSON string below
json = "{}"
# create an instance of PutEventStreamResponse from a JSON string
put_event_stream_response_instance = PutEventStreamResponse.from_json(json)
# print the JSON string representation of the object
print(PutEventStreamResponse.to_json())

# convert the object into a dict
put_event_stream_response_dict = put_event_stream_response_instance.to_dict()
# create an instance of PutEventStreamResponse from a dict
put_event_stream_response_from_dict = PutEventStreamResponse.from_dict(put_event_stream_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


