# PutEventsRequestEventsRequest

Specifies a batch of events to process.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_item** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.put_events_request_events_request import PutEventsRequestEventsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PutEventsRequestEventsRequest from a JSON string
put_events_request_events_request_instance = PutEventsRequestEventsRequest.from_json(json)
# print the JSON string representation of the object
print(PutEventsRequestEventsRequest.to_json())

# convert the object into a dict
put_events_request_events_request_dict = put_events_request_events_request_instance.to_dict()
# create an instance of PutEventsRequestEventsRequest from a dict
put_events_request_events_request_from_dict = PutEventsRequestEventsRequest.from_dict(put_events_request_events_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


