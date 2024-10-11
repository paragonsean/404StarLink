# PutEventStreamRequestWriteEventStream

Specifies the Amazon Resource Name (ARN) of an event stream to publish events to and the AWS Identity and Access Management (IAM) role to use when publishing those events.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination_stream_arn** | **str** |  | [optional] 
**role_arn** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.put_event_stream_request_write_event_stream import PutEventStreamRequestWriteEventStream

# TODO update the JSON string below
json = "{}"
# create an instance of PutEventStreamRequestWriteEventStream from a JSON string
put_event_stream_request_write_event_stream_instance = PutEventStreamRequestWriteEventStream.from_json(json)
# print the JSON string representation of the object
print(PutEventStreamRequestWriteEventStream.to_json())

# convert the object into a dict
put_event_stream_request_write_event_stream_dict = put_event_stream_request_write_event_stream_instance.to_dict()
# create an instance of PutEventStreamRequestWriteEventStream from a dict
put_event_stream_request_write_event_stream_from_dict = PutEventStreamRequestWriteEventStream.from_dict(put_event_stream_request_write_event_stream_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


