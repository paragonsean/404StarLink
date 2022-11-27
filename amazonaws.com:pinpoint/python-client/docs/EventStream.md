# EventStream

Specifies settings for publishing event data to an Amazon Kinesis data stream or an Amazon Kinesis Data Firehose delivery stream.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | 
**destination_stream_arn** | **str** |  | 
**external_id** | **str** |  | [optional] 
**last_modified_date** | **str** |  | [optional] 
**last_updated_by** | **str** |  | [optional] 
**role_arn** | **str** |  | 

## Example

```python
from openapi_client.models.event_stream import EventStream

# TODO update the JSON string below
json = "{}"
# create an instance of EventStream from a JSON string
event_stream_instance = EventStream.from_json(json)
# print the JSON string representation of the object
print(EventStream.to_json())

# convert the object into a dict
event_stream_dict = event_stream_instance.to_dict()
# create an instance of EventStream from a dict
event_stream_from_dict = EventStream.from_dict(event_stream_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


