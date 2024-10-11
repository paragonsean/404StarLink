# UpdateJourneyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**write_journey_request** | [**WriteJourneyRequest**](WriteJourneyRequest.md) |  | 

## Example

```python
from openapi_client.models.update_journey_request import UpdateJourneyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateJourneyRequest from a JSON string
update_journey_request_instance = UpdateJourneyRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateJourneyRequest.to_json())

# convert the object into a dict
update_journey_request_dict = update_journey_request_instance.to_dict()
# create an instance of UpdateJourneyRequest from a dict
update_journey_request_from_dict = UpdateJourneyRequest.from_dict(update_journey_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


