# WriteEventStream

Specifies the Amazon Resource Name (ARN) of an event stream to publish events to and the AWS Identity and Access Management (IAM) role to use when publishing those events.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination_stream_arn** | **str** |  | 
**role_arn** | **str** |  | 

## Example

```python
from openapi_client.models.write_event_stream import WriteEventStream

# TODO update the JSON string below
json = "{}"
# create an instance of WriteEventStream from a JSON string
write_event_stream_instance = WriteEventStream.from_json(json)
# print the JSON string representation of the object
print(WriteEventStream.to_json())

# convert the object into a dict
write_event_stream_dict = write_event_stream_instance.to_dict()
# create an instance of WriteEventStream from a dict
write_event_stream_from_dict = WriteEventStream.from_dict(write_event_stream_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


