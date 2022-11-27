# CreateJourneyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**write_journey_request** | [**CreateJourneyRequestWriteJourneyRequest**](CreateJourneyRequestWriteJourneyRequest.md) |  | 

## Example

```python
from openapi_client.models.create_journey_request import CreateJourneyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJourneyRequest from a JSON string
create_journey_request_instance = CreateJourneyRequest.from_json(json)
# print the JSON string representation of the object
print(CreateJourneyRequest.to_json())

# convert the object into a dict
create_journey_request_dict = create_journey_request_instance.to_dict()
# create an instance of CreateJourneyRequest from a dict
create_journey_request_from_dict = CreateJourneyRequest.from_dict(create_journey_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


