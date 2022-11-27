# PutEventsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events_response** | [**EventsResponse**](EventsResponse.md) |  | 

## Example

```python
from openapi_client.models.put_events_response import PutEventsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of PutEventsResponse from a JSON string
put_events_response_instance = PutEventsResponse.from_json(json)
# print the JSON string representation of the object
print(PutEventsResponse.to_json())

# convert the object into a dict
put_events_response_dict = put_events_response_instance.to_dict()
# create an instance of PutEventsResponse from a dict
put_events_response_from_dict = PutEventsResponse.from_dict(put_events_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


