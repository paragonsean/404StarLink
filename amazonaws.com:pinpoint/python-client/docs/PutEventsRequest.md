# PutEventsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events_request** | [**PutEventsRequestEventsRequest**](PutEventsRequestEventsRequest.md) |  | 

## Example

```python
from openapi_client.models.put_events_request import PutEventsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PutEventsRequest from a JSON string
put_events_request_instance = PutEventsRequest.from_json(json)
# print the JSON string representation of the object
print(PutEventsRequest.to_json())

# convert the object into a dict
put_events_request_dict = put_events_request_instance.to_dict()
# create an instance of PutEventsRequest from a dict
put_events_request_from_dict = PutEventsRequest.from_dict(put_events_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


