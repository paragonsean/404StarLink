# EventsBatch

Specifies a batch of endpoints and events to process.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpoint** | [**EventsBatchEndpoint**](EventsBatchEndpoint.md) |  | 
**events** | **Dict** |  | 

## Example

```python
from openapi_client.models.events_batch import EventsBatch

# TODO update the JSON string below
json = "{}"
# create an instance of EventsBatch from a JSON string
events_batch_instance = EventsBatch.from_json(json)
# print the JSON string representation of the object
print(EventsBatch.to_json())

# convert the object into a dict
events_batch_dict = events_batch_instance.to_dict()
# create an instance of EventsBatch from a dict
events_batch_from_dict = EventsBatch.from_dict(events_batch_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


